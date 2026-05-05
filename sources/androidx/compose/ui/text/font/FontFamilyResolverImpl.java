package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import androidx.compose.ui.text.font.FontFamily;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: FontFamilyResolver.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яd\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<$a$yCQU\"}8\tWNu˧vJ`\fK\u000f\u0014\u0016\u0001̓4Ikxe\u0012\u00152JoU3UڎE9vt>ӌ(288\u0002ڎ\t\u001a@H\u0018v\u0001EQÈ(ؓpphQM\u0001\u0015\u001e \u0006V /\u001flmT6Vnu:]&\u0013oHN5cH|{\u0012VZ-\r\u0005g6+n>E\u001b+S\u0011\u000fj[m\fӭu=\u0013ro;9Z\fWdj0\u0018#>g\r\f\u0007lدCŌd\f5@\u0018\u001cYf&.\b|\f\rj\u0012<\u001dWN<@2h\u001e\ra\t#WNh\u001a^p\u0019+eD1=\u007faFi\u001ftmy;Gk}\u0010͕\f̔ţ\u0005p'yb-)))j\u0010WASP=v\\8pmq\u0012\u0011z\u0002X\u0011vGPG\n\u001cF#59k9Q.{\u0004XD\u0016\u00053l?\u05c8kʐL@*ÂfC8\u000f$Zrk[ߛRԜ\\,\u0019۳l`\u0015\u0006 \u0013NeN˖#ٚ\u0014NWŖ:|[]\"%]g\u000eիp«\u0012]AӔK7Wr\u001eq#\u0003\"ATb3[=̾U۱^\\0ί\u0003Tx\u0014\u0010{rSbƑ4Ɛu\u001c<ιվ\u0019a\u001dK\tپ^o{Ȫc{"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJOX4,\u001for9\u0014G4Y}|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJO*!\u001e#rhJ\u0007p\u0002", ">kPAY6K[y\t\u0004m\u0013\u0007\u0005.e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~D\u0005\u001cFn ;U$EtC\u0005\u001fd`9\u00149", ">kPAY6K[\u0006~\th3\u000e\t\u0013n\u000f(\t>\u0001\"&Q|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~D\u0005\u001cFn ;U0;y>%&hEB\u0016c9Lv2VV[\u0002", "Bx_2Y(<S\u0006~\u0007n,\u000b\u0018\ra}+{", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~H\u0012+7n\u0012,M0;wD\u001e#w?5\u0005f,$", "4n]A?0Lby\t\u0004m\rx\u00113l\u0014\u0017\u0010K\u0001\u0018\u0013Eoi;r0DY\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FT\u001a<\\$EtC~\u0011pe@\u001bR@Yv(CJN\b[N}L\u0014\u001f0", ">kPAY6K[yz\u0003b3\u0011wCp\u007f)w>\u0001r\u0016Cz\u001d<\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~D\u0005\u001cFn ;U$EtC~\u0011pe@\u001bR@Yv(CJN\b[N}L\u0014\u001f0", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W=\u0001.D#h'3|\u00178ZK\u001cu=-{r]8\u0007p\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0015]\u000b3nWFh\t6R\u0011\u0005S\b\b%\u000f?wx/V\u001eQ\u0001&u%2wFf]yRPOo\u007fK\bh\u001ciD>#';\u0017%p[8\u0018{\u001d!v\u001c\tgzVb{B-M7JZPoV8r'\fK\b\b\u0012@gR'r0\u0004\n\u00112m\u0004Xq\u001c=qB\u00136dL146\u0006#C\u0015ru\u007fMWi)j\u0017WC?:(LiqWo\u0011f&<1ic\bKA\u001aIIp\u0011%FZAW\u0005$\t\u0014yTaRB(^\u0005\u0019\u0004\u000e i\u0019\u000e\rt\u0018e>\u001a\u0007h\u000f{9)8W\u001c\u00182#\u0013whD\u001f}PpwT\u0002<Sw(=\r\u007f],3L8tR\u001fn\f!C\u0001\u0018T`d", "1qT.g,\u001dS\u001az\u000be;k\u001d:e\u0001$y@", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~H\u0012+7n\u0012,M0;wD\u001e#w7", "", "5dc\u001d_(MT#\f\u0003?6\u0006\u0018\u0016o{'{M?'\u001bA~\u000eO\u0006\u001fBY\u0005 3{\u0016", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u000b>i%/WPCL>'$Ok5\u0006c9$", ">qT9b(=", "", "4n]A9(FW \u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJOA", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W=\u0001.D#^*@|v*UGB\u007f\n\u0005\u001brp@\u000bluL\u00014Q\\]0eR\u0001\u0007q\u001cc\u001dR4\u001d\u0001hE.w\u001az\u0006\r(Z}\u0005o|\u0015\u0018W\u001fguBT\u001f\u001d", "@db<_=>", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "4n]AJ,BU\u001c\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F_\u00162OFJA", "4n]AF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[%BTC\u0011", "4n]AF@Gb\u001c~\tb:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[*7\\F;y8,j", "@db<_=>\u001bwixj\u0016\\t", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W=\u0001.D#^*@|v*UGB\u007f\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[i\u000ea:V\u0006cJ38%A(\u0017\u001eI\u0006=k\u0010ayqxQlKU\u001dQ}\u0014\t\u000b'rNdi\bG\u000bRr3s\u0010g\u001d&(I #qn", "Bx_2Y(<S\u0006~\u0007n,\u000b\u0018", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FontFamilyResolverImpl implements FontFamily.Resolver {
    public static final int $stable = 8;
    private final Function1<TypefaceRequest, Object> createDefaultTypeface;
    private final FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter;
    private final PlatformFontFamilyTypefaceAdapter platformFamilyTypefaceAdapter;
    private final PlatformFontLoader platformFontLoader;
    private final PlatformResolveInterceptor platformResolveInterceptor;
    private final TypefaceRequestCache typefaceRequestCache;

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1, reason: invalid class name */
    /* JADX INFO: compiled from: FontFamilyResolver.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\n~D\f}\u0012\u000fI\u0003\r\r\u0014Ng\u0012\u0012\u0019k\b\u0015\u0012\u0016$}\u0012!\u001e\u001c'\u0017%|\"&#", f = "\u0013;9>\u000f)4/1=\u0015'4/+4\".h%-", i = {0, 0}, l = {45}, m = "?B6>B59", n = {"c^kY", "UepZ8WOPBS"}, s = {"xQ^", "xQ_"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FontFamilyResolverImpl.this.preload(null, this);
        }
    }

    public FontFamilyResolverImpl(PlatformFontLoader platformFontLoader, PlatformResolveInterceptor platformResolveInterceptor, TypefaceRequestCache typefaceRequestCache, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter) {
        this.platformFontLoader = platformFontLoader;
        this.platformResolveInterceptor = platformResolveInterceptor;
        this.typefaceRequestCache = typefaceRequestCache;
        this.fontListFontFamilyTypefaceAdapter = fontListFontFamilyTypefaceAdapter;
        this.platformFamilyTypefaceAdapter = platformFontFamilyTypefaceAdapter;
        this.createDefaultTypeface = new Function1<TypefaceRequest, Object>() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$createDefaultTypeface$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(TypefaceRequest typefaceRequest) {
                return this.this$0.resolve(TypefaceRequest.m6274copye1PVR60$default(typefaceRequest, null, null, 0, 0, null, 30, null)).getValue();
            }
        };
    }

    public final PlatformFontLoader getPlatformFontLoader$ui_text_release() {
        return this.platformFontLoader;
    }

    public /* synthetic */ FontFamilyResolverImpl(PlatformFontLoader platformFontLoader, PlatformResolveInterceptor platformResolveInterceptor, TypefaceRequestCache typefaceRequestCache, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(platformFontLoader, (2 & i2) != 0 ? PlatformResolveInterceptor.Companion.getDefault$ui_text_release() : platformResolveInterceptor, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? FontFamilyResolverKt.getGlobalTypefaceRequestCache() : typefaceRequestCache, (8 & i2) != 0 ? new FontListFontFamilyTypefaceAdapter(FontFamilyResolverKt.getGlobalAsyncTypefaceCache(), null, 2, null) : fontListFontFamilyTypefaceAdapter, (-1) - (((-1) - i2) | ((-1) - 16)) != 0 ? new PlatformFontFamilyTypefaceAdapter() : platformFontFamilyTypefaceAdapter);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    @Override // androidx.compose.ui.text.font.FontFamily.Resolver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object preload(androidx.compose.ui.text.font.FontFamily r18, kotlin.coroutines.Continuation<? super kotlin.Unit> r19) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.FontFamilyResolverImpl.preload(androidx.compose.ui.text.font.FontFamily, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.text.font.FontFamily.Resolver
    /* JADX INFO: renamed from: resolve-DPcqOEQ */
    public State<Object> mo6208resolveDPcqOEQ(FontFamily fontFamily, FontWeight fontWeight, int i2, int i3) {
        return resolve(new TypefaceRequest(this.platformResolveInterceptor.interceptFontFamily(fontFamily), this.platformResolveInterceptor.interceptFontWeight(fontWeight), this.platformResolveInterceptor.m6258interceptFontStyleT2F_aPo(i2), this.platformResolveInterceptor.m6259interceptFontSynthesisMscr08Y(i3), this.platformFontLoader.getCacheKey(), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final State<Object> resolve(final TypefaceRequest typefaceRequest) {
        return this.typefaceRequestCache.runCached(typefaceRequest, new Function1<Function1<? super TypefaceResult, ? extends Unit>, TypefaceResult>() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$resolve$result$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ TypefaceResult invoke(Function1<? super TypefaceResult, ? extends Unit> function1) {
                return invoke2((Function1<? super TypefaceResult, Unit>) function1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final TypefaceResult invoke2(Function1<? super TypefaceResult, Unit> function1) {
                TypefaceResult typefaceResultResolve = this.this$0.fontListFontFamilyTypefaceAdapter.resolve(typefaceRequest, this.this$0.getPlatformFontLoader$ui_text_release(), function1, this.this$0.createDefaultTypeface);
                if (typefaceResultResolve == null && (typefaceResultResolve = this.this$0.platformFamilyTypefaceAdapter.resolve(typefaceRequest, this.this$0.getPlatformFontLoader$ui_text_release(), function1, this.this$0.createDefaultTypeface)) == null) {
                    throw new IllegalStateException("Could not load font");
                }
                return typefaceResultResolve;
            }
        });
    }
}
