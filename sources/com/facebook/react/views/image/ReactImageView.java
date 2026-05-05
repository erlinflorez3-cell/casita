package com.facebook.react.views.image;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.util.UriUtil;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.controller.ForwardingControllerListener;
import com.facebook.drawee.drawable.AutoRotateDrawable;
import com.facebook.drawee.drawable.RoundedColorDrawable;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.GenericDraweeView;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.postprocessors.IterativeBoxBlurPostProcessor;
import com.facebook.imagepipeline.request.BasePostprocessor;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.Postprocessor;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.modules.fresco.ReactNetworkImageRequest;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.FloatUtil;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.util.RNLog;
import com.facebook.react.views.image.ImageLoadEvent;
import com.facebook.react.views.imagehelper.ImageSource;
import com.facebook.react.views.imagehelper.MultiSourceHelper;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import com.facebook.react.views.view.ReactViewBackgroundManager;
import com.facebook.yoga.YogaConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1626yg;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Jg;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яŋ\u0014D57\u001eq\u007fZDkŞ\fA\u001c0\u0013ǞJ~8,\u001aՄ\u000ff\u000198ǏmH<ɟ[*\u0015k\u000442a,ڎK;k\u001a\u0006\"\u000fOVgu\u0001Rҙ\u0013C\u001d\u000b\u001exp,QU\u000f]\u001aƁ:B\u0006?;M\u0006=Aś|6\u001b :Ĳ@y\u001b\u0001\"*N\u0010~zYK\u0014\u00126Dx:`\u0016U\u0005 \u0013\u000e>6\u0001&\\mP>H\u0003]Bǂ+\u0003\u007fBV'e0\u0005M#F\\'\u0013wi\u001eA@?ߎ\u001d%a\"\u000fѸc?\u0019?yܵ\rh='3ɞ{WDX\b\u0014\u001b4W\rsr.\\\u000b_h\f57WcQ\\\u0016(\u000ez\u0004\rB\u000b$ͺE;^-He@\u000e&h3\u000bPT\u0010^Z\u007f)bF+3\u0002K;I\u001blRq;\u001fOG{\u000b\u000e.#\u0007oO^d\u0014n\u00193V\u000eP_VPCVT\"[Sl2wĊ\u0006*\u00128\u0010\u000e=:).Edg_Gc9k0W\u000bg?\u0015n*kkhGn;\u001f\u001aEI!\f\tX+\u00054Vb\u001bD\u0011{A\u001b\u0007F\u000e!ctwjFk$\u0017Sv.\u0003M\fIm=t|qn\u001aM\b=lyMQ\u0012)(R?\"M\u0004z\u0005\u0007&rW\u001a#t(PW\u000fjX\u0006\n\u000ef\fAqou*~D1G([\\KDP\u000e\u0015\t\u000e\u001a\u0019\u0014\r\"K$1sTx\u0017Oh\\\u001fy\u0018|W{\u0015`P7qUCi>UPrz\u000fk\u0015\rE\u0018G\u0016\fwPz\u001f\u000eU**\\.\u0002]=\u0010+\u000f-hb\u0006;\u0019dr\u0014b\u0016\u001e5O\u0015y=z\u00192u\u0015\u0003pZj3V]*/\"%\u001e#'\u0016t\u0018y\u0010WC[q*#[l\t#\u0007gLf8+\u0016O\"3W\b\"+?uO5t.wBnEek{\b.(sW<\u0003>\u001c,\u0012U n_7JCHKi~l9:k1X\u000fo@\u0016PcL\ra\bqj~2PO!.,CO8\u001bNn[hR \u0002B\rw*\"MF\"l#=\u0011{\u0013\u0018s{ht\r`\u000e8)D?|r4=N\u0016\bh\u0017\f\u001eu.5o\u0018+\u0011Jj<4Z{8\u000fQ\u007f\u0002\u0006>\u0005HRmq/2p3kZ\u001c8\u0011\\\u0005mMlSE9*/>?7,(M13\u001e\u000f`=IJ\u0001\u0002\\9\u001fx6\u0017fS<\r`G\u0003@X/JuaQ\u007f\u001a62~qyyX$8F<MF&\u0005QQ?\u0005?>lumd|$'\u0018t\u000bf$?})hVB\u0018{#\u0019}26buX\\eOCH@GH7A$|\u0012\u0002c;\u0014$E=w\u0010D+\nvk;,\u001cf o\u0012\u0003\u0011tW<&:c)@.s,a0\u0010[`.tFJ#2:4\u0016(g\u0004I\u0001A; kH-N0Cl4L\"И\u0005Ơglkߛ&\u0019\u0011qIX\u0010m[\\sԗ3Ӱ2\u0013`Ŕ\u000b\u001da-p\u0011.\u001ekҴ+߱\fb1ց qv~\u0004Qq\fY>Bˎmʘ4R&ݙo\u0006\u0004\u0014BTV&\u0012۱Y̡h\td֬\u0013c\u001cp\u0003(\u0013\u0006bÌ μ\u0003HfƷcBT\u00066fE6G32ƯSֿ\u000b\u0004MÒv/?XW\u001dM19v~ϖ\u001dܾ>b|ʔzV\u0017\b\u0018o</VTk1=XR\u0004;ܡ2ɷI8J݊|\u001f\u001c)G\\N\u001flupˤGǾ7A!ֆQ)F \b\u000f)7zQ\u0002<@\u007f+\u001ccׇ\u0006܊o:{قC?=\u0011\b+gfA&EeR(\u001c\u0002kK\u000fMiW=d\u0003ݼ7¹\"y]ʮP\u0016-@<\u0006$-Vӝ=؝._dǾ'\u0002e\b>,Lmr(\u001eؠzݨ\u000e,qѢDri~LC\u0011\u0013Gb\u0015ϣ9ď\u000bEUˈJ%R,]\u0016M\u000e4=\nٛ\tӻS}HԴatSOj~\\\u0015y&HU2B\bkXYX+\u0004\u009d`ŀnju˩0\"F8%\r2\u001dg\u00137پb\u0099\u001c+cxL\\j \u001eOp3X\u0011:]\\kbƈ\u0012\u00892H\u001fлNXn?+5]ro`h͢\bؗ!\u0011cܩV1u\u0016_?\u0004{/װEߵ\u000fmRկ\u0006qj1m!y\n\u0002ۥ\fԐ/.O݊\u000f&8\u0006\u001e\u000es\u0013\u001fϤFѰH(uӧ\u0001<^.rC\f1r\u05feI֘\u0019e\u0007Ʈ3Ci\u0016)+ehEֳaǍ1x\nϷ`U'E# i8`V*M\bĈ}ţ`Mm~s}\u001e82V/e\u001e?]x\"Гb͑C\u0019_áO\u001e._<\f#&rgA}<[6̟NݜZ)PÁ*\u001dt|\u0003\u000f)0b˛\u0018ޮY\u0006Eڽat*qSeV+\\.YG}ǪR۔qݸjtaƲӀ/j"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5#j 3k%\u0012U?=k%\"\u0015z7", "\u001ab^:\"-:Q\u0019{\u0005h2F\b<a\u0012({\n\u0012\u001b\u0017Y9o<\u007f%B]{~Di(.M4?kFs", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "2qPDX,\u001c]\"\u000e\bh3\u0004\t<B\u0010,\u0003?\u0001$", "\u001ab^:\"-:Q\u0019{\u0005h2F\b<a\u0012({\n~! V|\u0018C}%B#Y\u001dE|#*KR\u001ax00\u0015h?C\u0010r9X}.GY+<`Yq=!g", "5k^/T3\"[\u0015\u0001zE6x\b\u0016i\u000e7{I\u0001$", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5#_'Aj\u001251K7m4\u0005\u001fd` \u000bq;N\u007f'T\"", "1`[9X9\u001c]\"\u000ezq;", "", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~Zy\u001e7j 8S\r:x00\u0015h+7\u0011l;[\u0001.NL[u8O\u0001L!\u000eX\u001d-8\t\u0017YA\u0002xMF,\u00123P\u0002HE\u0011\u0010\u001d\r5wF)T\u001aOC\u0016q?)ePceCTAA`9.\u001dc\u001dnH\u0004(\u001cm\u001b\u001b225\u0014xO\u0018VZuig.#v7\u000bB{jFNob\u0012[,\u001b\\wA\u0019.avt^*\t4(E:H<", "0`R8Z9Hc\"}Xh3\u0007\u0016", "", "0`R8Z9Hc\"}^f(~\t\u000er{:w=\b\u0017", "\u001ab^:\"-:Q\u0019{\u0005h2F\b<a\u0012({\n\u007f$\u0013Yk\u000bCvn\"c\u000e)6m\u0015\fWJEx\u0013+\u0011z]6\u000ec\u0002", "0na1X9\u001c] \t\b", "0na1X9\u001c]&\bzk\u0019x\b3i", "", "0na1X9+O\u0018\u0003\u000bl", "", "0na1X90W\u0018\u000e}", "1`R5X+\"[\u0015\u0001zL6\r\u0016-e", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5\\}'Bm#w1K7m4\f\u001fxn7\u00079", "1n]Ae6EZ\u0019\f[h9k\t=t\u00041}", "\u001ab^:\"-:Q\u0019{\u0005h2F\b<a\u0012({\n~! V|\u0018C}%B#[*@|#8TJ;x\u001b\"#waB\u0007p\u0002", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z-1[}i\u001bu\u00120M'Dl>s", "2dU.h3M7!z|^\u000b\n\u0005Aa|/{", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI'\t<\u0013\u0013\u0014NoW\u001b\u0004!GUz'7C", "2nf;_6:R\u007f\u0003\tm,\u0006\t<", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5#j 3k%\u0012U?=k\u0013('qhC\u0003b\u0013R\u00056GUN92", "4`S27<KO(\u0003\u0005g\u0014\u000b", "6dP1X9L", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "7lP4X\u001aHc&|z", "5dc\u0016`(@S\u0007\t\u000bk*|G\u001ce{&\u000b\u001c\n\u0016$Qs\r6\u0004%<Yy.7", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ(\u001bG\u0002\u001c\u0006z-1[}#7t!.Z\r\u001fs0 \u0015VkI\u0014a,$", "Adc\u0016`(@S\u0007\t\u000bk*|G\u001ce{&\u000b\u001c\n\u0016$Qs\r6\u0004%<Yy.7", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\u0012\u001b\u0017Y}W@~!7Y\u0001 >x\u0016;\u0017'Cg6\u001e\u0003rqF\u0005c\u0002\u0012g", "7r36e;R", "", "7rC6_,=", "u(I", "7sT?T;Bd\u0019[\u0005q\t\u0004\u0019<P\n6\u000b+\u000e!\u0015G}\u001cF\u0004", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u0002/Ch\t-Ak\u0016<[MHy}\u0002$hn5\u0016g=NS1Z)U<i=|K#|g\u0018L+\u001b\u0013cNy", ":nP1\\5@7!z|^\u000b\n\u0005Aa|/{", "=uT?_(R1#\u0006\u0005k", ">q^4e,La\u001d\u0010zK,\u0006\b/r\u00041} \n\u0013\u0014No\r", "@dP0g\t:Q\u001f\u0001\bh<\u0006\b\u0017a\t$}@\u000e", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001f@v7~F}\u001c5|\u00072MU\u0018g2$\u0017ukI\u0010b\u0014J\u007f#IL[\u0002", "@db6m,&S(\u0002\u0005]", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5#a(3o\u0016\u001bMQ?\u00014\u0006\u0015wdC\u00069", "@db6m,&c \u000e~i3\u0001\t<", "@db6m,(^(\u0003\u0005g:", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/=a\b)\u0001Z\u0016<QX;U?-\u0019rjG\\", "5dc\u001fX:Bh\u0019h\u0006m0\u0007\u0012=", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3c\u0006(Av_\u001bMQ?\u00014\b weC\u0010q\u0002", "AbP9X\u001bR^\u0019", "\u001ab^:\"-:Q\u0019{\u0005h2F\b<a\u0012({\n\u007f$\u0013Yk\u000bCvn#Wy';v\u0018\u001e\\GByr\f\u0013dh9uw7NL", "And?V,L", "", "Bh[2@6=S", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0016~<\u007f\u0017$\u0006^\u0012Cv\r?X}u", "Bh[2C6Lb$\f\u0005\\,\u000b\u00179r", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5#j 3k%\u0012U?=k%\"\u0015z (\u000bj,9\u00015VW[6ZR\u0001K\u001e\u001f0", "5dc\u0010b9GS&kv]0\u0001", "", "1n\\=h;>Rv\t\bg,\n\u0017", "5dc\u0011e(PO\u0016\u0006zB-l\u0012=u\u000b3\u0006M\u0010\u0017\u0016", "6`b\u001ah3MW$\u0006zL6\r\u0016-e\u000e", "6`b\u001ci,KZ\u0015\n\u0006b5~u/n~(\tD\n\u0019", ";`h/X\u001cIR\u0015\u000ezO0|\u001b", ";`h/X\u001cIR\u0015\u000ezO0|\u001b\u0010r\n0ZM|)\u0013Dv\u000e", "2qPDT)ES", ";`h/X\u001cIR\u0015\u000ezO0|\u001b\u0010r\n0h@\r'\u0017U~", "2nA2f0SS", "=m3?T>", "1`]CT:", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u001d", "=mB6m,\u001cV\u0015\b|^+", ExifInterface.LONGITUDE_EAST, "6", "=kSD", "=kS5", "Adc\u000fT*DU&\t\u000bg+Z\u00136o\r", "Adc\u000f_<K@\u0015}~n:", "0kd?E(=W)\r", "Adc\u000fb9=S&\\\u0005e6\n", "Adc\u000fb9=S&kv]0\r\u0017", ">nb6g0H\\", "Adc\u000fb9=S&p~];\u007f", "Adc\u0010b5M`#\u0006\u0002^9c\r=t\u007f1{M", "1n]Ae6EZ\u0019\fab:\f\t8e\r", "Adc\u0011X-:c \u000ehh<\n\u0007/", "<`\\2", "", "Adc\u0013T+>2)\fvm0\u0007\u0012", "2ta.g0H\\\u0001\r", "Adc\u0015X(=S&\r", "Adc\u0019b(=W\"\u0001^g+\u0001\u0007+t\n5iJ\u0011$\u0015G", "Adc\u001ci,KZ\u0015\u0013Xh3\u0007\u0016", "Adc\u001de6@`\u0019\r\tb=|u/n~(\tD\n\u0019vPk\u000bCv$", "3mP/_,=", "Adc\u001fX:Bh\u0019fzm/\u0007\b", "Adc\u001fX:Bh\u0019f\u000be;\u0001\u00146i\u007f5", ";t[A\\7EW\u0019\f", "Adc V(ES\b\u0013\u0006^", "Adc [6NZ\u0018g\u0005m0}\u001d\u0016o{'[Q\u0001 &U", "Ag^B_+'](\u0003{r", "Adc b<KQ\u0019", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7I#;IW\u0011", "Adc b<KQ\u0019b\u0003Z.|", "Adc!\\3>;#}z", "Ag^B_++S'\u0003\u0010^", "CoS.g,\u001cO \u0006zk\n\u0007\u0012>e\u00137", "E`a;<4:U\u0019l\u0005n9z\t", "CqX", "\u0011n\\=T5B]\"", "\"h[2C6Lb$\f\u0005\\,\u000b\u00179r", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ReactImageView extends GenericDraweeView {
    public static final int REMOTE_IMAGE_FADE_DURATION_MS = 300;
    private int backgroundColor;
    private RoundedColorDrawable backgroundImageDrawable;
    private int borderColor;
    private float[] borderCornerRadii;
    private float borderRadius;
    private float borderWidth;
    private ImageSource cachedImageSource;
    private Object callerContext;
    private ControllerListener<ImageInfo> controllerForTesting;
    private Drawable defaultImageDrawable;
    private ReactImageDownloadListener<ImageInfo> downloadListener;
    private final AbstractDraweeControllerBuilder<?, ?, ?, ?> draweeControllerBuilder;
    private int fadeDurationMs;
    private final GlobalImageLoadListener globalImageLoadListener;
    private ReadableMap headers;
    private ImageSource imageSource;
    private boolean isDirty;
    private IterativeBoxBlurPostProcessor iterativeBoxBlurPostProcessor;
    private Drawable loadingImageDrawable;
    private int overlayColor;
    private boolean progressiveRenderingEnabled;
    private final ReactViewBackgroundManager reactBackgroundManager;
    private ImageResizeMethod resizeMethod;
    private float resizeMultiplier;
    private ScalingUtils.ScaleType scaleType;
    private final List<ImageSource> sources;
    private Shader.TileMode tileMode;
    private TilePostprocessor tilePostprocessor;
    public static final Companion Companion = new Companion(null);
    private static final float[] computedCornerRadii = new float[4];
    private static final Matrix tileMatrix = new Matrix();

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0007\":$\u007fјnjO0L͜P.hS2şs{J$cҕw٘<kڼ.\"7N\u000flmnН^\u000bQ\u000fN$\u0007qDI\u0004\u0001\u000e\u0016\u001d;Zom=\u0014o\u000eEnuN\u0005N4x؇Lڱ\u0005\u001a2Ϻ`\u0003\tFc\f@4\u0017\u0084<ň\u0011M\r܅b\u0012L%\u0019\u001e\u000bm%ȧJǰa:7݊ɮmM"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5#j 3k%\u0012U?=k%\"\u0015z \u0017\u0011k7J\u007f+QU$", "", "u(E", " D<\u001cG\f87\u0001Z\\>&]d\u000eEy\u0007k-\\\u0006z1X\b$d", "", "1n\\=h;>Rv\t\bg,\nu+d\u0004,", "", "Bh[2@(M`\u001d\u0012", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0010wO\u000e\u001b*\u001d", "0tX9W\u000fBS&z\b\\/\u0011", "\u001ab^:\"-:Q\u0019{\u0005h2F\b<a\u0012({\n\u0003\u0017 G|\u0012:@\u00075b}-;kt;IU;k\u0017\"\u0015u]F\u0005f@$", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final GenericDraweeHierarchy buildHierarchy(Context context) throws Throwable {
            Class<?> cls = Class.forName(Jg.Wd("Xb<C,\u0006s-FS6,\u0010xk\u001d\u00169,\u001a\u007fzZ", (short) (FB.Xd() ^ 12937), (short) (FB.Xd() ^ 4516)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (ZN.Xd() ^ 28073);
            short sXd2 = (short) (ZN.Xd() ^ 18743);
            int[] iArr = new int["hpzyW\u0005~MW!s_".length()];
            QB qb = new QB("hpzyW\u0005~MW!s_");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilder = new GenericDraweeHierarchyBuilder((Resources) method.invoke(context, objArr));
                RoundingParams roundingParamsFromCornersRadius = RoundingParams.fromCornersRadius(0.0f);
                roundingParamsFromCornersRadius.setPaintFilterBitmap(true);
                GenericDraweeHierarchy genericDraweeHierarchyBuild = genericDraweeHierarchyBuilder.setRoundingParams(roundingParamsFromCornersRadius).build();
                Intrinsics.checkNotNullExpressionValue(genericDraweeHierarchyBuild, C1626yg.Ud("HUyQ\u000eR1U\\h", (short) (FB.Xd() ^ 27575), (short) (FB.Xd() ^ 11618)));
                return genericDraweeHierarchyBuild;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\u0007njO0L͜N\u008fTiճ?k*3d^ҸuCIUb\u001a0\ngTwi~J\t\u000eq\u00116\u001a\u0007nDI\u0004{\u000e\u0016\u001d7Zom9\u0014\u0004\u07b2=g"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5#j 3k%\u0012U?=k%\"\u0015z (\u000bj,9\u00015VW[6ZR\u0001K\u001e\u001f0", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u0004%Ai}.F7r*[C&uB- uk7\u0007q:X\u0004|", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\u0012\u001b\u0017Y}W@~!7YG\r7i\u0014=1K7m4\u000f\u0019hs\u000fJT", ">q^0X:L", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u000e\u0017\u0018G|\u000eEt%C#['A{\u0016*JJ;X4\u001f\u0015uaB\u0005c\u0002", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "And?V,", "0hc:T7\u001fO\u0017\u000e\u0005k@", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006s)Day+E7\u00015IR<uA&qlpA\u0003n\rJt6QYb\u0002", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private final class TilePostprocessor extends BasePostprocessor {
        public TilePostprocessor() {
        }

        @Override // com.facebook.imagepipeline.request.BasePostprocessor, com.facebook.imagepipeline.request.Postprocessor
        public CloseableReference<Bitmap> process(Bitmap source, PlatformBitmapFactory bitmapFactory) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(bitmapFactory, "bitmapFactory");
            Rect rect = new Rect(0, 0, ReactImageView.this.getWidth(), ReactImageView.this.getHeight());
            ReactImageView.this.scaleType.getTransform(ReactImageView.tileMatrix, rect, source.getWidth(), source.getHeight(), 0.0f, 0.0f);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            BitmapShader bitmapShader = new BitmapShader(source, ReactImageView.this.tileMode, ReactImageView.this.tileMode);
            bitmapShader.setLocalMatrix(ReactImageView.tileMatrix);
            paint.setShader(bitmapShader);
            CloseableReference<Bitmap> closeableReferenceCreateBitmap = bitmapFactory.createBitmap(ReactImageView.this.getWidth(), ReactImageView.this.getHeight());
            Intrinsics.checkNotNullExpressionValue(closeableReferenceCreateBitmap, "createBitmap(...)");
            try {
                new Canvas(closeableReferenceCreateBitmap.get()).drawRect(rect, paint);
                CloseableReference<Bitmap> closeableReferenceMo7166clone = closeableReferenceCreateBitmap.mo7166clone();
                Intrinsics.checkNotNullExpressionValue(closeableReferenceMo7166clone, "clone(...)");
                return closeableReferenceMo7166clone;
            } finally {
                CloseableReference.closeSafely(closeableReferenceCreateBitmap);
            }
        }
    }

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageResizeMethod.values().length];
            try {
                iArr[ImageResizeMethod.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageResizeMethod.RESIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactImageView(Context context, AbstractDraweeControllerBuilder<?, ?, ?, ?> draweeControllerBuilder, GlobalImageLoadListener globalImageLoadListener, Object obj) {
        super(context, Companion.buildHierarchy(context));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(draweeControllerBuilder, "draweeControllerBuilder");
        this.draweeControllerBuilder = draweeControllerBuilder;
        this.globalImageLoadListener = globalImageLoadListener;
        this.callerContext = obj;
        this.sources = new ArrayList();
        this.borderRadius = Float.NaN;
        this.scaleType = ImageResizeMode.defaultValue();
        this.tileMode = ImageResizeMode.defaultTileMode();
        this.fadeDurationMs = -1;
        this.resizeMultiplier = 1.0f;
        ReactViewBackgroundManager reactViewBackgroundManager = new ReactViewBackgroundManager(this);
        this.reactBackgroundManager = reactViewBackgroundManager;
        this.resizeMethod = ImageResizeMethod.AUTO;
        reactViewBackgroundManager.setOverflow(ViewProps.HIDDEN);
        setLegacyVisibilityHandlingEnabled(true);
    }

    private final void getCornerRadii(float[] fArr) {
        float f2 = !YogaConstants.isUndefined(this.borderRadius) ? this.borderRadius : 0.0f;
        float[] fArr2 = this.borderCornerRadii;
        if (fArr2 == null) {
            fArr2 = new float[4];
            for (int i2 = 0; i2 < 4; i2++) {
                fArr2[i2] = Float.NaN;
            }
        }
        fArr[0] = !YogaConstants.isUndefined(fArr2[0]) ? fArr2[0] : f2;
        fArr[1] = !YogaConstants.isUndefined(fArr2[1]) ? fArr2[1] : f2;
        fArr[2] = !YogaConstants.isUndefined(fArr2[2]) ? fArr2[2] : f2;
        if (!YogaConstants.isUndefined(fArr2[3])) {
            f2 = fArr2[3];
        }
        fArr[3] = f2;
    }

    private final Drawable getDrawableIfUnsupported(ImageSource imageSource) {
        if (!ReactNativeFeatureFlags.loadVectorDrawablesOnImages()) {
            return null;
        }
        String source = imageSource.getSource();
        if (!imageSource.isResource() || source == null) {
            return null;
        }
        ResourceDrawableIdHelper companion = ResourceDrawableIdHelper.Companion.getInstance();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (!companion.isVectorDrawable(context, source)) {
            return null;
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return companion.getResourceDrawable(context2, source);
    }

    private final ResizeOptions getResizeOptions() {
        int iRound = Math.round(getWidth() * this.resizeMultiplier);
        int iRound2 = Math.round(getHeight() * this.resizeMultiplier);
        if (iRound <= 0 || iRound2 <= 0) {
            return null;
        }
        return new ResizeOptions(iRound, iRound2, 0.0f, 0.0f, 12, null);
    }

    private final boolean hasMultipleSources() {
        return this.sources.size() > 1;
    }

    private final boolean isTiled() {
        return this.tileMode != Shader.TileMode.CLAMP;
    }

    private final void maybeUpdateViewFromDrawable(Drawable drawable) {
        EventDispatcher eventDispatcherForReactTag;
        if (this.downloadListener != null) {
            Context context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getId());
        } else {
            eventDispatcherForReactTag = null;
        }
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(ImageLoadEvent.Companion.createLoadStartEvent(UIManagerHelper.getSurfaceId(this), getId()));
        }
        getHierarchy().setImage(drawable, 1.0f, false);
        if (eventDispatcherForReactTag == null || this.imageSource == null) {
            return;
        }
        ImageLoadEvent.Companion companion = ImageLoadEvent.Companion;
        ReactImageView reactImageView = this;
        int surfaceId = UIManagerHelper.getSurfaceId(reactImageView);
        int id = getId();
        ImageSource imageSource = this.imageSource;
        eventDispatcherForReactTag.dispatchEvent(companion.createLoadEvent(surfaceId, id, imageSource != null ? imageSource.getSource() : null, getWidth(), getHeight()));
        eventDispatcherForReactTag.dispatchEvent(ImageLoadEvent.Companion.createLoadEndEvent(UIManagerHelper.getSurfaceId(reactImageView), getId()));
    }

    private final void maybeUpdateViewFromRequest(boolean z2) {
        Uri uri;
        ImageSource imageSource = this.imageSource;
        if (imageSource == null || (uri = imageSource.getUri()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        IterativeBoxBlurPostProcessor iterativeBoxBlurPostProcessor = this.iterativeBoxBlurPostProcessor;
        if (iterativeBoxBlurPostProcessor != null) {
            arrayList.add(iterativeBoxBlurPostProcessor);
        }
        TilePostprocessor tilePostprocessor = this.tilePostprocessor;
        if (tilePostprocessor != null) {
            arrayList.add(tilePostprocessor);
        }
        Postprocessor postprocessorFrom = MultiPostprocessor.Companion.from(arrayList);
        ResizeOptions resizeOptions = z2 ? getResizeOptions() : null;
        ImageRequestBuilder progressiveRenderingEnabled = ImageRequestBuilder.newBuilderWithSource(uri).setPostprocessor(postprocessorFrom).setResizeOptions(resizeOptions).setAutoRotateEnabled(true).setProgressiveRenderingEnabled(this.progressiveRenderingEnabled);
        ReactNetworkImageRequest.Companion companion = ReactNetworkImageRequest.Companion;
        Intrinsics.checkNotNull(progressiveRenderingEnabled);
        ReactNetworkImageRequest reactNetworkImageRequestFromBuilderWithHeaders = companion.fromBuilderWithHeaders(progressiveRenderingEnabled, this.headers);
        GlobalImageLoadListener globalImageLoadListener = this.globalImageLoadListener;
        if (globalImageLoadListener != null) {
            globalImageLoadListener.onLoadAttempt(uri);
        }
        AbstractDraweeControllerBuilder<?, ?, ?, ?> abstractDraweeControllerBuilder = this.draweeControllerBuilder;
        Intrinsics.checkNotNull(abstractDraweeControllerBuilder, "null cannot be cast to non-null type com.facebook.drawee.controller.AbstractDraweeControllerBuilder<*, com.facebook.imagepipeline.request.ImageRequest, com.facebook.common.references.CloseableReference<com.facebook.imagepipeline.image.CloseableImage>, com.facebook.imagepipeline.image.ImageInfo>");
        abstractDraweeControllerBuilder.reset();
        abstractDraweeControllerBuilder.setImageRequest(reactNetworkImageRequestFromBuilderWithHeaders).setAutoPlayAnimations(true).setOldController(getController());
        Object obj = this.callerContext;
        if (obj != null) {
            abstractDraweeControllerBuilder.setCallerContext(obj);
        }
        ImageSource imageSource2 = this.cachedImageSource;
        if (imageSource2 != null) {
            abstractDraweeControllerBuilder.setLowResImageRequest(ImageRequestBuilder.newBuilderWithSource(imageSource2.getUri()).setPostprocessor(postprocessorFrom).setResizeOptions(resizeOptions).setAutoRotateEnabled(true).setProgressiveRenderingEnabled(this.progressiveRenderingEnabled).build());
        }
        ReactImageDownloadListener<ImageInfo> reactImageDownloadListener = this.downloadListener;
        if (reactImageDownloadListener == null || this.controllerForTesting == null) {
            ControllerListener<ImageInfo> controllerListener = this.controllerForTesting;
            if (controllerListener != null) {
                abstractDraweeControllerBuilder.setControllerListener(controllerListener);
            } else if (reactImageDownloadListener != null) {
                abstractDraweeControllerBuilder.setControllerListener(reactImageDownloadListener);
            }
        } else {
            ForwardingControllerListener forwardingControllerListener = new ForwardingControllerListener();
            forwardingControllerListener.addListener(this.downloadListener);
            forwardingControllerListener.addListener(this.controllerForTesting);
            abstractDraweeControllerBuilder.setControllerListener(forwardingControllerListener);
        }
        if (this.downloadListener != null) {
            getHierarchy().setProgressBarImage(this.downloadListener);
        }
        setController(abstractDraweeControllerBuilder.build());
        abstractDraweeControllerBuilder.reset();
    }

    private final void setSourceImage() {
        this.imageSource = null;
        if (this.sources.isEmpty()) {
            List<ImageSource> list = this.sources;
            ImageSource.Companion companion = ImageSource.Companion;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            list.add(companion.getTransparentBitmapImageSource(context));
        } else if (hasMultipleSources()) {
            MultiSourceHelper.MultiSourceResult bestSourceForSize = MultiSourceHelper.getBestSourceForSize(getWidth(), getHeight(), this.sources);
            this.imageSource = bestSourceForSize.bestResult;
            this.cachedImageSource = bestSourceForSize.bestResultInCache;
            return;
        }
        this.imageSource = this.sources.get(0);
    }

    private final boolean shouldResize(ImageSource imageSource) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.resizeMethod.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return false;
            }
        } else if (!UriUtil.isLocalContentUri(imageSource.getUri()) && !UriUtil.isLocalFileUri(imageSource.getUri())) {
            return false;
        }
        return true;
    }

    private final void warnImageSource(String str) {
        if (!ReactBuildConfig.DEBUG || ReactFeatureFlags.enableBridgelessArchitecture) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        RNLog.w((ReactContext) context, "ReactImageView: Image source \"" + str + "\" doesn't exist");
    }

    public final ImageSource getImageSource$ReactAndroid_release() {
        return this.imageSource;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public final void maybeUpdateView() {
        if (this.isDirty) {
            if (!hasMultipleSources() || (getWidth() > 0 && getHeight() > 0)) {
                setSourceImage();
                ImageSource imageSource = this.imageSource;
                if (imageSource == null) {
                    return;
                }
                boolean zShouldResize = shouldResize(imageSource);
                if (!zShouldResize || (getWidth() > 0 && getHeight() > 0)) {
                    if (!isTiled() || (getWidth() > 0 && getHeight() > 0)) {
                        GenericDraweeHierarchy hierarchy = getHierarchy();
                        hierarchy.setActualImageScaleType(this.scaleType);
                        Drawable drawable = this.defaultImageDrawable;
                        if (drawable != null) {
                            hierarchy.setPlaceholderImage(drawable, this.scaleType);
                        }
                        Drawable drawable2 = this.loadingImageDrawable;
                        if (drawable2 != null) {
                            hierarchy.setPlaceholderImage(drawable2, ScalingUtils.ScaleType.CENTER);
                        }
                        float[] fArr = computedCornerRadii;
                        getCornerRadii(fArr);
                        RoundingParams roundingParams = hierarchy.getRoundingParams();
                        if (roundingParams != null) {
                            roundingParams.setCornersRadii(fArr[0], fArr[1], fArr[2], fArr[3]);
                            RoundedColorDrawable roundedColorDrawable = this.backgroundImageDrawable;
                            if (roundedColorDrawable != null) {
                                roundedColorDrawable.setBorder(this.borderColor, this.borderWidth);
                                float[] cornersRadii = roundingParams.getCornersRadii();
                                if (cornersRadii != null) {
                                    roundedColorDrawable.setRadii(cornersRadii);
                                }
                                hierarchy.setBackgroundImage(roundedColorDrawable);
                            }
                            roundingParams.setBorder(this.borderColor, this.borderWidth);
                            int i2 = this.overlayColor;
                            if (i2 != 0) {
                                roundingParams.setOverlayColor(i2);
                            } else {
                                roundingParams.setRoundingMethod(RoundingParams.RoundingMethod.BITMAP_ONLY);
                            }
                            hierarchy.setRoundingParams(roundingParams);
                        }
                        int i3 = this.fadeDurationMs;
                        if (i3 < 0) {
                            i3 = imageSource.isResource() ? 0 : 300;
                        }
                        hierarchy.setFadeDuration(i3);
                        Drawable drawableIfUnsupported = getDrawableIfUnsupported(imageSource);
                        if (drawableIfUnsupported != null) {
                            maybeUpdateViewFromDrawable(drawableIfUnsupported);
                        } else {
                            maybeUpdateViewFromRequest(zShouldResize);
                        }
                        this.isDirty = false;
                    }
                }
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.clipToPaddingBox(this, canvas);
        } else if (ReactNativeFeatureFlags.useNewReactImageViewBackgroundDrawing()) {
            this.reactBackgroundManager.maybeClipToPaddingBox(canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 <= 0 || i3 <= 0) {
            return;
        }
        this.isDirty = this.isDirty || hasMultipleSources() || isTiled();
        maybeUpdateView();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBackgroundColor(this, Integer.valueOf(i2));
            return;
        }
        if (ReactNativeFeatureFlags.useNewReactImageViewBackgroundDrawing()) {
            this.reactBackgroundManager.setBackgroundColor(i2);
        } else if (this.backgroundColor != i2) {
            this.backgroundColor = i2;
            this.backgroundImageDrawable = new RoundedColorDrawable(i2);
            this.isDirty = true;
        }
    }

    public final void setBlurRadius(float f2) {
        int iDpToPx = ((int) PixelUtil.INSTANCE.dpToPx(f2)) / 2;
        this.iterativeBoxBlurPostProcessor = iDpToPx == 0 ? null : new IterativeBoxBlurPostProcessor(2, iDpToPx);
        this.isDirty = true;
    }

    public final void setBorderColor(int i2) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBorderColor(this, LogicalEdge.ALL, Integer.valueOf(i2));
            return;
        }
        if (ReactNativeFeatureFlags.useNewReactImageViewBackgroundDrawing()) {
            this.reactBackgroundManager.setBorderColor(8, Integer.valueOf(i2));
        } else if (this.borderColor != i2) {
            this.borderColor = i2;
            this.isDirty = true;
        }
    }

    public final void setBorderRadius(float f2) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBorderRadius(this, BorderRadiusProp.BORDER_RADIUS, Float.isNaN(f2) ? null : new LengthPercentage(PixelUtil.INSTANCE.pxToDp(f2), LengthPercentageType.POINT));
            return;
        }
        if (ReactNativeFeatureFlags.useNewReactImageViewBackgroundDrawing()) {
            this.reactBackgroundManager.setBorderRadius(f2);
        } else {
            if (FloatUtil.floatsEqual(this.borderRadius, f2)) {
                return;
            }
            this.borderRadius = f2;
            this.isDirty = true;
        }
    }

    public final void setBorderRadius(float f2, int i2) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBorderRadius(this, BorderRadiusProp.values()[i2], Float.isNaN(f2) ? null : new LengthPercentage(PixelUtil.INSTANCE.pxToDp(f2), LengthPercentageType.POINT));
            return;
        }
        if (ReactNativeFeatureFlags.useNewReactImageViewBackgroundDrawing()) {
            this.reactBackgroundManager.setBorderRadius(f2, i2 + 1);
            return;
        }
        if (this.borderCornerRadii == null) {
            float[] fArr = new float[4];
            for (int i3 = 0; i3 < 4; i3++) {
                fArr[i3] = Float.NaN;
            }
            this.borderCornerRadii = fArr;
        }
        float[] fArr2 = this.borderCornerRadii;
        if (FloatUtil.floatsEqual(fArr2 != null ? Float.valueOf(fArr2[i2]) : null, Float.valueOf(f2))) {
            return;
        }
        float[] fArr3 = this.borderCornerRadii;
        if (fArr3 != null) {
            fArr3[i2] = f2;
        }
        this.isDirty = true;
    }

    public final void setBorderWidth(float f2) {
        float fDpToPx = PixelUtil.INSTANCE.dpToPx(f2);
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBorderWidth(this, LogicalEdge.ALL, Float.valueOf(f2));
            return;
        }
        if (ReactNativeFeatureFlags.useNewReactImageViewBackgroundDrawing()) {
            this.reactBackgroundManager.setBorderWidth(8, fDpToPx);
        } else {
            if (FloatUtil.floatsEqual(this.borderWidth, fDpToPx)) {
                return;
            }
            this.borderWidth = fDpToPx;
            this.isDirty = true;
        }
    }

    @VisibleForTesting
    public final void setControllerListener(ControllerListener<ImageInfo> controllerListener) {
        this.controllerForTesting = controllerListener;
        this.isDirty = true;
        maybeUpdateView();
    }

    public final void setDefaultSource(String str) throws Throwable {
        ResourceDrawableIdHelper companion = ResourceDrawableIdHelper.Companion.getInstance();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Drawable resourceDrawable = companion.getResourceDrawable(context, str);
        if (Intrinsics.areEqual(this.defaultImageDrawable, resourceDrawable)) {
            return;
        }
        this.defaultImageDrawable = resourceDrawable;
        this.isDirty = true;
    }

    public final void setFadeDuration(int i2) {
        this.fadeDurationMs = i2;
    }

    public final void setHeaders(ReadableMap readableMap) {
        this.headers = readableMap;
    }

    public final void setImageSource$ReactAndroid_release(ImageSource imageSource) {
        this.imageSource = imageSource;
    }

    public final void setLoadingIndicatorSource(String str) throws Throwable {
        ResourceDrawableIdHelper companion = ResourceDrawableIdHelper.Companion.getInstance();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Drawable resourceDrawable = companion.getResourceDrawable(context, str);
        AutoRotateDrawable autoRotateDrawable = resourceDrawable != null ? new AutoRotateDrawable(resourceDrawable, 1000) : null;
        if (Intrinsics.areEqual(this.loadingImageDrawable, autoRotateDrawable)) {
            return;
        }
        this.loadingImageDrawable = autoRotateDrawable;
        this.isDirty = true;
    }

    public final void setOverlayColor(int i2) {
        if (this.overlayColor != i2) {
            this.overlayColor = i2;
            this.isDirty = true;
        }
    }

    public final void setProgressiveRenderingEnabled(boolean z2) {
        this.progressiveRenderingEnabled = z2;
    }

    public final void setResizeMethod(ImageResizeMethod resizeMethod) {
        Intrinsics.checkNotNullParameter(resizeMethod, "resizeMethod");
        if (this.resizeMethod != resizeMethod) {
            this.resizeMethod = resizeMethod;
            this.isDirty = true;
        }
    }

    public final void setResizeMultiplier(float f2) {
        if (Math.abs(this.resizeMultiplier - f2) > 9.999999747378752E-5d) {
            this.resizeMultiplier = f2;
            this.isDirty = true;
        }
    }

    public final void setScaleType(ScalingUtils.ScaleType scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        if (this.scaleType != scaleType) {
            this.scaleType = scaleType;
            this.isDirty = true;
        }
    }

    public final void setShouldNotifyLoadEvents(boolean z2) {
        if (z2 == (this.downloadListener != null)) {
            return;
        }
        if (z2) {
            Context context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            final EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getId());
            this.downloadListener = new ReactImageDownloadListener<ImageInfo>() { // from class: com.facebook.react.views.image.ReactImageView.setShouldNotifyLoadEvents.1
                @Override // com.facebook.react.views.image.ReactImageDownloadListener, com.facebook.drawee.controller.ControllerListener
                public void onFailure(String id, Throwable throwable) {
                    Intrinsics.checkNotNullParameter(id, "id");
                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                    EventDispatcher eventDispatcher = eventDispatcherForReactTag;
                    if (eventDispatcher == null) {
                        return;
                    }
                    eventDispatcher.dispatchEvent(ImageLoadEvent.Companion.createErrorEvent(UIManagerHelper.getSurfaceId(this), this.getId(), throwable));
                }

                @Override // com.facebook.react.views.image.ReactImageDownloadListener, com.facebook.drawee.controller.ControllerListener
                public void onFinalImageSet(String id, ImageInfo imageInfo, Animatable animatable) {
                    EventDispatcher eventDispatcher;
                    Intrinsics.checkNotNullParameter(id, "id");
                    if (imageInfo == null || this.getImageSource$ReactAndroid_release() == null || (eventDispatcher = eventDispatcherForReactTag) == null) {
                        return;
                    }
                    ImageLoadEvent.Companion companion = ImageLoadEvent.Companion;
                    int surfaceId = UIManagerHelper.getSurfaceId(this);
                    int id2 = this.getId();
                    ImageSource imageSource$ReactAndroid_release = this.getImageSource$ReactAndroid_release();
                    eventDispatcher.dispatchEvent(companion.createLoadEvent(surfaceId, id2, imageSource$ReactAndroid_release != null ? imageSource$ReactAndroid_release.getSource() : null, imageInfo.getWidth(), imageInfo.getHeight()));
                    eventDispatcherForReactTag.dispatchEvent(ImageLoadEvent.Companion.createLoadEndEvent(UIManagerHelper.getSurfaceId(this), this.getId()));
                }

                @Override // com.facebook.react.views.image.ReactImageDownloadListener
                public void onProgressChange(int i2, int i3) {
                    if (eventDispatcherForReactTag == null || this.getImageSource$ReactAndroid_release() == null) {
                        return;
                    }
                    EventDispatcher eventDispatcher = eventDispatcherForReactTag;
                    ImageLoadEvent.Companion companion = ImageLoadEvent.Companion;
                    int surfaceId = UIManagerHelper.getSurfaceId(this);
                    int id = this.getId();
                    ImageSource imageSource$ReactAndroid_release = this.getImageSource$ReactAndroid_release();
                    eventDispatcher.dispatchEvent(companion.createProgressEvent(surfaceId, id, imageSource$ReactAndroid_release != null ? imageSource$ReactAndroid_release.getSource() : null, i2, i3));
                }

                @Override // com.facebook.react.views.image.ReactImageDownloadListener, com.facebook.drawee.controller.ControllerListener
                public void onSubmit(String id, Object obj) {
                    Intrinsics.checkNotNullParameter(id, "id");
                    EventDispatcher eventDispatcher = eventDispatcherForReactTag;
                    if (eventDispatcher == null) {
                        return;
                    }
                    eventDispatcher.dispatchEvent(ImageLoadEvent.Companion.createLoadStartEvent(UIManagerHelper.getSurfaceId(this), this.getId()));
                }
            };
        } else {
            this.downloadListener = null;
        }
        this.isDirty = true;
    }

    public final void setSource(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList();
        if (readableArray == null || readableArray.size() == 0) {
            ImageSource.Companion companion = ImageSource.Companion;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            arrayList.add(companion.getTransparentBitmapImageSource(context));
        } else {
            if (readableArray.size() == 1) {
                ReadableMap map = readableArray.getMap(0);
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                ImageSource imageSource = new ImageSource(context2, map.getString("uri"), 0.0d, 0.0d, 12, null);
                if (Intrinsics.areEqual(Uri.EMPTY, imageSource.getUri())) {
                    warnImageSource(map.getString("uri"));
                    ImageSource.Companion companion2 = ImageSource.Companion;
                    Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    imageSource = companion2.getTransparentBitmapImageSource(context3);
                }
                arrayList.add(imageSource);
            } else {
                int size = readableArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ReadableMap map2 = readableArray.getMap(i2);
                    Context context4 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    ImageSource imageSource2 = new ImageSource(context4, map2.getString("uri"), map2.getDouble("width"), map2.getDouble("height"));
                    if (Intrinsics.areEqual(Uri.EMPTY, imageSource2.getUri())) {
                        warnImageSource(map2.getString("uri"));
                        ImageSource.Companion companion3 = ImageSource.Companion;
                        Context context5 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                        imageSource2 = companion3.getTransparentBitmapImageSource(context5);
                    }
                    arrayList.add(imageSource2);
                }
            }
        }
        if (Intrinsics.areEqual(this.sources, arrayList)) {
            return;
        }
        this.sources.clear();
        this.sources.addAll(arrayList);
        this.isDirty = true;
    }

    public final void setTileMode(Shader.TileMode tileMode) {
        Intrinsics.checkNotNullParameter(tileMode, "tileMode");
        if (this.tileMode != tileMode) {
            this.tileMode = tileMode;
            this.tilePostprocessor = isTiled() ? new TilePostprocessor() : null;
            this.isDirty = true;
        }
    }

    public final void updateCallerContext(Object obj) {
        if (Intrinsics.areEqual(this.callerContext, obj)) {
            return;
        }
        this.callerContext = obj;
        this.isDirty = true;
    }
}
