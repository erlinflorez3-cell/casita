package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.view.MotionEvent;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.events.Event;
import com.facebook.soloader.SoLoader;
import com.swmansion.common.GestureHandlerStateManager;
import com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec;
import com.swmansion.gesturehandler.ReactContextExtensionsKt;
import com.swmansion.gesturehandler.ReanimatedEventDispatcher;
import com.swmansion.gesturehandler.core.FlingGestureHandler;
import com.swmansion.gesturehandler.core.GestureHandler;
import com.swmansion.gesturehandler.core.HoverGestureHandler;
import com.swmansion.gesturehandler.core.LongPressGestureHandler;
import com.swmansion.gesturehandler.core.ManualGestureHandler;
import com.swmansion.gesturehandler.core.NativeViewGestureHandler;
import com.swmansion.gesturehandler.core.OnTouchEventListener;
import com.swmansion.gesturehandler.core.PanGestureHandler;
import com.swmansion.gesturehandler.core.PinchGestureHandler;
import com.swmansion.gesturehandler.core.RotationGestureHandler;
import com.swmansion.gesturehandler.core.TapGestureHandler;
import com.swmansion.gesturehandler.react.RNGestureHandlerEvent;
import com.swmansion.gesturehandler.react.eventbuilders.FlingGestureHandlerEventDataBuilder;
import com.swmansion.gesturehandler.react.eventbuilders.GestureHandlerEventDataBuilder;
import com.swmansion.gesturehandler.react.eventbuilders.HoverGestureHandlerEventDataBuilder;
import com.swmansion.gesturehandler.react.eventbuilders.LongPressGestureHandlerEventDataBuilder;
import com.swmansion.gesturehandler.react.eventbuilders.ManualGestureHandlerEventDataBuilder;
import com.swmansion.gesturehandler.react.eventbuilders.NativeGestureHandlerEventDataBuilder;
import com.swmansion.gesturehandler.react.eventbuilders.PanGestureHandlerEventDataBuilder;
import com.swmansion.gesturehandler.react.eventbuilders.PinchGestureHandlerEventDataBuilder;
import com.swmansion.gesturehandler.react.eventbuilders.RotationGestureHandlerEventDataBuilder;
import com.swmansion.gesturehandler.react.eventbuilders.TapGestureHandlerEventDataBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@ReactModule(name = "\u0012\r\u0005\"///+\u001d~\u0017#\u0018\u001f\u0017#|\u001e\u0012\"\u0018\u0010")
@Metadata(bv = {}, d1 = {"ЯĪ\u0014D57\u001eq\u007fZDkt\u001aA\u000eֶ\u0013.X~*,\u0018w\u000ffp:8DsW6Ri*\u0017k\u00024,[:qKП]\u001a\u0014\"\u0011ѧVg}nRZ\u0011D\u0017\u0006$\u0018r,_U\u0001ز\u001a\u000f@BwЀ;M}AA`z8\r @.@ц\r\u00010*P\u0010|zKK\"\u00128ϋx:`\u0013U\u0005 \u0012\u000e>.\b&\\mS>Hz\u007fB/1ɅqBT)g0\u000bV\u0015FZ3\u0015vw\u001e3¨?5+%[\u0003\rSc?\u0019?y=\u000bwO&0Oxm̬vQD\u0015YN=]!&\u0015\u000e#3_{\u0001&;$*h\u00048\b\f\u0013J\u0005&\b=G\\/բj\b\u001c6=\u0011aVh\u0002\rY0~oN/%.L[=)\u0001iai2~;\n %\u001eQ\u001a56$r\u001c|-\u001b\u0003\u000f\u00025_]UH|(\nA{\u001c\tb0C44U\u001fG{?N]:\u007f\nGD9k0_ds|ݓn\u000b{obJP\"58eM9\u0010ha|\u0005\u001an\u0005\\:5e\u001c\u0003,.\f!?twjAk\u0010\u0017^v\u0010\u0003M\f!U3t^qn\u001a6\u001eޭ|{C_\r(a\u0001\u000eDCJz\u001dX\u0015[\u001a!#\t6LJPz\u0012\b{\u000bp\"\u0012`H\u0012(:ι?;\u0005\u001bX\u0005.B\b\u001f7\u0003\u000br\u001e*l94\u0005y$;+/s#p8w\u0007uD~v![V\u00029'Sm\"\u0017YC#O\u0005\u0002._gz^\u0013\u0002^\bc+8\"*;a/k1\u001f\u0001920^s|9y\u001aS Y\u0013|(-\u0002|vm\u0016\u001e\t,\u000f\u0002\u0011d\u001d-0+vrQ\u001f\u0015\u0004\b{^zu|\u0005\u000fisar1\u0010\u0003c\u0001\u0003\u0013V6%/&h\u0012}3Q_5\u0016&+u)*\u0001w)Fy\u0011&F\u0001kֽ:\u0006>urSm2\u0002Zw|/B0O\u0005\u0003\tj1wڇF\tBG{{O \tVfd+;\u0004օ\u0015N5vf]J\u00136 bQ\u0010.\u0002n\u0016\u0014%eU\u0015[\u0010\u007fm\u001cp\r\u000fXL\"\u000b*V5\u0012εA d\u0016+,>E\f\u0018dX[n\u000bµ\u0017F\\2L\n\u001bC\u001b\f43+\u0004T\u000b'\u0017xd:;ټ\u0012T\u0007\u0017\u001fT\u0013!]`OA1\u0003\u001dt6xcFM\u0004T\u0017Gc`\u0018\u0004!\u0017^\u0003O-\u0005U/R\u0019Q\u001bV\u001eG\u000b\u000e\u0001Q\u0010\u001a62^IyqƑ\u001aZ@\u0003-D(\u001b\u007fs?''4lSmd\u0015\u0007=\u0012؉VN0rG\t\u000bXT\n=\"IS\u00018z-z\u001a>7\f=\u000fc\\)5#\u001doLɑ;(]3MKz\u0014m\u001e\u0006\u001bk\u0002\u0016h8'J\u0017g\\߉\u0012f\u0018'cP$?.b0 CT.(FJ#\u0018:2\u0016rg\u0002a'Yr\"w\u0006oX'Y\u00046FY*\u0011\n\u0012\u0002,\u0005cZ\u001bf_m*r;h5\tUf^\u0017fyR\u0011\u0002@\u001f&H:#v766yI\u001cUɪv\u0013\u0014Uk\u000f;/2L\u0010T`V,\"7y$)ZX64SV{^+\t-zP[&^\u0019-;É\u000eì\u0018~\u0007Hl\u0017cLTy6n?=)#k\rMa5\rsQ|϶3ĿC\u001d?2\u0019yx\u0003\u001f\u000eRb#\f\u0001Ш\u000bۥ\u0004g4ߠ\u0017`K'?YR{;ܡ(ɷI8J݊| \u001c GZf0ۋ` $ԝi5G*\u001f\u0013eJ\u0014\u0003\u001f\u001fElaSS?/\u0011W\u0090Aƺ5kBݩ٫v\u007f"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[^1F\\U,2", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n\u001eU\r$Hm\u0003\u0017/CIzD+\u0015K]B\u0006j,[^1F\\U,J]r;i", "\u001ab^:\":P[\u0015\b\tb6\u0006R-o\b0\u0006IJx\u0017U~\u001eIv\b1b|'7z\u0004=IR;S0'\u0011jaF\\", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$:\u0018", "3uT;g\u0013Ba(~\u0004^9", "1n\\{f>FO\"\r~h5F\u000b/s\u000f8\t@\u0004\u0013 Fv\u000eI@25U{/\u0001Z~\u0010MQJ{A\u001ewdj8\u000ec96\u0001&WSNj\\crF#x^\u001c]+\u0016\u0005f\u007fo", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[^1F\\U,\u001bR\u0004=\u001d!A\u0012\\:\r\u000eYNb:\u001a", "6`]1_,K4\u0015|\nh9\u0001\t=", "", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[^1F\\U,\u001b5nF\u0013\u0019Z\u001b/'\u000b\u0014cN8D", ")KR<`uLe!z\u0004l0\u0007\u0012xg\u007f6\u000bP\u000e\u0017\u001aCx\rCv2~f}\u001c5|_\u001b6%;yC.\"hD5\u0010b3N\u0004\u000fQK^3\\\u0011U9\u001d\u0011a\u000e[\f\t\u0003hK1\u0003\u001a", "7mc2e(<b\u001d\t\u0004F(\u0006\u00051e\r", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[Z0VL[(ZavG\u001dyV\u0017J-\r\u0012/", "@dP;\\4:b\u0019}Zo,\u0006\u0018\u000ei\u000e3wO~\u001a\u0017T", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n\"Yy);u\u0012=MB\u001b|4'$GeG\u0012_;Ly'T\"", "@dV6f;Kg", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[c'IP\\;ifH", "5dc\u001fX.Ba(\f\u000f", "u(;0b4\ba+\u0007vg:\u0001\u00138/\u0002(\nO\u0011$\u0017Jk\u0017;}%B#\u000b 3k%w:,\u001dkB-%ua\u001c\u0003l+Uv44LP0ja\u007fQi", "@n^Af", "", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[c1Q[1,c]rJi", "/sc.V/ S'\u000e\u000bk,_\u00058d\u0007(\t", "", "6`]1_,KB\u0015\u0001Yh<y\u0010/", "", "DhTDG(@2#\u000fwe,", "/bc6b5-g$~Yh<y\u0010/", "1qT.g, S'\u000e\u000bk,_\u00058d\u0007(\t", "6`]1_,K<\u0015\u0007z", "", "1n]3\\.", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "1qT.g, S'\u000e\u000bk,_\u00058d\u0007(\t#\u0001\u001e\"G|", "\"", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u00149", "6`]1_,KB\u0015\u0001", "", "2dR<e(MS\u0006\u000f\u0004m0\u0005\t", "8rX\u001dg9", "", "2q^=:,Lb)\fzA(\u0006\b6e\r", "4h]19(<b#\f\u000f?6\nk+n~/{M", "6`]1_,K", "4h]1E6Hb{~\u0002i,\ni9rp,{R\\ \u0015G}\u001dF\u0004", "DhTDG(@", "4kd@[\u0016IS&z\nb6\u0006\u0017", "5dc\u0010b5Lb\u0015\b\nl", "", "", "5dc\u001bT4>", "6`]1_,\u001cZ\u0019z\bC\u001ai\t=p\n1z@\u000e", "6`]1_,,S(chK,\u000b\u00149n~(\t", "0k^0^\u0015:b\u001d\u0010zK,\u000b\u00149n~(\t", "", "7mbAT3E", "7me._0=O(~", "=m7.a+ES&n\u0006](\f\t", "uKR<`uLe!z\u0004l0\u0007\u0012xg\u007f6\u000bP\u000e\u0017\u001aCx\rCv2~W\b-77w.[RKx4\u0001\u0011q`@\u0007p\u0002\u0012g", "=mBAT;>1\u001cz\u0004`,", "<df g(MS", "=kS g(MS", "uKR<`uLe!z\u0004l0\u0007\u0012xg\u007f6\u000bP\u000e\u0017\u001aCx\rCv2~W\b-77w.[RKx4\u0001\u0011q`@\u0007p\u00022Zj8", "=mC<h*A3*~\u0004m", "@dV6f;>`\u0006\t\u0005m\u000f|\u0010:e\r", "@n^A", "Ad]18=>\\(_\u0005k\u000b|\u001a3c\u007f\b\r@\n&", "3uT;g\u0015:[\u0019", "2`c.", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW.\u0004)DUz'7U\u00129#", "Ad]18=>\\(_\u0005k\u000b\u0001\u0016/c\u000f\b\r@\n&", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u000e^CDz\n", "3uT;g", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\u0011\u001b\u001fCx\n>v2~Y\u000f @|$w-T;tCsXY", "Ad]18=>\\(_\u0005k\u0015x\u00183v\u007f\u0004\u0005D\t\u0013&GnmMv.D", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[V8GU]\u0002", "Ad]18=>\\(_\u0005k\u0019|\u00058i\b$\u000b@\u007f", "Adc\u0014X:Mc&~]Z5{\u0010/rm7wO\u0001", "Cma2Z0Lb\u0019\fgh6\fk/l\u000b(\t", "CoS.g, S'\u000e\u000bk,_\u00058d\u0007(\t", "CoS.g, S'\u000e\u000bk,_\u00058d\u0007(\t#\u0001\u001e\"G|", "\u0011n\\=T5B]\"", "\u0014kX;Z\u000e>a(\u000f\b^\u000fx\u0012.l\u007f5\\<~&!T\u0004", "\u0016`]1_,K4\u0015|\nh9\u0011", "\u0016ne2e\u000e>a(\u000f\b^\u000fx\u0012.l\u007f5\\<~&!T\u0004", "\u001an]4C9>a'`zl;\r\u0016/H{1zG\u0001$wCm\u001dF\u00049", "\u001b`]BT3 S'\u000e\u000bk,_\u00058d\u0007(\t!|\u0015&Q|\"", "\u001c`c6i,/W\u0019\u0011\\^:\f\u0019<eb$\u0005?\b\u0017$(k\fK\u00012I", "\u001e`]\u0014X:Mc&~]Z5{\u0010/r`$yO\u000b$+", "\u001eh]0[\u000e>a(\u000f\b^\u000fx\u0012.l\u007f5\\<~&!T\u0004", " nc.g0H\\z~\tm<\n\t\u0012a\t'\u0003@\u000ew\u0013E~\u0018I\u000b", "\"`_\u0014X:Mc&~]Z5{\u0010/r`$yO\u000b$+", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class RNGestureHandlerModule extends NativeRNGestureHandlerModuleSpec implements GestureHandlerStateManager {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_DIRECTION = "direction";
    private static final String KEY_ENABLED = "enabled";
    private static final String KEY_HIT_SLOP = "hitSlop";
    private static final String KEY_HIT_SLOP_BOTTOM = "bottom";
    private static final String KEY_HIT_SLOP_HEIGHT = "height";
    private static final String KEY_HIT_SLOP_HORIZONTAL = "horizontal";
    private static final String KEY_HIT_SLOP_LEFT = "left";
    private static final String KEY_HIT_SLOP_RIGHT = "right";
    private static final String KEY_HIT_SLOP_TOP = "top";
    private static final String KEY_HIT_SLOP_VERTICAL = "vertical";
    private static final String KEY_HIT_SLOP_WIDTH = "width";
    private static final String KEY_LONG_PRESS_MAX_DIST = "maxDist";
    private static final String KEY_LONG_PRESS_MIN_DURATION_MS = "minDurationMs";
    private static final String KEY_MANUAL_ACTIVATION = "manualActivation";
    private static final String KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION = "disallowInterruption";
    private static final String KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START = "shouldActivateOnStart";
    private static final String KEY_NEEDS_POINTER_DATA = "needsPointerData";
    private static final String KEY_NUMBER_OF_POINTERS = "numberOfPointers";
    private static final String KEY_PAN_ACTIVATE_AFTER_LONG_PRESS = "activateAfterLongPress";
    private static final String KEY_PAN_ACTIVE_OFFSET_X_END = "activeOffsetXEnd";
    private static final String KEY_PAN_ACTIVE_OFFSET_X_START = "activeOffsetXStart";
    private static final String KEY_PAN_ACTIVE_OFFSET_Y_END = "activeOffsetYEnd";
    private static final String KEY_PAN_ACTIVE_OFFSET_Y_START = "activeOffsetYStart";
    private static final String KEY_PAN_AVG_TOUCHES = "avgTouches";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_X_END = "failOffsetXEnd";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_X_START = "failOffsetXStart";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_Y_END = "failOffsetYEnd";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_Y_START = "failOffsetYStart";
    private static final String KEY_PAN_MAX_POINTERS = "maxPointers";
    private static final String KEY_PAN_MIN_DIST = "minDist";
    private static final String KEY_PAN_MIN_POINTERS = "minPointers";
    private static final String KEY_PAN_MIN_VELOCITY = "minVelocity";
    private static final String KEY_PAN_MIN_VELOCITY_X = "minVelocityX";
    private static final String KEY_PAN_MIN_VELOCITY_Y = "minVelocityY";
    private static final String KEY_SHOULD_CANCEL_WHEN_OUTSIDE = "shouldCancelWhenOutside";
    private static final String KEY_TAP_MAX_DELAY_MS = "maxDelayMs";
    private static final String KEY_TAP_MAX_DELTA_X = "maxDeltaX";
    private static final String KEY_TAP_MAX_DELTA_Y = "maxDeltaY";
    private static final String KEY_TAP_MAX_DIST = "maxDist";
    private static final String KEY_TAP_MAX_DURATION_MS = "maxDurationMs";
    private static final String KEY_TAP_MIN_POINTERS = "minPointers";
    private static final String KEY_TAP_NUMBER_OF_TAPS = "numberOfTaps";
    public static final String NAME = "RNGestureHandlerModule";
    private final RNGestureHandlerModule$eventListener$1 eventListener;
    private final HandlerFactory<?>[] handlerFactories;
    private final RNGestureHandlerInteractionManager interactionManager;
    private final ReanimatedEventDispatcher reanimatedEventDispatcher;
    private final RNGestureHandlerRegistry registry;
    private final List<RNGestureHandlerRootHelper> roots;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005K4\u0012\u0006\u0007nʑA0ZeP\u008cZS@\u000fsڔ:Š\\:ڎs;\u0004\u0019>'\u000fOɁkg|J#%Q<\u001e\u0016'\u0019\\Qc(u\u0016\u001f2Hpmc}sKjxtd7f2rD\b\u0006\u0019\u001aXJf͏MŲO\f\u001aؓ\u0011|HU%M3\u001châ\u0011ŋ\u0005\u001edɡ\u001fBVpu:]%Y݆\u0015Ě+_8ŧ\u001e\u0019TY?\r%ctѫ\u0013˝9\u0015-مS\u0013`aW\u0003ms\u0014ݞ;Ҋ++Q֕(Bf\u0007,\u0015YQcơE͉`\u0005YӠ\\39W{K~\u0010~¾Mԫ\u0011<\f\u05faV3V7E\u001a\u0015\ndޚGɤW@X\u061c/N\u000e\u0005y6E'VĔ}ݰ\u001ffYĥ\f%\\B\u0014\u0005; yЪAĲ_T\u0016֫e'b\u0004i1\u007fB\u0014ʳ!̆]=uՎAn\u00107\u001c0u\u0002\u0006Ɉcѧ\u001b%?ك\n//y\u001aHriMݖ3ĈWiZ̲\u0011.|%O*7\u000e1ը7ʰoP\\А|\u001d[,l\u0007,\ni\u0601/ʟ@!-ī\u001f[vz\u0003M\f\f{Ç9Ơ]nsލ(ElEMQ\u0012\u00128ׯI݀C<jڳ)rPf$Z\u000b*xø\u001bн\u0014w\u0004ͩ\u001f\u0018!FWqJ6\u0003վkÅ\u0019H\u000bٜ\u0013M\u000b\u001ewZ\u0017\u0012Uԡ\u0006ʗ\u0007i,ڏY\r^r\to\u0016z ؖO˃&-Iٛ\u0006%4l:hb~yȗQ\u0381\u0004Goն\u0018Xz.\u000eU*\"l֠\fֺ3=\u001bÁO5@\u001bEEzt<ʻ ɟ+z\u0005Ȫ_GvH\u007f\b\u0019r\u0003ߏ=ߝST\u001fǱGj\u0001> d.{8ÂMĕgT\u0013ϵ\u000fU\u0001\u001fq<|:SāqǪ)\u0001wܲMA;`?\u001dDyjٯg˸aiwЃJn\u001dD\re2.:ܡB͈U]:ծ\tUg\u001eV\"RnYܬ\u001bܖ{\bJކ\u0005\u0019AhYd\u001fX\u000fԊ]ɣ\u0002f\u000fԭ]|d|R\u0013\u001e\u007f\u000bʠ2ͫwC\u0006ж/O33eS\u0016oDй/\u05c8N\u000f\u0012ΚL=|54=NX.Ņ[ޘ\ns ܽ\u0012Gp)T\tR6\u0003чZդGTqв`\u0007\u000ekw\u000fE4\u0019ǀ\u000eټ\u0012T\u0001ִ'T\u0013\u0007]`O,Wϖaʟ\"x=̍UyT{Gc`\u0003*\u07fc[ƨnO\u0007ܺu7R|Q\u001bVZWՍ\u0018زGI\nԍTS7\u0017\u0004o::nԀoÐ\u001c\u001bAܱak\u0005Zv\u000b\u0004f%ЉIՆjRVÝy\u000b\t(&<8\u0011aĂ\"ζsb5ً\u001f\u0004Eo2\u0001EF\u007fܔ^ƔgF#Ҏދ9`"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[^1F\\U,\u001b0|E\u001f\u000ec\u0012X4b", "", "u(E", "\u0019DH,7\u0010+3vm^H\u0015", "", "\u0019DH,8\u0015\u001a0\u007f^Y", "\u0019DH,;\u0010-M\u0007edI", "\u0019DH,;\u0010-M\u0007edI&Yr\u001eTi\u0010", "\u0019DH,;\u0010-M\u0007edI&_h\u0013Gb\u0017", "\u0019DH,;\u0010-M\u0007edI&_r\u001cIt\u0012d/\\}", "\u0019DH,;\u0010-M\u0007edI&ch\u0010T", "\u0019DH,;\u0010-M\u0007edI&il\u0011Hn", "\u0019DH,;\u0010-M\u0007edI&kr\u001a", "\u0019DH,;\u0010-M\u0007edI&mh\u001cTc\u0006W'", "\u0019DH,;\u0010-M\u0007edI&nl\u000eTb", "\u0019DH,?\u0016'5\u0013ig>\u001aj\u0003\u0017Ar\"Z$n\u0006", "\u0019DH,?\u0016'5\u0013ig>\u001aj\u0003\u0017Ih\"Z0mr\u0006+Yv6^\u0013", "\u0019DH,@\b'Ctet:\nkl An\fe)", "\u0019DH,A\b-7\n^tO\u0010\\z)Dc\u0016W'g\u0001\tASv+V\u0012\"Ih\u000f\u001bW~", "\u0019DH,A\b-7\n^tO\u0010\\z)Sb\u0012k'_\u0011r%^q-R\u0014\u0015Sg\t1[\u0005\n:2", "\u0019DH,A\f\u001e2\u0007xeH\u0010ew\u000fRy\u0007W/\\", "\u0019DH,A\u001c&0xktH\rvs\u0019Ih\u0017[-n", "\u0019DH,C\b'Mt\\iB\u001dXw\u000f_[\tj m\u0011}1Xo6a\u0012\u0015Gk", "\u0019DH,C\b'Mt\\iB\u001d\\\u0003\u0019F`\u0016[/z\n\u0011'Xl", "\u0019DH,C\b'Mt\\iB\u001d\\\u0003\u0019F`\u0016[/z\n\u00115^i)e", "\u0019DH,C\b'Mt\\iB\u001d\\\u0003\u0019F`\u0016[/z\u000b\u0011'Xl", "\u0019DH,C\b'Mt\\iB\u001d\\\u0003\u0019F`\u0016[/z\u000b\u00115^i)e", "\u0019DH,C\b'Mto\\X\u001bfx\rH_\u0016", "\u0019DH,C\b'MyZ^E&fi\u0010S_\u0017u-\\\u007fx'i\u00016V\u000e\u0014", "\u0019DH,C\b'MyZ^E&fi\u0010S_\u0017u-\\\u007fx'i\u00016d\u0014\u0011Fl", "\u0019DH,C\b'MyZ^E&fi\u0010S_\u0017u-\\\u007fx'i\u00026V\u000e\u0014", "\u0019DH,C\b'MyZ^E&fi\u0010S_\u0017u-\\\u007fx'i\u00026d\u0014\u0011Fl", "\u0019DH,C\b'M\u0001ZmX\u0017fl\u0018T_\u0015i", "\u0019DH,C\b'M\u0001bcX\u000b`v\u001e", "\u0019DH,C\b'M\u0001bcX\u0017fl\u0018T_\u0015i", "\u0019DH,C\b'M\u0001bcX\u001d\\o\u0019Cc\u0017o", "\u0019DH,C\b'M\u0001bcX\u001d\\o\u0019Cc\u0017o:s", "\u0019DH,C\b'M\u0001bcX\u001d\\o\u0019Cc\u0017o:t", "\u0019DH,F\u000f(C\u007f]t<\bef\u000fLy\u001a^ i\u0011\u00017^{ U\u0005", "\u0019DH,G\b)M\u0001ZmX\u000b\\o\u000bYy\u0010i", "\u0019DH,G\b)M\u0001ZmX\u000b\\o\u001eAy\u001b", "\u0019DH,G\b)M\u0001ZmX\u000b\\o\u001eAy\u001c", "\u0019DH,G\b)M\u0001ZmX\u000b`v\u001e", "\u0019DH,G\b)M\u0001ZmX\u000blu\u000bTc\u0012d:h\u0005", "\u0019DH,G\b)M\u0001bcX\u0017fl\u0018T_\u0015i", "\u0019DH,G\b)M\u0002nb;\fi\u0003\u0019Fy\u0017W+n", "\u001c@<\u0012", "6`]1_,!W(l\u0002h7g\u00169p\u007f5\u000bT", "", "6`]1_,K", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u00149", "1n]3\\.", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void handleHitSlopProperty(GestureHandler<?> gestureHandler, ReadableMap readableMap) {
            if (readableMap.getType(RNGestureHandlerModule.KEY_HIT_SLOP) == ReadableType.Number) {
                float pixelFromDIP = PixelUtil.toPixelFromDIP(readableMap.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP));
                gestureHandler.setHitSlop(pixelFromDIP, pixelFromDIP, pixelFromDIP, pixelFromDIP, Float.NaN, Float.NaN);
                return;
            }
            ReadableMap map = readableMap.getMap(RNGestureHandlerModule.KEY_HIT_SLOP);
            Intrinsics.checkNotNull(map);
            float pixelFromDIP2 = map.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP_HORIZONTAL) ? PixelUtil.toPixelFromDIP(map.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP_HORIZONTAL)) : Float.NaN;
            float pixelFromDIP3 = pixelFromDIP2;
            float pixelFromDIP4 = map.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP_VERTICAL) ? PixelUtil.toPixelFromDIP(map.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP_VERTICAL)) : Float.NaN;
            float pixelFromDIP5 = pixelFromDIP4;
            if (map.hasKey("left")) {
                pixelFromDIP2 = PixelUtil.toPixelFromDIP(map.getDouble("left"));
            }
            if (map.hasKey("top")) {
                pixelFromDIP4 = PixelUtil.toPixelFromDIP(map.getDouble("top"));
            }
            if (map.hasKey("right")) {
                pixelFromDIP3 = PixelUtil.toPixelFromDIP(map.getDouble("right"));
            }
            if (map.hasKey("bottom")) {
                pixelFromDIP5 = PixelUtil.toPixelFromDIP(map.getDouble("bottom"));
            }
            gestureHandler.setHitSlop(pixelFromDIP2, pixelFromDIP4, pixelFromDIP3, pixelFromDIP5, map.hasKey("width") ? PixelUtil.toPixelFromDIP(map.getDouble("width")) : Float.NaN, map.hasKey("height") ? PixelUtil.toPixelFromDIP(map.getDouble("height")) : Float.NaN);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\r.4\u0012}\bnjO0LeN/ZS8\u000fs{:$c$\bCCU }*\teNo˧vJp\u000bKƤ\f\u0016\u000f̓\\Oezm\u0012=2pn\u007f6ޜs=Ga=L\u0013*J\"f\u00055\u0005(6`\u0010%zsO\u001a\u001fH@\u001fH\u0019!\u0016\u0015(!\u001e>N\u0001Nbu^NJ\u0003\\h@i\u00172P\\9w0+`=Jb3%v\u0010\u001eqT\bG#'k\u00035U2ρEӭuC\rؒ?)1M\u0002\\\u0007p\u000e\u001a-1_\u000fmrT\\3X7І)˦SiSִ&*}\u0003\n\u0016ʆ\b\""}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[^1F\\U,\u001b3yA\u001d\u0014<\u000e\\:\u001d\u0012Y$ wC>\u001f\u0015\rE\u007fJr\u000e k", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[^1F\\U,\u001b5nF\u0013\u0019Z\u001b/'\u000b\u0014cN8D", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001N\u001d2VE\u001dkB-%ua\u001c\u0003l+Uv4\u001d", "u(E", "<`\\2", "", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Bx_2", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "5dc!l7>", "u(;7T=:\u001d z\u0004`uZ\u0010+s\u000e}", "1n]3\\.N`\u0019", "", "6`]1_,K", "1n]3\\.", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "1qT.g,", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "1qT.g,\u001ed\u0019\b\n;<\u0001\u0010.e\r", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0016?MLJhD\"\u001cgaF\u0015-\rUz0I.N:kb\u007f=v\u000ec\rU+\u001adjA-}#3.\u0004\tY\u0006Bg\u0001\u0019k", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class FlingGestureHandlerFactory extends HandlerFactory<FlingGestureHandler> {
        private final Class<FlingGestureHandler> type = FlingGestureHandler.class;
        private final String name = "FlingGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public void configure(FlingGestureHandler handler, ReadableMap config) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(config, "config");
            super.configure(handler, config);
            if (config.hasKey(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS)) {
                handler.setNumberOfPointersRequired(config.getInt(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_DIRECTION)) {
                handler.setDirection(config.getInt(RNGestureHandlerModule.KEY_DIRECTION));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public FlingGestureHandler create(Context context) {
            return new FlingGestureHandler();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public FlingGestureHandlerEventDataBuilder createEventBuilder(FlingGestureHandler handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new FlingGestureHandlerEventDataBuilder(handler);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public String getName() {
            return this.name;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public Class<FlingGestureHandler> getType() {
            return this.type;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯD\u001d<K!&˛\bDZc|\u0004Oي8\u000b4B\u0007\":\u001e\u007f\u0007lkA0ZeP.XT2\u000fy{<$a$yCQU\"}(\nWN}gvJ`\u000bK\u000f\u001c\u0016\u0001j2I[\u0019s܈7>HģM2uuM;pt|\u0004N2R8(\u0006A\u001dݵL\u0010\u0005|\ff\u001a\u001dH@\u001fF\u0003\u0011[\u00122\u0012<̄P\u0005,j\u007fNdW3qƠ3#\u0011y\u000bc5pH|\u0004εvZ5\u001f\u000fc4*nJ{9ȏW\u0003\u0015f$X\u0011T\nC\u0015j7'aɞ\"mf\\\u000e!-+\u0006Օ$\u0017͉`\u0005_w\\79R{K~\u0012~â|ԫ\u0011@\u001c\u0010\f,V4}0t\u000f&9\u0005tc@\u0007\u061c\rJVєcي\u001b)\u001851B)pЈeS"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[^1F\\U,\u001b5nF\u0013\u0019Z\u001b/'\u000b\u0014cN8D", "\"", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u00149", "", "u(E", "<`\\2", "", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Bx_2", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "5dc!l7>", "u(;7T=:\u001d z\u0004`uZ\u0010+s\u000e}", "1n]3\\.N`\u0019", "", "6`]1_,K", "1n]3\\.", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "uKR<`uLe!z\u0004l0\u0007\u0012xg\u007f6\u000bP\u000e\u0017\u001aCx\rCv2~W\b-77w.[RKx4\u0001\u0011q`@\u0007p\u00025t1O\u0016O(ZRoG\u001e\u0018$\u001bN'\u000b\u0014#>1rC9\u001fQ\u0019I}:d}\u0013\u0016u1uF\u0006G", "1qT.g,", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ#t/=#\f2?i\u001f<QMD56\u001e#wqF\u0007f(Wu.GY\u0018*f_r\u0007u\u0012h\u001d^8\rgUJ#uDDt", "1qT.g,\u001ed\u0019\b\n;<\u0001\u0010.e\r", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0016?MLJhD\"\u001cgaF\u0015-\u000eN\u00056WYN\u000fX[qD\u0014\u001f:\u001fN4\u001ccUP KT;&\u0007,VW", "uKR<`uLe!z\u0004l0\u0007\u0012xg\u007f6\u000bP\u000e\u0017\u001aCx\rCv2~W\b-77w.[RKx4\u0001\u0011q`@\u0007p\u0002\u0012]%QT\u0018:nZnF\"\u0016d\u0017\u0018-\r\u0013hQ1nG3(\u00073I\u000f\u0005u\u0001\b\u0014\u001d~j\u0002B_\u001fD\n\u0019|@)uT#AyUPUo*G\bh\u001cc:G\u0004%q\"*GL=\u0006Xc\u0015yQyt=", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static abstract class HandlerFactory<T extends GestureHandler<T>> {
        public void configure(T handler, ReadableMap config) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(config, "config");
            handler.resetConfig();
            if (config.hasKey(RNGestureHandlerModule.KEY_SHOULD_CANCEL_WHEN_OUTSIDE)) {
                handler.setShouldCancelWhenOutside(config.getBoolean(RNGestureHandlerModule.KEY_SHOULD_CANCEL_WHEN_OUTSIDE));
            }
            if (config.hasKey("enabled")) {
                handler.setEnabled(config.getBoolean("enabled"));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP)) {
                RNGestureHandlerModule.Companion.handleHitSlopProperty(handler, config);
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_NEEDS_POINTER_DATA)) {
                handler.setNeedsPointerData(config.getBoolean(RNGestureHandlerModule.KEY_NEEDS_POINTER_DATA));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_MANUAL_ACTIVATION)) {
                handler.setManualActivation(config.getBoolean(RNGestureHandlerModule.KEY_MANUAL_ACTIVATION));
            }
            if (config.hasKey("mouseButton")) {
                handler.setMouseButton(config.getInt("mouseButton"));
            }
        }

        public abstract T create(Context context);

        public abstract GestureHandlerEventDataBuilder<T> createEventBuilder(T t2);

        public abstract String getName();

        public abstract Class<T> getType();
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\r.4\u0012}\bnjO0LeN0ZS@\u000fsڔ<$q$yCAU }8ޛ\u007fTwi~J\t\u000bq\u000eF\u0019ѱn,WVAm \u0019JB\u001e?cS}HQb\u000b53,x6\u0001\b\u0013\u000e2*v\u001e'~QZ$\u0012^@7N#\u001f[\u00072\u00124Avӌ`֔kT>ԟ\u0005_@31\b:Z\\-w6\rO\u001dF\u0003';}8ӳ-Ë;;\u001dǬk\u0005\rZiHƊC\u0002"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[^1F\\U,\u001b5|N\u0014\u001f<\u000e\\:\u001d\u0012Y$ wC>\u001f\u0015\rE\u007fJr\u000e k", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[^1F\\U,\u001b5nF\u0013\u0019Z\u001b/'\u000b\u0014cN8D", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001P ?MP\u001dkB-%ua\u001c\u0003l+Uv4\u001d", "u(E", "<`\\2", "", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Bx_2", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "5dc!l7>", "u(;7T=:\u001d z\u0004`uZ\u0010+s\u000e}", "1qT.g,", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "1qT.g,\u001ed\u0019\b\n;<\u0001\u0010.e\r", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0016?MLJhD\"\u001cgaF\u0015-\u000fX\b'T.N:kb\u007f=v\u000ec\rU+\u001adjA-}#3.\u0004\tY\u0006Bg\u0001\u0019k", "6`]1_,K", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class HoverGestureHandlerFactory extends HandlerFactory<HoverGestureHandler> {
        private final Class<HoverGestureHandler> type = HoverGestureHandler.class;
        private final String name = "HoverGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public HoverGestureHandler create(Context context) {
            return new HoverGestureHandler();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public HoverGestureHandlerEventDataBuilder createEventBuilder(HoverGestureHandler handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new HoverGestureHandlerEventDataBuilder(handler);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public String getName() {
            return this.name;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public Class<HoverGestureHandler> getType() {
            return this.type;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\r.4\u0012}\bnjO0LeN/ZS8\u000fs{:$c$\bCCU }*\teNo˧vJp\u000bKƤ\f\u0016\u000f̓\\Oezm\u0012=2pn\u007f6ޜs=Ga=L\u0013*J\"f\u00055\u0005(6`\u0010%zsO\u001a\u001fH@\u001fH\u0019!\u0016\u0015(!\u001e>N\u0001Nbu^NJ\u0003\\h@i\u00172P\\9w0+`=Jb3%v\u0010\u001eqT\bG#'k\u00035U2ρEӭuC\rؒ?)1M\u0002\\\u0007p\u000e\u001a-1_\u000fmrT\\3X7І)˦SiSִ&*}\u0003\n\u0016ʆ\b\""}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[^1F\\U,\u001b9|F\u0016|g\u000e\\9n\u0005gP4{D\u001a\u001b\u0011+P\u0002HI|\n%\u0018B~F", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[^1F\\U,\u001b5nF\u0013\u0019Z\u001b/'\u000b\u0014cN8D", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001T 7O.HkB,vhoH\u0017p,1r0FSN92", "u(E", "<`\\2", "", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Bx_2", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "5dc!l7>", "u(;7T=:\u001d z\u0004`uZ\u0010+s\u000e}", "1n]3\\.N`\u0019", "", "6`]1_,K", "1n]3\\.", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "1qT.g,", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "1qT.g,\u001ed\u0019\b\n;<\u0001\u0010.e\r", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0016?MLJhD\"\u001cgaF\u0015-\u0013X\u007f)2YN:j4rK#\"g\u000e1'\u0016\u0004`A1NU7(\u0017\u000bE\u00117E\u0011\u0010\u001d\r5wF", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class LongPressGestureHandlerFactory extends HandlerFactory<LongPressGestureHandler> {
        private final Class<LongPressGestureHandler> type = LongPressGestureHandler.class;
        private final String name = "LongPressGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public void configure(LongPressGestureHandler handler, ReadableMap config) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(config, "config");
            super.configure(handler, config);
            if (config.hasKey(RNGestureHandlerModule.KEY_LONG_PRESS_MIN_DURATION_MS)) {
                handler.setMinDurationMs(config.getInt(RNGestureHandlerModule.KEY_LONG_PRESS_MIN_DURATION_MS));
            }
            if (config.hasKey("maxDist")) {
                handler.setMaxDist(PixelUtil.toPixelFromDIP(config.getDouble("maxDist")));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS)) {
                handler.setNumberOfPointers(config.getInt(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public LongPressGestureHandler create(Context context) {
            Intrinsics.checkNotNull(context);
            return new LongPressGestureHandler(context);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public LongPressGestureHandlerEventDataBuilder createEventBuilder(LongPressGestureHandler handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new LongPressGestureHandlerEventDataBuilder(handler);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public String getName() {
            return this.name;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public Class<LongPressGestureHandler> getType() {
            return this.type;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\r.4\u0012}\bnjO0LeN0ZS@\u000fsڔ<$q$yCAU }8ޛ\u007fTwi~J\t\u000bq\u000eF\u0019ѱn,WVAm \u0019JB\u001e?cS}HQb\u000b53,x6\u0001\b\u0013\u000e2*v\u001e'~QZ$\u0012^@7N#\u001f[\u00072\u00124Avӌ`֔kT>ԟ\u0005_@31\b:Z\\-w6\rO\u001dF\u0003';}8ӳ-Ë;;\u001dǬk\u0005\rZiHƊC\u0002"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[^1F\\U,\u001b:nF$\u000eaoN9\u001c\u0015fA\u0007jM6&\b9*}9w\u000b\u0019*c", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[^1F\\U,\u001b5nF\u0013\u0019Z\u001b/'\u000b\u0014cN8D", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001U\u00127]?BM4,$xn9i_5M}'T\"", "u(E", "<`\\2", "", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Bx_2", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "5dc!l7>", "u(;7T=:\u001d z\u0004`uZ\u0010+s\u000e}", "1qT.g,", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "1qT.g,\u001ed\u0019\b\n;<\u0001\u0010.e\r", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0016?MLJhD\"\u001cgaF\u0015-\u0014J\u007f7CS0,ja\u0003J\u0014tV\u0017M2\r\u00129R$wS\u0016\u001b\u0017(&\u0012?o\u007f\f#c", "6`]1_,K", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class ManualGestureHandlerFactory extends HandlerFactory<ManualGestureHandler> {
        private final Class<ManualGestureHandler> type = ManualGestureHandler.class;
        private final String name = "ManualGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public ManualGestureHandler create(Context context) {
            return new ManualGestureHandler();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public ManualGestureHandlerEventDataBuilder createEventBuilder(ManualGestureHandler handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new ManualGestureHandlerEventDataBuilder(handler);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public String getName() {
            return this.name;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public Class<ManualGestureHandler> getType() {
            return this.type;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\r.4\u0012}\bnjO0LeN/ZS8\u000fs{:$c$\bCCU }*\teNo˧vJp\u000bKƤ\f\u0016\u000f̓\\Oezm\u0012=2pn\u007f6ޜs=Ga=L\u0013*J\"f\u00055\u0005(6`\u0010%zsO\u001a\u001fH@\u001fH\u0019!\u0016\u0015(!\u001e>N\u0001Nbu^NJ\u0003\\h@i\u00172P\\9w0+`=Jb3%v\u0010\u001eqT\bG#'k\u00035U2ρEӭuC\rؒ?)1M\u0002\\\u0007p\u000e\u001a-1_\u000fmrT\\3X7І)˦SiSִ&*}\u0003\n\u0016ʆ\b\""}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[^1F\\U,\u001b;nL\u0018#Z~R+\u001ffYO3~Q7\u0002\u00045H\t;ua\b\u0014\u001d?w\u0005\u0018", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[^1F\\U,\u001b5nF\u0013\u0019Z\u001b/'\u000b\u0014cN8D", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001V\u0012=QT;\\8\u001e'JaG\u0016s9NY#PKU,i(", "u(E", "<`\\2", "", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Bx_2", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "5dc!l7>", "u(;7T=:\u001d z\u0004`uZ\u0010+s\u000e}", "1n]3\\.N`\u0019", "", "6`]1_,K", "1n]3\\.", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "1qT.g,", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "1qT.g,\u001ed\u0019\b\n;<\u0001\u0010.e\r", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0016?MLJhD\"\u001cgaF\u0015-\u0015J\u0006+XL0,ja\u0003J\u0014tV\u0017M2\r\u00129R$wS\u0016\u001b\u0017(&\u0012?o\u007f\f#c", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class NativeViewGestureHandlerFactory extends HandlerFactory<NativeViewGestureHandler> {
        private final Class<NativeViewGestureHandler> type = NativeViewGestureHandler.class;
        private final String name = "NativeViewGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public void configure(NativeViewGestureHandler handler, ReadableMap config) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(config, "config");
            super.configure(handler, config);
            if (config.hasKey(RNGestureHandlerModule.KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START)) {
                handler.setShouldActivateOnStart(config.getBoolean(RNGestureHandlerModule.KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION)) {
                handler.setDisallowInterruption(config.getBoolean(RNGestureHandlerModule.KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public NativeViewGestureHandler create(Context context) {
            return new NativeViewGestureHandler();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public NativeGestureHandlerEventDataBuilder createEventBuilder(NativeViewGestureHandler handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new NativeGestureHandlerEventDataBuilder(handler);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public String getName() {
            return this.name;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public Class<NativeViewGestureHandler> getType() {
            return this.type;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\r.4\u0012}\bnjO0LeN/ZS8\u000fs{:$c$\bCCU }*\teNo˧vJp\u000bKƤ\f\u0016\u000f̓\\Oezm\u0012=2pn\u007f6ޜs=Ga=L\u0013*J\"f\u00055\u0005(6`\u0010%zsO\u001a\u001fH@\u001fH\u0019!\u0016\u0015(!\u001e>N\u0001Nbu^NJ\u0003\\h@i\u00172P\\9w0+`=Jb3%v\u0010\u001eqT\bG#'k\u00035U2ρEӭuC\rؒ?)1M\u0002\\\u0007p\u000e\u001a-1_\u000fmrT\\3X7І)˦SiSִ&*}\u0003\n\u0016ʆ\b\""}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[^1F\\U,\u001b=nFu\u0012h\u001d^8\rgUJ#uDD\u007f\u0004*X\fH|V", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[^1F\\U,\u001b5nF\u0013\u0019Z\u001b/'\u000b\u0014cN8D", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001X\u00127/CIzD+\u0015K]B\u0006j,[L", "u(E", "<`\\2", "", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Bx_2", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "5dc!l7>", "u(;7T=:\u001d z\u0004`uZ\u0010+s\u000e}", "1n]3\\.N`\u0019", "", "6`]1_,K", "1n]3\\.", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "1qT.g,", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "1qT.g,\u001ed\u0019\b\n;<\u0001\u0010.e\r", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0016?MLJhD\"\u001cgaF\u0015-\u0017J\u007f\tGZ]<iRU9\u001d\u0011a\u000e[\u000b\u001e\u0005bP\u0003jS3{\u00180P\u0001;uV", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class PanGestureHandlerFactory extends HandlerFactory<PanGestureHandler> {
        private final Class<PanGestureHandler> type = PanGestureHandler.class;
        private final String name = "PanGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public void configure(PanGestureHandler handler, ReadableMap config) {
            boolean z2;
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(config, "config");
            super.configure(handler, config);
            boolean z3 = true;
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_START)) {
                handler.setActiveOffsetXStart(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_START)));
                z2 = true;
            } else {
                z2 = false;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_END)) {
                handler.setActiveOffsetXEnd(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_END)));
                z2 = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_START)) {
                handler.setFailOffsetXStart(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_START)));
                z2 = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_END)) {
                handler.setFailOffsetXEnd(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_END)));
                z2 = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_START)) {
                handler.setActiveOffsetYStart(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_START)));
                z2 = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_END)) {
                handler.setActiveOffsetYEnd(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_END)));
                z2 = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_START)) {
                handler.setFailOffsetYStart(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_START)));
                z2 = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_END)) {
                handler.setFailOffsetYEnd(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_END)));
                z2 = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY)) {
                handler.setMinVelocity(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY)));
                z2 = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_X)) {
                handler.setMinVelocityX(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_X)));
                z2 = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_Y)) {
                handler.setMinVelocityY(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_Y)));
            } else {
                z3 = z2;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_DIST)) {
                handler.setMinDist(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_DIST)));
            } else if (z3) {
                handler.setMinDist(Float.MAX_VALUE);
            }
            if (config.hasKey("minPointers")) {
                handler.setMinPointers(config.getInt("minPointers"));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_MAX_POINTERS)) {
                handler.setMaxPointers(config.getInt(RNGestureHandlerModule.KEY_PAN_MAX_POINTERS));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_AVG_TOUCHES)) {
                handler.setAverageTouches(config.getBoolean(RNGestureHandlerModule.KEY_PAN_AVG_TOUCHES));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVATE_AFTER_LONG_PRESS)) {
                handler.setActivateAfterLongPress(config.getInt(RNGestureHandlerModule.KEY_PAN_ACTIVATE_AFTER_LONG_PRESS));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public PanGestureHandler create(Context context) {
            return new PanGestureHandler(context);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public PanGestureHandlerEventDataBuilder createEventBuilder(PanGestureHandler handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new PanGestureHandlerEventDataBuilder(handler);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public String getName() {
            return this.name;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public Class<PanGestureHandler> getType() {
            return this.type;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\r.4\u0012}\bnjO0LeN0ZS@\u000fsڔ<$q$yCAU }8ޛ\u007fTwi~J\t\u000bq\u000eF\u0019ѱn,WVAm \u0019JB\u001e?cS}HQb\u000b53,x6\u0001\b\u0013\u000e2*v\u001e'~QZ$\u0012^@7N#\u001f[\u00072\u00124Avӌ`֔kT>ԟ\u0005_@31\b:Z\\-w6\rO\u001dF\u0003';}8ӳ-Ë;;\u001dǬk\u0005\rZiHƊC\u0002"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[^1F\\U,\u001b=vF\u0012\u0015<\u000e\\:\u001d\u0012Y$ wC>\u001f\u0015\rE\u007fJr\u000e k", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[^1F\\U,\u001b5nF\u0013\u0019Z\u001b/'\u000b\u0014cN8D", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001X\u001a7KF\u001dkB-%ua\u001c\u0003l+Uv4\u001d", "u(E", "<`\\2", "", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Bx_2", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "5dc!l7>", "u(;7T=:\u001d z\u0004`uZ\u0010+s\u000e}", "1qT.g,", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "1qT.g,\u001ed\u0019\b\n;<\u0001\u0010.e\r", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0016?MLJhD\"\u001cgaF\u0015-\u0017R\u007f%J.N:kb\u007f=v\u000ec\rU+\u001adjA-}#3.\u0004\tY\u0006Bg\u0001\u0019k", "6`]1_,K", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class PinchGestureHandlerFactory extends HandlerFactory<PinchGestureHandler> {
        private final Class<PinchGestureHandler> type = PinchGestureHandler.class;
        private final String name = "PinchGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public PinchGestureHandler create(Context context) {
            return new PinchGestureHandler();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public PinchGestureHandlerEventDataBuilder createEventBuilder(PinchGestureHandler handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new PinchGestureHandlerEventDataBuilder(handler);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public String getName() {
            return this.name;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public Class<PinchGestureHandler> getType() {
            return this.type;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\r.4\u0012}\bnjO0LeN0ZS@\u000fsڔ<$q$yCAU }8ޛ\u007fTwi~J\t\u000bq\u000eF\u0019ѱn,WVAm \u0019JB\u001e?cS}HQb\u000b53,x6\u0001\b\u0013\u000e2*v\u001e'~QZ$\u0012^@7N#\u001f[\u00072\u00124Avӌ`֔kT>ԟ\u0005_@31\b:Z\\-w6\rO\u001dF\u0003';}8ӳ-Ë;;\u001dǬk\u0005\rZiHƊC\u0002"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[^1F\\U,\u001b?|L\u0010!^\u0018W\r\r\u0013hQ1n'3(\u00073I\u000f\u001cd~\u001b \u001bI@", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[^1F\\U,\u001b5nF\u0013\u0019Z\u001b/'\u000b\u0014cN8D", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001Z =IR?u=\u007f\u0015vpI\u0014c\u000fJ\u007f&NL[\u0002", "u(E", "<`\\2", "", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Bx_2", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "5dc!l7>", "u(;7T=:\u001d z\u0004`uZ\u0010+s\u000e}", "1qT.g,", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "1qT.g,\u001ed\u0019\b\n;<\u0001\u0010.e\r", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0016?MLJhD\"\u001cgaF\u0015-\u0019X\u0006#VPX5>R\u0001L$\u001fZpJ4\f\fYN\u0004\u007fD@.f(X}\u0018x\u0005\u0013\u0015\u000eB@", "6`]1_,K", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class RotationGestureHandlerFactory extends HandlerFactory<RotationGestureHandler> {
        private final Class<RotationGestureHandler> type = RotationGestureHandler.class;
        private final String name = "RotationGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public RotationGestureHandler create(Context context) {
            return new RotationGestureHandler();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public RotationGestureHandlerEventDataBuilder createEventBuilder(RotationGestureHandler handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new RotationGestureHandlerEventDataBuilder(handler);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public String getName() {
            return this.name;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public Class<RotationGestureHandler> getType() {
            return this.type;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\r.4\u0012}\bnjO0LeN/ZS8\u000fs{:$c$\bCCU }*\teNo˧vJp\u000bKƤ\f\u0016\u000f̓\\Oezm\u0012=2pn\u007f6ޜs=Ga=L\u0013*J\"f\u00055\u0005(6`\u0010%zsO\u001a\u001fH@\u001fH\u0019!\u0016\u0015(!\u001e>N\u0001Nbu^NJ\u0003\\h@i\u00172P\\9w0+`=Jb3%v\u0010\u001eqT\bG#'k\u00035U2ρEӭuC\rؒ?)1M\u0002\\\u0007p\u000e\u001a-1_\u000fmrT\\3X7І)˦SiSִ&*}\u0003\n\u0016ʆ\b\""}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[^1F\\U,\u001bAnHu\u0012h\u001d^8\rgUJ#uDD\u007f\u0004*X\fH|V", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[^1F\\U,\u001b5nF\u0013\u0019Z\u001b/'\u000b\u0014cN8D", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001\\\u00129/CIzD+\u0015K]B\u0006j,[L", "u(E", "<`\\2", "", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Bx_2", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "5dc!l7>", "u(;7T=:\u001d z\u0004`uZ\u0010+s\u000e}", "1n]3\\.N`\u0019", "", "6`]1_,K", "1n]3\\.", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "1qT.g,", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "1qT.g,\u001ed\u0019\b\n;<\u0001\u0010.e\r", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0016?MLJhD\"\u001cgaF\u0015-\u001bJ\u0002\tGZ]<iRU9\u001d\u0011a\u000e[\u000b\u001e\u0005bP\u0003jS3{\u00180P\u0001;uV", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class TapGestureHandlerFactory extends HandlerFactory<TapGestureHandler> {
        private final Class<TapGestureHandler> type = TapGestureHandler.class;
        private final String name = "TapGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public void configure(TapGestureHandler handler, ReadableMap config) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(config, "config");
            super.configure(handler, config);
            if (config.hasKey(RNGestureHandlerModule.KEY_TAP_NUMBER_OF_TAPS)) {
                handler.setNumberOfTaps(config.getInt(RNGestureHandlerModule.KEY_TAP_NUMBER_OF_TAPS));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DURATION_MS)) {
                handler.setMaxDurationMs(config.getInt(RNGestureHandlerModule.KEY_TAP_MAX_DURATION_MS));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELAY_MS)) {
                handler.setMaxDelayMs(config.getInt(RNGestureHandlerModule.KEY_TAP_MAX_DELAY_MS));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_X)) {
                handler.setMaxDx(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_X)));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_Y)) {
                handler.setMaxDy(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_Y)));
            }
            if (config.hasKey("maxDist")) {
                handler.setMaxDist(PixelUtil.toPixelFromDIP(config.getDouble("maxDist")));
            }
            if (config.hasKey("minPointers")) {
                handler.setMinNumberOfPointers(config.getInt("minPointers"));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public TapGestureHandler create(Context context) {
            return new TapGestureHandler();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public TapGestureHandlerEventDataBuilder createEventBuilder(TapGestureHandler handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new TapGestureHandlerEventDataBuilder(handler);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public String getName() {
            return this.name;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.HandlerFactory
        public Class<TapGestureHandler> getType() {
            return this.type;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.swmansion.gesturehandler.react.RNGestureHandlerModule$eventListener$1] */
    public RNGestureHandlerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.eventListener = new OnTouchEventListener() { // from class: com.swmansion.gesturehandler.react.RNGestureHandlerModule$eventListener$1
            @Override // com.swmansion.gesturehandler.core.OnTouchEventListener
            public <T extends GestureHandler<T>> void onHandlerUpdate(T handler, MotionEvent event) {
                Intrinsics.checkNotNullParameter(handler, "handler");
                Intrinsics.checkNotNullParameter(event, "event");
                this.this$0.onHandlerUpdate(handler);
            }

            @Override // com.swmansion.gesturehandler.core.OnTouchEventListener
            public <T extends GestureHandler<T>> void onStateChange(T handler, int i2, int i3) {
                Intrinsics.checkNotNullParameter(handler, "handler");
                this.this$0.onStateChange(handler, i2, i3);
            }

            @Override // com.swmansion.gesturehandler.core.OnTouchEventListener
            public <T extends GestureHandler<T>> void onTouchEvent(T handler) {
                Intrinsics.checkNotNullParameter(handler, "handler");
                this.this$0.onTouchEvent(handler);
            }
        };
        this.handlerFactories = new HandlerFactory[]{new NativeViewGestureHandlerFactory(), new TapGestureHandlerFactory(), new LongPressGestureHandlerFactory(), new PanGestureHandlerFactory(), new PinchGestureHandlerFactory(), new RotationGestureHandlerFactory(), new FlingGestureHandlerFactory(), new ManualGestureHandlerFactory(), new HoverGestureHandlerFactory()};
        this.registry = new RNGestureHandlerRegistry();
        this.interactionManager = new RNGestureHandlerInteractionManager();
        this.roots = new ArrayList();
        this.reanimatedEventDispatcher = new ReanimatedEventDispatcher();
    }

    private final <T extends GestureHandler<T>> void createGestureHandlerHelper(String str, int i2, ReadableMap readableMap) {
        if (this.registry.getHandler(i2) != null) {
            throw new IllegalStateException("Handler with tag " + i2 + " already exists. Please ensure that no Gesture instance is used across multiple GestureDetectors.");
        }
        for (HandlerFactory<?> handlerFactory : this.handlerFactories) {
            if (Intrinsics.areEqual(handlerFactory.getName(), str)) {
                GestureHandler<?> gestureHandlerCreate = handlerFactory.create(getReactApplicationContext());
                gestureHandlerCreate.setTag(i2);
                gestureHandlerCreate.setOnTouchEventListener(this.eventListener);
                this.registry.registerHandler(gestureHandlerCreate);
                this.interactionManager.configureInteractions(gestureHandlerCreate, readableMap);
                handlerFactory.configure(gestureHandlerCreate, readableMap);
                return;
            }
        }
        throw new JSApplicationIllegalArgumentException("Invalid handler name " + str);
    }

    private final native void decorateRuntime(long j2);

    private final <T extends GestureHandler<T>> HandlerFactory<T> findFactoryForHandler(GestureHandler<T> gestureHandler) {
        for (Object obj : this.handlerFactories) {
            HandlerFactory<T> handlerFactory = (HandlerFactory<T>) obj;
            if (Intrinsics.areEqual(handlerFactory.getType(), gestureHandler.getClass())) {
                return handlerFactory;
            }
        }
        return null;
    }

    private final RNGestureHandlerRootHelper findRootHelperForViewAncestor(int i2) {
        RNGestureHandlerRootHelper rNGestureHandlerRootHelper;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        int iResolveRootTagFromReactTag = ExtensionsKt.getUIManager(reactApplicationContext).resolveRootTagFromReactTag(i2);
        Object obj = null;
        if (iResolveRootTagFromReactTag < 1) {
            return null;
        }
        synchronized (this.roots) {
            Iterator<T> it = this.roots.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                RNGestureHandlerRootHelper rNGestureHandlerRootHelper2 = (RNGestureHandlerRootHelper) next;
                if ((rNGestureHandlerRootHelper2.getRootView() instanceof ReactRootView) && ((ReactRootView) rNGestureHandlerRootHelper2.getRootView()).getRootViewTag() == iResolveRootTagFromReactTag) {
                    obj = next;
                    break;
                }
            }
            rNGestureHandlerRootHelper = (RNGestureHandlerRootHelper) obj;
        }
        return rNGestureHandlerRootHelper;
    }

    public static final void install$lambda$2(RNGestureHandlerModule this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            SoLoader.loadLibrary("gesturehandler");
            JavaScriptContextHolder javaScriptContextHolder = this$0.getReactApplicationContext().getJavaScriptContextHolder();
            Intrinsics.checkNotNull(javaScriptContextHolder);
            this$0.decorateRuntime(javaScriptContextHolder.get());
        } catch (Exception unused) {
        }
    }

    public final <T extends GestureHandler<T>> void onHandlerUpdate(T t2) {
        HandlerFactory<T> handlerFactoryFindFactoryForHandler;
        if (t2.getTag() >= 0 && t2.getState() == 4 && (handlerFactoryFindFactoryForHandler = findFactoryForHandler(t2)) != null) {
            if (t2.getActionType() == 1) {
                sendEventForReanimated(RNGestureHandlerEvent.Companion.obtain$default(RNGestureHandlerEvent.Companion, t2, handlerFactoryFindFactoryForHandler.createEventBuilder(t2), false, 4, null));
                return;
            }
            if (t2.getActionType() == 2) {
                sendEventForNativeAnimatedEvent(RNGestureHandlerEvent.Companion.obtain(t2, handlerFactoryFindFactoryForHandler.createEventBuilder(t2), true));
            } else if (t2.getActionType() == 3) {
                sendEventForDirectEvent(RNGestureHandlerEvent.Companion.obtain$default(RNGestureHandlerEvent.Companion, t2, handlerFactoryFindFactoryForHandler.createEventBuilder(t2), false, 4, null));
            } else if (t2.getActionType() == 4) {
                sendEventForDeviceEvent("onGestureHandlerEvent", RNGestureHandlerEvent.Companion.createEventData(handlerFactoryFindFactoryForHandler.createEventBuilder(t2)));
            }
        }
    }

    public final <T extends GestureHandler<T>> void onStateChange(T t2, int i2, int i3) {
        HandlerFactory<T> handlerFactoryFindFactoryForHandler;
        if (t2.getTag() >= 0 && (handlerFactoryFindFactoryForHandler = findFactoryForHandler(t2)) != null) {
            if (t2.getActionType() == 1) {
                sendEventForReanimated(RNGestureHandlerStateChangeEvent.Companion.obtain(t2, i2, i3, handlerFactoryFindFactoryForHandler.createEventBuilder(t2)));
                return;
            }
            if (t2.getActionType() == 2 || t2.getActionType() == 3) {
                sendEventForDirectEvent(RNGestureHandlerStateChangeEvent.Companion.obtain(t2, i2, i3, handlerFactoryFindFactoryForHandler.createEventBuilder(t2)));
            } else if (t2.getActionType() == 4) {
                sendEventForDeviceEvent(RNGestureHandlerStateChangeEvent.EVENT_NAME, RNGestureHandlerStateChangeEvent.Companion.createEventData(handlerFactoryFindFactoryForHandler.createEventBuilder(t2), i2, i3));
            }
        }
    }

    public final <T extends GestureHandler<T>> void onTouchEvent(T t2) {
        if (t2.getTag() < 0) {
            return;
        }
        if (t2.getState() == 2 || t2.getState() == 4 || t2.getState() == 0 || t2.getView() != null) {
            if (t2.getActionType() == 1) {
                sendEventForReanimated(RNGestureHandlerTouchEvent.Companion.obtain(t2));
            } else if (t2.getActionType() == 4) {
                sendEventForDeviceEvent("onGestureHandlerEvent", RNGestureHandlerTouchEvent.Companion.createEventData(t2));
            }
        }
    }

    private final void sendEventForDeviceEvent(String str, WritableMap writableMap) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        ExtensionsKt.getDeviceEventEmitter(reactApplicationContext).emit(str, writableMap);
    }

    private final <T extends Event<T>> void sendEventForDirectEvent(T t2) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        ReactContextExtensionsKt.dispatchEvent(reactApplicationContext, t2);
    }

    private final void sendEventForNativeAnimatedEvent(RNGestureHandlerEvent rNGestureHandlerEvent) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        ReactContextExtensionsKt.dispatchEvent(reactApplicationContext, rNGestureHandlerEvent);
    }

    private final <T extends Event<T>> void sendEventForReanimated(T t2) {
        sendEventForDirectEvent(t2);
    }

    private final <T extends GestureHandler<T>> void updateGestureHandlerHelper(int i2, ReadableMap readableMap) {
        HandlerFactory<T> handlerFactoryFindFactoryForHandler;
        GestureHandler<?> handler = this.registry.getHandler(i2);
        if (handler == null || (handlerFactoryFindFactoryForHandler = findFactoryForHandler(handler)) == null) {
            return;
        }
        this.interactionManager.dropRelationsForHandlerWithTag(i2);
        this.interactionManager.configureInteractions(handler, readableMap);
        handlerFactoryFindFactoryForHandler.configure(handler, readableMap);
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void attachGestureHandler(double d2, double d3, double d4) {
        int i2 = (int) d2;
        if (!this.registry.attachHandlerToView(i2, (int) d3, (int) d4)) {
            throw new JSApplicationIllegalArgumentException("Handler with tag " + i2 + " does not exists");
        }
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void createGestureHandler(String handlerName, double d2, ReadableMap config) {
        Intrinsics.checkNotNullParameter(handlerName, "handlerName");
        Intrinsics.checkNotNullParameter(config, "config");
        createGestureHandlerHelper(handlerName, (int) d2, config);
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void dropGestureHandler(double d2) {
        int i2 = (int) d2;
        this.interactionManager.dropRelationsForHandlerWithTag(i2);
        this.registry.dropHandler(i2);
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void flushOperations() {
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return MapsKt.mapOf(TuplesKt.to("State", MapsKt.mapOf(TuplesKt.to("UNDETERMINED", 0), TuplesKt.to("BEGAN", 2), TuplesKt.to("ACTIVE", 4), TuplesKt.to("CANCELLED", 3), TuplesKt.to("FAILED", 1), TuplesKt.to("END", 5))), TuplesKt.to("Direction", MapsKt.mapOf(TuplesKt.to("RIGHT", 1), TuplesKt.to("LEFT", 2), TuplesKt.to("UP", 4), TuplesKt.to("DOWN", 8))));
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNGestureHandlerModule";
    }

    public final RNGestureHandlerRegistry getRegistry() {
        return this.registry;
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void handleClearJSResponder() {
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void handleSetJSResponder(double d2, boolean z2) {
        int i2 = (int) d2;
        RNGestureHandlerRootHelper rNGestureHandlerRootHelperFindRootHelperForViewAncestor = findRootHelperForViewAncestor(i2);
        if (rNGestureHandlerRootHelperFindRootHelperForViewAncestor != null) {
            rNGestureHandlerRootHelperFindRootHelperForViewAncestor.handleSetJSResponder(i2, z2);
        }
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean install() {
        getReactApplicationContext().runOnJSQueueThread(new Runnable() { // from class: com.swmansion.gesturehandler.react.RNGestureHandlerModule$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                RNGestureHandlerModule.install$lambda$2(this.f$0);
            }
        });
        return true;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        this.registry.dropAllHandlers();
        this.interactionManager.reset();
        synchronized (this.roots) {
            while (!this.roots.isEmpty()) {
                int size = this.roots.size();
                this.roots.get(0).tearDown();
                if (this.roots.size() >= size) {
                    throw new IllegalStateException("Expected root helper to get unregistered while tearing down");
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        super.invalidate();
    }

    public final void registerRootHelper(RNGestureHandlerRootHelper root) {
        Intrinsics.checkNotNullParameter(root, "root");
        synchronized (this.roots) {
            if (this.roots.contains(root)) {
                throw new IllegalStateException("Root helper" + root + " already registered");
            }
            this.roots.add(root);
        }
    }

    @Override // com.swmansion.common.GestureHandlerStateManager
    public void setGestureHandlerState(int i2, int i3) {
        GestureHandler<?> handler = this.registry.getHandler(i2);
        if (handler != null) {
            if (i3 == 1) {
                handler.fail();
                return;
            }
            if (i3 == 2) {
                handler.begin();
                return;
            }
            if (i3 == 3) {
                handler.cancel();
            } else if (i3 == 4) {
                handler.activate(true);
            } else {
                if (i3 != 5) {
                    return;
                }
                handler.end();
            }
        }
    }

    public final void unregisterRootHelper(RNGestureHandlerRootHelper root) {
        Intrinsics.checkNotNullParameter(root, "root");
        synchronized (this.roots) {
            this.roots.remove(root);
        }
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void updateGestureHandler(double d2, ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
        updateGestureHandlerHelper((int) d2, config);
    }
}
