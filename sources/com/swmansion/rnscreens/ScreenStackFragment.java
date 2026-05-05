package com.swmansion.rnscreens;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.swmansion.rnscreens.ScreenStackHeaderSubview;
import com.swmansion.rnscreens.bottomsheet.BottomSheetBehaviorExtKt;
import com.swmansion.rnscreens.bottomsheet.DimmingViewManager;
import com.swmansion.rnscreens.bottomsheet.SheetDelegate;
import com.swmansion.rnscreens.bottomsheet.SheetUtils;
import com.swmansion.rnscreens.bottomsheet.SheetUtilsKt;
import com.swmansion.rnscreens.events.ScreenAnimationDelegate;
import com.swmansion.rnscreens.events.ScreenDismissedEvent;
import com.swmansion.rnscreens.events.ScreenEventEmitter;
import com.swmansion.rnscreens.ext.ViewExtKt;
import com.swmansion.rnscreens.transition.ExternalBoundaryValuesEvaluator;
import com.swmansion.rnscreens.utils.DeviceUtils;
import com.swmansion.rnscreens.utils.ViewBackgroundUtilsKt;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;

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
@Metadata(bv = {}, d1 = {"Яŉ\u0014D57\u001eq\u007fZDkt\u001aA\u000eֶ\u0013.X~*,\u0018x\u000ff\u000198ǏmH4S[*%k\u0004é,[:qK;k\u001a\u0006̝\u0011O\\ponPZ\u0013C\u0015\u0007\u001ex\u0001,Qǁ\u0001](\u000f:BuB;M\u0006=A`\u000b6\r H\"@y\u000b\u0001\"*V\u0010~zIN\u0014\u0012F@x:X\u0012U\u00050\u0012\u000ē(\u00014\\oN<Jt]P/+\u0003oBV'u0\u0005M\u0013O\\'#viӜ3@M5\u001dǬ[\u0003\u0015Xc?\t@y=\u001bh/'1I{WLX\bϬ\u001d+e\reö.\\\u001bQhϯ/+ecSP\u0014= z\u0004 Rǉ>\u0006UG^-Hf@\u000e!c3`Fe\u0012bP\u0001\u0013ad\u0019Ӿ\u000439<[kWuޅ\u001dNE\u007fM\u001b,W\u0019nO~\u0005\u0012nJ3T&SwQ\tCV\u0005\"Yk}J\u0005++8;HM\u00101\f\u0011\\\u0019So\fC1Z\u0004\bXFwv3b\u0017\f\u001aXN@0).7XDRɮֈh\u0005q\r\u001dd:Ne\"d\t\u000e\bA\"\u000b0\u0003!m\u001c\\\u000e\u0001ozOm\nS1\u0015o n4\u0014exv3ct*$*]\u0005TW<\u0011(\u001f٨͞W\f`\u001ep*@\u000b\u0003\u0012\u000ezrdR\u0013zE\u007f_L,_<#\u0015\u0011\t,\u0007Y|7\u0003!|X\u000fbx<\u0003\u0018G%\u000f\u000f\u0017tr\u0006f'\u0011r\u0011)B;\ni7/%\u0004k\u00198\u000bm\u001f~\"KwkZ\u0014dlD\u0006\u0006\u007f.c29\u007fz\u0004'W\u001f7\u0001\u001a/[K!5\u0002Q q\u0013|(Zkl<4 j\u001f<\u0011nX\u001dl\u0017PB%\u0007k\u001erP\u0012at\u001ewgb\\s>wE3]J\"P|3sd9I\u00120RM-q=M\u001a\u0006gG\u0015\u00104\u001au<Qz\u0011<s\u0014\\\\i$6zSs1i\u007f\u0010mGL0}\u0005\u0003pk\u001b{\u0016\u0014!4;\u0006\u000fU-{d\u0013e\u000b]!-߿Ր\u0011p\\7\u0003\u0019}ZL.\u000eM:WF\u001al!=\u0011{v.\u00026Qjib\u000f8.BE7**\u001d8V\u0006\u000694\u0014T06oQ\u0013\u000bJO<6B;6R\nh2\f\u001e\\\u0018F\u000e2]F\u000b\tI9&V\u000f[\u0005\u00145dS\u00169*/\u0001U3\u038b|5?h6Tb\u0014{2/vM\r)\u001dg~\u0015XqX\u001dG)\u000ep\u00019h\u000eGWhN\u0004u94\u007f8\u001aF\u007f\u0015\u001dp;K=_ywv^nQi-Tr`*f\u0001^h)G\b\u000bxT\f%\nG\u001b9oܑ1L\\c\u007fQ(m/DW*<\u0001q\u00183-4\bs=\u001ax\",\u0014Yi:,\u000evì3ؗx!dަ^t\u0018d3:Dylȋ\u0004Ƥ\u0017R(\u0004<SE~\u00188 6}\r\nû?Ȩ]k\u007f˺\u001199x\u001eH[j\t\n\u0012z\u0012{,̆\u0005Ђ5V\u0002ҧ}\\+\u0018?M\\#/ŗFñW `ҹP #7766r\u007fք[ʍlpsχ,\u001b9A\u0004*\u0010D\u0007ܿ ݼ#{}\u00048hx#Ike@z\b\u000b\u0003\u0019ģ\u001a߿n(lÆ\\C\"\u0014\u0017Jt\u0010AL\u001dݸ*Ү3C!ےs\u000fMy\u0015\u001eeK,<?n\u0010PEO#\r8\b!\u0012h\u0002߰\u00044H)\u0003\u0006mM=HZC@Ii&}d1IaDf`^ϻ\u001dã\u0015;b߀8@b>*`q5G?\u001f(eJ\u0014\u0018\u001f\u0019c\u0014\b\u0014{ܼ\u0003Ϙ\u0005\u0011W{7\u0016H\u001f\b\r1Q'q1V\u0015Z{˦qͺ+\u0018\nʆb\u0001S\u0010d<\u0002.OcSMJcN0\"!:#4'yǊQ˜L*gЇ\u0011d\u0002\n\u001c(@5\u001dwy\u061cxՐw\n4ʖҋwT"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>G\r\u001c5sv;IECk=-j", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>:\u000b\u001c9u\u00167\\\u0019", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>G\r\u001c5sv;IECk=-\u0007u]D\u0012c9$", "Aba2X5/W\u0019\u0011", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>/", "uKR<`uLe!z\u0004l0\u0007\u0012xr\t6yM\u0001\u0017 U9{:\u0004%5bSc(", "u(E", "/o_\u000fT9%O-\t\u000bm", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EH|&\u0017Ts\nC@!@dz\u001cD7q9X 7x\u001b\u001a)rqH\\", "0ncAb4,V\u0019~\nL;x\u0018/C{/\u0003=|\u0015\u001d", "1n\\{f>FO\"\r~h5F\u00168s}5{@\n%`5m\u001b<v.#hy\u001e=N#*OK;tC\\\u0012rpH\u0011k\u001aQv'V:](kRP9\u001b\u0019W\nL1KP", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>G\r\u001c5sv;IECk=-SekH\u0016m4<y'G[<;Xar\u001b\u0010\u0019a\u000bJ)\u0013C%\u0017", "1n^?W0GO(\t\bE(\u0011\u0013?t", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>G\r\u001c5sv;IECk=-SV_F\u0007c5\\T1QYM0eN\u0002G!xV\"X;\u001cZ", "2h\\:\\5@2\u0019\u0006z`(\f\t", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011l\u0018K\u0006/=g\u0001 7|_\rQKCo= \u0006laKn_5Jx'T\"", "7rC<b3;O&l}Z+\u0007\u001b\u0012i~'{I", "", "7rC<b3;O&m\bZ5\u000b\u0010?c\u007f1\u000b", "9dh/b(KR\u0007\u0002z^;Z\u00056l|$yF", "1n\\{f>FO\"\r~h5F\u00168s}5{@\n%`5m\u001b<v.#hy\u001e=N#*OK;tC\\\u001bhu6\u0011_9Md*GL]\nXYy:\u0010\u0010`L\u001a", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>G\r\u001c5sv;IECk=-SnaM\u0004m([u\u0015JLN;:NyD\u0011\u000eX\u0014\rvb", ":`bA96<c'~y</\u0001\u0010.", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "<`c6i,\u001dW'\u0007~l:x\u0010\u0019b\u000e(\tQ\u0001$", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011X\nKz658\u0002.?q$<IJ%hB\u001e\"yaF\\", "5dc\u001bT;Bd\u0019]~l4\u0001\u0017=a\u0007\u0012xN\u0001$(G|", "u(;0b4\ba+\u0007vg:\u0001\u00138/\r1\n>\u000e\u0017\u0017P}W%r49j}~;{\u001e2[Q7r\u001e\u001b#hnJ\u0007p\u0002", "Adc\u001bT;Bd\u0019]~l4\u0001\u0017=a\u0007\u0012xN\u0001$(G|", "uKR<`uLe!z\u0004l0\u0007\u0012xr\t6yM\u0001\u0017 U9v8\u0006)FY\\$Eu\u001a<[?BU1,\u0015ur9\u00149o?", "=mB2T9<V\n\u0003zp\n\n\t+t\u007f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011M\u001eJ\u0006/=G}\u001cDk\u0019\u001fQCMA", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "AdP?V//W\u0019\u0011", "", "5dc\u001ca\u001a>O&|}O0|\u001b\rr\u007f$\u000b@", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "Adc\u001ca\u001a>O&|}O0|\u001b\rr\u007f$\u000b@", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc(", "Aba2X5,b\u0015|\u0001", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>G\r\u001c5sk", "5dc V9>S\"l\nZ*\u0003", "u(;0b4\ba+\u0007vg:\u0001\u00138/\r1\n>\u000e\u0017\u0017P}W*t25Y\u0007\u000eFi\u00144#", "5dc X(KQ\u001co~^>", "u(;0b4\ba+\u0007vg:\u0001\u00138/\r1\n>\u000e\u0017\u0017P}W\u001a\u00073Dc\u0006\u000e7i#,P4?kFs", "Adc X(KQ\u001co~^>", "uKR<`uLe!z\u0004l0\u0007\u0012xr\t6yM\u0001\u0017 U9kL\u00054?ak 3z\u00141>G;}\na\u0006", "AgT2g\u000b>Z\u0019\u0001vm,", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011l\u0018K\u0006/=g\u0001 7|_\u001cPC;z\u0013\u001e\u001chc5\u0016c\u0002", "Bn^9U(K", "\u001a`]1e6BR,Hvi7z\u00137p{7ER\u0005\u0016\u0019G~W+\u0001/<Vy-\r", "/sc.V/,V\u0015\nzM6j\u0007<e\u007f1", "Aba2X5", "1`]\u001bT=BU\u0015\u000ez;(z\u000f", "1n]3\\.N`\u0019[\u0005m;\u0007\u0011\u001dh\u007f(\u000b\u001d\u0001\u001a\u0013Xs\u0018L\u0004", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EH|&\u0017Ts\nC@\"?h\r*?{\u0019.MR\u0005H>-$ri'\nc,]S'JH_0f_H", "0dW.i0H`", "9dh/b(KR\u0007\u000evm,", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011U\u000ePs/1f|\u000eFi%.#", "1n]3\\.N`\u0019[\u0005m;\u0007\u0011\u001dh\u007f(\u000b\u001d\u0001\u001a\u0013Xs\u0018L\u0004cBYy\u001eFg\u001f*\\GLk.,\u0013ua9\u0010q&[v.GH\\,", "1qT.g,\u001a\\\u0018\\\u0005g-\u0001\u000b?r\u007f\u0005\u0006O\u0010!\u001f5r\u000e<\u0006\u00025\\y1;w&;", "1qT.g,\u001b](\u000e\u0005f\u001a\u007f\t/t\\(~<\u0012\u001b!W|", "2hb:\\:L4&\t\u0003<6\u0006\u0018+i\t(\t", "2hb:\\:LA\u0019\u0006{", "2hb:\\:LA\u0019\u0006{\u001d9|\u0005-ty1wO\u0005(\u0017A}\fIv%>gw-7t\u0016*[C", "4h]1?(Lby\txn:|\b\rh\u0004/z", "<nc6Y@/W\u0019\u0011Vi7|\u0005<T\r$\u0005N\u0005&\u001bQxmEu", "=m2<a;:W\"~\bN7{\u0005>e", "=m2?X(MS", "A`e2W\u0010Ga(z\u0004\\,j\u0018+t\u007f", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "=m2?X(MSt\b~f(\f\r9n", "\u001a`]1e6BRb\u0010~^>F\u00058i\b$\u000bD\u000b `#x\u0012Dr49c\u0007u", "BqP;f0M", "", "3mc2e", "<dgA45B[", "=m2?X(MSt\b~f(\f\u0013<", "\u001a`]1e6BRbz\u0004b4x\u00183o\tqWI\u0005\u001f\u0013Vy\u001b\u0012", "=m2?X(MS\u0003\n\nb6\u0006\u0017\u0017e\t8", ";d]B", "\u001a`]1e6BRb\u0010~^>Fp/n\u0010}", "7mU9T;>`", "\u001a`]1e6BRb\u0010~^>Fp/n\u0010\f\u0005A\b\u0013&G|c", "=m2?X(MS\n\u0003zp", "\u001a`]1e6BRb\u0010~^>Fo+y\n8\u000b$\n\u0018\u001eC~\u000eIL", "1n]AT0GS&", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "=m??X7:`\u0019h\u0006m0\u0007\u0012=M\u007f1\f", "=mB5X,M1#\f\u0004^9i\u0005.i\u00106YC| \u0019G", "=mB5X,M1#\f\u0004^9i\u0005.i\u00106YC| \u0019G.\u001b<r#DS\u0007\u001cFq'.GQ9x4\u001e\u001ev[F\u0007j,J\u0005'", "=mBAT9M", "=mBAb7", "=mE6X>\u001a\\\u001d\u0007vm0\u0007\u0012\u000fn~", "=mE6X>\u001c`\u0019z\n^+", "DhTD", "@d\\<i,-]#\u0006wZ9", "@db<_=>0\u0015|\u0001`9\u0007\u00198d]2\u0003J\u000e", "uKR<`uLe!z\u0004l0\u0007\u0012xr\t6yM\u0001\u0017 U9{:\u0004%5bSc\u001er\u0012?I\rBg= ^LjH\u0007e,[L", "Adc!b6EP\u0015\f", "Adc!b6EP\u0015\fha({\u0013AH\u0004'z@\n", "6hS1X5", "Adc!b6EP\u0015\fik(\u0006\u00176u}(\u0005O", "BqP;f3NQ\u0019\b\n", "Ag^B_+,V#\u0011h^(\n\u00072B{5", "Bqh\u001fX:HZ*~Xh5\f\u00053n\u007f5^@\u0005\u0019\u001aV", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", "CoS.g,-]#\u0006wZ9d\t8u", "!ba2X5L/\"\u0003\u0003Z;\u0001\u00138", "!ba2X5L1#\t\b]0\u0006\u0005>o\r\u000fwT\u000b'&", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ScreenStackFragment extends ScreenFragment implements ScreenStackFragmentWrapper {
    private AppBarLayout appBarLayout;
    private final ScreenStackFragment$bottomSheetStateCallback$1 bottomSheetStateCallback;
    private ScreensCoordinatorLayout coordinatorLayout;
    private final Lazy<DimmingViewManager> dimmingDelegate;
    private boolean isToolbarShadowHidden;
    private boolean isToolbarTranslucent;
    private final ScreenStackFragment$keyboardSheetCallback$1 keyboardSheetCallback;
    private View lastFocusedChild;
    private NativeDismissalObserver nativeDismissalObserver;
    private Function1<? super CustomSearchView, Unit> onSearchViewCreate;
    private CustomSearchView searchView;
    private SheetDelegate sheetDelegate;
    private Toolbar toolbar;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u0012\u007fјnjG5L͜P.hS2şq{Jř\f$ B{`*\u00020\tgN\u0016hĔNZ\u0019EW\u001c${\u0003,wY)a \u0014JB\u001eEcQ}DQ`#>K2\u0003.Fy\u001d\u0001H+\u001fƸxټGK\u0014۵ؼDy"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>G\r\u001c5sv;IECk=-SV_F\u0007c5\\R0KTJ;`\\{\u0013", "\u001a`]1e6BRb\u0010~^>F\u00058i\b$\u000bD\u000b `#x\u0012Dr49c\u0007u", ";Ea.Z4>\\(", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>:\u000b\u001c9u\u00167\\\u0019", "uKR<`uLe!z\u0004l0\u0007\u0012xr\t6yM\u0001\u0017 U9{:\u0004%5b^-3o\u001e.VR\u0011/%", "/o_9l\u001bKO\"\r{h9\u0005\u0005>i\n1", "", "7mc2e7HZ\u0015\u000ez]\u001b\u0001\u0011/", "", "B", "\u001a`]1e6BRb\u0010~^>F\u00058i\b$\u000bD\u000b `6|\nE\u0005&?f\u0006\u001cFq 7#", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class ScreensAnimation extends Animation {
        private final ScreenFragment mFragment;

        public ScreensAnimation(ScreenFragment mFragment) {
            Intrinsics.checkNotNullParameter(mFragment, "mFragment");
            this.mFragment = mFragment;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float f2, Transformation t2) {
            Intrinsics.checkNotNullParameter(t2, "t");
            super.applyTransformation(f2, t2);
            this.mFragment.dispatchTransitionProgressEvent(f2, !r1.isResumed());
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?0Le^.Zݷ2\u000fy{<řc$\bCC٥\"}8\tWNmhvJp\u000bKƤ\f\u0016\u000f̓\\I\u0004w\u000e\u0012=2\u0003\u0003O7[pU9\u000fvF\t.5:8(\tв\u001e*V\u0015?\u0001QS$\u0012^I7N\u001b\u0013[\u000f2\u00124If\u0015fluZNH\u001bjj51\u0011\u0002Dd&\u000e=CaUTb6%v\u0010'[DEE-%\u0002\u0014Mf,K\u0011E\n=3o}ݓ-ʁwW>ݙP #.g\r\fv|؛\u0007Ōd\f/˃ջg]"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>G\r\u001c5sv;IECk=-SV_F\u0007c5\\T1QYM0eN\u0002G!xV\"X;\u001cZ", "\u001a`]1e6BR,Hxh6\n\b3n{7\u0006M\b\u0013+Q\u007f\u001d\u0006\t)4[}/\u0001K 8ZB?t0-\u001fuH5\u001bm<]L", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\"Yy\u001eFX 2VR;x\u0014/\u0015qpGwg,`L", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "4qP4`,Gb", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>G\r\u001c5sv;IECk=-j", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~g\u0010(3v$2WL\u0005x=,\u0013ua9\u0010qu<t4GLW\u001akNpCt\u001fV\u0010V+\u0016\u0014/\u0005\u0015", "/mX:T;B]\"e~l;|\u0012/r", "\u001a`]1e6BRb\u0010~^>F\u00058i\b$\u000bD\u000b `#x\u0012Dr49c\u0007^\u0013v\u001a6IR?u=\u0005\u0019vp9\u0010c9$", "1kT.e\rHQ)\r", "", "5dc\u001db0Gb\u0019\fZo,\u0006\u0018=", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n c\u0002)Fm#\u000e^CDzBs", "=m0=c3RE\u001d\byh>`\u0012=e\u000f6", "\u001a`]1e6BRb\u0010~^>Fz3n~2\u000e$\n%\u0017V}c", "7mb2g:", "AsP?g\bGW!z\nb6\u0006", "/mX:T;B]\"", "\u001a`]1e6BRb\u0010~^>F\u00058i\b$\u000bD\u000b `#x\u0012Dr49c\u0007u", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class ScreensCoordinatorLayout extends CoordinatorLayout implements ReactPointerEventsView {
        private final Animation.AnimationListener animationListener;
        private final ScreenStackFragment fragment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScreensCoordinatorLayout(Context context, ScreenStackFragment fragment) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            this.fragment = fragment;
            this.animationListener = new Animation.AnimationListener() { // from class: com.swmansion.rnscreens.ScreenStackFragment$ScreensCoordinatorLayout$animationListener$1
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    this.this$0.fragment.onViewAnimationEnd();
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    this.this$0.fragment.onViewAnimationStart();
                }
            };
        }

        @Override // android.view.ViewGroup, android.view.View
        public void clearFocus() {
            if (getVisibility() != 4) {
                super.clearFocus();
            }
        }

        @Override // com.facebook.react.uimanager.ReactPointerEventsView
        public PointerEvents getPointerEvents() {
            return PointerEvents.BOX_NONE;
        }

        @Override // android.view.View
        public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
            WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
            Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
            return windowInsetsOnApplyWindowInsets;
        }

        @Override // android.view.View
        public void startAnimation(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            ScreensAnimation screensAnimation = new ScreensAnimation(this.fragment);
            screensAnimation.setDuration(animation.getDuration());
            if ((animation instanceof AnimationSet) && !this.fragment.isRemoving()) {
                AnimationSet animationSet = (AnimationSet) animation;
                animationSet.addAnimation(screensAnimation);
                animationSet.setAnimationListener(this.animationListener);
                super.startAnimation(animationSet);
                return;
            }
            AnimationSet animationSet2 = new AnimationSet(true);
            animationSet2.addAnimation(animation);
            animationSet2.addAnimation(screensAnimation);
            animationSet2.setAnimationListener(this.animationListener);
            super.startAnimation(animationSet2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.swmansion.rnscreens.ScreenStackFragment$bottomSheetStateCallback$1] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.swmansion.rnscreens.ScreenStackFragment$keyboardSheetCallback$1] */
    public ScreenStackFragment() {
        this.dimmingDelegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<DimmingViewManager>() { // from class: com.swmansion.rnscreens.ScreenStackFragment$dimmingDelegate$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final DimmingViewManager invoke() {
                return new DimmingViewManager(this.this$0.getScreen().getReactContext(), this.this$0.getScreen());
            }
        });
        this.bottomSheetStateCallback = new BottomSheetBehavior.BottomSheetCallback() { // from class: com.swmansion.rnscreens.ScreenStackFragment$bottomSheetStateCallback$1
            private int lastStableState;

            {
                this.lastStableState = SheetUtils.INSTANCE.sheetStateFromDetentIndex(this.this$0.getScreen().getSheetInitialDetentIndex(), this.this$0.getScreen().getSheetDetents().size());
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onSlide(View bottomSheet, float f2) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onStateChanged(View bottomSheet, int i2) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                if (SheetUtils.INSTANCE.isStateStable(i2)) {
                    this.lastStableState = i2;
                    this.this$0.getScreen().notifySheetDetentChange$react_native_screens_release(SheetUtils.INSTANCE.detentIndexFromSheetState(this.lastStableState, this.this$0.getScreen().getSheetDetents().size()), true);
                } else if (i2 == 1) {
                    this.this$0.getScreen().notifySheetDetentChange$react_native_screens_release(SheetUtils.INSTANCE.detentIndexFromSheetState(this.lastStableState, this.this$0.getScreen().getSheetDetents().size()), false);
                }
                if (i2 == 5) {
                    this.this$0.dismissSelf$react_native_screens_release();
                }
            }
        };
        this.keyboardSheetCallback = new BottomSheetBehavior.BottomSheetCallback() { // from class: com.swmansion.rnscreens.ScreenStackFragment$keyboardSheetCallback$1
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onSlide(View bottomSheet, float f2) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onStateChanged(View view, int i2) throws Throwable {
                short sXd = (short) (FB.Xd() ^ 5578);
                short sXd2 = (short) (FB.Xd() ^ 29769);
                int[] iArr = new int["SCip{&9t_S\u0010".length()];
                QB qb = new QB("SCip{&9t_S\u0010");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd2) + sXd)));
                    i3++;
                }
                Intrinsics.checkNotNullParameter(view, new String(iArr, 0, i3));
                if (i2 == 4 && WindowInsetsCompat.toWindowInsetsCompat(view.getRootWindowInsets()).isVisible(WindowInsetsCompat.Type.ime())) {
                    view.requestFocus();
                    Context contextRequireContext = this.this$0.requireContext();
                    Object[] objArr = {InputMethodManager.class};
                    Method method = Class.forName(C1626yg.Ud("'\u001eEgy\r\u007f\u007fC\u001a\u001aR,\u0003W\f<\u0011g9%\"V", (short) (Od.Xd() ^ (-10804)), (short) (Od.Xd() ^ (-15421)))).getMethod(EO.Od("\u000b1pu\u0016l?\u0013iQ_\r[^2X", (short) (C1499aX.Xd() ^ (-22948))), Class.forName(Ig.wd("Y\"\u0007Tw`\u00047l&?Hisy", (short) (Od.Xd() ^ (-3254)))));
                    try {
                        method.setAccessible(true);
                        ((InputMethodManager) method.invoke(contextRequireContext, objArr)).hideSoftInputFromWindow(view.getWindowToken(), 0);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            }
        };
        throw new IllegalStateException("ScreenStack fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.swmansion.rnscreens.ScreenStackFragment$bottomSheetStateCallback$1] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.swmansion.rnscreens.ScreenStackFragment$keyboardSheetCallback$1] */
    public ScreenStackFragment(Screen screenView) {
        super(screenView);
        Intrinsics.checkNotNullParameter(screenView, "screenView");
        this.dimmingDelegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<DimmingViewManager>() { // from class: com.swmansion.rnscreens.ScreenStackFragment$dimmingDelegate$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final DimmingViewManager invoke() {
                return new DimmingViewManager(this.this$0.getScreen().getReactContext(), this.this$0.getScreen());
            }
        });
        this.bottomSheetStateCallback = new BottomSheetBehavior.BottomSheetCallback() { // from class: com.swmansion.rnscreens.ScreenStackFragment$bottomSheetStateCallback$1
            private int lastStableState;

            {
                this.lastStableState = SheetUtils.INSTANCE.sheetStateFromDetentIndex(this.this$0.getScreen().getSheetInitialDetentIndex(), this.this$0.getScreen().getSheetDetents().size());
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onSlide(View bottomSheet, float f2) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onStateChanged(View bottomSheet, int i2) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                if (SheetUtils.INSTANCE.isStateStable(i2)) {
                    this.lastStableState = i2;
                    this.this$0.getScreen().notifySheetDetentChange$react_native_screens_release(SheetUtils.INSTANCE.detentIndexFromSheetState(this.lastStableState, this.this$0.getScreen().getSheetDetents().size()), true);
                } else if (i2 == 1) {
                    this.this$0.getScreen().notifySheetDetentChange$react_native_screens_release(SheetUtils.INSTANCE.detentIndexFromSheetState(this.lastStableState, this.this$0.getScreen().getSheetDetents().size()), false);
                }
                if (i2 == 5) {
                    this.this$0.dismissSelf$react_native_screens_release();
                }
            }
        };
        this.keyboardSheetCallback = new BottomSheetBehavior.BottomSheetCallback() { // from class: com.swmansion.rnscreens.ScreenStackFragment$keyboardSheetCallback$1
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onSlide(View bottomSheet, float f2) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onStateChanged(View view, int i2) throws Throwable {
                short sXd = (short) (FB.Xd() ^ 5578);
                short sXd2 = (short) (FB.Xd() ^ 29769);
                int[] iArr = new int["SCip{&9t_S\u0010".length()];
                QB qb = new QB("SCip{&9t_S\u0010");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd2) + sXd)));
                    i3++;
                }
                Intrinsics.checkNotNullParameter(view, new String(iArr, 0, i3));
                if (i2 == 4 && WindowInsetsCompat.toWindowInsetsCompat(view.getRootWindowInsets()).isVisible(WindowInsetsCompat.Type.ime())) {
                    view.requestFocus();
                    Context contextRequireContext = this.this$0.requireContext();
                    Object[] objArr = {InputMethodManager.class};
                    Method method = Class.forName(C1626yg.Ud("'\u001eEgy\r\u007f\u007fC\u001a\u001aR,\u0003W\f<\u0011g9%\"V", (short) (Od.Xd() ^ (-10804)), (short) (Od.Xd() ^ (-15421)))).getMethod(EO.Od("\u000b1pu\u0016l?\u0013iQ_\r[^2X", (short) (C1499aX.Xd() ^ (-22948))), Class.forName(Ig.wd("Y\"\u0007Tw`\u00047l&?Hisy", (short) (Od.Xd() ^ (-3254)))));
                    try {
                        method.setAccessible(true);
                        ((InputMethodManager) method.invoke(contextRequireContext, objArr)).hideSoftInputFromWindow(view.getWindowToken(), 0);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            }
        };
    }

    private final void attachShapeToScreen(Screen screen) {
        float pixelFromDIP = PixelUtil.toPixelFromDIP(screen.getSheetCornerRadius());
        ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel.Builder();
        builder.setTopLeftCorner(0, pixelFromDIP);
        builder.setTopRightCorner(0, pixelFromDIP);
        ShapeAppearanceModel shapeAppearanceModelBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(shapeAppearanceModelBuild, "build(...)");
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModelBuild);
        Integer numResolveBackgroundColor = resolveBackgroundColor(screen);
        materialShapeDrawable.setTint(numResolveBackgroundColor != null ? numResolveBackgroundColor.intValue() : 0);
        screen.setBackground(materialShapeDrawable);
    }

    public static /* synthetic */ BottomSheetBehavior configureBottomSheetBehaviour$react_native_screens_release$default(ScreenStackFragment screenStackFragment, BottomSheetBehavior bottomSheetBehavior, KeyboardState keyboardState, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            keyboardState = KeyboardNotVisible.INSTANCE;
        }
        return screenStackFragment.configureBottomSheetBehaviour$react_native_screens_release(bottomSheetBehavior, keyboardState);
    }

    private final BottomSheetBehavior<Screen> createAndConfigureBottomSheetBehaviour() {
        return configureBottomSheetBehaviour$react_native_screens_release$default(this, createBottomSheetBehaviour(), null, 2, null);
    }

    private final BottomSheetBehavior<Screen> createBottomSheetBehaviour() {
        return new BottomSheetBehavior<>();
    }

    private final View findLastFocusedChild() {
        Screen screen = getScreen();
        while (screen != null) {
            if (screen.isFocused()) {
                return screen;
            }
            screen = screen instanceof ViewGroup ? ((ViewGroup) screen).getFocusedChild() : null;
        }
        return null;
    }

    private final ScreenStack getScreenStack() {
        ScreenContainer container = getScreen().getContainer();
        if (container instanceof ScreenStack) {
            return (ScreenStack) container;
        }
        throw new IllegalStateException("ScreenStackFragment added into a non-stack container".toString());
    }

    private final void notifyViewAppearTransitionEnd() {
        View view = getView();
        ViewParent parent = view != null ? view.getParent() : null;
        if (parent instanceof ScreenStack) {
            ((ScreenStack) parent).onViewAppearTransitionEnd();
        }
    }

    public static final void onCreateAnimator$lambda$10$lambda$9(ScreenStackFragment this$0, ValueAnimator anim) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(anim, "anim");
        Object animatedValue = anim.getAnimatedValue();
        Float f2 = animatedValue instanceof Float ? (Float) animatedValue : null;
        if (f2 != null) {
            this$0.dimmingDelegate.getValue().getDimmingView$react_native_screens_release().setAlpha(f2.floatValue());
        }
    }

    public static final void onCreateAnimator$lambda$13$lambda$12(ScreenStackFragment this$0, ValueAnimator anim) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(anim, "anim");
        Object animatedValue = anim.getAnimatedValue();
        Float f2 = animatedValue instanceof Float ? (Float) animatedValue : null;
        if (f2 != null) {
            this$0.getScreen().setTranslationY(f2.floatValue());
        }
    }

    public static final void onCreateAnimator$lambda$16$lambda$15(ScreenStackFragment this$0, ValueAnimator anim) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(anim, "anim");
        Object animatedValue = anim.getAnimatedValue();
        Float f2 = animatedValue instanceof Float ? (Float) animatedValue : null;
        if (f2 != null) {
            this$0.dimmingDelegate.getValue().getDimmingView$react_native_screens_release().setAlpha(f2.floatValue());
        }
    }

    public static final void onCreateAnimator$lambda$19$lambda$18(ScreenStackFragment this$0, ValueAnimator anim) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(anim, "anim");
        Object animatedValue = anim.getAnimatedValue();
        Float f2 = animatedValue instanceof Float ? (Float) animatedValue : null;
        if (f2 != null) {
            this$0.getScreen().setTranslationY(f2.floatValue());
        }
    }

    private final Integer resolveBackgroundColor(Screen screen) {
        Integer numValueOf;
        ColorStateList tintList;
        Drawable background = screen.getBackground();
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        if (colorDrawable != null) {
            numValueOf = Integer.valueOf(colorDrawable.getColor());
        } else {
            Drawable background2 = screen.getBackground();
            MaterialShapeDrawable materialShapeDrawable = background2 instanceof MaterialShapeDrawable ? (MaterialShapeDrawable) background2 : null;
            numValueOf = (materialShapeDrawable == null || (tintList = materialShapeDrawable.getTintList()) == null) ? null : Integer.valueOf(tintList.getDefaultColor());
        }
        if (numValueOf != null) {
            return numValueOf;
        }
        ScreenContentWrapper screenContentWrapper = screen.getContentWrapper().get();
        if (screenContentWrapper == null) {
            return null;
        }
        return ViewBackgroundUtilsKt.resolveBackgroundColor(screenContentWrapper);
    }

    private final boolean shouldShowSearchBar() {
        ScreenStackHeaderConfig headerConfig = getScreen().getHeaderConfig();
        int configSubviewsCount = headerConfig != null ? headerConfig.getConfigSubviewsCount() : 0;
        if (headerConfig != null && configSubviewsCount > 0) {
            for (int i2 = 0; i2 < configSubviewsCount; i2++) {
                if (headerConfig.getConfigSubview(i2).getType() == ScreenStackHeaderSubview.Type.SEARCH_BAR) {
                    return true;
                }
            }
        }
        return false;
    }

    private final Integer tryResolveContainerHeight() throws Throwable {
        Object objInvoke;
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        DisplayMetrics displayMetrics;
        if (getScreen().getContainer() != null) {
            return Integer.valueOf(getScreenStack().getHeight());
        }
        Context context = getContext();
        if (context != null) {
            short sXd = (short) (C1499aX.Xd() ^ (-15625));
            int[] iArr = new int["o{p}yrl5itrwgot-Aljo_ql".length()];
            QB qb = new QB("o{p}yrl5itrwgot-Aljo_ql");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd2 = (short) (OY.Xd() ^ 30670);
            short sXd3 = (short) (OY.Xd() ^ 32033);
            int[] iArr2 = new int["DCS2FURYWIL[".length()];
            QB qb2 = new QB("DCS2FURYWIL[");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) - sXd3);
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                Resources resources = (Resources) method.invoke(context, objArr);
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    return Integer.valueOf(displayMetrics.heightPixels);
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Context context2 = getContext();
            if (context2 != null) {
                Object[] objArr2 = {C1561oA.od("`QUJT[", (short) (OY.Xd() ^ 14337))};
                Method method2 = Class.forName(C1561oA.Kd("\t\u0017\u000e\u001d\u001b\u0016\u0012\\\u0013  '\u0019#*dz((/!52", (short) (C1499aX.Xd() ^ (-11312)))).getMethod(C1561oA.Xd("21A!HCE7@':HMA<?", (short) (OY.Xd() ^ TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO)), Class.forName(Wg.Zd("s\u0006m4[s{cHi`\u001duH r", (short) (C1499aX.Xd() ^ (-19081)), (short) (C1499aX.Xd() ^ (-27155)))));
                try {
                    method2.setAccessible(true);
                    objInvoke = method2.invoke(context2, objArr2);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } else {
                objInvoke = null;
            }
            WindowManager windowManager = objInvoke instanceof WindowManager ? (WindowManager) objInvoke : null;
            if (windowManager != null && (currentWindowMetrics = windowManager.getCurrentWindowMetrics()) != null && (bounds = currentWindowMetrics.getBounds()) != null) {
                return Integer.valueOf(bounds.height());
            }
        }
        return null;
    }

    private final void updateToolbarMenu(Menu menu) {
        menu.clear();
        if (shouldShowSearchBar()) {
            Context context = getContext();
            if (this.searchView == null && context != null) {
                CustomSearchView customSearchView = new CustomSearchView(context, this);
                this.searchView = customSearchView;
                Function1<? super CustomSearchView, Unit> function1 = this.onSearchViewCreate;
                if (function1 != null) {
                    function1.invoke(customSearchView);
                }
            }
            MenuItem menuItemAdd = menu.add("");
            menuItemAdd.setShowAsAction(2);
            menuItemAdd.setActionView(this.searchView);
        }
    }

    @Override // com.swmansion.rnscreens.ScreenStackFragmentWrapper
    public boolean canNavigateBack() {
        ScreenContainer container = getScreen().getContainer();
        if (!(container instanceof ScreenStack)) {
            throw new IllegalStateException("ScreenStackFragment added into a non-stack container".toString());
        }
        if (!Intrinsics.areEqual(((ScreenStack) container).getRootScreen(), getScreen())) {
            return true;
        }
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof ScreenStackFragment) {
            return ((ScreenStackFragment) parentFragment).canNavigateBack();
        }
        return false;
    }

    public final BottomSheetBehavior<Screen> configureBottomSheetBehaviour$react_native_screens_release(BottomSheetBehavior<Screen> behavior, KeyboardState keyboardState) throws Throwable {
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(keyboardState, "keyboardState");
        Integer numTryResolveContainerHeight = tryResolveContainerHeight();
        if (numTryResolveContainerHeight == null) {
            throw new IllegalStateException("[RNScreens] Failed to find window height during bottom sheet behaviour configuration".toString());
        }
        behavior.setHideable(true);
        behavior.setDraggable(true);
        behavior.addBottomSheetCallback(this.bottomSheetStateCallback);
        ScreenFooter footer = getScreen().getFooter();
        if (footer != null) {
            footer.registerWithSheetBehavior(behavior);
        }
        if (keyboardState instanceof KeyboardNotVisible) {
            int size = getScreen().getSheetDetents().size();
            if (size != 1) {
                if (size == 2) {
                    return BottomSheetBehaviorExtKt.useTwoDetents(behavior, Integer.valueOf(SheetUtils.INSTANCE.sheetStateFromDetentIndex(getScreen().getSheetInitialDetentIndex(), getScreen().getSheetDetents().size())), Integer.valueOf((int) (getScreen().getSheetDetents().get(0).doubleValue() * ((double) numTryResolveContainerHeight.intValue()))), Integer.valueOf((int) (getScreen().getSheetDetents().get(1).doubleValue() * ((double) numTryResolveContainerHeight.intValue()))));
                }
                if (size == 3) {
                    return BottomSheetBehaviorExtKt.useThreeDetents(behavior, Integer.valueOf(SheetUtils.INSTANCE.sheetStateFromDetentIndex(getScreen().getSheetInitialDetentIndex(), getScreen().getSheetDetents().size())), Integer.valueOf((int) (getScreen().getSheetDetents().get(0).doubleValue() * ((double) numTryResolveContainerHeight.intValue()))), Float.valueOf((float) (getScreen().getSheetDetents().get(1).doubleValue() / getScreen().getSheetDetents().get(2).doubleValue())), Integer.valueOf((int) ((((double) 1) - getScreen().getSheetDetents().get(2).doubleValue()) * ((double) numTryResolveContainerHeight.intValue()))));
                }
                throw new IllegalStateException("[RNScreens] Invalid detent count " + getScreen().getSheetDetents().size() + ". Expected at most 3.");
            }
            if (SheetUtilsKt.isSheetFitToContents(getScreen())) {
                ScreenContentWrapper screenContentWrapper = getScreen().getContentWrapper().get();
                numValueOf = screenContentWrapper != null ? Integer.valueOf(screenContentWrapper.getHeight()) : null;
                ScreenContentWrapper screenContentWrapper2 = getScreen().getContentWrapper().get();
                if (screenContentWrapper2 == null || !screenContentWrapper2.isLaidOut()) {
                    numValueOf = null;
                }
            } else {
                numValueOf = Integer.valueOf((int) (((Number) CollectionsKt.first((List) getScreen().getSheetDetents())).doubleValue() * ((double) numTryResolveContainerHeight.intValue())));
            }
            BottomSheetBehaviorExtKt.useSingleDetent$default(behavior, numValueOf, false, 2, null);
            return behavior;
        }
        if (!(keyboardState instanceof KeyboardVisible)) {
            if (!(keyboardState instanceof KeyboardDidHide)) {
                throw new NoWhenBranchMatchedException();
            }
            behavior.removeBottomSheetCallback(this.keyboardSheetCallback);
            int size2 = getScreen().getSheetDetents().size();
            if (size2 == 1) {
                return BottomSheetBehaviorExtKt.useSingleDetent(behavior, Integer.valueOf((int) (((Number) CollectionsKt.first((List) getScreen().getSheetDetents())).doubleValue() * ((double) numTryResolveContainerHeight.intValue()))), false);
            }
            if (size2 == 2) {
                return BottomSheetBehaviorExtKt.useTwoDetents$default(behavior, null, Integer.valueOf((int) (getScreen().getSheetDetents().get(0).doubleValue() * ((double) numTryResolveContainerHeight.intValue()))), Integer.valueOf((int) (getScreen().getSheetDetents().get(1).doubleValue() * ((double) numTryResolveContainerHeight.intValue()))), 1, null);
            }
            if (size2 == 3) {
                return BottomSheetBehaviorExtKt.useThreeDetents$default(behavior, null, Integer.valueOf((int) (getScreen().getSheetDetents().get(0).doubleValue() * ((double) numTryResolveContainerHeight.intValue()))), Float.valueOf((float) (getScreen().getSheetDetents().get(1).doubleValue() / getScreen().getSheetDetents().get(2).doubleValue())), Integer.valueOf((int) ((((double) 1) - getScreen().getSheetDetents().get(2).doubleValue()) * ((double) numTryResolveContainerHeight.intValue()))), 1, null);
            }
            throw new IllegalStateException("[RNScreens] Invalid detent count " + getScreen().getSheetDetents().size() + ". Expected at most 3.");
        }
        KeyboardVisible keyboardVisible = (KeyboardVisible) keyboardState;
        int maxHeight = behavior.getMaxHeight() - keyboardVisible.getHeight() > 1 ? behavior.getMaxHeight() - keyboardVisible.getHeight() : behavior.getMaxHeight();
        int size3 = getScreen().getSheetDetents().size();
        if (size3 == 1) {
            BottomSheetBehaviorExtKt.useSingleDetent$default(behavior, Integer.valueOf(maxHeight), false, 2, null);
            behavior.addBottomSheetCallback(this.keyboardSheetCallback);
            return behavior;
        }
        if (size3 == 2) {
            BottomSheetBehaviorExtKt.useTwoDetents$default(behavior, 3, null, Integer.valueOf(maxHeight), 2, null);
            behavior.addBottomSheetCallback(this.keyboardSheetCallback);
            return behavior;
        }
        if (size3 != 3) {
            throw new IllegalStateException("[RNScreens] Invalid detent count " + getScreen().getSheetDetents().size() + ". Expected at most 3.");
        }
        BottomSheetBehaviorExtKt.useThreeDetents$default(behavior, 3, null, null, null, 14, null);
        behavior.setMaxHeight(maxHeight);
        behavior.addBottomSheetCallback(this.keyboardSheetCallback);
        return behavior;
    }

    @Override // com.swmansion.rnscreens.ScreenStackFragmentWrapper
    public void dismissFromContainer() {
        getScreenStack().dismiss(this);
    }

    public final void dismissSelf$react_native_screens_release() {
        if (isRemoving() && isDetached()) {
            return;
        }
        ThemedReactContext reactContext = getScreen().getReactContext();
        int surfaceId = UIManagerHelper.getSurfaceId(reactContext);
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, getScreen().getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new ScreenDismissedEvent(surfaceId, getScreen().getId()));
        }
    }

    public final NativeDismissalObserver getNativeDismissalObserver() {
        return this.nativeDismissalObserver;
    }

    public final Function1<CustomSearchView, Unit> getOnSearchViewCreate() {
        return this.onSearchViewCreate;
    }

    public final CustomSearchView getSearchView() {
        return this.searchView;
    }

    @Override // com.swmansion.rnscreens.ScreenFragment, com.swmansion.rnscreens.ScreenFragmentWrapper
    public void onContainerUpdate() {
        super.onContainerUpdate();
        ScreenStackHeaderConfig headerConfig = getScreen().getHeaderConfig();
        if (headerConfig != null) {
            headerConfig.onUpdate();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i2, boolean z2, int i3) {
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public Animator onCreateAnimator(int i2, boolean z2, int i3) {
        ScreensCoordinatorLayout screensCoordinatorLayout = null;
        if (!SheetUtilsKt.usesFormSheetPresentation(getScreen())) {
            return null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        if (z2) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.dimmingDelegate.getValue().getMaxAlpha$react_native_screens_release());
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.swmansion.rnscreens.ScreenStackFragment$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ScreenStackFragment.onCreateAnimator$lambda$10$lambda$9(this.f$0, valueAnimator);
                }
            });
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ExternalBoundaryValuesEvaluator(new Function1<Number, Float>() { // from class: com.swmansion.rnscreens.ScreenStackFragment$onCreateAnimator$startValueCallback$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Float invoke(Number number) {
                    return Float.valueOf(this.this$0.getScreen().getHeight());
                }
            }, new Function1<Number, Float>() { // from class: com.swmansion.rnscreens.ScreenStackFragment$onCreateAnimator$evaluator$1
                @Override // kotlin.jvm.functions.Function1
                public final Float invoke(Number number) {
                    return Float.valueOf(0.0f);
                }
            }), Float.valueOf(getScreen().getHeight()), Float.valueOf(0.0f));
            valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.swmansion.rnscreens.ScreenStackFragment$$ExternalSyntheticLambda1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ScreenStackFragment.onCreateAnimator$lambda$13$lambda$12(this.f$0, valueAnimator);
                }
            });
            animatorSet.play(valueAnimatorOfFloat).with(valueAnimatorOfObject);
        } else {
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.dimmingDelegate.getValue().getDimmingView$react_native_screens_release().getAlpha(), 0.0f);
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.swmansion.rnscreens.ScreenStackFragment$$ExternalSyntheticLambda2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ScreenStackFragment.onCreateAnimator$lambda$16$lambda$15(this.f$0, valueAnimator);
                }
            });
            ScreensCoordinatorLayout screensCoordinatorLayout2 = this.coordinatorLayout;
            if (screensCoordinatorLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
            } else {
                screensCoordinatorLayout = screensCoordinatorLayout2;
            }
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, screensCoordinatorLayout.getBottom() - getScreen().getTop());
            valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.swmansion.rnscreens.ScreenStackFragment$$ExternalSyntheticLambda3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ScreenStackFragment.onCreateAnimator$lambda$19$lambda$18(this.f$0, valueAnimator);
                }
            });
            animatorSet.play(valueAnimatorOfFloat2).with(valueAnimatorOfFloat3);
        }
        animatorSet.addListener(new ScreenAnimationDelegate(this, new ScreenEventEmitter(getScreen()), z2 ? ScreenAnimationDelegate.AnimationType.ENTER : ScreenAnimationDelegate.AnimationType.EXIT));
        return animatorSet;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        updateToolbarMenu(menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override // com.swmansion.rnscreens.ScreenFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AppBarLayout appBarLayout;
        AppBarLayout appBarLayout2;
        AppBarLayout appBarLayout3;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        this.coordinatorLayout = new ScreensCoordinatorLayout(contextRequireContext, this);
        Screen screen = getScreen();
        CoordinatorLayout.LayoutParams layoutParams = new CoordinatorLayout.LayoutParams(-1, -1);
        ScreensCoordinatorLayout screensCoordinatorLayout = null;
        layoutParams.setBehavior(SheetUtilsKt.usesFormSheetPresentation(getScreen()) ? createAndConfigureBottomSheetBehaviour() : this.isToolbarTranslucent ? null : new AppBarLayout.ScrollingViewBehavior());
        screen.setLayoutParams(layoutParams);
        if (SheetUtilsKt.usesFormSheetPresentation(getScreen())) {
            getScreen().setClipToOutline(true);
            attachShapeToScreen(getScreen());
            getScreen().setElevation(getScreen().getSheetElevation());
        }
        ScreensCoordinatorLayout screensCoordinatorLayout2 = this.coordinatorLayout;
        if (screensCoordinatorLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
            screensCoordinatorLayout2 = null;
        }
        screensCoordinatorLayout2.addView(ViewExtKt.recycle(getScreen()));
        if (!SheetUtilsKt.usesFormSheetPresentation(getScreen())) {
            Context context = getContext();
            if (context != null) {
                appBarLayout = new AppBarLayout(context);
                appBarLayout.setBackgroundColor(0);
                appBarLayout.setLayoutParams(new AppBarLayout.LayoutParams(-1, -2));
            } else {
                appBarLayout = null;
            }
            this.appBarLayout = appBarLayout;
            ScreensCoordinatorLayout screensCoordinatorLayout3 = this.coordinatorLayout;
            if (screensCoordinatorLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
                screensCoordinatorLayout3 = null;
            }
            screensCoordinatorLayout3.addView(this.appBarLayout);
            if (this.isToolbarShadowHidden && (appBarLayout3 = this.appBarLayout) != null) {
                appBarLayout3.setTargetElevation(0.0f);
            }
            Toolbar toolbar = this.toolbar;
            if (toolbar != null && (appBarLayout2 = this.appBarLayout) != null) {
                appBarLayout2.addView(ViewExtKt.recycle(toolbar));
            }
            setHasOptionsMenu(true);
        }
        ScreensCoordinatorLayout screensCoordinatorLayout4 = this.coordinatorLayout;
        if (screensCoordinatorLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
        } else {
            screensCoordinatorLayout = screensCoordinatorLayout4;
        }
        return screensCoordinatorLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        ScreenStackHeaderConfig headerConfig;
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (!getScreen().isTransparent() || ((headerConfig = getScreen().getHeaderConfig()) != null && !headerConfig.isHeaderHidden())) {
            updateToolbarMenu(menu);
        }
        super.onPrepareOptionsMenu(menu);
    }

    public final void onSheetCornerRadiusChange$react_native_screens_release() {
        getScreen().onSheetCornerRadiusChange$react_native_screens_release();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        View view = this.lastFocusedChild;
        if (view != null) {
            view.requestFocus();
        }
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        if (DeviceUtils.INSTANCE.isPlatformAndroidTV(getContext())) {
            this.lastFocusedChild = findLastFocusedChild();
        }
        super.onStop();
    }

    @Override // com.swmansion.rnscreens.ScreenFragment, com.swmansion.rnscreens.ScreenFragmentWrapper
    public void onViewAnimationEnd() {
        super.onViewAnimationEnd();
        notifyViewAppearTransitionEnd();
        getScreen().endRemovalTransition();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        if (SheetUtilsKt.usesFormSheetPresentation(getScreen())) {
            this.sheetDelegate = new SheetDelegate(getScreen());
            ScreensCoordinatorLayout screensCoordinatorLayout = this.coordinatorLayout;
            ScreensCoordinatorLayout screensCoordinatorLayout2 = null;
            if (screensCoordinatorLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
                screensCoordinatorLayout = null;
            }
            Intrinsics.areEqual(view, screensCoordinatorLayout);
            DimmingViewManager value = this.dimmingDelegate.getValue();
            Screen screen = getScreen();
            ScreensCoordinatorLayout screensCoordinatorLayout3 = this.coordinatorLayout;
            if (screensCoordinatorLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
                screensCoordinatorLayout3 = null;
            }
            value.onViewHierarchyCreated(screen, screensCoordinatorLayout3);
            DimmingViewManager value2 = this.dimmingDelegate.getValue();
            Screen screen2 = getScreen();
            BottomSheetBehavior<Screen> sheetBehavior = getScreen().getSheetBehavior();
            Intrinsics.checkNotNull(sheetBehavior);
            value2.onBehaviourAttached(screen2, sheetBehavior);
            ScreenContainer container = getScreen().getContainer();
            Intrinsics.checkNotNull(container);
            ScreensCoordinatorLayout screensCoordinatorLayout4 = this.coordinatorLayout;
            if (screensCoordinatorLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
                screensCoordinatorLayout4 = null;
            }
            screensCoordinatorLayout4.measure(View.MeasureSpec.makeMeasureSpec(container.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(container.getHeight(), 1073741824));
            ScreensCoordinatorLayout screensCoordinatorLayout5 = this.coordinatorLayout;
            if (screensCoordinatorLayout5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
            } else {
                screensCoordinatorLayout2 = screensCoordinatorLayout5;
            }
            screensCoordinatorLayout2.layout(0, 0, container.getWidth(), container.getHeight());
        }
    }

    @Override // com.swmansion.rnscreens.ScreenStackFragmentWrapper
    public void removeToolbar() {
        Toolbar toolbar;
        AppBarLayout appBarLayout = this.appBarLayout;
        if (appBarLayout != null && (toolbar = this.toolbar) != null && toolbar.getParent() == appBarLayout) {
            appBarLayout.removeView(toolbar);
        }
        this.toolbar = null;
    }

    public final void setNativeDismissalObserver(NativeDismissalObserver nativeDismissalObserver) {
        this.nativeDismissalObserver = nativeDismissalObserver;
    }

    public final void setOnSearchViewCreate(Function1<? super CustomSearchView, Unit> function1) {
        this.onSearchViewCreate = function1;
    }

    public final void setSearchView(CustomSearchView customSearchView) {
        this.searchView = customSearchView;
    }

    @Override // com.swmansion.rnscreens.ScreenStackFragmentWrapper
    public void setToolbar(Toolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        AppBarLayout appBarLayout = this.appBarLayout;
        if (appBarLayout != null) {
            appBarLayout.addView(toolbar);
        }
        AppBarLayout.LayoutParams layoutParams = new AppBarLayout.LayoutParams(-1, -2);
        layoutParams.setScrollFlags(0);
        toolbar.setLayoutParams(layoutParams);
        this.toolbar = toolbar;
    }

    @Override // com.swmansion.rnscreens.ScreenStackFragmentWrapper
    public void setToolbarShadowHidden(boolean z2) {
        if (this.isToolbarShadowHidden != z2) {
            AppBarLayout appBarLayout = this.appBarLayout;
            if (appBarLayout != null) {
                appBarLayout.setElevation(z2 ? 0.0f : PixelUtil.toPixelFromDIP(4.0f));
            }
            AppBarLayout appBarLayout2 = this.appBarLayout;
            if (appBarLayout2 != null) {
                appBarLayout2.setStateListAnimator(null);
            }
            this.isToolbarShadowHidden = z2;
        }
    }

    @Override // com.swmansion.rnscreens.ScreenStackFragmentWrapper
    public void setToolbarTranslucent(boolean z2) {
        if (this.isToolbarTranslucent != z2) {
            ViewGroup.LayoutParams layoutParams = getScreen().getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            ((CoordinatorLayout.LayoutParams) layoutParams).setBehavior(z2 ? null : new AppBarLayout.ScrollingViewBehavior());
            this.isToolbarTranslucent = z2;
        }
    }
}
