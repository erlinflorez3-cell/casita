package com.swmansion.rnscreens;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.swmansion.rnscreens.ScreenContentWrapper;
import com.swmansion.rnscreens.bottomsheet.SheetUtilsKt;
import com.swmansion.rnscreens.events.HeaderHeightChangeEvent;
import com.swmansion.rnscreens.events.SheetDetentChangedEvent;
import com.swmansion.rnscreens.ext.ViewExtKt;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
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
@Metadata(bv = {}, d1 = {"Яř\u0014D57\u001eq\u007fZDkt\u001aA\u000eֶ\u0013.X~*,\u0018w\u000ff\u000198DkJ6Ri*\u0017k\u00027,[:qK;k\u001a\u0006\"\u000fRVg}nRZ\u0011G\u0017\u0006,xr,OV\u0001](\u000f:BuB;M\u0006=A`z7\r @+@y\u000b\u001c\"*V\u0016~zIQ\u0014\u0012F@x:X\u000eU\u00050\u0012\u000e>&\u0006&\\}N>Hr`B/1\bqBT+g0\u000bl\u0015Fb+\u0015vg33@M5\u001d%Y\u0006\u000fRq?\u000b?wC\rh533IyZ>X\u000e\u0014\u001d+U\rer<\\\rQv\f/+UeSP$(\u007fz\u0002&D\u0004$\u0006/H41\"f\u001e\u000e;tx`FU\u0018މ`ɨy\u00126E$03Y9Spб`\u07b5\u0018؟6\u07fb\u0004ے\u001dƗ\u007f/,kX\u001ca-\u001b\u0003yΦ5QN@\u0011]\u0018Ջ<\u0006\u0005\u001fĄ\u0001Z\t>ϸ~G{?x_=E٢8;\"\u001aɒGts\u0005\u000expclbIn̯mD֓)O\u001e#\\rʯjhU\u0007©\u0010}(b\u0010\u0016\u0010##lxjƺ$>ʺN/{3Skܦ$Ggeևm4 eߎ]K6\u007fӌ\u000f\u0012X\u0005݂>Tc3׀e\tSTkj͌!JH\u0019<(\u0002R°\u000b+3mۊ\u001bz,y\u001ejĒG\u001b\u001epmE\u0011m˝g(\u007f\u0003չ#Iil\u0006\u0017ʁOtq\u001eμwy1\u000bˌ!EA\u007f\u007f_&\u001eBvف{;\b-ͻ~wlZܯK\u0005\u0016$ ,%$\u05cc8i/k?UȯȞ6\u00033֖K;\u001b_̘\u0011?{+ɇ\u000ekm<Ո\u0007\u0003pZ\r\u001bO]ݪ\u0016:v\r=S\rrѴxyF)\u0012\u0014Y\u0019Ъ=ar1$lSFپ\u00047\u001eSK66EC;ϵ&5\u0017&Ҿ.[˕ԃmp4ԘaW[\u0003к\u0003DdD̎a\u0002b@֠7aY-jR)zđA`j&Rr\u000eBٺ2`A\u0013;\u0007=[\u008d.\u0016f5v=udݧ9+o,~tqr\u0002QΝ\u0013vDSݫL\u001a܊ƽqLbפIW\u001d\u0019\u05ca0\u0007\u0012JiP^eƃ\bH\t\n\u0017d؏:)\u001a\u0005\u00182ӌ+T\t9ͬS\u001a\u000b\u001eŃ~^_=(zP\u0002ŮU&U'בUx\tnKx!X\u0006G,AήwM23֤E\u00054qҩ\u007fk\u001d7e\u001bW\rނ$CGj8IЂWG\u001f\u000enQͼ\u0001N\u0005uԀl\u001cv\u001a\u00150\u007f3AFÞ8\u001a m܆/v\f\u0004́M\u0015{ زQf\"W+C\u0003\u001c܀\t'\fG۷q8v;ڙM\u00108q\u05eb\u007fGL7ܲ\u000b\u0015f\\\u001a[ވ4s=\u0012\u0005\"֬zoTi֘\u0007P%5لs9\\\u0006X\u0017\u000fkκ9.qD-H\tcp.\nFL\u000bq838<]\u0006K\u0004)]\bp6a\u0017Ӗ7˭\nHSЕ\u0011\fisqv&%\u0011oIX\u0010m[Zsԛ3Ӱ2\u001f`ŔR\u0013Y+f\u001d \u0016\u001b3-DX\u00017\u001fgixr{O\n\u001eY?B˒mʘ4^&ݙ7{{\u00168gH\u0017Aj[S5/j\u0005ZY$]\u0019?\u0015z\u001a?,~\u0015G\r(Qx\u001dݸ*Ү3C!ےs\u000fMy\u0015\u001eeK,<?n\u0010,EO#q>u?!p'߰\u0004.Z\u000bx\u001fuL}`b^2)o#\u001c\u0007Y\u0380WԺ<N\u0010ϴ)\u0010\u0017Rh\\@@b?*a\"DO@)\u0003+74\u0018=]ǝnUk'0*\u000b+]W\b\\\u0004:\"cIܓ;ތs'_ƠS';\u0011ZT,\u0004kx\r|4n\u001d\u0012DIcqt aˑ\u0004\u0016'\u07fb<\b{S\u000erQJ0\u0011jo'\u001ce7>,LmrOwr\u0007&\".\u007f\u0017\"\u0011\u001a&\u000bШ\u0007\u008f\u001dRF*;$\u001fGS\u001c\b?d\u000fKIEEVQAP\u0015\u0012epnWyx[gt_R\u0012\"0xv8֓\u0006üDg2\u0006;Ilep${\u0006\u007f\u0012>L\u001bCT\u0010?\u000ex\u007f\u000fInøWŗJBd\u070eeChFN<D`4~\u001a:V2<\u0006/\u0004\u0014I\u000fAiЫSضEU\u001aV\nX5\u0013ab\u0014Y\blM}c()eGs#o`Wc\u0012\r\u000bc`cfA\u0014.\u0017ir\u001eݑJϹ.f\u000e\u000eS\u001c`\u0012J9R\\\u000e26q^5+kkD4!STC\u0012/8pysf'*e\u0004-\u0017,Ʊ9ӟ\u0006\u0011\u0018A'J# Y|@W\u0014\u000f7\u0003\n>-UcB\u0006I>/8ı-ǵ\n?7ϕ\u001c\u0005d,W\u0019\u0006kUǒ,η(\u0012\u001bڡzi\u00191\u001cO\u007f\u0005R~dX\u0019sgZ~D\u0001\u000e)?<4\u001a\u0002m\bS\u0005?-Zy\u0012ܱLڝ2~\u0011G]:\u0014,k;tAyOKx\u0004g\u000f@\u007f\u0012{O\u000e\u0016،Ub`ƃ/Y,\u0011!Sj.44\u0014J?/E)\u001a2حwXx\u0013_\ty\u00065\u0012\u0001=|>\u0012\u0016\u0013\u0098xæj[\u0006ܮiFhanJhC\u0016=z\bwXVG1\u0003\u0017J\u0010aD=Rz;iI9P,`\u00144ՒSͩ\n\u0016ra\u0006d\u0014_9\u0014\u001b<|\u0014#cVn\u0003\u0006|\u0005{ۺ\u001aj]\u0012|\u001fޓ 1r)sI\u0016\f^$\u000bgDn\u0002~(΅+ʒh\u000b+̎2C]\u001dUN3\u0005\u001f!\u0016a\u001ez\tUp\\S\u0014,\n-(Z{cR\u007f8RِcƖS@eϰA\u007fo_.u\f\u0014\nMX\u000e \bp|u4]y\u0017YjGon`ޭ5Ά\f!/ܝ`6P!0\u0013!\u0011<\tXX?\u00113{}\f]ZLʻ>ýB\u007fnʛ\u007f6G1cF\u001fG3$\u007fr\u001ca{tCG<ulΡ[ٜq\u0002cʕl\u00188}}1Q\u0012yXiqg\u0010\u0016[LkhF\u001eǦ ԖO:\"ʼ~prp^\\0?\u001c\t\"\u0002\u000f\u000e7!X%\u000e+>\u0557Gˣt+?ٕ]g\u0011ҿ\u00106[RA\u0018\u074cGfc^6\u0010ܘJ|\u001aDe\u001c߅Lѽ\u0019i\f߅{T(٭GyUO\r}פ5+/\u0006F\u001b\u0084Ov5\u0016\u000b_\u0530/Ǣ+nWȫBN@ϴ\\r!]؉\u0007dμrȀT\u001dI\u05f5\u00052|Ƙq%՟\u0014\".Kڳ\u001cQɄ\u00188#Dɠ:ui\u0002˻ytɵgЬ+@\u0006ւ9\u0017G܋\u0015\u001cǾ\u0007 xaʢN\u0004è?\u0019?\u001aˣBF\n*\u0004\u0014\u00175<\u0018ѱ0WU\u0007\u0018YB\u001e#\u0019ѱ\u0019ۚ%8\u0013\u001861\u0005\u0016uɍ'0\u00103y!̌\b\u001ej\u001aS\u0017վP\u000f}01>ٗT@G\u0018աavz\u0016 wզ/2M$նy߱2zwȈ\u0010b\u0016բpJՄ}\u0018:K͈\u000f4ͨ:ҧfȤC"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>/", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011P\n9\u0004)39\u0007\u001c4t\u0016->G;}\u0016+\u001fxl\u000f", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>7\b)Fm\u001f=?P7v?\u001e\"'KBm_@X\u00076%HU3YNpCi", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n$\\}(7l\u0003.IAJI>'$htH\\", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\u0011\u001b\u001fCx\n>v2~H\u0001 ?m\u0015\u001bM?9z\u0012(\u001ewaL\u00169o?", "\nrTA \u0006\u0017", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>\u0018Y\u001eFq'2\\W)z0-\u0015>", "/bc6i0Mg\u0007\u000evm,", "5dc\u000eV;Bd\u001d\u000e\u000fL;x\u0018/", "u(;0b4\ba+\u0007vg:\u0001\u00138/\r1\n>\u000e\u0017\u0017P}W*t25Y\u0007^\u0013k%2^GJ\u007f\"-\u0011wa\u000f", "1n]AT0GS&", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>7\b)Fi\u001a7MP\u0011", "5dc\u0010b5MO\u001d\bzk", "u(;0b4\ba+\u0007vg:\u0001\u00138/\r1\n>\u000e\u0017\u0017P}W*t25Y\u0007}Av%*QL;x\n", "Adc\u0010b5MO\u001d\bzk", "uKR<`uLe!z\u0004l0\u0007\u0012xr\t6yM\u0001\u0017 U9{:\u0004%5b[*@|\u00122VCHAw\u000f", "1n]AX5ME&z\u0006i,\n", "\u001aiPCTuEO\"\u0001Dk,}R!e{.h@\u0002\u0017$Gx\f<L", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>7\b)Fm\u001f=?P7v?\u001e\">", "5dc\u0010b5MS\"\u000elk(\b\u0014/r", "u(;7T=:\u001d z\u0004`u\n\t0/q(wFm\u0017\u0018G|\u000eEt%\u000b", "Adc\u0010b5MS\"\u000elk(\b\u0014/r", "uKY.i(\bZ\u0015\b|(9|\nxW\u007f$\u0002-\u0001\u0018\u0017To\u0017:vzxJ", "D`[BX", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>:\b*Fm#\u0004", "4n^AX9", "5dc\u0013b6MS&", "u(;0b4\ba+\u0007vg:\u0001\u00138/\r1\n>\u000e\u0017\u0017P}W*t25Y\u0007\u0001Aw%.Z\u0019", "Adc\u0013b6MS&", "uKR<`uLe!z\u0004l0\u0007\u0012xr\t6yM\u0001\u0017 U9{:\u0004%5b^*A|\u0016;#\u0007,", "4qP4`,Gb", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "5dc\u0013e(@[\u0019\b\n", "u(;.a+K]\u001d}\u000e(-\n\u00051m\u007f1\u000b\n|\"\"\u0011P\u001b8x-5b\ru", "4qP4`,Gb\u000b\fvi7|\u0016", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>:\u000b\u001c9u\u00167\\5Hg?)\u0015u7", "5dc\u0013e(@[\u0019\b\nP9x\u0014:e\r", "u(;0b4\ba+\u0007vg:\u0001\u00138/\r1\n>\u000e\u0017\u0017P}W*t25Y\u0007\u0001Di\u00186MLJ]A\u001a saF\\", "Adc\u0013e(@[\u0019\b\nP9x\u0014:e\r", "uKR<`uLe!z\u0004l0\u0007\u0012xr\t6yM\u0001\u0017 U9{:\u0004%5b^-3o\u001e.VR-x0) hn\u000fJT", "6dP1X9\u001c]\"\u007f~`", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>G\r\u001c5sx.IB;x\u0012(\u001eie;\\", "5dc\u0015X(=S&\\\u0005g-\u0001\u000b", "u(;0b4\ba+\u0007vg:\u0001\u00138/\r1\n>\u000e\u0017\u0017P}W*t25Y\u0007\u000eFi\u001440C7j4+rrj:\u000be\u0002", "7r12\\5@@\u0019\u0007\u0005o,{", "", "u(I", "Adc\u000fX0GU\u0006~\u0003h=|\b", "uY\u0018#", "7r62f;N`\u0019^\u0004Z)\u0004\t.", "Adc\u0014X:Mc&~Zg(y\u0010/d", "<`e6Z(MW#\bWZ9_\r.d\u007f1", "7r=.i0@O(\u0003\u0005g\tx\u0016\u0012i~'{I", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016", "Adc\u001bT=BU\u0015\u000e~h5Y\u0005<H\u0004'z@\n", "uKY.i(\bZ\u0015\b|(\t\u0007\u00136e{1Q\u0004q", "\u001aiPCTuEO\"\u0001D;6\u0007\u0010/a\t}", "<`e6Z(MW#\bWZ9k\u0016+n\u000e/\f>\u0001 &", "7r=.i0@O(\u0003\u0005g\tx\u0016\u001er{1\nG\u0011\u0015\u0017P~", "Adc\u001bT=BU\u0015\u000e~h5Y\u0005<T\r$\u0005N\b'\u0015Gx\u001d", "7rB5X,M5&zw[,\ny3s\u0004%\u0003@", "Adc [,>bz\fv[)|\u0016 i\u000e,xG\u0001", "7rBAT;Nauz\b:5\u0001\u0011+t\u007f'", "Adc g(Mc'[vk\b\u0006\r7a\u000f(z", "AsPAh:\u001bO&a~]+|\u0012", "7rBAT;Nauz\bA0{\b/n", "Adc g(Mc'[vk\u000f\u0001\b.e\t", "AsPAh:\u001bO&m\bZ5\u000b\u0010?c\u007f1\u000b", "7rBAT;Nauz\bM9x\u0012=l\u0010&{I\u0010", "Adc g(Mc'[vk\u001b\n\u00058s\u00078y@\n&", "7rC?T5LW(\u0003\u0005g0\u0006\u000b", "<`c6i,\u001bO\u0017\u0005Wn;\f\u00138D\u00046\u0004D\u000f%\u0013NO\u00178s,5X", "5dc\u001bT;Bd\u0019[v\\2Y\u0019>t\n1ZD\u000f\u001f\u001bU}\nCV.1V\u0005 6", "Adc\u001bT;Bd\u0019[v\\2Y\u0019>t\n1ZD\u000f\u001f\u001bU}\nCV.1V\u0005 6", "<`e6Z(MW#\bWZ9Z\u00136o\r", "", "5dc\u001bT=BU\u0015\u000e~h5Y\u0005<C\n/\u0006M", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", "Adc\u001bT=BU\u0015\u000e~h5Y\u0005<C\n/\u0006M", "uKY.i(\bZ\u0015\b|(\u0010\u0006\u0018/g\u007f5Q\u0004q", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "5dc\u001fX(<bv\t\u0004m,\u0010\u0018", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ'\u001bOk\u00178x%B#l#7u\u0016-:C7iC{\u001fqp9\u001ar\u0002", "@dP0g\fOS\"\u000eYb:\b\u0005>c\u0003(\t", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u000e^CDz\u0013\"#s]H\u0005f,[L", "5dc\u001fX(<bx\u0010zg;[\r=p{7yC\u0001$", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ'\u001bOk\u00178x%B#}17v%<\u0017#Lk=-sloD\u0003r*Qv4\u001d", "@d_9T*>/\"\u0003\u0003Z;\u0001\u00138", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>\u0018j Bt\u0012,M\u001fDo<\u001a$lkB\\", "5dc\u001fX7EO\u0017~Vg0\u0005\u0005>i\n1", "u(;0b4\ba+\u0007vg:\u0001\u00138/\r1\n>\u000e\u0017\u0017P}W*t25Y\u0007^$m!5IA;G=\"\u001ddp=\u0011l\u0002", "Adc\u001fX7EO\u0017~Vg0\u0005\u0005>i\n1", "uKR<`uLe!z\u0004l0\u0007\u0012xr\t6yM\u0001\u0017 U9{:\u0004%5b<\r7x\u001d*KC\u0017t8&\u0011weC\u00109o?", "Aba2X5(`\u001d~\u0004m(\f\r9n", "5dc V9>S\"h\bb,\u0006\u0018+t\u00042\u0005", "AgT2g\t>V\u0015\u0010~h9", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EH|&\u0017Ts\nC@\"?h\r*?{\u0019.MR\u0005H>-$ri'\nc,]S'JH_0f_H", "5dc [,>bu~}Z=\u0001\u0013<", "u(;0b4\bU#\t|e,F\u00058d\r2\u007f?J\u001f\u0013Vo\u001b@r,~V\b/Fw\u001e<PC;z}z\u001fwpC\u000fQ/Nv6$LQ(mV|Ji", "AgT2g\nE]'~\tH5k\u0013?c\u0003\u0012\fO\u000f\u001b\u0016G", "5dc [,>bv\u0006\u0005l,\u000br8T\n8yCj'&Us\r<", "Adc [,>bv\u0006\u0005l,\u000br8T\n8yCj'&Us\r<", "", "AgT2g\nH`\"~\bK({\r?s", "5dc [,>bv\t\bg,\nu+d\u00048\n", "u(5", "Adc [,>bv\t\bg,\nu+d\u00048\n", "uE\u0018#", "AgT2g\u000b>b\u0019\b\nl", "", "", "5dc [,>bw~\n^5\f\u0017", "u(;7T=:\u001d)\u000e~euc\r=tU", "Adc [,>bw~\n^5\f\u0017", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "AgT2g\fES*z\nb6\u0006", "5dc [,>bx\u0006zo(\f\r9n", "Adc [,>bx\u0006zo(\f\r9n", "AgT2g\fQ^\u0015\byl\u001e\u007f\t8S}5\u0006G\b\u0017\u00166ym;x%", "5dc [,>bx\u0012\u0006Z5{\u0017!h\u007f1i>\u000e!\u001eNo\r+\u0001\u00054[}", "Adc [,>bx\u0012\u0006Z5{\u0017!h\u007f1i>\u000e!\u001eNo\r+\u0001\u00054[}", "AgT2g\u0010GW(\u0003ve\u000b|\u0018/n\u000f\f\u0005?\u0001*", "5dc [,>b|\b~m0x\u0010\u000ee\u000f(\u0005Od \u0016G\u0003", "u(8", "Adc [,>b|\b~m0x\u0010\u000ee\u000f(\u0005Od \u0016G\u0003", "uH\u0018#", "AgT2g\u0013:`\u001b~\tm\u001c\u0006\b3m\b(z\u001f\u0001&\u0017P~qEu%H", "5dc [,>b\u007fz\b`,\u000b\u0018\u001fn~,\u0004H\u0001\u0016uG~\u000eE\u0006\t>X}3", "Adc [,>b\u007fz\b`,\u000b\u0018\u001fn~,\u0004H\u0001\u0016uG~\u000eE\u0006\t>X}3", "Ag^B_+-`\u001d\u0001|^9g\u0013=t\u000b2\u0005@\u007f\u0006$Cx\u001c@\u0006)?bY!Fm#\u0015IWE{C", "5dc [6NZ\u0018m\bb.~\t<P\n6\u000bK\u000b \u0017F^\u001b8\u007f39h\u0002*@I\u0017=MP\"gH(%w", "Adc [6NZ\u0018m\bb.~\t<P\n6\u000bK\u000b \u0017F^\u001b8\u007f39h\u0002*@I\u0017=MP\"gH(%w", "Ag^B_+.^\u0018z\n^\u001a\u007f\t/t]2\tI\u0001$\u0004Cn\u0012L\u0005", "AsP0^\bGW!z\nb6\u0006", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>\u0018k/3k\u001c\nVGCgC\"\u001fq7", "5dc g(<Yt\b~f(\f\r9n", "u(;0b4\ba+\u0007vg:\u0001\u00138/\r1\n>\u000e\u0017\u0017P}W*t25Y\u0007^%|\u0012,S\u001fDo<\u001a$lkB\\", "Adc g(<Yt\b~f(\f\r9n", "uKR<`uLe!z\u0004l0\u0007\u0012xr\t6yM\u0001\u0017 U9{:\u0004%5b<\u000eFi\u00144)L?s0-\u0019rj\u000fJT", "AsP0^\u0017KS'~\u0004m(\f\r9n", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>\u0018k/3k\u001c\u0019ZCIk=-\u0011weC\u00109", "5dc g(<Y\u0004\fzl,\u0006\u0018+t\u00042\u0005", "u(;0b4\ba+\u0007vg:\u0001\u00138/\r1\n>\u000e\u0017\u0017P}W*t25Y\u0007^%|\u0012,S.HkB\u001e\u001ew]H\u000bm5$", "Adc g(<Y\u0004\fzl,\u0006\u0018+t\u00042\u0005", "uKR<`uLe!z\u0004l0\u0007\u0012xr\t6yM\u0001\u0017 U9{:\u0004%5b<\u000eFi\u001448P;y4'$dp=\u0011l\u0002\u0012g", "AsPAh:\u001bO&\\\u0005e6\n", "5dc g(Mc'[vk\n\u0007\u00109r", "Adc g(Mc'[vk\n\u0007\u00109r", "AsPAh:\u001bO&l\nr3|", "", "5dc g(Mc'[vk\u001a\f\u001d6e", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc g(Mc'[vk\u001a\f\u001d6e", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "1gP;Z,\u001aQ\u0017~\tl0y\r6i\u000f<cJ\u007f\u0017", "", ";nS2", "2hb=T;<V\u0006~\tm6\n\t\u0013n\u000e7wI~\u0017\u0005Vk\u001d<", "\u001a`]1e6BRb\u000f\nb3Fv:a\r6{\u001c\u000e$\u0013[E", "\u001a`]1e6BRb\t\t(\u0017x\u0016-e\u0007$xG\u0001l", "2hb=T;<V\u0007z\f^\u0010\u0006\u0017>a\t&{.\u0010\u0013&G", "3mS\u001fX4Hd\u0015\u0006ik(\u0006\u00173t\u00042\u0005", "3mS!e(Ga\u001d\u000e~h5i\t-u\r6\u007fQ\u0001", ">`a2a;", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "6`b$X)/W\u0019\u0011", "DhTD:9Hc$", "7rC?T5L^\u0015\fzg;", ";`h/X\u001bKW\u001b\u0001zk\u0017\u0007\u0017>p\n1{?o$\u0013P}\u0012Kz/>", "<nc6Y@!S\u0015}zk\u000f|\r1h\u000f\u0006~<\n\u0019\u0017", "6dP1X9!S\u001d\u0001}m", "<nc6Y@,V\u0019~\n=,\f\t8t]+wI\u0003\u0017", "2dc2a;\"\\\u0018~\u000e", "7rBAT)ES", "<nc6Y@,V\u0019~\n=,\f\t8t]+wI\u0003\u0017UTo\n:\u0006\u001f>U\r$Hm\u0010<KP;k=,\u000fua@\u0007_:N", "=m2<a;>\\(p\bZ7\b\t<L{<\u0006P\u0010", "1gP;Z,=", ":dUA", "Bn_", "@hV5g", "0ncAb4", "=m56a(EW.~ek6\b\u0017\u001fp~$\u000b@", "=m56a(EW.~ek6\b\u0017\u001fp~$\u000b@?$\u0017Cm\u001d6\u007f!D]\u000f 1{\u0014;MCDy.+\u0015oa5\u0015c", "=m;.l6Nb", Global.COLON, "B", "@", AdkSettings.PLATFORM_TYPE_MOBILE, "=mB5X,M1#\f\u0004^9i\u0005.i\u00106YC| \u0019G", "=mB5X,M1#\f\u0004^9i\u0005.i\u00106YC| \u0019G.\u001b<r#DS\u0007\u001cFq'.GQ9x4\u001e\u001ev[F\u0007j,J\u0005'", "=mC<h*A3*~\u0004m", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "@dV6f;>`\u007fz\u000fh<\ff+l\u0007%w>\u0007w!Ta\u001b8\u000205f", "EqP=c,K", "Adc\u000eV;Bd\u001d\u000e\u000fL;x\u0018/", "Adc\u0019T@>`\b\u0013\u0006^", ":`h2e\u001bR^\u0019", ">`X;g", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wD\n&l", "Adc V9>S\"h\bb,\u0006\u0018+t\u00042\u0005", "Adc!e(Ga\u001d\u000e~h5\u0001\u00121", "BqP;f0MW#\b~g.", "AsP?g\u0019>[#\u0010ve\u001b\n\u00058s\u00047\u007fJ\n", "AsP?g\u001bKO\"\r~m0\u0007\u0012\u001ce}8\tN\u0005(\u0017", "CoS.g,,Q&~zg\u001a\u0001\u001e/P{3{M", "EhSA[", "6dX4[;", "\u000fbc6i0Mg\u0007\u000evm,", "\u0011n\\=T5B]\"", " d_9T*>/\"\u0003\u0003Z;\u0001\u00138", "!sP0^\bGW!z\nb6\u0006", "!sP0^\u0017KS'~\u0004m(\f\r9n", "%h]1b>-`\u0015\u0003\nl", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class Screen extends FabricEnabledViewGroup implements ScreenContentWrapper.OnLayoutCallback {
    public static final Companion Companion = new Companion(null);
    public static final double SHEET_FIT_TO_CONTENTS = -1.0d;
    public static final String TAG = "Screen";
    private ActivityState activityState;
    private ScreenContainer container;
    private WeakReference<ScreenContentWrapper> contentWrapper;
    private ScreenFooter footer;
    private ScreenFragmentWrapper fragmentWrapper;
    private boolean isBeingRemoved;
    private boolean isGestureEnabled;
    private Boolean isNavigationBarHidden;
    private Boolean isNavigationBarTranslucent;
    private boolean isSheetGrabberVisible;
    private Boolean isStatusBarAnimated;
    private Boolean isStatusBarHidden;
    private Boolean isStatusBarTranslucent;
    private boolean isTransitioning;
    private boolean nativeBackButtonDismissalEnabled;
    private Integer navigationBarColor;
    private final ThemedReactContext reactContext;
    private ReplaceAnimation replaceAnimation;
    private Integer screenOrientation;
    private boolean sheetClosesOnTouchOutside;
    private float sheetCornerRadius;
    private List<Double> sheetDetents;
    private float sheetElevation;
    private boolean sheetExpandsWhenScrolledToEdge;
    private int sheetInitialDetentIndex;
    private int sheetLargestUndimmedDetentIndex;
    private boolean shouldTriggerPostponedTransitionAfterLayout;
    private boolean shouldUpdateSheetCornerRadius;
    private StackAnimation stackAnimation;
    private StackPresentation stackPresentation;
    private Integer statusBarColor;
    private String statusBarStyle;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\u0007Gָّ\u000bDȐ/(<\u0014\b\u0007\u0015ʑg/\u0005jN.ʂW*\u001dkd4*\\\rqI=>\u001a\u0004%߄SR"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>\u0018Y\u001eFq'2\\W)z0-\u0015>", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u0017M0\u0010G\u0010/3", "\"Q0\u001bF\u0010-7\u0003g^G\u000evr\u001c_\\\bb*r\u0011\u00061Z", "\u001dMN!B\u0017", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class ActivityState extends Enum<ActivityState> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ActivityState[] $VALUES;
        public static final ActivityState INACTIVE = new ActivityState("INACTIVE", 0);
        public static final ActivityState TRANSITIONING_OR_BELOW_TOP = new ActivityState("TRANSITIONING_OR_BELOW_TOP", 1);
        public static final ActivityState ON_TOP = new ActivityState("ON_TOP", 2);

        private static final /* synthetic */ ActivityState[] $values() {
            return new ActivityState[]{INACTIVE, TRANSITIONING_OR_BELOW_TOP, ON_TOP};
        }

        static {
            ActivityState[] activityStateArr$values = $values();
            $VALUES = activityStateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(activityStateArr$values);
        }

        private ActivityState(String str, int i2) {
            super(str, i2);
        }

        public static EnumEntries<ActivityState> getEntries() {
            return $ENTRIES;
        }

        public static ActivityState valueOf(String str) {
            return (ActivityState) Enum.valueOf(ActivityState.class, str);
        }

        public static ActivityState[] values() {
            return (ActivityState[]) $VALUES.clone();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000f6Ȑ\u0007\":\u001e\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$BOIV2}P\u000b&ȥ:̊rJbŏ\u0014\u001b\u0014\u0019\u0011jZM,ޓ0ܫ\u00132JģЩ7R"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>\u0018[*?x\u00127QMDA", "", "u(E", "!G4\u0012G&\u001f7\bxiH&Zr\u0018T_\u0011j.", "", "\"@6", "", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\u0006Gָّ\u000bDȐ/(<\u0014\b\u0007\u0015ʑg/\u0005jN.ʂW*\u001dkd4*\\\rqI=ڎ\u001e\u0001"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>\u0018j Bt\u0012,M\u001fDo<\u001a$lkB\\", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u001eTB\u0015", "\u001eN?", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class ReplaceAnimation extends Enum<ReplaceAnimation> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ReplaceAnimation[] $VALUES;
        public static final ReplaceAnimation PUSH = new ReplaceAnimation("PUSH", 0);
        public static final ReplaceAnimation POP = new ReplaceAnimation("POP", 1);

        private static final /* synthetic */ ReplaceAnimation[] $values() {
            return new ReplaceAnimation[]{PUSH, POP};
        }

        static {
            ReplaceAnimation[] replaceAnimationArr$values = $values();
            $VALUES = replaceAnimationArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(replaceAnimationArr$values);
        }

        private ReplaceAnimation(String str, int i2) {
            super(str, i2);
        }

        public static EnumEntries<ReplaceAnimation> getEntries() {
            return $ENTRIES;
        }

        public static ReplaceAnimation valueOf(String str) {
            return (ReplaceAnimation) Enum.valueOf(ReplaceAnimation.class, str);
        }

        public static ReplaceAnimation[] values() {
            return (ReplaceAnimation[]) $VALUES.clone();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\rGָّ\u000bDȐ/(<\u0014\b\u0007\u0015ʑg/\u0005jN.ʂW*\u001dkd4*\\\rqI=>\u001a\u0004%qOTkPnP_sC\u0015\f~xp32U~ez\u000f8KŌC="}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>\u0018k/3k\u001c\nVGCgC\"\u001fq7", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u0012D5\u000eH\u0013-", "\u001cN=\u0012", "\u0014@3\u0012", "!K8\u00118&\u001f@\u0003ft;\u0016kw\u0019M", "!K8\u00118&\u001f@\u0003ftK\u0010^k\u001e", "!K8\u00118&\u001f@\u0003ftE\f]w", "\u0014@3\u0012R\r+=\u0001xWH\u001bkr\u0017", "\u0017NB,9\u0019(;\u0013k^@\u000fk", "\u0017NB,9\u0019(;\u0013eZ?\u001b", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class StackAnimation extends Enum<StackAnimation> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StackAnimation[] $VALUES;
        public static final StackAnimation DEFAULT = new StackAnimation("DEFAULT", 0);
        public static final StackAnimation NONE = new StackAnimation("NONE", 1);
        public static final StackAnimation FADE = new StackAnimation("FADE", 2);
        public static final StackAnimation SLIDE_FROM_BOTTOM = new StackAnimation("SLIDE_FROM_BOTTOM", 3);
        public static final StackAnimation SLIDE_FROM_RIGHT = new StackAnimation("SLIDE_FROM_RIGHT", 4);
        public static final StackAnimation SLIDE_FROM_LEFT = new StackAnimation("SLIDE_FROM_LEFT", 5);
        public static final StackAnimation FADE_FROM_BOTTOM = new StackAnimation("FADE_FROM_BOTTOM", 6);
        public static final StackAnimation IOS_FROM_RIGHT = new StackAnimation("IOS_FROM_RIGHT", 7);
        public static final StackAnimation IOS_FROM_LEFT = new StackAnimation("IOS_FROM_LEFT", 8);

        private static final /* synthetic */ StackAnimation[] $values() {
            return new StackAnimation[]{DEFAULT, NONE, FADE, SLIDE_FROM_BOTTOM, SLIDE_FROM_RIGHT, SLIDE_FROM_LEFT, FADE_FROM_BOTTOM, IOS_FROM_RIGHT, IOS_FROM_LEFT};
        }

        static {
            StackAnimation[] stackAnimationArr$values = $values();
            $VALUES = stackAnimationArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(stackAnimationArr$values);
        }

        private StackAnimation(String str, int i2) {
            super(str, i2);
        }

        public static EnumEntries<StackAnimation> getEntries() {
            return $ENTRIES;
        }

        public static StackAnimation valueOf(String str) {
            return (StackAnimation) Enum.valueOf(StackAnimation.class, str);
        }

        public static StackAnimation[] values() {
            return (StackAnimation[]) $VALUES.clone();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\bGָّ\u000bDȐ/(<\u0014\b\u0007\u0015ʑg/\u0005jN.ʂW*\u001dkd4*\\\rqI=>\u001a\u0004%qOTk̐rO"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>\u0018k/3k\u001c\u0019ZCIk=-\u0011weC\u00109", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u001eTB\u0015", "\u001bN3\u000e?", "\"Q0\u001bF\u0017\u001a@xgiX\u0014fg\u000bL", "\u0014NA\u001aR\u001a!3xm", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class StackPresentation extends Enum<StackPresentation> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StackPresentation[] $VALUES;
        public static final StackPresentation PUSH = new StackPresentation("PUSH", 0);
        public static final StackPresentation MODAL = new StackPresentation("MODAL", 1);
        public static final StackPresentation TRANSPARENT_MODAL = new StackPresentation("TRANSPARENT_MODAL", 2);
        public static final StackPresentation FORM_SHEET = new StackPresentation("FORM_SHEET", 3);

        private static final /* synthetic */ StackPresentation[] $values() {
            return new StackPresentation[]{PUSH, MODAL, TRANSPARENT_MODAL, FORM_SHEET};
        }

        static {
            StackPresentation[] stackPresentationArr$values = $values();
            $VALUES = stackPresentationArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(stackPresentationArr$values);
        }

        private StackPresentation(String str, int i2) {
            super(str, i2);
        }

        public static EnumEntries<StackPresentation> getEntries() {
            return $ENTRIES;
        }

        public static StackPresentation valueOf(String str) {
            return (StackPresentation) Enum.valueOf(StackPresentation.class, str);
        }

        public static StackPresentation[] values() {
            return (StackPresentation[]) $VALUES.clone();
        }
    }

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StackPresentation.values().length];
            try {
                iArr[StackPresentation.TRANSPARENT_MODAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StackPresentation.FORM_SHEET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\rGָّ\u000bDȐ/(<\u0014\b\u0007\u0015ʑg/\u0005jN.ʂW*\u001dkd4*\\\rqI=>\u001a\u0004%qOTkPnP_sC\u0015\f~xp32U~ez\u000f8KŌC="}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>\u0018o$@l @<P7oC,j", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u001dQ8\u0012A\u001b\u001aB|hc", "\u0011N;\u001cE", "!SH\u00198", "\"Q0\u001bF\u0013.1xgi", "\u0016H3\u00118\u0015", "\u000fM8\u001a4\u001b\u001e2", "\u001c@E\u0016:\b-7\u0003gt;\bi\u0003\rOf\u0012h", "\u001c@E\u0016:\b-7\u0003gt;\bi\u0003\u001eR[\u0011i'ptv0^", "\u001c@E\u0016:\b-7\u0003gt;\bi\u0003\u0012I^\u0007[)", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class WindowTraits extends Enum<WindowTraits> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ WindowTraits[] $VALUES;
        public static final WindowTraits ORIENTATION = new WindowTraits("ORIENTATION", 0);
        public static final WindowTraits COLOR = new WindowTraits("COLOR", 1);
        public static final WindowTraits STYLE = new WindowTraits("STYLE", 2);
        public static final WindowTraits TRANSLUCENT = new WindowTraits("TRANSLUCENT", 3);
        public static final WindowTraits HIDDEN = new WindowTraits("HIDDEN", 4);
        public static final WindowTraits ANIMATED = new WindowTraits("ANIMATED", 5);
        public static final WindowTraits NAVIGATION_BAR_COLOR = new WindowTraits("NAVIGATION_BAR_COLOR", 6);
        public static final WindowTraits NAVIGATION_BAR_TRANSLUCENT = new WindowTraits("NAVIGATION_BAR_TRANSLUCENT", 7);
        public static final WindowTraits NAVIGATION_BAR_HIDDEN = new WindowTraits("NAVIGATION_BAR_HIDDEN", 8);

        private static final /* synthetic */ WindowTraits[] $values() {
            return new WindowTraits[]{ORIENTATION, COLOR, STYLE, TRANSLUCENT, HIDDEN, ANIMATED, NAVIGATION_BAR_COLOR, NAVIGATION_BAR_TRANSLUCENT, NAVIGATION_BAR_HIDDEN};
        }

        static {
            WindowTraits[] windowTraitsArr$values = $values();
            $VALUES = windowTraitsArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(windowTraitsArr$values);
        }

        private WindowTraits(String str, int i2) {
            super(str, i2);
        }

        public static EnumEntries<WindowTraits> getEntries() {
            return $ENTRIES;
        }

        public static WindowTraits valueOf(String str) {
            return (WindowTraits) Enum.valueOf(WindowTraits.class, str);
        }

        public static WindowTraits[] values() {
            return (WindowTraits[]) $VALUES.clone();
        }
    }

    /* JADX INFO: renamed from: com.swmansion.rnscreens.Screen$updateScreenSizePaper$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0013\u001d̉=!4i\bӵLc\u0003\u0004IيX\nǞH\u00078ܥBw5e3?>D}H\\S\u001a>ƈo}"}, d2 = {"1n\\{f>FO\"\r~h5F\u00168s}5{@\n%`5m\u001b<v.si\t\u001f3|\u0016\u001cKP;k=\f\u0019}a$\u0003n,[5r", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW\u001e\u0007!BX}\u001f$}\u001f7I@Bk\n", "@t]\u0014h(KR\u0019}", "", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 extends GuardedRunnable {
        final /* synthetic */ int $height;
        final /* synthetic */ int $width;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i2, int i3, JSExceptionHandler jSExceptionHandler) {
            super(jSExceptionHandler);
            i = i2;
            i = i3;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            UIManagerModule uIManagerModule = (UIManagerModule) Screen.this.getReactContext().getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                uIManagerModule.updateNodeSize(Screen.this.getId(), i, i);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Screen(ThemedReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.contentWrapper = new WeakReference<>(null);
        this.stackPresentation = StackPresentation.PUSH;
        this.replaceAnimation = ReplaceAnimation.POP;
        this.stackAnimation = StackAnimation.DEFAULT;
        this.isGestureEnabled = true;
        this.sheetExpandsWhenScrolledToEdge = true;
        this.sheetDetents = CollectionsKt.mutableListOf(Double.valueOf(1.0d));
        this.sheetLargestUndimmedDetentIndex = -1;
        this.sheetClosesOnTouchOutside = true;
        this.sheetElevation = 24.0f;
        setLayoutParams(new WindowManager.LayoutParams(2));
        this.nativeBackButtonDismissalEnabled = true;
    }

    private final void endTransitionRecursive(ViewGroup viewGroup) {
        for (View view : ViewGroupKt.getChildren(viewGroup)) {
            viewGroup.endViewTransition(view);
            if (view instanceof ScreenStackHeaderConfig) {
                endTransitionRecursive(((ScreenStackHeaderConfig) view).getToolbar());
            }
            if (view instanceof ViewGroup) {
                endTransitionRecursive((ViewGroup) view);
            }
        }
    }

    private final boolean hasWebView(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof WebView) {
                return true;
            }
            if ((childAt instanceof ViewGroup) && hasWebView((ViewGroup) childAt)) {
                return true;
            }
        }
        return false;
    }

    private final void maybeTriggerPostponedTransition() throws Throwable {
        if (this.shouldTriggerPostponedTransitionAfterLayout) {
            this.shouldTriggerPostponedTransitionAfterLayout = false;
            Fragment fragment = getFragment();
            if (fragment != null) {
                fragment.startPostponedEnterTransition();
            }
        }
    }

    private final void notifyHeaderHeightChange(int i2) {
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int surfaceId = UIManagerHelper.getSurfaceId(reactContext);
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new HeaderHeightChangeEvent(surfaceId, getId(), i2));
        }
    }

    private final void startTransitionRecursive(ViewGroup viewGroup) {
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if ((viewGroup instanceof SwipeRefreshLayout) && (childAt instanceof ImageView)) {
                    viewGroup.addView(new View(getContext()), i2);
                } else if (childAt != null) {
                    Intrinsics.checkNotNull(childAt);
                    viewGroup.startViewTransition(childAt);
                }
                if (childAt instanceof ScreenStackHeaderConfig) {
                    startTransitionRecursive(((ScreenStackHeaderConfig) childAt).getToolbar());
                }
                if (childAt instanceof ViewGroup) {
                    startTransitionRecursive((ViewGroup) childAt);
                }
            }
        }
    }

    private final void updateScreenSizePaper(int i2, int i3) {
        ThemedReactContext themedReactContext = this.reactContext;
        themedReactContext.runOnNativeModulesQueueThread(new GuardedRunnable(themedReactContext.getExceptionHandler()) { // from class: com.swmansion.rnscreens.Screen.updateScreenSizePaper.1
            final /* synthetic */ int $height;
            final /* synthetic */ int $width;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(int i22, int i32, JSExceptionHandler jSExceptionHandler) {
                super(jSExceptionHandler);
                i = i22;
                i = i32;
            }

            @Override // com.facebook.react.bridge.GuardedRunnable
            public void runGuarded() {
                UIManagerModule uIManagerModule = (UIManagerModule) Screen.this.getReactContext().getNativeModule(UIManagerModule.class);
                if (uIManagerModule != null) {
                    uIManagerModule.updateNodeSize(Screen.this.getId(), i, i);
                }
            }
        });
    }

    public final void changeAccessibilityMode(int i2) {
        setImportantForAccessibility(i2);
        ScreenStackHeaderConfig headerConfig = getHeaderConfig();
        CustomToolbar toolbar = headerConfig != null ? headerConfig.getToolbar() : null;
        if (toolbar == null) {
            return;
        }
        toolbar.setImportantForAccessibility(i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> container) {
        Intrinsics.checkNotNullParameter(container, "container");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> container) {
        Intrinsics.checkNotNullParameter(container, "container");
    }

    public final void endRemovalTransition() {
        if (this.isBeingRemoved) {
            this.isBeingRemoved = false;
            endTransitionRecursive(this);
        }
    }

    public final ActivityState getActivityState() {
        return this.activityState;
    }

    public final ScreenContainer getContainer() {
        return this.container;
    }

    public final WeakReference<ScreenContentWrapper> getContentWrapper() {
        return this.contentWrapper;
    }

    public final ScreenFooter getFooter() {
        return this.footer;
    }

    public final Fragment getFragment() {
        ScreenFragmentWrapper screenFragmentWrapper = this.fragmentWrapper;
        if (screenFragmentWrapper != null) {
            return screenFragmentWrapper.getFragment();
        }
        return null;
    }

    public final ScreenFragmentWrapper getFragmentWrapper() {
        return this.fragmentWrapper;
    }

    public final ScreenStackHeaderConfig getHeaderConfig() {
        View next;
        Iterator<View> it = ViewGroupKt.getChildren(this).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof ScreenStackHeaderConfig) {
                break;
            }
        }
        if (next instanceof ScreenStackHeaderConfig) {
            return (ScreenStackHeaderConfig) next;
        }
        return null;
    }

    public final boolean getNativeBackButtonDismissalEnabled() {
        return this.nativeBackButtonDismissalEnabled;
    }

    public final Integer getNavigationBarColor() {
        return this.navigationBarColor;
    }

    public final ThemedReactContext getReactContext() {
        return this.reactContext;
    }

    public final EventDispatcher getReactEventDispatcher() {
        return UIManagerHelper.getEventDispatcherForReactTag(this.reactContext, getId());
    }

    public final ReplaceAnimation getReplaceAnimation() {
        return this.replaceAnimation;
    }

    public final Integer getScreenOrientation() {
        return this.screenOrientation;
    }

    public final BottomSheetBehavior<Screen> getSheetBehavior() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        CoordinatorLayout.LayoutParams layoutParams2 = layoutParams instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams : null;
        CoordinatorLayout.Behavior behavior = layoutParams2 != null ? layoutParams2.getBehavior() : null;
        if (behavior instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) behavior;
        }
        return null;
    }

    public final boolean getSheetClosesOnTouchOutside() {
        return this.sheetClosesOnTouchOutside;
    }

    public final float getSheetCornerRadius() {
        return this.sheetCornerRadius;
    }

    public final List<Double> getSheetDetents() {
        return this.sheetDetents;
    }

    public final float getSheetElevation() {
        return this.sheetElevation;
    }

    public final boolean getSheetExpandsWhenScrolledToEdge() {
        return this.sheetExpandsWhenScrolledToEdge;
    }

    public final int getSheetInitialDetentIndex() {
        return this.sheetInitialDetentIndex;
    }

    public final int getSheetLargestUndimmedDetentIndex() {
        return this.sheetLargestUndimmedDetentIndex;
    }

    public final boolean getShouldTriggerPostponedTransitionAfterLayout() {
        return this.shouldTriggerPostponedTransitionAfterLayout;
    }

    public final StackAnimation getStackAnimation() {
        return this.stackAnimation;
    }

    public final StackPresentation getStackPresentation() {
        return this.stackPresentation;
    }

    public final Integer getStatusBarColor() {
        return this.statusBarColor;
    }

    public final String getStatusBarStyle() {
        return this.statusBarStyle;
    }

    public final boolean isBeingRemoved() {
        return this.isBeingRemoved;
    }

    public final boolean isGestureEnabled() {
        return this.isGestureEnabled;
    }

    public final Boolean isNavigationBarHidden() {
        return this.isNavigationBarHidden;
    }

    public final Boolean isNavigationBarTranslucent() {
        return this.isNavigationBarTranslucent;
    }

    public final boolean isSheetGrabberVisible() {
        return this.isSheetGrabberVisible;
    }

    public final Boolean isStatusBarAnimated() {
        return this.isStatusBarAnimated;
    }

    public final Boolean isStatusBarHidden() {
        return this.isStatusBarHidden;
    }

    public final Boolean isStatusBarTranslucent() {
        return this.isStatusBarTranslucent;
    }

    public final boolean isTransparent() {
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.stackPresentation.ordinal()];
        return i2 == 1 || i2 == 2;
    }

    public final void notifySheetDetentChange$react_native_screens_release(int i2, boolean z2) {
        int surfaceId = UIManagerHelper.getSurfaceId(this.reactContext);
        EventDispatcher reactEventDispatcher = getReactEventDispatcher();
        if (reactEventDispatcher != null) {
            reactEventDispatcher.dispatchEvent(new SheetDetentChangedEvent(surfaceId, getId(), i2, z2));
        }
    }

    @Override // com.swmansion.rnscreens.ScreenContentWrapper.OnLayoutCallback
    public void onContentWrapperLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6 = i5 - i3;
        if (SheetUtilsKt.isSheetFitToContents(this)) {
            BottomSheetBehavior<Screen> sheetBehavior = getSheetBehavior();
            if (sheetBehavior != null && sheetBehavior.getMaxHeight() != i6) {
                sheetBehavior.setMaxHeight(i6);
            }
            this.shouldTriggerPostponedTransitionAfterLayout = true;
            ViewGroup viewGroupParentAsViewGroup = ViewExtKt.parentAsViewGroup(this);
            if (viewGroupParentAsViewGroup == null || viewGroupParentAsViewGroup.isInLayout()) {
                return;
            }
            viewGroupParentAsViewGroup.requestLayout();
        }
    }

    public final void onFinalizePropsUpdate$react_native_screens_release() {
        if (this.shouldUpdateSheetCornerRadius) {
            this.shouldUpdateSheetCornerRadius = false;
            onSheetCornerRadiusChange$react_native_screens_release();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) throws Throwable {
        if ((this.container instanceof ScreenStack) && z2) {
            updateScreenSizePaper(i4 - i2, i5 - i3);
            ScreenFooter screenFooter = this.footer;
            if (screenFooter != null) {
                ScreenContainer screenContainer = this.container;
                Intrinsics.checkNotNull(screenContainer);
                screenFooter.onParentLayout(z2, i2, i3, i4, i5, screenContainer.getHeight());
            }
            notifyHeaderHeightChange(i3);
            maybeTriggerPostponedTransition();
        }
    }

    public final void onSheetCornerRadiusChange$react_native_screens_release() {
        if (this.stackPresentation != StackPresentation.FORM_SHEET || getBackground() == null) {
            return;
        }
        Drawable background = getBackground();
        MaterialShapeDrawable materialShapeDrawable = background instanceof MaterialShapeDrawable ? (MaterialShapeDrawable) background : null;
        if (materialShapeDrawable != null) {
            float dIPFromPixel = PixelUtil.toDIPFromPixel(this.sheetCornerRadius);
            ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel.Builder();
            builder.setTopLeftCorner(0, dIPFromPixel);
            builder.setTopRightCorner(0, dIPFromPixel);
            materialShapeDrawable.setShapeAppearanceModel(builder.build());
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (SheetUtilsKt.usesFormSheetPresentation(this)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void registerLayoutCallbackForWrapper(ScreenContentWrapper wrapper) {
        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
        wrapper.setDelegate$react_native_screens_release(this);
        this.contentWrapper = new WeakReference<>(wrapper);
    }

    public final void setActivityState(ActivityState activityState) {
        Intrinsics.checkNotNullParameter(activityState, "activityState");
        ActivityState activityState2 = this.activityState;
        if (activityState == activityState2) {
            return;
        }
        if ((this.container instanceof ScreenStack) && activityState2 != null) {
            Intrinsics.checkNotNull(activityState2);
            if (activityState.compareTo(activityState2) < 0) {
                throw new IllegalStateException("[RNScreens] activityState can only progress in NativeStack");
            }
        }
        this.activityState = activityState;
        ScreenContainer screenContainer = this.container;
        if (screenContainer != null) {
            screenContainer.notifyChildUpdate();
        }
    }

    public final void setBeingRemoved(boolean z2) {
        this.isBeingRemoved = z2;
    }

    public final void setContainer(ScreenContainer screenContainer) {
        this.container = screenContainer;
    }

    public final void setContentWrapper(WeakReference<ScreenContentWrapper> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.contentWrapper = weakReference;
    }

    public final void setFooter(ScreenFooter screenFooter) {
        BottomSheetBehavior<Screen> sheetBehavior;
        if (screenFooter == null && this.footer != null) {
            BottomSheetBehavior<Screen> sheetBehavior2 = getSheetBehavior();
            if (sheetBehavior2 != null) {
                ScreenFooter screenFooter2 = this.footer;
                Intrinsics.checkNotNull(screenFooter2);
                screenFooter2.unregisterWithSheetBehavior(sheetBehavior2);
            }
        } else if (screenFooter != null && (sheetBehavior = getSheetBehavior()) != null) {
            screenFooter.registerWithSheetBehavior(sheetBehavior);
        }
        this.footer = screenFooter;
    }

    public final void setFragmentWrapper(ScreenFragmentWrapper screenFragmentWrapper) {
        this.fragmentWrapper = screenFragmentWrapper;
    }

    public final void setGestureEnabled(boolean z2) {
        this.isGestureEnabled = z2;
    }

    @Override // android.view.View
    public void setLayerType(int i2, Paint paint) {
    }

    public final void setNativeBackButtonDismissalEnabled(boolean z2) {
        this.nativeBackButtonDismissalEnabled = z2;
    }

    public final void setNavigationBarColor(Integer num) {
        if (num != null) {
            ScreenWindowTraits.INSTANCE.applyDidSetNavigationBarAppearance$react_native_screens_release();
        }
        this.navigationBarColor = num;
        ScreenFragmentWrapper screenFragmentWrapper = this.fragmentWrapper;
        if (screenFragmentWrapper != null) {
            ScreenWindowTraits.INSTANCE.setNavigationBarColor$react_native_screens_release(this, screenFragmentWrapper.tryGetActivity());
        }
    }

    public final void setNavigationBarHidden(Boolean bool) {
        if (bool != null) {
            ScreenWindowTraits.INSTANCE.applyDidSetNavigationBarAppearance$react_native_screens_release();
        }
        this.isNavigationBarHidden = bool;
        ScreenFragmentWrapper screenFragmentWrapper = this.fragmentWrapper;
        if (screenFragmentWrapper != null) {
            ScreenWindowTraits.INSTANCE.setNavigationBarHidden$react_native_screens_release(this, screenFragmentWrapper.tryGetActivity());
        }
    }

    public final void setNavigationBarTranslucent(Boolean bool) {
        if (bool != null) {
            ScreenWindowTraits.INSTANCE.applyDidSetNavigationBarAppearance$react_native_screens_release();
        }
        this.isNavigationBarTranslucent = bool;
        ScreenFragmentWrapper screenFragmentWrapper = this.fragmentWrapper;
        if (screenFragmentWrapper != null) {
            ScreenWindowTraits.INSTANCE.setNavigationBarTranslucent$react_native_screens_release(this, screenFragmentWrapper.tryGetActivity());
        }
    }

    public final void setReplaceAnimation(ReplaceAnimation replaceAnimation) {
        Intrinsics.checkNotNullParameter(replaceAnimation, "<set-?>");
        this.replaceAnimation = replaceAnimation;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setScreenOrientation(java.lang.String r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L6
            r0 = 0
            r2.screenOrientation = r0
            return
        L6:
            com.swmansion.rnscreens.ScreenWindowTraits r0 = com.swmansion.rnscreens.ScreenWindowTraits.INSTANCE
            r0.applyDidSetOrientation$react_native_screens_release()
            int r0 = r3.hashCode()
            switch(r0) {
                case -1894896954: goto L27;
                case 96673: goto L37;
                case 729267099: goto L47;
                case 1430647483: goto L56;
                case 1651658175: goto L65;
                case 1730732811: goto L74;
                case 2118770584: goto L84;
                default: goto L12;
            }
        L12:
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L17:
            r2.screenOrientation = r0
            com.swmansion.rnscreens.ScreenFragmentWrapper r0 = r2.fragmentWrapper
            if (r0 == 0) goto L26
            com.swmansion.rnscreens.ScreenWindowTraits r1 = com.swmansion.rnscreens.ScreenWindowTraits.INSTANCE
            android.app.Activity r0 = r0.tryGetActivity()
            r1.setOrientation$react_native_screens_release(r2, r0)
        L26:
            return
        L27:
            java.lang.String r0 = "portrait_down"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L30
            goto L12
        L30:
            r0 = 9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L17
        L37:
            java.lang.String r0 = "all"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L40
            goto L12
        L40:
            r0 = 10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L17
        L47:
            java.lang.String r0 = "portrait"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L50
            goto L12
        L50:
            r0 = 7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L17
        L56:
            java.lang.String r0 = "landscape"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L5f
            goto L12
        L5f:
            r0 = 6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L17
        L65:
            java.lang.String r0 = "portrait_up"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L6e
            goto L12
        L6e:
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L17
        L74:
            java.lang.String r0 = "landscape_left"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L7d
            goto L12
        L7d:
            r0 = 8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L17
        L84:
            java.lang.String r0 = "landscape_right"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L8d
            goto L12
        L8d:
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.Screen.setScreenOrientation(java.lang.String):void");
    }

    public final void setSheetClosesOnTouchOutside(boolean z2) {
        this.sheetClosesOnTouchOutside = z2;
    }

    public final void setSheetCornerRadius(float f2) {
        if (this.sheetCornerRadius == f2) {
            return;
        }
        this.sheetCornerRadius = f2;
        this.shouldUpdateSheetCornerRadius = true;
    }

    public final void setSheetDetents(List<Double> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.sheetDetents = list;
    }

    public final void setSheetElevation(float f2) {
        this.sheetElevation = f2;
    }

    public final void setSheetExpandsWhenScrolledToEdge(boolean z2) {
        this.sheetExpandsWhenScrolledToEdge = z2;
    }

    public final void setSheetGrabberVisible(boolean z2) {
        this.isSheetGrabberVisible = z2;
    }

    public final void setSheetInitialDetentIndex(int i2) {
        this.sheetInitialDetentIndex = i2;
    }

    public final void setSheetLargestUndimmedDetentIndex(int i2) {
        this.sheetLargestUndimmedDetentIndex = i2;
    }

    public final void setShouldTriggerPostponedTransitionAfterLayout(boolean z2) {
        this.shouldTriggerPostponedTransitionAfterLayout = z2;
    }

    public final void setStackAnimation(StackAnimation stackAnimation) {
        Intrinsics.checkNotNullParameter(stackAnimation, "<set-?>");
        this.stackAnimation = stackAnimation;
    }

    public final void setStackPresentation(StackPresentation stackPresentation) {
        Intrinsics.checkNotNullParameter(stackPresentation, "<set-?>");
        this.stackPresentation = stackPresentation;
    }

    public final void setStatusBarAnimated(Boolean bool) {
        this.isStatusBarAnimated = bool;
    }

    public final void setStatusBarColor(Integer num) {
        if (num != null) {
            ScreenWindowTraits.INSTANCE.applyDidSetStatusBarAppearance$react_native_screens_release();
        }
        this.statusBarColor = num;
        ScreenFragmentWrapper screenFragmentWrapper = this.fragmentWrapper;
        if (screenFragmentWrapper != null) {
            ScreenWindowTraits.INSTANCE.setColor$react_native_screens_release(this, screenFragmentWrapper.tryGetActivity(), screenFragmentWrapper.tryGetContext());
        }
    }

    public final void setStatusBarHidden(Boolean bool) {
        if (bool != null) {
            ScreenWindowTraits.INSTANCE.applyDidSetStatusBarAppearance$react_native_screens_release();
        }
        this.isStatusBarHidden = bool;
        ScreenFragmentWrapper screenFragmentWrapper = this.fragmentWrapper;
        if (screenFragmentWrapper != null) {
            ScreenWindowTraits.INSTANCE.setHidden$react_native_screens_release(this, screenFragmentWrapper.tryGetActivity());
        }
    }

    public final void setStatusBarStyle(String str) {
        if (str != null) {
            ScreenWindowTraits.INSTANCE.applyDidSetStatusBarAppearance$react_native_screens_release();
        }
        this.statusBarStyle = str;
        ScreenFragmentWrapper screenFragmentWrapper = this.fragmentWrapper;
        if (screenFragmentWrapper != null) {
            ScreenWindowTraits.INSTANCE.setStyle$react_native_screens_release(this, screenFragmentWrapper.tryGetActivity(), screenFragmentWrapper.tryGetContext());
        }
    }

    public final void setStatusBarTranslucent(Boolean bool) {
        if (bool != null) {
            ScreenWindowTraits.INSTANCE.applyDidSetStatusBarAppearance$react_native_screens_release();
        }
        this.isStatusBarTranslucent = bool;
        ScreenFragmentWrapper screenFragmentWrapper = this.fragmentWrapper;
        if (screenFragmentWrapper != null) {
            ScreenWindowTraits.INSTANCE.setTranslucent$react_native_screens_release(this, screenFragmentWrapper.tryGetActivity(), screenFragmentWrapper.tryGetContext());
        }
    }

    public final void setTransitioning(boolean z2) {
        if (this.isTransitioning == z2) {
            return;
        }
        this.isTransitioning = z2;
        boolean zHasWebView = hasWebView(this);
        if (!zHasWebView || getLayerType() == 2) {
            super.setLayerType((!z2 || zHasWebView) ? 0 : 2, null);
        }
    }

    public final void startRemovalTransition() {
        if (this.isBeingRemoved) {
            return;
        }
        this.isBeingRemoved = true;
        startTransitionRecursive(this);
    }
}
