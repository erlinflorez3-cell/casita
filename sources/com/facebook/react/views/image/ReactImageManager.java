package com.facebook.react.views.image;

import android.content.Context;
import android.graphics.PorterDuff;
import com.facebook.common.logging.FLog;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.LogicalEdge;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яp\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u0006јnj?0Le^.ZS0\u000fs{J$c$wDCU0}*ޛWNu\u000bvJh\u0017K\u000f\f\u0016\u0001j:I]xc\u0013\u00172PxG3SoE9nz>\u0005&2*8\b\n\t\u001a0P\u0018v\u0011CS\f\u00184HpPR\u0015M\u000b.\u0018\u000bTĨ\u001fc\rm^8Xl\f:]\";h\b\u000fPeE\rc\u001bGl9\u001dvg\u001f;@=6%%Y\u0004\u0017Ra@\u0019> ?\u0015n5*CK\nVd\\ÿ\u0018\u00159TM\u0011x;l\u001b_a$9;OiL`\u000e.x\u000b{\u0013=\u0014\u000e\f(^-[\u001cv\u000e\u001c9\rti?~\tnH\u000e}y8-$.7ڢ=\u001btY\"t\u001fSG\u0014\u000b\r,$\u0019\u00011[Z\u000fp\u0015!U\bQ7RP=NO Xko\u0014xh\u00028\nHI\u0016.*\u0018>\u001f+7iB;#\u0002\u0001vNϼz\u0005ns\u001cw`TX\"\u001d\u0016g.\u0017\u0019rD\u0013\u00132d\u001dj: e(d\t\u000e\bA1lyL!S\u0014|_/}3Sk\u001c=/\u0015H \u00034\u001ceLv3ce\u0014\u0014og\u000f\u0014m<)\u0017!|Pi$Z\u000b<R6V\u007f(w*D~\u0010!IWqJLr6at#a\u001b\u001epU-\rmo\u0001\u0010-Tc*\th2\u000f!\u0001~w7\u00040\u000fWH\u0015`PAqUC.>UPhd\u00011$\u0017s.e.Q\u0010iz5\u000eU*4F\u001eGfG=A\u000f//@\"EGbq\u0014l\u0014\u0017ؠ~|\b0\u0004\u0007<\n j\u001f@\u0011nXdl\u0017Pv\u000fv1+|\u007f(|v~U\bl\u000b\n\\\u0010wKoJsP|33N)\u000f\u0005:|c-s++<\u0010\u0014]3(b2\b<!z\u000fT\t\u0016\b:x.o\u0011Q\u000e8I`a[\u0015=PM3\b\u000b`x\" B7H=7VV|p\u00058}\u0011=)~\tB\f\u001fg\"?[\u0006\f`F_X\bs\u0002\"s[%?M\u0004k{\u001bc\\9eU\u000fS\u0014?\u001d*\u001ck4\u0007[p\u001eH\u0006\"\u0018fGI\u0012\u001d>\u001f#b\\\u0003\rS[b\u001b\u001e\u0010)\u0014vc\u001d,JB\";\u0007\u0014b+tX^\u0004\u000fV'&r\u0017\rBK\u001e'Ia\t{[l/\u001221W+=3j}\u0017-*s\\bn3(\u0007\u0015;IkXa\u0002d\u0004w/{\u0017\b\u000eN\u0017+.\t\u001dcV_Gwv^r;Yrc|v@f\u0003T0`\u0017|\u0013\rj%U\u0010ĢSr}\u0004ub\\0OCH\u0015GH7\u001c$|\u0012FK1\u0014nE=w\u0003Z,Doau\u0016\bN4W\b\u00036tW<f:c)u.s,a0\u001aYUh\u001c<\u0007\rr8B8:]\u0017K\u0002A^\nq\u0006^X)Ak4S\u0012mA q+{n\u0004\u001f3j?k\u0012n[PM\r5\rF\u0013\u0007x\u0001\u0016\u001c8fQ\u0018\u0014C:O:\u0016wA\u0010}c\u0019vy\u0011s\u000fA.\u001aS(6xj,@7y$\u0018ZX6*SV{>\u0015\u000fj.ZY$]\u0019Q+yTF\"@\u0017H\r%C8T\b6d]7I%iQ_b\u001d\u0003sdl&ܳV?)X\u0003\u0019}+\u000f\u0013\u00199\u0011xVˢN֟v\u007foƨ}TbF2)o#\u001cnYͼMԺ<B\u0010ϴa,\u001f0rJ0>b\u001b,;W4Q\u0019\u0017\u0002%8\fp\u001d\u0018cl(Ɲ'ݜ\u0005|\t\u008d\u0010\b?qRuMqQ6e\u0378\u001d˓j;-˟ֶPm"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5#j 3k%\u0012U?=k\u001c\u001a\u001edc9\u00149", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n#]\u0006+>m\u00072MU#g=\u001a\u0017hn\u000f", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5#j 3k%\u0012U?=k%\"\u0015z7", "2qPDX,\u001c]\"\u000e\bh3\u0004\t<B\u0010,\u0003?\u0001$", "\u001ab^:\"-:Q\u0019{\u0005h2F\b<a\u0012({\n~! V|\u0018C}%B#Y\u001dE|#*KR\u001ax00\u0015h?C\u0010r9X}.GY+<`Yq=!g", "1`[9X9\u001c]\"\u000ezq;", "", "uKR<`u?O\u0017~wh6\u0003R.r{:{@J\u0015!P~\u001bF},5fG{4{%;IAJJA\u001a'ha\u0017\u0011l;[\u0001.NL[\tlVy<\u0014\u001f0tS'\u001e\u0001#H wF\u0001\t\u00051I\u007fJ>D|", "5k^/T3\"[\u0015\u0001zE6x\b\u0016i\u000e7{I\u0001$", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5#_'Aj\u001251K7m4\u0005\u001fd` \u000bq;N\u007f'T\"", "uKR<`u?O\u0017~wh6\u0003R.r{:{@J\u0015!P~\u001bF},5fG{4{%;IAJJA\u001a'ha\u0017\u0011l;[\u0001.NL[\tlVy<\u0014\u001f0tL5\u0015NZ=\"nAA)\u000euV\u00027f\u0010U'\u00125|~\fZ\u0018C{\u0015?#0rCUf]O=Gb\u0011n\b^\u0004`HI$\u001dq&pOU*\u001bw\u001d\u0018n[{1QD\u001ez63\u00141L", "1`[9X9\u001c]\"\u000ezq;]\u0005-t\n5\u0010", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5#j 3k%\fIJBkA{\u001fqp9\u001ar\rJt6QYb\u0002", "uKR<`u?O\u0017~wh6\u0003R.r{:{@J\u0015!P~\u001bF},5fG{4{%;IAJJA\u001a'ha\u0017\u0011l;[\u0001.NL[\tlVy<\u0014\u001f0tL5\u0015NZ=\"nAA)\u000euV\u00027f\u0010U'\u00125|~\fZ\u0018C{\u0015?#0rCUf]O=Gb\u0011n\b^\u0004`HI$\u001dq&pON8\u0012ET\rpRvqqMb\b8 <|%WIogJ>+'G}w[\u001fXp)\u0004\u000b\u007f;16qbUp'>q\bu(ZP13J\u0012V0", "1qT.g,/W\u0019\u0011^g:\f\u00058c\u007f", "1n]AX?M", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n$\\}(7l\u0003.IAJI>'$htH\\", "5dc\u0012k7H`(~y<<\u000b\u00189m^,\t@~&vXo\u0017Ke9@Y[*@{%*VRI", "", "", "5dc\u001bT4>", "=m03g,KC$}vm,k\u0016+n\u000e$yO\u0005! ", "", "DhTD", "Adc\u000eV*>a'\u0003we,", "/bR2f:BP ~", "", "Adc\u000fT*DU&\t\u000bg+Z\u00136o\r", "0`R8Z9Hc\"}Xh3\u0007\u0016", "", "Adc\u000f_<K@\u0015}~n:", "0kd?E(=W)\r", "", "Adc\u000fb9=S&\\\u0005e6\n", "0na1X9\u001c] \t\b", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\u0012\u001b\u0017Y}W@~!7YG\r7i\u0014=1K7m4\u000f\u0019hs\u000fmh(_rpNHW.&6{L\u0014\u0014Z\u001b$n}", "Adc\u000fb9=S&kv]0\r\u0017", "7mS2k", "0na1X9+O\u0018\u0003\u000bl", "Adc\u000fb9=S&p~];\u007f", "0na1X90W\u0018\u000e}", "Adc\u000fb?,V\u0015}\u0005p", "AgP1b>L", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7I#;IW\u0011", "Adc\u0011X-:c \u000ehh<\n\u0007/", "And?V,", "Adc\u0013T+>2)\fvm0\u0007\u0012", "2ta.g0H\\\u0001\r", "Adc\u0015X(=S&\r", "6dP1X9L", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "Adc\u0016a;>`\"z\u0002X\b\u0006\u00056y\u000f,yNo\u0013\u0019", "/mP9l;BQ\bz|", "Adc\u0019b(=6\u0015\bye,\n\u0017\u001ce\u0002,\nO\u0001$\u0017F", "Ag^B_+'](\u0003{r\u0013\u0007\u0005.E\u0011(\u0005O\u000f", "Adc\u0019b(=W\"\u0001^g+\u0001\u0007+t\n5iJ\u0011$\u0015G", "Adc\u001ci,KZ\u0015\u0013Xh3\u0007\u0016", "=uT?_(R1#\u0006\u0005k", "Adc\u001de6@`\u0019\r\tb=|u/n~(\tD\n\u0019vPk\u000bCv$", "3mP/_,=", "Adc\u001fX:Bh\u0019fzm/\u0007\b", "@db6m,&S(\u0002\u0005]", "Adc\u001fX:Bh\u0019f\u0005],", "@db6m,&]\u0018~", "Adc\u001fX:Bh\u0019f\u000be;\u0001\u00146i\u007f5", "@db6m,&c \u000e~i3\u0001\t<", "Adc b<KQ\u0019", "And?V,L", "Adc e*", "Adc!\\5M1#\u0006\u0005k", "Bh]A66E]&", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
@ReactModule(name = "\u0012\u0002\u0012\u0006)\u001c!\u001e\u000e \u001b,")
public final class ReactImageManager extends SimpleViewManager<ReactImageView> {
    public static final Companion Companion = new Companion(null);
    private static final String ON_ERROR = "onError";
    private static final String ON_LOAD = "onLoad";
    private static final String ON_LOAD_END = "onLoadEnd";
    private static final String ON_LOAD_START = "onLoadStart";
    private static final String ON_PROGRESS = "onProgress";
    public static final String REACT_CLASS = "RCTImageView";
    private static final String REGISTRATION_NAME = "registrationName";
    private Object callerContext;
    private final ReactCallerContextFactory callerContextFactory;
    private final AbstractDraweeControllerBuilder<?, ?, ?, ?> draweeControllerBuilder;
    private final GlobalImageLoadListener globalImageLoadListener;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005'2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԅt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̖~֒Yxe܈_>PsW3{q\u0014ʣ3ҽ:\u0005(݅rD\b\n\u0019\u001aXJf͏MŲO\f\u001aؓ\u0011|HX%M3\u001châ\u0011ŋ\u0005\u001edɡ\u001fBVsu:]%Y݊\u0015Ě+_8ŧ\u001e\u0019T\\?\r%ctѫ\u0013˝9\u0015-مα\u000b["}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5#j 3k%\u0012U?=k\u001c\u001a\u001edc9\u0014\"\nX~2CUR6e(", "", "u(E", "\u001dMN\u0012E\u0019(@", "", "\u001dMN\u0019B\b\u001d", "\u001dMN\u0019B\b\u001dMxgY", "\u001dMN\u0019B\b\u001dM\u0007mVK\u001b", "\u001dMN\u001dE\u0016 @xlh", " D0\u0010G&\u001c:tlh", " D6\u0016F\u001b+/\bbdG&ed\u0017E", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ReactImageManager() {
        this(null, null, null, 7, null);
    }

    public ReactImageManager(AbstractDraweeControllerBuilder<?, ?, ?, ?> abstractDraweeControllerBuilder) {
        this(abstractDraweeControllerBuilder, null, null, 6, null);
    }

    public ReactImageManager(AbstractDraweeControllerBuilder<?, ?, ?, ?> abstractDraweeControllerBuilder, GlobalImageLoadListener globalImageLoadListener) {
        this(abstractDraweeControllerBuilder, globalImageLoadListener, null, 4, null);
    }

    public ReactImageManager(AbstractDraweeControllerBuilder<?, ?, ?, ?> abstractDraweeControllerBuilder, GlobalImageLoadListener globalImageLoadListener, ReactCallerContextFactory reactCallerContextFactory) {
        this.draweeControllerBuilder = abstractDraweeControllerBuilder;
        this.globalImageLoadListener = globalImageLoadListener;
        this.callerContextFactory = reactCallerContextFactory;
    }

    public /* synthetic */ ReactImageManager(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, GlobalImageLoadListener globalImageLoadListener, ReactCallerContextFactory reactCallerContextFactory, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((AbstractDraweeControllerBuilder<?, ?, ?, ?>) ((1 & i2) != 0 ? null : abstractDraweeControllerBuilder), (2 & i2) != 0 ? null : globalImageLoadListener, (i2 & 4) != 0 ? null : reactCallerContextFactory);
    }

    @Deprecated(message = "\u0018Y\u0001t\u0006|\u001a\u0017[V6\u000ed'AQp[\u001bf\u001cq Z68skQ\t\u0007gtXiT0kvMK6G \u0013Y`\t4q\bDsQH\u0017\rK", replaceWith = @ReplaceWith(expression = "ReactImageManager(draweeControllerBuilder, globalImageLoadListener, callerContextFactory)", imports = {}))
    @InterfaceC1492Gx
    public ReactImageManager(AbstractDraweeControllerBuilder<?, ?, ?, ?> abstractDraweeControllerBuilder, GlobalImageLoadListener globalImageLoadListener, Object obj) {
        this(abstractDraweeControllerBuilder, globalImageLoadListener, (ReactCallerContextFactory) null);
        this.callerContext = obj;
    }

    @Deprecated(message = "\u0018Y\u0001t\u0006|\u001a\u0017[V6\u000ed'AQp[\u001bf\u001cq Z68skQ\t\u0007gtXiT0kvMK6G \u0013Y`\t4q\bDsQH\u0017\rK", replaceWith = @ReplaceWith(expression = "ReactImageManager(draweeControllerBuilder, globalImageLoadListener, callerContextFactory)", imports = {}))
    @InterfaceC1492Gx
    public ReactImageManager(AbstractDraweeControllerBuilder<?, ?, ?, ?> abstractDraweeControllerBuilder, Object obj) {
        this(abstractDraweeControllerBuilder, (GlobalImageLoadListener) null, (ReactCallerContextFactory) null);
        this.callerContext = obj;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactImageView createViewInstance(ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object orCreateCallerContext = this.callerContext;
        if (orCreateCallerContext == null) {
            ReactCallerContextFactory reactCallerContextFactory = this.callerContextFactory;
            orCreateCallerContext = null;
            if (reactCallerContextFactory != null) {
                orCreateCallerContext = reactCallerContextFactory.getOrCreateCallerContext(context.getModuleName(), null);
            }
        }
        ThemedReactContext themedReactContext = context;
        PipelineDraweeControllerBuilder pipelineDraweeControllerBuilderNewDraweeControllerBuilder = this.draweeControllerBuilder;
        if (pipelineDraweeControllerBuilderNewDraweeControllerBuilder == null) {
            pipelineDraweeControllerBuilderNewDraweeControllerBuilder = Fresco.newDraweeControllerBuilder();
        }
        Intrinsics.checkNotNull(pipelineDraweeControllerBuilderNewDraweeControllerBuilder);
        return new ReactImageView(themedReactContext, pipelineDraweeControllerBuilderNewDraweeControllerBuilder, this.globalImageLoadListener, orCreateCallerContext);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        LinkedHashMap exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new LinkedHashMap();
        }
        exportedCustomDirectEventTypeConstants.put(ImageLoadEvent.Companion.eventNameForType(4), MapsKt.mapOf(TuplesKt.to(REGISTRATION_NAME, ON_LOAD_START)));
        exportedCustomDirectEventTypeConstants.put(ImageLoadEvent.Companion.eventNameForType(5), MapsKt.mapOf(TuplesKt.to(REGISTRATION_NAME, ON_PROGRESS)));
        exportedCustomDirectEventTypeConstants.put(ImageLoadEvent.Companion.eventNameForType(2), MapsKt.mapOf(TuplesKt.to(REGISTRATION_NAME, ON_LOAD)));
        exportedCustomDirectEventTypeConstants.put(ImageLoadEvent.Companion.eventNameForType(1), MapsKt.mapOf(TuplesKt.to(REGISTRATION_NAME, ON_ERROR)));
        exportedCustomDirectEventTypeConstants.put(ImageLoadEvent.Companion.eventNameForType(3), MapsKt.mapOf(TuplesKt.to(REGISTRATION_NAME, ON_LOAD_END)));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(ReactImageView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction(view);
        view.maybeUpdateView();
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002Rb~\u000f;\u0017zb;")
    public final void setAccessible(ReactImageView view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setFocusable(z2);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
    public void setBackgroundColor(ReactImageView view, int i2) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBackgroundColor(view, Integer.valueOf(i2));
        } else {
            super.setBackgroundColor(view, i2);
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0003[t\fm)\u0012\u0002kI")
    public final void setBlurRadius(ReactImageView view, float f2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBlurRadius(f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = "\"\u0001oKU", name = "\u0003^q}\u0001:p\bbEB")
    public final void setBorderColor(ReactImageView view, Integer num) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBorderColor(view, LogicalEdge.ALL, num);
        } else if (num == null) {
            view.setBorderColor(0);
        } else {
            view.setBorderColor(num.intValue());
        }
    }

    @ReactPropGroup(customType = "0/333-@6=';?5)\"!", defaultFloat = Float.NaN, names = {"t\u0003\u0007y{\njz~\u0005\u0012\u0011", "t\u0003\u0007y{\nl\t\u000bg\u0002\u0004\u0013q\u0002\u0006\f\u0019\u0018", "t\u0003\u0007y{\nl\t\u000bm\u0006\u0005\u0007\u0014r\u0003\u0007\r\u001a\u0019", "t\u0003\u0007y{\nZ\t\u000f\u0010\f\u000bp\t\b\n\u0017u\u0006\n\u0010\u001d\u001c", "t\u0003\u0007y{\nZ\t\u000f\u0010\f\u000bj\u0005\u0007\u0016t\u0005\t\u000f\u001c\u001b"})
    @InterfaceC1492Gx
    public final void setBorderRadius(ReactImageView view, int i2, float f2) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBorderRadius(view, BorderRadiusProp.values()[i2], Float.isNaN(f2) ? null : new LengthPercentage(f2, LengthPercentageType.POINT));
            return;
        }
        if (!Float.isNaN(f2)) {
            f2 = PixelUtil.INSTANCE.dpToPx(f2);
        }
        if (i2 == 0) {
            view.setBorderRadius(f2);
        } else {
            view.setBorderRadius(f2, i2 - 1);
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0003^q}\u0001:\u0005\u0002ZJ8")
    public final void setBorderWidth(ReactImageView view, float f2) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBorderWidth(view, LogicalEdge.ALL, Float.valueOf(f2));
        } else {
            view.setBorderWidth(f2);
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = "!\u0001{/KgNA~", name = "\u0003^wl\u0004)\u0012\bm")
    public final void setBoxShadow(ReactImageView view, ReadableArray readableArray) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBoxShadow(view, readableArray);
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005Tez\u00114\"kh9")
    public final void setDefaultSource(ReactImageView view, String str) throws Throwable {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setDefaultSource(str);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Pc~_= yj??$")
    public final void setFadeDuration(ReactImageView view, int i2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setFadeDuration(i2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\tT`}\u0001:!")
    public final void setHeaders(ReactImageView view, ReadableMap readableMap) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (readableMap != null) {
            view.setHeaders(readableMap);
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\n]s~\u000e6\u000f\u0005U7>\u0017mxoF\u000exM\u000f")
    public final void setInternal_AnalyticsTag(ReactImageView view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        ReactCallerContextFactory reactCallerContextFactory = this.callerContextFactory;
        if (reactCallerContextFactory != null) {
            Context context = view.getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
            view.updateCallerContext(reactCallerContextFactory.getOrCreateCallerContext(((ThemedReactContext) context).getModuleName(), str));
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014Wn\u000f\b,{\bj?6/Mn\\Ao\u001bQ\u0016[.")
    public final void setLoadHandlersRegistered(ReactImageView view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setShouldNotifyLoadEvents(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\r^`}\u00056\u0015ad:9\u0019bsjO}\u0017O")
    public final void setLoadingIndicatorSource(ReactImageView view, String str) throws Throwable {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setLoadingIndicatorSource(str);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = "\"\u0001oKU", name = "\u0010ed\f\b)'[eB?(")
    public final void setOverlayColor(ReactImageView view, Integer num) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (num == null) {
            view.setOverlayColor(0);
        } else {
            view.setOverlayColor(num.intValue());
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011an\u0001\u000e-!\f_L5\bfm_B\u001d\u000eZ\u000f,)\n\u0007pI&")
    public final void setProgressiveRenderingEnabled(ReactImageView view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setProgressiveRenderingEnabled(z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (r4.equals("auto") == false) goto L10;
     */
    @yg.InterfaceC1492Gx
    @com.facebook.react.uimanager.annotations.ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tr\u0003\u0016-z}j>?\u001a")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setResizeMethod(com.facebook.react.views.image.ReactImageView r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            if (r4 == 0) goto L64
            int r1 = r4.hashCode()
            r0 = -934437708(0xffffffffc84d9cb4, float:-210546.81)
            if (r1 == r0) goto L54
            r0 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r1 == r0) goto L4b
            r0 = 109250890(0x683094a, float:4.929037E-35)
            if (r1 == r0) goto L3b
        L1b:
            com.facebook.react.views.image.ImageResizeMethod r0 = com.facebook.react.views.image.ImageResizeMethod.AUTO
            r3.setResizeMethod(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid resize method: '"
            r1.<init>(r0)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r0 = "'"
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "ReactNative"
            com.facebook.common.logging.FLog.w(r0, r1)
        L3a:
            return
        L3b:
            java.lang.String r0 = "scale"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L45
            goto L1b
        L45:
            com.facebook.react.views.image.ImageResizeMethod r0 = com.facebook.react.views.image.ImageResizeMethod.SCALE
            r3.setResizeMethod(r0)
            goto L3a
        L4b:
            java.lang.String r0 = "auto"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L64
            goto L1b
        L54:
            java.lang.String r0 = "resize"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L5e
            goto L1b
        L5e:
            com.facebook.react.views.image.ImageResizeMethod r0 = com.facebook.react.views.image.ImageResizeMethod.RESIZE
            r3.setResizeMethod(r0)
            goto L3a
        L64:
            com.facebook.react.views.image.ImageResizeMethod r0 = com.facebook.react.views.image.ImageResizeMethod.AUTO
            r3.setResizeMethod(r0)
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.image.ReactImageManager.setResizeMethod(com.facebook.react.views.image.ReactImageView, java.lang.String):void");
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tr\u0003\u0016-z\bZ;")
    public final void setResizeMode(ReactImageView view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setScaleType(ImageResizeMode.toScaleType(str));
        view.setTileMode(ImageResizeMode.toTileMode(str));
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tr\u0003\u0016-z\u000ebJ9&mh`O")
    public final void setResizeMultiplier(ReactImageView view, float f2) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (f2 < 0.01f) {
            FLog.w(ReactConstants.TAG, "Invalid resize multiplier: '" + f2 + "'");
        }
        view.setResizeMultiplier(f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014^t\f~-")
    public final void setSource(ReactImageView view, ReadableArray readableArray) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSource(readableArray);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014ab")
    public final void setSrc(ReactImageView view, ReadableArray readableArray) {
        Intrinsics.checkNotNullParameter(view, "view");
        setSource(view, readableArray);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = "\"\u0001oKU", name = "\u0015Xm\u000e^7\u001a\bh")
    public final void setTintColor(ReactImageView view, Integer num) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (num == null) {
            view.clearColorFilter();
        } else {
            view.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }
}
