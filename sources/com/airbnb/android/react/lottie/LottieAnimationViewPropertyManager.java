package com.airbnb.android.react.lottie;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.net.Uri;
import android.widget.ImageView;
import com.airbnb.lottie.FontAssetDelegate;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.RenderMode;
import com.airbnb.lottie.SimpleColorFilter;
import com.airbnb.lottie.TextDelegate;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieValueCallback;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.util.RNLog;
import com.facebook.react.views.text.ReactFontManager;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;
import java.util.zip.ZipInputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.QB;
import yg.Qg;
import yg.Wg;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я`\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\":\u001e\u007f\u0007lrA0RnP.X[2\u000f\u0002{<$a0yCI[\"}(\u0010WNulvJ`\u000fK\u000f\u001c\u0016\u0001j2L]xs\u0012\u00172H{G3coEʠhtD\u0005(2(8\u0002\u0005\u0017\u001a2Ϻ&͌+Cy\u000bR;PtHR%M3\u001bŪ\n>.\u0003f`u\u001fNH\u001b/\u0003E1U\u0002B|x\u00104\u000b!%F\u0003{=zo\u001eC@e6[%$\u000f\u0015Us?1CHܸGص+'3ɞDqD]\u0018\u0016+*}\u00114ý2ػ\t]hϯ?-UiYW.*}\u0003\n\u0016\r*\u001c\u0011?JD,Hj8\u0014A~\u000bUVO0b\u0001DQʯBа)\f;ٿQ\u001dl]oB9P=\t\u0013\u0016n/\u000f|9[\u0003\u001d7ڀ'ƻ{Q9҅\u0011WV^\"[Sl2t9̪6˙4S\b\u07fc\u0014\u00134(3>{;)3y\u000b\u0019`u\n\u001db~R\u0018a\u001f؞.å\u001aE2\t\u001ar\\f\u000b\u007f^ix.\u0017c*kW\u0018\u0016,8^\u000e;O?fʡ[ŹmvUΪ\"'5\u0002Eu\u000fm\u0014tG|\u0004Q_\u0003(chuBN\u0013ϼ\u0011ֽjP[\fht@$8hx%\u0018}Jo\u001a*\u0003[\u007f>L.G\u0018\u000b$\u001fҘ*նE\u000b\u0011_h\u0001(\u0001ZV2\u0018\n&z-\u000fg-\u000b}\r\u0011KB{\u000f&\u0004ے]ڤ\u001d2]Ȩ\u00016\u0003I\u0015\u0006\u0014\u0002M\u000fZP\u001d\t$\u001em}6\u0015Hb(ȄIт\u0013\r12\u0010[]Nx\u0010_x2)\u0001)\b<\f\u0005<\u0017 l\u0007+\u000fy!֩`Ђ&\u0005fr1 |\u0002\u007f\u0012T\u0010geZ<iU\u001a\u000f\u0011\fTPN{3Rtݙ\rȞ&\u000b=-Q_5\u0018}H=J\u0002_o&<13)4.}\u0006BbD*9Кiщ?DQʲ\u0017@(_z?bJp5\u0016\u0001YN\u001br`Czo\u0005x$ߙ;̱j\u00134ݸ\tXa{!2\u001e64#88\u0014\u0018\"$[''L\u0002kD\u07b5Wů\u000fV\u0017Ϙ#}75 #]\"\\\u001fp\u0012\u0001\"\u0002`NCQa3o_Ӟ@ʙ@\u0016\u0013Cb\"\u001e\u0012\u0001IT\u0015/\u00198\r\u0002r'(bDtX^\u0004\u000f_7ԧ6ܣ\u0003\u001b;ͨ\u001177Q{bt1i\u007f\u000fqm\u001b)9g\u0005v';D\u0003:Iw/ۡ\r\u0558aCQ\u0379Զ\b\u001d"}, d2 = {"\u001ab^:\"(B`\u0016\bw((\u0006\b<o\u0004'EM\u0001\u0013\u0015V9\u0015F\u000649YG\u0007A|%2M\u001fDo<\u001a$lkBwg,`a4QWN9kfZ9\u001d\u000e\\\u000e[\u0001", "", "DhTD", "\u001ab^:\"(B`\u0016\bw(3\u0007\u0018>i\u007fqbJ\u0010&\u001bGK\u0017@~!D]\b)(q\u0016@#", "uKR<`u:W&{\u0004[u\u0004\u0013>t\u0004(E'\u000b&&KoiEz-1h\u0002*@^\u001a._\u0019~\\", "\"@6", "", "/mX:T;B]\"c\th5", "5dc\u000ea0FO(\u0003\u0005g\u0011\u000b\u00138", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u000ea0FO(\u0003\u0005g\u0011\u000b\u00138", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "D`[BX", "/mX:T;B]\"gvf,", "5dc\u000ea0FO(\u0003\u0005g\u0015x\u0011/", "Adc\u000ea0FO(\u0003\u0005g\u0015x\u0011/", "/mX:T;B]\"gvf,[\r<t\u0014", "", "/mX:T;B]\"ngE", "5dc\u000ea0FO(\u0003\u0005g\u001cio", "Adc\u000ea0FO(\u0003\u0005g\u001cio", "/tc<C3:g", "5dc\u000eh;H> z\u000f", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016", "Adc\u000eh;H> z\u000f", "uKY.i(\bZ\u0015\b|(\t\u0007\u00136e{1Q\u0004q", "\u001aiPCTuEO\"\u0001D;6\u0007\u0010/a\t}", "1n[<e\rBZ(~\bl", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7I#;IW\u0011", "5dc\u0010b3H`y\u0003\u0002m,\n\u0017", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0014$Kn\u0010<@\u00125U|\u001c4t\u0016\nZP7\u007f\n", "Adc\u0010b3H`y\u0003\u0002m,\n\u0017", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1Xy\u001d>mq;Z?OAw\u000f", "3mP/_,&S&\u0001zI(\f\f=", "5dc\u0012a(;Z\u0019fzk.|s+t\u00036", "Adc\u0012a(;Z\u0019fzk.|s+t\u00036", "3mP/_,,O\u001a~bh+|", "5dc\u0012a(;Z\u0019lv_,d\u0013.e", "Adc\u0012a(;Z\u0019lv_,d\u0013.e", "7lP4X\bLa\u0019\u000e\t?6\u0004\b/r", "5dc\u0016`(@St\r\t^;\u000bi9l~(\t", "Adc\u0016`(@St\r\t^;\u000bi9l~(\t", ":`h2e\u001bR^\u0019", "", "5dc\u0019T@>`\b\u0013\u0006^", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", "Adc\u0019T@>`\b\u0013\u0006^", "uKY.i(\bZ\u0015\b|(\u0010\u0006\u0018/g\u007f5Q\u0004q", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", ":n^=", "5dc\u0019b6I", "Adc\u0019b6I", ">q^4e,La", "", "5dc\u001de6@`\u0019\r\t", "u(;7T=:\u001d z\u0004`u]\u00109a\u000f}", "Adc\u001de6@`\u0019\r\t", "uKY.i(\bZ\u0015\b|(\r\u0004\u0013+tUkl", "\u001aiPCTuEO\"\u0001D?3\u0007\u0005>;", "@d]1X9&]\u0018~", "\u001ab^:\"(B`\u0016\bw(3\u0007\u0018>i\u007fqh@\n\u0016\u0017TW\u0018;vz", "5dc\u001fX5=S&f\u0005],", "u(;0b4\bO\u001d\fwg)F\u00109t\u000f,{\nm\u0017 Fo\u001b$\u0001$5/", "Adc\u001fX5=S&f\u0005],", "uKR<`u:W&{\u0004[u\u0004\u0013>t\u0004(E-\u0001 \u0016G|uFu%\u000b\u001dn", "AbP9X\u001bR^\u0019", "\u001a`]1e6BRb\u0011~].|\u0018xI\b$}@q\u001b\u0017Y.{:r,5H\u0012+7C", "5dc V(ES\b\u0013\u0006^", "u(;.a+K]\u001d}Dp0{\u000b/tI\f\u0004<\u0003\u0017\bKo zd#1`}\u000fKx\u0016\u0004", "Adc V(ES\b\u0013\u0006^", "uKP;W9HW\u0018H\rb+~\t>/c0wB\u0001\b\u001bG\u0002L*t!<Yl4Bmkq>", "And?V,\u001d](e\u0005m;\u0001\t", "5dc b<KQ\u0019]\u0005m\u0013\u0007\u0018>i\u007f", "Adc b<KQ\u0019]\u0005m\u0013\u0007\u0018>i\u007f", "AoT2W", "5dc c,>R", "Adc c,>R", "BdgA90Eb\u0019\f\t", "5dc!X?M4\u001d\u0006\n^9\u000b", "Adc!X?M4\u001d\u0006\n^9\u000b", "DhTDJ,:Y\u0006~{^9|\u0012-e", "\u001aiPCTuEO\"\u0001Dk,}R!e{.h@\u0002\u0017$Gx\f<L", "1n\\:\\;\u001cV\u0015\b|^:", "", ">`a@X\nHZ#\f[b3\f\t<", "1n[<e\rBZ(~\b", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", ":ncA\\,\u0006`\u0019zxms\u0006\u0005>i\u0011(uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class LottieAnimationViewPropertyManager {
    private final String TAG;
    private String animationJson;
    private String animationName;
    private boolean animationNameDirty;
    private String animationURL;
    private Boolean autoPlay;
    private ReadableArray colorFilters;
    private Boolean enableMergePaths;
    private Boolean enableSafeMode;
    private String imageAssetsFolder;
    private Integer layerType;
    private Boolean loop;
    private Float progress;
    private RenderMode renderMode;
    private ImageView.ScaleType scaleType;
    private String sourceDotLottie;
    private Float speed;
    private ReadableArray textFilters;
    private final WeakReference<LottieAnimationView> viewWeakReference;

    /* JADX INFO: renamed from: com.airbnb.android.react.lottie.LottieAnimationViewPropertyManager$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001b\u001d̉=!4i\bӵLc\u000b\u0004Iي8\u000b<N\u0007\"2\u0013 \u0006߿pAFǏ\u0016H\\Q\u001c8\u001dk\u00144R\\TuQ=m\u001a,%Oc\u0017\u0006unbZ9D?\n$z\u0003,wX)a \u0013JB\u001eBcQ}BQ`#9K4ݮ&>"}, d2 = {"1n\\{T0KP\"{DZ5{\u00169i~q\t@|\u0015&\u0011v\u0018K\u0006)5#d*F|\u001a.)L?s0-\u0019rj*\u000bc>9\u00041RL[;p:nF\u0010\u0014Z\u001b\rv", "\u001ab^:\"(B`\u0016\bw(3\u0007\u0018>i\u007fq\\J\n&rU}\u000eKU%<Y\u007f\u001cFmk", "4dc0[\rH\\(", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0017\u0010K\u0001\u0018\u0013Eoc", "4n]A9(FW \u0013", "", "4n]AF;RZ\u0019", "4n]AA(FS", ":ncA\\,\u0006`\u0019zxms\u0006\u0005>i\u0011(uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 extends FontAssetDelegate {
        AnonymousClass1() {
        }

        @Override // com.airbnb.lottie.FontAssetDelegate
        public Typeface fetchFont(String str) throws Throwable {
            Intrinsics.checkNotNullParameter(str, C1561oA.Kd("\u0013\u001d\u001d$v\u0013 \u001d!/", (short) (C1580rY.Xd() ^ (-30886))));
            ReactFontManager reactFontManager = ReactFontManager.getInstance();
            Context context = lottieAnimationView.getContext();
            short sXd = (short) (ZN.Xd() ^ 25235);
            short sXd2 = (short) (ZN.Xd() ^ 4723);
            int[] iArr = new int["D+tQ u?ZrV'@\u0001d<E=C\u0011j-\u0017'".length()];
            QB qb = new QB("D+tQ u?ZrV'@\u0001d<E=C\u0011j-\u0017'");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd3 = (short) (C1499aX.Xd() ^ (-19917));
            int[] iArr2 = new int["\u001d\u001c,y-.!11".length()];
            QB qb2 = new QB("\u001d\u001c,y-.!11");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i3));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                Typeface typeface = reactFontManager.getTypeface(str, -1, -1, (AssetManager) method.invoke(context, objArr));
                Intrinsics.checkNotNullExpressionValue(typeface, Wg.vd("\u0012\u0011\u001d}( \u0012\u0014\u0004\u0007\u0006ITURN", (short) (C1499aX.Xd() ^ (-20727))));
                return typeface;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:73:0x00d9  */
        @Override // com.airbnb.lottie.FontAssetDelegate
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.graphics.Typeface fetchFont(java.lang.String r11, java.lang.String r12, java.lang.String r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 506
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.android.react.lottie.LottieAnimationViewPropertyManager.AnonymousClass1.fetchFont(java.lang.String, java.lang.String, java.lang.String):android.graphics.Typeface");
        }
    }

    public LottieAnimationViewPropertyManager(LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.TAG = "lottie-react-native";
        this.viewWeakReference = new WeakReference<>(view);
        view.setFontAssetDelegate(new FontAssetDelegate() { // from class: com.airbnb.android.react.lottie.LottieAnimationViewPropertyManager.1
            AnonymousClass1() {
            }

            @Override // com.airbnb.lottie.FontAssetDelegate
            public Typeface fetchFont(String str) throws Throwable {
                Intrinsics.checkNotNullParameter(str, C1561oA.Kd("\u0013\u001d\u001d$v\u0013 \u001d!/", (short) (C1580rY.Xd() ^ (-30886))));
                ReactFontManager reactFontManager = ReactFontManager.getInstance();
                Context context = lottieAnimationView.getContext();
                short sXd = (short) (ZN.Xd() ^ 25235);
                short sXd2 = (short) (ZN.Xd() ^ 4723);
                int[] iArr = new int["D+tQ u?ZrV'@\u0001d<E=C\u0011j-\u0017'".length()];
                QB qb = new QB("D+tQ u?ZrV'@\u0001d<E=C\u0011j-\u0017'");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                    i2++;
                }
                Class<?> cls = Class.forName(new String(iArr, 0, i2));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr = new Object[0];
                short sXd3 = (short) (C1499aX.Xd() ^ (-19917));
                int[] iArr2 = new int["\u001d\u001c,y-.!11".length()];
                QB qb2 = new QB("\u001d\u001c,y-.!11");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i3));
                    i3++;
                }
                Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
                try {
                    method.setAccessible(true);
                    Typeface typeface = reactFontManager.getTypeface(str, -1, -1, (AssetManager) method.invoke(context, objArr));
                    Intrinsics.checkNotNullExpressionValue(typeface, Wg.vd("\u0012\u0011\u001d}( \u0012\u0014\u0004\u0007\u0006ITURN", (short) (C1499aX.Xd() ^ (-20727))));
                    return typeface;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:73:0x00d9  */
            @Override // com.airbnb.lottie.FontAssetDelegate
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public android.graphics.Typeface fetchFont(java.lang.String r11, java.lang.String r12, java.lang.String r13) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 506
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.airbnb.android.react.lottie.LottieAnimationViewPropertyManager.AnonymousClass1.fetchFont(java.lang.String, java.lang.String, java.lang.String):android.graphics.Typeface");
            }
        });
    }

    private final void parseColorFilter(ReadableMap readableMap, LottieAnimationView lottieAnimationView) throws Throwable {
        int iIntValue;
        List listEmptyList;
        if (readableMap.getType("color") == ReadableType.Map) {
            Integer color = ColorPropConverter.getColor(readableMap.getMap("color"), lottieAnimationView.getContext());
            iIntValue = color == null ? 0 : color.intValue();
        } else {
            iIntValue = readableMap.getInt("color");
        }
        String str = readableMap.getString("keypath") + ".**";
        String strQuote = Pattern.quote(".");
        Intrinsics.checkNotNullExpressionValue(strQuote, "quote(...)");
        List<String> listSplit = new Regex(strQuote).split(str, 0);
        if (listSplit.isEmpty()) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() != 0) {
                    listEmptyList = CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                    break;
                }
            }
            listEmptyList = CollectionsKt.emptyList();
        }
        String[] strArr = (String[]) listEmptyList.toArray(new String[0]);
        lottieAnimationView.addValueCallback(new KeyPath((String[]) Arrays.copyOf(strArr, strArr.length)), LottieProperty.COLOR_FILTER, (LottieValueCallback<ColorFilter>) new LottieValueCallback(new SimpleColorFilter(iIntValue)));
    }

    public final void commitChanges() {
        Object objM8980constructorimpl;
        LottieAnimationView lottieAnimationView = this.viewWeakReference.get();
        if (lottieAnimationView == null) {
            return;
        }
        ReadableArray readableArray = this.textFilters;
        if (readableArray != null && readableArray.size() > 0) {
            TextDelegate textDelegate = new TextDelegate(lottieAnimationView);
            int size = readableArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                ReadableMap map = readableArray.getMap(i2);
                if (map != null) {
                    textDelegate.setText(map.getString(C1561oA.od("\u0002\u0004\b|", (short) (C1633zX.Xd() ^ (-3689)))), map.getString(C1561oA.Kd("4(41'*-", (short) (FB.Xd() ^ 32136))));
                }
            }
            lottieAnimationView.setTextDelegate(textDelegate);
        }
        String str = this.animationJson;
        if (str != null) {
            lottieAnimationView.setAnimationFromJson(str, String.valueOf(str.hashCode()));
            this.animationJson = null;
        }
        String str2 = this.animationURL;
        if (str2 != null) {
            File file = new File(str2);
            if (file.exists()) {
                lottieAnimationView.setAnimation(new FileInputStream(file), String.valueOf(str2.hashCode()));
            } else {
                lottieAnimationView.setAnimationFromUrl(str2, String.valueOf(str2.hashCode()));
            }
            this.animationURL = null;
        }
        String str3 = this.sourceDotLottie;
        if (str3 != null) {
            File file2 = new File(str3);
            if (file2.exists()) {
                lottieAnimationView.setAnimation(new ZipInputStream(new FileInputStream(file2)), String.valueOf(str3.hashCode()));
                this.sourceDotLottie = null;
                return;
            }
            try {
                Result.Companion companion = Result.Companion;
                LottieAnimationViewPropertyManager lottieAnimationViewPropertyManager = this;
                objM8980constructorimpl = Result.m8980constructorimpl(Uri.parse(str3).getScheme());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM8980constructorimpl = Result.m8980constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m8986isFailureimpl(objM8980constructorimpl)) {
                objM8980constructorimpl = null;
            }
            String str4 = (String) objM8980constructorimpl;
            if (str4 != null) {
                if (Intrinsics.areEqual(str4, Wg.Zd("\r}7h", (short) (FB.Xd() ^ 16840), (short) (FB.Xd() ^ 13133)))) {
                    String path = Uri.parse(str3).getPath();
                    if (path != null) {
                        lottieAnimationView.setAnimation(new ZipInputStream(new FileInputStream(new File(path))), String.valueOf(str3.hashCode()));
                    } else {
                        String str5 = this.TAG;
                        String str6 = C1561oA.Xd("XVN&wi}r+u\u0001.}\u0006}~3z\u0005\t7y\r\u000e\u0001\u0011W>", (short) (C1607wl.Xd() ^ 10954)) + str3;
                    }
                } else {
                    lottieAnimationView.setAnimationFromUrl(str3);
                }
                this.sourceDotLottie = null;
                return;
            }
            Resources resources = lottieAnimationView.getResources();
            Context context = lottieAnimationView.getContext();
            Object[] objArr = new Object[0];
            Method method = Class.forName(Wg.vd("P^Udb]Y$Zggn`jq,Boovh|y", (short) (C1633zX.Xd() ^ (-27852)))).getMethod(Qg.kd("@=K&67>385\u001d/:1", (short) (C1633zX.Xd() ^ (-1529)), (short) (C1633zX.Xd() ^ (-31131))), new Class[0]);
            try {
                method.setAccessible(true);
                String str7 = (String) method.invoke(context, objArr);
                short sXd = (short) (FB.Xd() ^ 17856);
                short sXd2 = (short) (FB.Xd() ^ 7354);
                int[] iArr = new int["7%:".length()];
                QB qb = new QB("7%:");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK(sXd + i3 + xuXd.CK(iKK) + sXd2);
                    i3++;
                }
                int identifier = resources.getIdentifier(str3, new String(iArr, 0, i3), str7);
                if (identifier == 0) {
                    StringBuilder sbAppend = new StringBuilder(C1561oA.ud("]\n\u0004\u0007y\f\u007f\u0005\u00033x\u0001\u0003/", (short) (FB.Xd() ^ 19756))).append(str3);
                    short sXd3 = (short) (ZN.Xd() ^ 14785);
                    int[] iArr2 = new int["_6#4c159g-9>:/m6\u001eN$\u0012+R(\u001a+&/+\u001f 1".length()];
                    QB qb2 = new QB("_6#4c159g-9>:/m6\u001eN$\u0012+R(\u001a+&/+\u001f 1");
                    int i4 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 ^ i4));
                        i4++;
                    }
                    RNLog.e(sbAppend.append(new String(iArr2, 0, i4)).toString());
                    return;
                }
                lottieAnimationView.setAnimation(identifier);
                this.animationNameDirty = false;
                this.sourceDotLottie = null;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        if (this.animationNameDirty) {
            lottieAnimationView.setAnimation(this.animationName);
            this.animationNameDirty = false;
        }
        Float f2 = this.progress;
        if (f2 != null) {
            lottieAnimationView.setProgress(f2.floatValue());
            this.progress = null;
        }
        Boolean bool = this.loop;
        if (bool != null) {
            lottieAnimationView.setRepeatCount(bool.booleanValue() ? -1 : 0);
            this.loop = null;
        }
        Boolean bool2 = this.autoPlay;
        if (bool2 != null && bool2.booleanValue() && !lottieAnimationView.isAnimating()) {
            lottieAnimationView.playAnimation();
        }
        Float f3 = this.speed;
        if (f3 != null) {
            lottieAnimationView.setSpeed(f3.floatValue());
            this.speed = null;
        }
        ImageView.ScaleType scaleType = this.scaleType;
        if (scaleType != null) {
            lottieAnimationView.setScaleType(scaleType);
            this.scaleType = null;
        }
        RenderMode renderMode = this.renderMode;
        if (renderMode != null) {
            lottieAnimationView.setRenderMode(renderMode);
            this.renderMode = null;
        }
        Integer num = this.layerType;
        if (num != null) {
            lottieAnimationView.setLayerType(num.intValue(), null);
        }
        String str8 = this.imageAssetsFolder;
        if (str8 != null) {
            lottieAnimationView.setImageAssetsFolder(str8);
            this.imageAssetsFolder = null;
        }
        Boolean bool3 = this.enableMergePaths;
        if (bool3 != null) {
            lottieAnimationView.enableMergePathsForKitKatAndAbove(bool3.booleanValue());
            this.enableMergePaths = null;
        }
        Boolean bool4 = this.enableSafeMode;
        if (bool4 != null) {
            lottieAnimationView.setSafeMode(bool4.booleanValue());
            this.enableSafeMode = null;
        }
        ReadableArray readableArray2 = this.colorFilters;
        if (readableArray2 == null || readableArray2.size() <= 0) {
            return;
        }
        int size2 = readableArray2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            ReadableMap map2 = readableArray2.getMap(i5);
            if (map2 != null) {
                parseColorFilter(map2, lottieAnimationView);
            }
        }
    }

    public final String getAnimationJson() {
        return this.animationJson;
    }

    public final String getAnimationName() {
        return this.animationName;
    }

    public final String getAnimationURL() {
        return this.animationURL;
    }

    public final Boolean getAutoPlay() {
        return this.autoPlay;
    }

    public final ReadableArray getColorFilters() {
        return this.colorFilters;
    }

    public final Boolean getEnableMergePaths() {
        return this.enableMergePaths;
    }

    public final Boolean getEnableSafeMode() {
        return this.enableSafeMode;
    }

    public final String getImageAssetsFolder() {
        return this.imageAssetsFolder;
    }

    public final Integer getLayerType() {
        return this.layerType;
    }

    public final Boolean getLoop() {
        return this.loop;
    }

    public final Float getProgress() {
        return this.progress;
    }

    public final RenderMode getRenderMode() {
        return this.renderMode;
    }

    public final ImageView.ScaleType getScaleType() {
        return this.scaleType;
    }

    public final String getSourceDotLottie() {
        return this.sourceDotLottie;
    }

    public final Float getSpeed() {
        return this.speed;
    }

    public final ReadableArray getTextFilters() {
        return this.textFilters;
    }

    public final void setAnimationJson(String str) {
        this.animationJson = str;
    }

    public final void setAnimationName(String str) {
        this.animationName = str;
        this.animationNameDirty = true;
    }

    public final void setAnimationURL(String str) {
        this.animationURL = str;
    }

    public final void setAutoPlay(Boolean bool) {
        this.autoPlay = bool;
    }

    public final void setColorFilters(ReadableArray readableArray) {
        this.colorFilters = readableArray;
    }

    public final void setEnableMergePaths(Boolean bool) {
        this.enableMergePaths = bool;
    }

    public final void setEnableSafeMode(Boolean bool) {
        this.enableSafeMode = bool;
    }

    public final void setImageAssetsFolder(String str) {
        this.imageAssetsFolder = str;
    }

    public final void setLayerType(Integer num) {
        this.layerType = num;
    }

    public final void setLoop(Boolean bool) {
        this.loop = bool;
    }

    public final void setProgress(Float f2) {
        this.progress = f2;
    }

    public final void setRenderMode(RenderMode renderMode) {
        this.renderMode = renderMode;
    }

    public final void setScaleType(ImageView.ScaleType scaleType) {
        this.scaleType = scaleType;
    }

    public final void setSourceDotLottie(String str) {
        this.sourceDotLottie = str;
    }

    public final void setSpeed(Float f2) {
        this.speed = f2;
    }

    public final void setTextFilters(ReadableArray readableArray) {
        this.textFilters = readableArray;
    }
}
