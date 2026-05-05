package com.swmansion.rnscreens;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import com.drew.metadata.iptc.IptcDirectory;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.callback.Callback;
import com.facebook.react.ReactApplication;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.text.ReactTypefaceUtils;
import com.swmansion.rnscreens.ScreenStackHeaderSubview;
import com.swmansion.rnscreens.events.HeaderAttachedEvent;
import com.swmansion.rnscreens.events.HeaderDetachedEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
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
@Metadata(bv = {}, d1 = {"Яp\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u001b\u007fјnjO0L͜P.`Y2\u000fq{<$q$yCQU\"}8\tWNmkvJh\u0017K\u000f\f!\u0001jBI]xc\u0013\u00172XoG3SpE9vt>\u0005&7*8\b\n\t\u001a0H\u0018v\u0011CS\f\u00181HpHR\u0015M\u000bA(ß\\\u00011\u001e\u000bf\u00076)N\u001eE?'\u0011iZNU`݁\u0001M\u001bH\u001d;\u001b/y\u001eYyg9#_k\u00035^\fC\u0011z\n=3po+9\u0006\fWd\u0012H #hg\r\f~V`\u0013\rx\fU3\u0018iY\u000f&(&4B\r\u0005\n\u001cE?H\\f`xP\u0014A5\u000bSn\nHp\u000b.\t#N\u0017S9c/G]~Q\u0010?IRE?\u001d\rL+1r/ l\u000e\u000f\u001dKX\u0006\u0017IQnExR\u0018 Um2x)\u0014r\b>\u000f\u0018/*Jv\u001b3\u007fs9QZ4\u000eV\u000e\u007fv3\u001a\u0019Ww\u000e`@Pv^C8S$Zr\u001e5o^Wp,?Qdg\u0015I \u0013N\u0016(B/q(Peg\u0018rܷa\n3|/Eg=\u0004\u000e\u0006r\u000f9Cd{\u0012wQ%(\bHpTpfp\r<^jx:2vnX\u0004\n\u0016f\fAkou*\u0007D1G`]T\u0011qZA+B\u0010^vd\u0017Ta(Ku2J!\u0001~\u0016!suEa,+hj;O(M\u0019T\u000fRnB+;\t\u0015r.[0XU$\u0005\u0016$\u000f,$$fQQ]E[\u001d\r\u0002J\u0002[~|xs\u0002e\u0014=y+\u000eWGv\b\u007f\b\u0019*\\dx{gTET?l\u0001} d.3\u0012L\t#{V!Zl];\u000fg\u0019f8+>O\"3^\b\"+9uO5{.wBhEekI\b.(f_2\u0003h\u001c,\u0012\u001aF̨]Є6;@Ծ*\u000bL'<l1H\u001f۶yڇF\t<ؿ\u0004XOk\tXNL97Tֈ\u0013Ր\u0011r^[H\u001c@\u001aB8w:\u0004E\u000e\u0014\rOS\u001c6Ywo}K\u000b\u0017)\u001c`Ν}ϥr\u0012$ܻpeep!04{Nzװ?f\u001d>\u000f3B<\r\u0014\u0019Tli4\u0018QėHݍ\u0013\u0017:߿DGd lx\u000b^\u001fζb҇d!2܀O\u001dA1\u00117G\u0004\u001cZ+Вo҅\u0005S%̿kz]\u0014~'AC\u0003Aqμd܁\u000fGeCW\u000b\u0007\u0010U?\u0006k\u001e\u0010\u000f\u0091\tܫF\u0018#ʃ\"\u001dm\u000eH^9Y;̲pʝ\u0016fZƉr5\r\u0013\u0015\u000ej\u000eeԨ%۽voj\u03a2\u001df\u0006P[\u001a/\u001b\u001b͏\u0013Ѽ\u0001oNɑE\b;FKc\u000b\u0016-\u0017eo\f\u0016\u0016=8'2xwƿcˍj\u0016eͩR\u0018w3p\u001c)\u0015V>\u0012J\u001b\u0001\u0001)F\bdSXֲ\u000eեbYsլqL5K\u0005\u0006pO?ǐ\u0016ʋpcvΩ[\u0017tRn{\u0005,~??g$ܛ\u0015͠^>)U&{\u001f$d&4DN\nx(>u\u001a-ӗoSs\u000f1VyR2E>{6\u007f5x$.`\u0015~׀=ܑQB|\u000bb\u0018P\u0004^jxU|t:1jΜ\u000bĿb\u0011\u001b̊\u0017\u0001,\u0013G9/\u001e\n!\u001e֟\u0013ʺII.ϳ\u0002^MJO29w~ϖ\u001dܾ>b|ʔzP\u0017#\u0018iB,th\u0014Ԧ3ڵ(mlܞvWSiZ\bZCdĴ;և< Fюj(I\u0005KAG\u0019Ẅ́D۰s\u0007!ƺ;`aYB\u0001+6°C\u007f9ˉRu=)1fޒs}"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>G\r\u001c5sx.IB;x\u0012(\u001eie;\\", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011P\n9\u0004)39\u0007\u001c4t\u0016-0C7j4+rrj:\u000be\u001dRv9)YX<g(", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "0`R85<Mb#\b^g\n\r\u0017>o\b\u0019\u007f@\u0013", "", "0`R863BQ\u001fe~l;|\u0012/r", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012feI^\u001e\u001bEut@\u000545b}-\r", "0`R8Z9Hc\"}Xh3\u0007\u0016", "", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "1n]3\\.,c\u0016\u0010~^>\u000b", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>G\r\u001c5sx.IB;x\".\u0012ye9\u00199", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "1n]3\\.,c\u0016\u0010~^>\u000bf9u\t7", "5dc\u0010b5?W\u001bl\u000b[=\u0001\tAs]2\fI\u0010", "u(8", "2dU.h3MA(z\bm\u0010\u0006\u0017/t", "2dU.h3MA(z\bm\u0010\u0006\u0017/tq,\u000bCi\u0013(Kq\nKz/>", "2ha2V;B]\"", "", "6dP1X9-]$b\u0004l,\f", "7r0Ag(<V\u0019}ih\u001e\u0001\u0012.o\u0012", "7r1.V2\u001bc(\u000e\u0005g\u000f\u0001\b.e\t", "7r32f;K]-~y", "7r72T+>`{\u0003y],\u0006", "u(I", "Adc\u0015X(=S&a~]+|\u0012", "uY\u0018#", "7r72T+>`\b\fvg:\u0004\u0019-e\t7", "Adc\u0015X(=S&m\bZ5\u000b\u0010?c\u007f1\u000b", "7rB5T+He{\u0003y],\u0006", "7rC<c\u0010Ga\u0019\u000eZg(y\u0010/d", "Aba2X5", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>/", "5dc V9>S\"", "u(;0b4\ba+\u0007vg:\u0001\u00138/\r1\n>\u000e\u0017\u0017P}W*t25Y\u0007u", "Aba2X5\u001f`\u0015\u0001\u0003^5\f", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>G\r\u001c5sv;IECk=-j", "5dc V9>S\"_\bZ.\u0005\t8t", "u(;0b4\ba+\u0007vg:\u0001\u00138/\r1\n>\u000e\u0017\u0017P}W*t25Y\u0007\u000eFi\u00144.P7m<\u001e\u001ew7", "Aba2X5,b\u0015|\u0001", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>G\r\u001c5sk", "5dc V9>S\"l\nZ*\u0003", "u(;0b4\ba+\u0007vg:\u0001\u00138/\r1\n>\u000e\u0017\u0017P}W*t25Y\u0007\u000eFi\u00144#", "Bh]A66E]&", "Bhc9X", "Bhc9X\nHZ#\f", "Bhc9X\rH\\(_vf0\u0004\u001d", "Bhc9X\rH\\(l~s,", "", "Bhc9X\rH\\(pzb.\u007f\u0018", "Bn^9U(K", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011M\u001eJ\u0006/=H\b*>j\u0012;#", "5dc!b6EP\u0015\f", "u(;0b4\ba+\u0007vg:\u0001\u00138/\r1\n>\u000e\u0017\u0017P}W\u001a\u00073Dc\u0006\u000fAw\u001d+IP\u0011", "/cS\u0010b5?W\u001bl\u000b[=\u0001\tA", "", "1gX9W", "7mS2k", "2dbAe6R", "5dc\u0010b5?W\u001bl\u000b[=\u0001\tA", ";`h/X\u001cIR\u0015\u000ez", "=m0Ag(<V\u0019}ih\u001e\u0001\u0012.o\u0012", "=m32g(<V\u0019}[k6\u0005z3n~2\u000e", "=m;.l6Nb", "1gP;Z,=", Global.COLON, "B", "@", AdkSettings.PLATFORM_TYPE_MOBILE, "=mD=W(MS", "@d\\<i,\u001aZ \\\u0005g-\u0001\u000b\u001du|9\u007f@\u0013%", "@d\\<i,\u001c]\"\u007f~`\u001a\r\u0006@i\u007f:", "Adc\u000fT*D0)\u000e\nh5`\u0012\ru\u000e7\u0006Hq\u001b\u0017Y", "Adc\u000fT*DU&\t\u000bg+Z\u00136o\r", "1n[<e", "uKY.i(\bZ\u0015\b|(\u0010\u0006\u0018/g\u007f5Q\u0004q", "Adc\u0011\\9>Q(\u0003\u0005g", "Adc\u0015\\+=S\"", "6hS1X5", "Adc\u0015\\+>0\u0015|\u0001;<\f\u00189n", "6hS25(<Yu\u000f\nm6\u0006", "Adc\u0015\\+>A\u001czyh>", "6hS2F/:R#\u0011", "Adc!\\5M1#\u0006\u0005k", "Adc!\\;ES", "Adc!\\;ESv\t\u0002h9", "Adc!\\;ESy\t\u0004m\rx\u00113l\u0014", "Adc!\\;ESy\t\u0004m\u001a\u0001\u001e/", "Adc!\\;ESy\t\u0004m\u001e|\r1h\u000f", "4n]AJ,BU\u001c\u000ehm9\u0001\u00121", "Adc!b7\"\\'~\n>5x\u00066e~", "Bn_\u0016a:>bx\bv[3|\b", "Adc!e(Ga \u000fx^5\f", "BqP;f3NQ\u0019\b\n", "\u0011n\\=T5B]\"", "\u0012dQBZ\u0014>\\)m\u0005h3y\u0005<", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ScreenStackHeaderConfig extends FabricEnabledHeaderConfigViewGroup {
    public static final Companion Companion = new Companion(null);
    private boolean backButtonInCustomView;
    private final View.OnClickListener backClickListener;
    private Integer backgroundColor;
    private final ArrayList<ScreenStackHeaderSubview> configSubviews;
    private final int defaultStartInset;
    private final int defaultStartInsetWithNavigation;
    private String direction;
    private Integer headerTopInset;
    private boolean isAttachedToWindow;
    private boolean isBackButtonHidden;
    private boolean isDestroyed;
    private boolean isHeaderHidden;
    private boolean isHeaderTranslucent;
    private boolean isShadowHidden;
    private boolean isTopInsetEnabled;
    private int tintColor;
    private String title;
    private int titleColor;
    private String titleFontFamily;
    private float titleFontSize;
    private int titleFontWeight;
    private final CustomToolbar toolbar;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:QIV2\u007f8\b}P\u0018k|Mr\u000bq\u0013َ\u001a}"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>G\r\u001c5sx.IB;x\u0012(\u001eie;EA6V\u0002#PPX52", "", "u(E", "4h]1G0MZ\u0019mzq;m\r/wc1jJ\u000b\u001e\u0014C|", "\u001a`]1e6BRb\u0011~].|\u0018xT\u007f;\u000b1\u0005\u0017)\u001d", "Bn^9U(K", "\u001a`]1e6BR,Hvi7z\u00137p{7ER\u0005\u0016\u0019G~W+\u0001/<Vy-\r", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TextView findTitleTextViewInToolbar(Toolbar toolbar) {
            Intrinsics.checkNotNullParameter(toolbar, "toolbar");
            int childCount = toolbar.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = toolbar.getChildAt(i2);
                if (childAt instanceof TextView) {
                    TextView textView = (TextView) childAt;
                    if (Intrinsics.areEqual(textView.getText(), toolbar.getTitle())) {
                        return textView;
                    }
                }
            }
            return null;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njG9L͜N.hݷZ\u000f\u001azt7k(\u007fCSUH~2\r]P\u007fg\u001dMҼ\u000fC\u001d\n^~x1aU'cX#̙Fv"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>G\r\u001c5sx.IB;x\u0012(\u001eie;EB,K\u0007)/LW<K\\|D\u0011\u000egc", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011M\u001eJ\u0006/=H\b*>j\u0012;#", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "1n]3\\.", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>G\r\u001c5sx.IB;x\u0012(\u001eie;\\", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~g\u0010(3v$2WL\u0005x=,\u0013ua9\u0010qu<t4GLW\u001akNpCv\u0012V\rN8j\u000fbB(p\u001az\u0010", "Ag^DB=>`\u001a\u0006\u0005p\u0014|\u0012?", "", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class DebugMenuToolbar extends CustomToolbar {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DebugMenuToolbar(Context context, ScreenStackHeaderConfig config) {
            super(context, config);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(config, "config");
        }

        @Override // androidx.appcompat.widget.Toolbar
        public boolean showOverflowMenu() throws Throwable {
            Context context = getContext();
            Object[] objArr = new Object[0];
            Method method = Class.forName(Wg.vd("?MDSID@\u000bIVV]GQX\u0013\u0011>>E/C@", (short) (FB.Xd() ^ 9272))).getMethod(Qg.kd("B?M\u0019GFA=63E9><\u0010;9>.@;", (short) (FB.Xd() ^ 18331), (short) (FB.Xd() ^ IptcDirectory.TAG_OBJECT_CYCLE)), new Class[0]);
            try {
                method.setAccessible(true);
                Object obj = (Context) method.invoke(context, objArr);
                Intrinsics.checkNotNull(obj, hg.Vd("\u007f\u0006{z-olxww{&gi#ebss\u001eqk\u001bhhf$dj`_\u0012ei_S\rOZW\u0017NHIJFRQL\u000eQC>?O\b+=89I\u0015CB=92/A5:8", (short) (C1499aX.Xd() ^ (-20261)), (short) (C1499aX.Xd() ^ (-4198))));
                ((ReactApplication) obj).getReactNativeHost().getReactInstanceManager().showDevOptionsDialog();
                return true;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScreenStackHeaderSubview.Type.values().length];
            try {
                iArr[ScreenStackHeaderSubview.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScreenStackHeaderSubview.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScreenStackHeaderSubview.Type.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenStackHeaderConfig(Context context) throws Throwable {
        super(context);
        Intrinsics.checkNotNullParameter(context, C1561oA.ud("\u007f\u000b\t\u000e}\u0010\u000b", (short) (C1580rY.Xd() ^ (-29757))));
        this.configSubviews = new ArrayList<>(3);
        this.isTopInsetEnabled = true;
        this.backClickListener = new View.OnClickListener() { // from class: com.swmansion.rnscreens.ScreenStackHeaderConfig$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScreenStackHeaderConfig.m8763instrumented$0$new$LandroidcontentContextV(this.f$0, view);
            }
        };
        setVisibility(8);
        CustomToolbar customToolbar = new CustomToolbar(context, this);
        this.toolbar = customToolbar;
        this.defaultStartInset = customToolbar.getContentInsetStart();
        this.defaultStartInsetWithNavigation = customToolbar.getContentInsetStartWithNavigation();
        TypedValue typedValue = new TypedValue();
        short sXd = (short) (C1633zX.Xd() ^ (-31915));
        int[] iArr = new int["1?2A;6.x+84;)36p\u00030,3!5.".length()];
        QB qb = new QB("1?2A;6.x+84;)36p\u00030,3!5.");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Yd("\u0006\u0005\u0015u\u000b\t\u0012\u000b", (short) (C1580rY.Xd() ^ (-18642))), new Class[0]);
        try {
            method.setAccessible(true);
            if (((Resources.Theme) method.invoke(context, objArr)).resolveAttribute(android.R.attr.colorPrimary, typedValue, true)) {
                customToolbar.setBackgroundColor(typedValue.data);
            }
            customToolbar.setClipChildren(false);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static final void backClickListener$lambda$1(ScreenStackHeaderConfig this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ScreenStackFragment screenFragment = this$0.getScreenFragment();
        if (screenFragment != null) {
            ScreenStack screenStack = this$0.getScreenStack();
            if (screenStack == null || !Intrinsics.areEqual(screenStack.getRootScreen(), screenFragment.getScreen())) {
                if (screenFragment.getScreen().getNativeBackButtonDismissalEnabled()) {
                    screenFragment.dismissFromContainer();
                    return;
                } else {
                    screenFragment.dispatchHeaderBackButtonClickedEvent();
                    return;
                }
            }
            Fragment parentFragment = screenFragment.getParentFragment();
            if (parentFragment instanceof ScreenStackFragment) {
                ScreenStackFragment screenStackFragment = (ScreenStackFragment) parentFragment;
                if (screenStackFragment.getScreen().getNativeBackButtonDismissalEnabled()) {
                    screenStackFragment.dismissFromContainer();
                } else {
                    screenStackFragment.dispatchHeaderBackButtonClickedEvent();
                }
            }
        }
    }

    private final Screen getScreen() {
        ViewParent parent = getParent();
        if (parent instanceof Screen) {
            return (Screen) parent;
        }
        return null;
    }

    private final ScreenStack getScreenStack() {
        Screen screen = getScreen();
        ScreenContainer container = screen != null ? screen.getContainer() : null;
        if (container instanceof ScreenStack) {
            return (ScreenStack) container;
        }
        return null;
    }

    /* JADX INFO: renamed from: instrumented$0$new$-Landroid-content-Context--V */
    public static /* synthetic */ void m8763instrumented$0$new$LandroidcontentContextV(ScreenStackHeaderConfig screenStackHeaderConfig, View view) {
        Callback.onClick_enter(view);
        try {
            backClickListener$lambda$1(screenStackHeaderConfig, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    private final void maybeUpdate() {
        Screen screen;
        if (getParent() == null || this.isDestroyed || (screen = getScreen()) == null || screen.isBeingRemoved()) {
            return;
        }
        onUpdate();
    }

    public final void addConfigSubview(ScreenStackHeaderSubview child, int i2) {
        Intrinsics.checkNotNullParameter(child, "child");
        this.configSubviews.add(i2, child);
        maybeUpdate();
    }

    public final void destroy() {
        this.isDestroyed = true;
    }

    public final ScreenStackHeaderSubview getConfigSubview(int i2) {
        ScreenStackHeaderSubview screenStackHeaderSubview = this.configSubviews.get(i2);
        Intrinsics.checkNotNullExpressionValue(screenStackHeaderSubview, "get(...)");
        return screenStackHeaderSubview;
    }

    public final int getConfigSubviewsCount() {
        return this.configSubviews.size();
    }

    public final ScreenStackFragment getScreenFragment() {
        ViewParent parent = getParent();
        if (!(parent instanceof Screen)) {
            return null;
        }
        Fragment fragment = ((Screen) parent).getFragment();
        if (fragment instanceof ScreenStackFragment) {
            return (ScreenStackFragment) fragment;
        }
        return null;
    }

    public final CustomToolbar getToolbar() {
        return this.toolbar;
    }

    public final boolean isHeaderHidden() {
        return this.isHeaderHidden;
    }

    public final boolean isHeaderTranslucent() {
        return this.isHeaderTranslucent;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isAttachedToWindow = true;
        int surfaceId = UIManagerHelper.getSurfaceId(this);
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new HeaderAttachedEvent(surfaceId, getId()));
        }
        if (this.headerTopInset == null) {
            this.headerTopInset = Build.VERSION.SDK_INT >= 30 ? Integer.valueOf(getRootWindowInsets().getInsets(WindowInsets.Type.systemBars()).top) : Integer.valueOf(getRootWindowInsets().getSystemWindowInsetTop());
        }
        onUpdate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        int surfaceId = UIManagerHelper.getSurfaceId(this);
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new HeaderDetachedEvent(surfaceId, getId()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
    }

    public final void onUpdate() {
        Drawable navigationIcon;
        ScreenStackFragment screenFragment;
        ScreenStackFragment screenFragment2;
        ReactContext reactContextTryGetContext;
        ScreenStack screenStack = getScreenStack();
        boolean z2 = screenStack == null || Intrinsics.areEqual(screenStack.getTopScreen(), getParent());
        if (this.isAttachedToWindow && z2 && !this.isDestroyed) {
            ScreenStackFragment screenFragment3 = getScreenFragment();
            AppCompatActivity appCompatActivity = (AppCompatActivity) (screenFragment3 != null ? screenFragment3.getActivity() : null);
            if (appCompatActivity == null) {
                return;
            }
            String str = this.direction;
            if (str != null) {
                if (Intrinsics.areEqual(str, Xg.qd("692", (short) (C1499aX.Xd() ^ (-27735)), (short) (C1499aX.Xd() ^ (-14795))))) {
                    this.toolbar.setLayoutDirection(1);
                } else if (Intrinsics.areEqual(this.direction, Jg.Wd("0Nv", (short) (C1499aX.Xd() ^ (-488)), (short) (C1499aX.Xd() ^ (-10338))))) {
                    this.toolbar.setLayoutDirection(0);
                }
            }
            Screen screen = getScreen();
            if (screen != null) {
                if (getContext() instanceof ReactContext) {
                    Context context = getContext();
                    Intrinsics.checkNotNull(context, ZO.xd("FD\u0007XU<h\n\u000f1%\u007f\u0002#T%!C{Oz{'\\:c49'q0-\u001a4/50\u0019\u0003^hH-2'WJJO\u0013PC}CX8\u001b\u0015\nU0\u0013j\u0015~\nf\u0002\u001d\u001a6\u001b]RZ", (short) (C1580rY.Xd() ^ (-16160)), (short) (C1580rY.Xd() ^ (-12540))));
                    reactContextTryGetContext = (ReactContext) context;
                } else {
                    ScreenFragmentWrapper fragmentWrapper = screen.getFragmentWrapper();
                    reactContextTryGetContext = fragmentWrapper != null ? fragmentWrapper.tryGetContext() : null;
                }
                ScreenWindowTraits.INSTANCE.trySetWindowTraits$react_native_screens_release(screen, appCompatActivity, reactContextTryGetContext);
            }
            if (this.isHeaderHidden) {
                if (this.toolbar.getParent() == null || (screenFragment2 = getScreenFragment()) == null) {
                    return;
                }
                screenFragment2.removeToolbar();
                return;
            }
            if (this.toolbar.getParent() == null && (screenFragment = getScreenFragment()) != null) {
                screenFragment.setToolbar(this.toolbar);
            }
            if (this.isTopInsetEnabled) {
                Integer num = this.headerTopInset;
                this.toolbar.setPadding(0, num != null ? num.intValue() : 0, 0, 0);
            } else if (this.toolbar.getPaddingTop() > 0) {
                this.toolbar.setPadding(0, 0, 0, 0);
            }
            appCompatActivity.setSupportActionBar(this.toolbar);
            ActionBar supportActionBar = appCompatActivity.getSupportActionBar();
            if (supportActionBar == null) {
                throw new IllegalArgumentException(C1561oA.Kd("r\u0007\u0014\u0019\u000e\u0018\f\fH \f\u0018\"\u0013N'\u0012%R\"*\"#e", (short) (OY.Xd() ^ 18328)).toString());
            }
            short sXd = (short) (OY.Xd() ^ 25510);
            short sXd2 = (short) (OY.Xd() ^ 19523);
            int[] iArr = new int["&\u001a\u001c\nC/o.8giA,_I\u0016lD8".length()];
            QB qb = new QB("&\u001a\u001c\nC/o.8giA,_I\u0016lD8");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                i2++;
            }
            Intrinsics.checkNotNullExpressionValue(supportActionBar, new String(iArr, 0, i2));
            this.toolbar.setContentInsetStartWithNavigation(this.defaultStartInsetWithNavigation);
            CustomToolbar customToolbar = this.toolbar;
            int i3 = this.defaultStartInset;
            customToolbar.setContentInsetsRelative(i3, i3);
            ScreenStackFragment screenFragment4 = getScreenFragment();
            supportActionBar.setDisplayHomeAsUpEnabled((screenFragment4 == null || !screenFragment4.canNavigateBack() || this.isBackButtonHidden) ? false : true);
            this.toolbar.setNavigationOnClickListener(this.backClickListener);
            ScreenStackFragment screenFragment5 = getScreenFragment();
            if (screenFragment5 != null) {
                screenFragment5.setToolbarShadowHidden(this.isShadowHidden);
            }
            ScreenStackFragment screenFragment6 = getScreenFragment();
            if (screenFragment6 != null) {
                screenFragment6.setToolbarTranslucent(this.isHeaderTranslucent);
            }
            supportActionBar.setTitle(this.title);
            if (TextUtils.isEmpty(this.title)) {
                this.toolbar.setContentInsetStartWithNavigation(0);
            }
            TextView textViewFindTitleTextViewInToolbar = Companion.findTitleTextViewInToolbar(this.toolbar);
            int i4 = this.titleColor;
            if (i4 != 0) {
                this.toolbar.setTitleTextColor(i4);
            }
            if (textViewFindTitleTextViewInToolbar != null) {
                String str2 = this.titleFontFamily;
                if (str2 != null || this.titleFontWeight > 0) {
                    int i5 = this.titleFontWeight;
                    Context context2 = getContext();
                    Object[] objArr = new Object[0];
                    Method method = Class.forName(Ig.wd("cA\u0003r-JkrMWV@b_o\ty\u0016Z\u001aP5\u0015", (short) (C1633zX.Xd() ^ (-11095)))).getMethod(EO.Od("E\u00147\u001dQ~>_)", (short) (ZN.Xd() ^ 18413)), new Class[0]);
                    try {
                        method.setAccessible(true);
                        Typeface typefaceApplyStyles = ReactTypefaceUtils.applyStyles(null, 0, i5, str2, (AssetManager) method.invoke(context2, objArr));
                        Intrinsics.checkNotNullExpressionValue(typefaceApplyStyles, C1561oA.Qd("0>=8D\u001d=A3+8kponh", (short) (C1633zX.Xd() ^ (-21554))));
                        textViewFindTitleTextViewInToolbar.setTypeface(typefaceApplyStyles);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                float f2 = this.titleFontSize;
                if (f2 > 0.0f) {
                    textViewFindTitleTextViewInToolbar.setTextSize(f2);
                }
            }
            Integer num2 = this.backgroundColor;
            if (num2 != null) {
                this.toolbar.setBackgroundColor(num2.intValue());
            }
            if (this.tintColor != 0 && (navigationIcon = this.toolbar.getNavigationIcon()) != null) {
                navigationIcon.setColorFilter(new PorterDuffColorFilter(this.tintColor, PorterDuff.Mode.SRC_ATOP));
            }
            for (int childCount = this.toolbar.getChildCount() - 1; -1 < childCount; childCount--) {
                if (this.toolbar.getChildAt(childCount) instanceof ScreenStackHeaderSubview) {
                    this.toolbar.removeViewAt(childCount);
                }
            }
            int size = this.configSubviews.size();
            for (int i6 = 0; i6 < size; i6++) {
                ScreenStackHeaderSubview screenStackHeaderSubview = this.configSubviews.get(i6);
                short sXd3 = (short) (C1499aX.Xd() ^ (-6610));
                short sXd4 = (short) (C1499aX.Xd() ^ (-29662));
                int[] iArr2 = new int["! 0dklmi".length()];
                QB qb2 = new QB("! 0dklmi");
                int i7 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i7] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i7)) - sXd4);
                    i7++;
                }
                Intrinsics.checkNotNullExpressionValue(screenStackHeaderSubview, new String(iArr2, 0, i7));
                ScreenStackHeaderSubview screenStackHeaderSubview2 = screenStackHeaderSubview;
                ScreenStackHeaderSubview.Type type = screenStackHeaderSubview2.getType();
                if (type == ScreenStackHeaderSubview.Type.BACK) {
                    View childAt = screenStackHeaderSubview2.getChildAt(0);
                    ImageView imageView = childAt instanceof ImageView ? (ImageView) childAt : null;
                    if (imageView == null) {
                        throw new JSApplicationIllegalArgumentException(C1561oA.od("Jhip$ewutnl\u001dd`[]]i\u0016XcaXZW\u000fdVQb\n\\PV[QH\u0003JBVD}&I<A>w8It:<DDDn1557.", (short) (C1633zX.Xd() ^ (-20115))));
                    }
                    supportActionBar.setHomeAsUpIndicator(imageView.getDrawable());
                } else {
                    Toolbar.LayoutParams layoutParams = new Toolbar.LayoutParams(-2, -1);
                    int i8 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                    if (i8 == 1) {
                        if (!this.backButtonInCustomView) {
                            this.toolbar.setNavigationIcon((Drawable) null);
                        }
                        this.toolbar.setTitle((CharSequence) null);
                        layoutParams.gravity = GravityCompat.START;
                    } else if (i8 == 2) {
                        layoutParams.gravity = GravityCompat.END;
                    } else if (i8 == 3) {
                        layoutParams.width = -1;
                        layoutParams.gravity = 1;
                        this.toolbar.setTitle((CharSequence) null);
                    }
                    screenStackHeaderSubview2.setLayoutParams(layoutParams);
                    this.toolbar.addView(screenStackHeaderSubview2);
                }
            }
        }
    }

    public final void removeAllConfigSubviews() {
        this.configSubviews.clear();
        maybeUpdate();
    }

    public final void removeConfigSubview(int i2) {
        this.configSubviews.remove(i2);
        maybeUpdate();
    }

    public final void setBackButtonInCustomView(boolean z2) {
        this.backButtonInCustomView = z2;
    }

    public final void setBackgroundColor(Integer num) {
        this.backgroundColor = num;
    }

    public final void setDirection(String str) {
        this.direction = str;
    }

    public final void setHeaderHidden(boolean z2) {
        this.isHeaderHidden = z2;
    }

    public final void setHeaderTranslucent(boolean z2) {
        this.isHeaderTranslucent = z2;
    }

    public final void setHidden(boolean z2) {
        this.isHeaderHidden = z2;
    }

    public final void setHideBackButton(boolean z2) {
        this.isBackButtonHidden = z2;
    }

    public final void setHideShadow(boolean z2) {
        this.isShadowHidden = z2;
    }

    public final void setTintColor(int i2) {
        this.tintColor = i2;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTitleColor(int i2) {
        this.titleColor = i2;
    }

    public final void setTitleFontFamily(String str) {
        this.titleFontFamily = str;
    }

    public final void setTitleFontSize(float f2) {
        this.titleFontSize = f2;
    }

    public final void setTitleFontWeight(String str) {
        this.titleFontWeight = ReactTypefaceUtils.parseFontWeight(str);
    }

    public final void setTopInsetEnabled(boolean z2) {
        this.isTopInsetEnabled = z2;
    }

    public final void setTranslucent(boolean z2) {
        this.isHeaderTranslucent = z2;
    }
}
