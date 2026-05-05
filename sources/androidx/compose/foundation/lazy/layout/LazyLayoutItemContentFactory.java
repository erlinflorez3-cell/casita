package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: LazyLayoutItemContentFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012\u000e\u0007nj?2LeVQZS@\u000fsڔ<$i$yCQU\"Ԃ*\t]TogtN`\nYƤ6\u0016'idHi9v\"\u0013@B\b?aN\u007fGGb\r<\u0015\"B\"f}3\u0004ʀ.H\u001e{CqY\u0017*;PrJR;Y3\u001dŪ\n>&\u000eN`u\\NH\u001blj31\u0013\u0002B|&\u00106\u000b^%Hj&;uҐ\"+NI}%3f\u001b\thZm\u0002owK\u0015\u0001)=*wr(Kf\u0002,\u001b;Q\u001d]!*\u000b\bŌd\u0012/˃geQV\u001c/H\u0017\n\u0015T\u0014\u001e\b7H\\,*l\u0018\u0012a~CSnА0g\u0019Ș|ˋ:\u0017-Į\u00047G\u001b~Q\u0010<o\u05ce9߉\t\r&ŀѐr6"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;2\u0006'O*X5kR{Lt\u000eX\u001dX8!Z", "", "A`e2T)ES\u0007\u000evm,_\u00136d\u007f5", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?M?8r4\f$dp9im3Mv4\u001d", "7sT:C9Hd\u001d}zk", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;2\u0006'O7[6mVq=!g", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoWJr65Uz'77\u0004*^C7h;\u001e\u0003w]H\u0007F6Uu'T\"52fayA\u001d[_\u001fVt\u000e\u0015b?3rN@-Q\rY\u000b9w\u0005\u0016\u001fX\u000b.a", "5dc\u0016g,F>&\t\fb+|\u0016", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", ":`\\/W(L1\u0015|}^", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;2\u0006'O*X5kR{Lt\u000eX\u001dX8!C7=\"qD6\u0003\u0017,Q_Eq\u0010\f\u001f\u001d\u000b", "5dc\u0010b5MS\"\u000e", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "7mS2k", "", "9dh", "1n]AX5MB-\nz", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004\u0011*AuC%\u0019q+>\u0018kuO\u00070E[R6e`<\u001e$\u001bX\u001dR5\u0016Q/", "5dc\u0010b5MS\"\u000eir7|", "\u0011`R5X+\"b\u0019\u0007Xh5\f\t8t", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyLayoutItemContentFactory {
    public static final int $stable = 8;
    private final Function0<LazyLayoutItemProvider> itemProvider;
    private final Map<Object, CachedItemContent> lambdasCache = new LinkedHashMap();
    private final SaveableStateHolder saveableStateHolder;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutItemContentFactory(SaveableStateHolder saveableStateHolder, Function0<? extends LazyLayoutItemProvider> function0) {
        this.saveableStateHolder = saveableStateHolder;
        this.itemProvider = function0;
    }

    public final Function0<LazyLayoutItemProvider> getItemProvider() {
        return this.itemProvider;
    }

    public final Object getContentType(Object obj) {
        if (obj == null) {
            return null;
        }
        CachedItemContent cachedItemContent = this.lambdasCache.get(obj);
        if (cachedItemContent != null) {
            return cachedItemContent.getContentType();
        }
        LazyLayoutItemProvider lazyLayoutItemProviderInvoke = this.itemProvider.invoke();
        int index = lazyLayoutItemProviderInvoke.getIndex(obj);
        if (index != -1) {
            return lazyLayoutItemProviderInvoke.getContentType(index);
        }
        return null;
    }

    public final Function2<Composer, Integer, Unit> getContent(int i2, Object obj, Object obj2) {
        CachedItemContent cachedItemContent = this.lambdasCache.get(obj);
        if (cachedItemContent != null && cachedItemContent.getIndex() == i2 && Intrinsics.areEqual(cachedItemContent.getContentType(), obj2)) {
            return cachedItemContent.getContent();
        }
        CachedItemContent cachedItemContent2 = new CachedItemContent(i2, obj, obj2);
        this.lambdasCache.put(obj, cachedItemContent2);
        return cachedItemContent2.getContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: LazyLayoutItemContentFactory.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4D\u0007\"B\u0012\u007f\u0007tjA0ZeP.X]0Ţm\u0012éT[Rp\u0004Xe\u001e\f\"!O|hwrX\\#C=\u0005&~x/aW\u000f\\@\u000e̓FoM7\u0016\u0006KLx\u007fF\u000702P?(\u000bв\u001e*N\u0018=zŲO\f <\u0011\fHW%Z\u0015\u001c\"\u0006l'\u0017\u001d\u000bmߑ:Hre\u0011ǅ/ɨmDV'm9Mg\u001bPl2\u001dxq\u001eYGe;չ)S\t\u000f\t ύ\u0007C\n?\u000bs53{Z\u0002ZNZ\u0016\u0013C*̠\u0011cz̦t\u0007Wm\u001a5{kqKh\u000eVx+\u007f\u001bK\u001c\u000e4(\u0007n\u0004Նrڿ\u00129|ɁkBV\u0012lSP\no8/%.2ڢ=!nϟy=\u001f`E\n̅\u00112"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;2\u0006'O*X5kR{Lt\u000eX\u001dX8!C7=\"qD6\u0003\u0017,Q_Eq\u0010\f\u001f\u001d\u000b", "", "7mS2k", "", "9dh", "1n]AX5MB-\nz", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001t\u0012BWSJ5\u001b\u001a*|H5\u001bm<]Z6GT,6earF#rV\f]5\u001a\u0019/%\u000bs@H\u001bQ3E\u000b=2j\t\u001b\u000e3yF)[\fXu^|=2j\u0010C\\~G?T8mU", "-b^;g,Gb", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001aj^A_0G\u001d\u001e\u0010\u0003(-\r\u0012-t\u00042\u0005NJw'Pm\u001d@\u0001.\u0002/", "1n]AX5M", "5dc\u0010b5MS\"\u000e", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJu", "5dc\u0010b5MS\"\u000eir7|", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "\nrTA \u0006\u0017", "5dc\u0016a+>f", "u(8", "5dc\u0018X@", "1qT.g,\u001c]\"\u000ezg;c\u00057b~$", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    final class CachedItemContent {
        private Function2<? super Composer, ? super Integer, Unit> _content;
        private final Object contentType;
        private int index;
        private final Object key;

        public CachedItemContent(int i2, Object obj, Object obj2) {
            this.key = obj;
            this.contentType = obj2;
            this.index = i2;
        }

        public final Object getKey() {
            return this.key;
        }

        public final Object getContentType() {
            return this.contentType;
        }

        public final int getIndex() {
            return this.index;
        }

        public final Function2<Composer, Integer, Unit> getContent() {
            Function2 function2 = this._content;
            if (function2 != null) {
                return function2;
            }
            Function2<Composer, Integer, Unit> function2CreateContentLambda = createContentLambda();
            this._content = function2CreateContentLambda;
            return function2CreateContentLambda;
        }

        private final Function2<Composer, Integer, Unit> createContentLambda() {
            final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = LazyLayoutItemContentFactory.this;
            return ComposableLambdaKt.composableLambdaInstance(1403994769, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i2) {
                    ComposerKt.sourceInformation(composer, "C107@3934L220,107@3912L242:LazyLayoutItemContentFactory.kt#wow0x6");
                    if ((i2 + 3) - (3 | i2) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1403994769, i2, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:91)");
                        }
                        LazyLayoutItemProvider lazyLayoutItemProviderInvoke = lazyLayoutItemContentFactory.getItemProvider().invoke();
                        int index = this.getIndex();
                        if ((index >= lazyLayoutItemProviderInvoke.getItemCount() || !Intrinsics.areEqual(lazyLayoutItemProviderInvoke.getKey(index), this.getKey())) && (index = lazyLayoutItemProviderInvoke.getIndex(this.getKey())) != -1) {
                            this.index = index;
                        }
                        if (index != -1) {
                            composer.startReplaceGroup(-660479623);
                            ComposerKt.sourceInformation(composer, "100@3701L184");
                            LazyLayoutItemContentFactoryKt.m1186SkippableItemJVlU9Rs(lazyLayoutItemProviderInvoke, StableValue.m1206constructorimpl(lazyLayoutItemContentFactory.saveableStateHolder), index, StableValue.m1206constructorimpl(this.getKey()), composer, 0);
                            composer.endReplaceGroup();
                        } else {
                            composer.startReplaceGroup(-660272047);
                            composer.endReplaceGroup();
                        }
                        Object key = this.getKey();
                        ComposerKt.sourceInformationMarkerStart(composer, -714034419, "CC(remember):LazyLayoutItemContentFactory.kt#9igjgp");
                        boolean zChangedInstance = composer.changedInstance(this);
                        final LazyLayoutItemContentFactory.CachedItemContent cachedItemContent = this;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                            objRememberedValue = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$1$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                    final LazyLayoutItemContentFactory.CachedItemContent cachedItemContent2 = cachedItemContent;
                                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$1$1$invoke$$inlined$onDispose$1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            cachedItemContent2._content = null;
                                        }
                                    };
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        EffectsKt.DisposableEffect(key, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }
            });
        }
    }
}
