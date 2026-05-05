package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: SaveableStateHolder.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0016DLш|\u0004O)8\u000b<Ȑ\u0007\":4\u007f\u0007tvA0R\u0004P.XS2\u000f\u0002{<$a'yCQU\"Ԃ*\t]NogtJb\u000bY\u000f\u000e\u0016\u000fj4I[|c\u0012%˰`\bo3{nu9x\u000ev20X(8\b\u0005\u0019::J v)E[\"\"DPrJR;Q\u0015$\"\u000eN$\u0011 rf|8vq\f=]$ɨmB\\-(V\u000b\\%F\u00037=zo/C@e7E4a\u0015\u001f]kA\u0013? M3{Ҋ++O\b\u001eKݼ\u0004\u0014#@\u0018\u001bk\t>\\3a\u0011\u00105<gcyRT<@#\n$T&\u001e\b7H\\/*|\u0018\"Cv\u0003SnT\u0012hR\b\u000beF\u0019;~a-g \u0015Tw:GO}{U',*\u0019p7Z\u0003\u00167ڄ'ƻ{]9҅X?NW\u0018c]o\n{p\u000ez >T\u0018?\f\u0013>\u0017S9k?3%\u001a\u0010\u0019D\u0016ϸ3a?\u05c8kʐL@*Âfc8\t$zTf\u0015k~VhB!a,V\u0017}6\u00170f\bD1) Peg\u0018l{b8(]g\u000eխp«\u0012WAӔۑ9k"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?M?8r4\f$dp9im3Mv4+TY32", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?M?8r4\f$dp9im3Mv4\u001d", "A`e2W\u001aMO(~\t", "", "", "", "", "", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005)p", ">`a2a;,O*~v[3|v>a\u000f(h@\u0003\u001b%V|\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?M?8r4\f$dp9sc.R\u00056T`$", "5dc\u001dT9>\\(lvo,x\u00066em7wO\u0001\u0004\u0017Is\u001cK\u00049", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005!FYy\u001d>m_\u001cIT;g1%\u0015Vp5\u0016c\u0019Nx+U[[@2", "Adc\u001dT9>\\(lvo,x\u00066em7wO\u0001\u0004\u0017Is\u001cK\u00049", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoWJr65Uz'77\u0004*^C7h;\u001e\u0003w]H\u0007P,Pz5VYb\u0002 C", "@dV6f;Kg{\t\u0002],\n\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?M?8r4\f$dp9im3Mv4+TY3\u001b?r?\u0018 i\u001bb\u000e\u0017\fXA1D", "!`e2T)ES\u0007\u000evm,g\u00169v\u0004'{M", "", "9dh", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00100\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0012iJ3rL7he6Q\rEv\u0001\u0019kqx[", "@d\\<i,,b\u0015\u000ez", "A`e243E", "\u0011n\\=T5B]\"", " dV6f;Kg{\t\u0002],\n", "@t]A\\4>\u001b'z\f^(y\u0010/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class SaveableStateHolderImpl implements SaveableStateHolder {
    public static final Companion Companion = new Companion(null);
    private static final Saver<SaveableStateHolderImpl, ?> Saver = SaverKt.Saver(new Function2<SaverScope, SaveableStateHolderImpl, Map<Object, Map<String, ? extends List<? extends Object>>>>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        public final Map<Object, Map<String, List<Object>>> invoke(SaverScope saverScope, SaveableStateHolderImpl saveableStateHolderImpl) {
            return saveableStateHolderImpl.saveAll();
        }
    }, new Function1<Map<Object, Map<String, ? extends List<? extends Object>>>, SaveableStateHolderImpl>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ SaveableStateHolderImpl invoke(Map<Object, Map<String, ? extends List<? extends Object>>> map) {
            return invoke2((Map<Object, Map<String, List<Object>>>) map);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final SaveableStateHolderImpl invoke2(Map<Object, Map<String, List<Object>>> map) {
            return new SaveableStateHolderImpl(map);
        }
    });
    private SaveableStateRegistry parentSaveableStateRegistry;
    private final Map<Object, RegistryHolder> registryHolders;
    private final Map<Object, Map<String, List<Object>>> savedStates;

    public SaveableStateHolderImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public SaveableStateHolderImpl(Map<Object, Map<String, List<Object>>> map) {
        this.savedStates = map;
        this.registryHolders = new LinkedHashMap();
    }

    public /* synthetic */ SaveableStateHolderImpl(LinkedHashMap linkedHashMap, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? new LinkedHashMap() : linkedHashMap);
    }

    public final SaveableStateRegistry getParentSaveableStateRegistry() {
        return this.parentSaveableStateRegistry;
    }

    public final void setParentSaveableStateRegistry(SaveableStateRegistry saveableStateRegistry) {
        this.parentSaveableStateRegistry = saveableStateRegistry;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void SaveableStateProvider(final Object obj, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1198538093);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SaveableStateProvider)P(1)76@3032L923:SaveableStateHolder.kt#r2ddri");
        if ((6 & i2) == 0) {
            int i4 = composerStartRestartGroup.changedInstance(obj) ? 4 : 2;
            i3 = (i4 + i2) - (i4 & i2);
        } else {
            i3 = i2;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
            i3 = (i3 + i5) - (i3 & i5);
        }
        if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (384 | i2) == 0) {
            int i6 = composerStartRestartGroup.changedInstance(this) ? 256 : 128;
            i3 = (i3 + i6) - (i3 & i6);
        }
        if ((i3 + 147) - (147 | i3) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1198538093, i3, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:75)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 444418301, "CC(ReusableContent)P(1)149@5444L9:Composables.kt#9igjgp");
            composerStartRestartGroup.startReusableGroup(207, obj);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1358150931, "C77@3088L321,84@3422L150,88@3608L337,88@3585L360:SaveableStateHolder.kt#r2ddri");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -233283229, "CC(remember):SaveableStateHolder.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                SaveableStateRegistry saveableStateRegistry = this.parentSaveableStateRegistry;
                if (!(saveableStateRegistry != null ? saveableStateRegistry.canBeSaved(obj) : true)) {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                objRememberedValue = new RegistryHolder(obj);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final RegistryHolder registryHolder = (RegistryHolder) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            CompositionLocalKt.CompositionLocalProvider(SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(registryHolder.getRegistry()), function2, composerStartRestartGroup, ((-1) - (((-1) - i3) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))) | ProvidedValue.$stable);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -233266573, "CC(remember):SaveableStateHolder.kt#9igjgp");
            int i7 = (composerStartRestartGroup.changedInstance(this) ? 1 : 0) | (composerStartRestartGroup.changedInstance(obj) ? 1 : 0);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(registryHolder);
            boolean z2 = (i7 + (zChangedInstance ? 1 : 0)) - (i7 & (zChangedInstance ? 1 : 0)) == 1;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        boolean zContainsKey = this.this$0.registryHolders.containsKey(obj);
                        Object obj2 = obj;
                        if (!zContainsKey) {
                            this.this$0.savedStates.remove(obj);
                            this.this$0.registryHolders.put(obj, registryHolder);
                            final SaveableStateHolderImpl.RegistryHolder registryHolder2 = registryHolder;
                            final SaveableStateHolderImpl saveableStateHolderImpl = this.this$0;
                            final Object obj3 = obj;
                            return new DisposableEffectResult() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$1$1$1$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    registryHolder2.saveTo(saveableStateHolderImpl.savedStates);
                                    saveableStateHolderImpl.registryHolders.remove(obj3);
                                }
                            };
                        }
                        throw new IllegalArgumentException(("Key " + obj2 + " was used multiple times ").toString());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 6);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endReusableGroup();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i8) {
                    SaveableStateHolderImpl saveableStateHolderImpl = SaveableStateHolderImpl.this;
                    Object obj2 = obj;
                    Function2<Composer, Integer, Unit> function22 = function2;
                    int i9 = i2;
                    saveableStateHolderImpl.SaveableStateProvider(obj2, function22, composer2, RecomposeScopeImplKt.updateChangedFlags((i9 + 1) - (i9 & 1)));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<Object, Map<String, List<Object>>> saveAll() {
        Map<Object, Map<String, List<Object>>> mutableMap = MapsKt.toMutableMap(this.savedStates);
        Iterator<T> it = this.registryHolders.values().iterator();
        while (it.hasNext()) {
            ((RegistryHolder) it.next()).saveTo(mutableMap);
        }
        if (mutableMap.isEmpty()) {
            return null;
        }
        return mutableMap;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void removeState(Object obj) {
        RegistryHolder registryHolder = this.registryHolders.get(obj);
        if (registryHolder != null) {
            registryHolder.setShouldSave(false);
        } else {
            this.savedStates.remove(obj);
        }
    }

    /* JADX INFO: compiled from: SaveableStateHolder.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLcz\u0007I\u0006F\u000b6B\u0005#4\u0012\u0006\u0010nj?3LeV.Zݷ2\u000fy\u001f<$iFyCIa\"}0'WȞmˮp`ҙ;C=\u0005V\u0004z0WU\u0011]@\u000e̓FoM4\u0016\u001cKGxtd\u0014PV0H\u0012%\u0011\u001c:H>u\u000bY[ \"2Pphe\u001dW\u0015\"\"\nN\"\u0017\u001d\u000bf|Jv~\fK\u007f2\u0011iZNU^݁\u0001S\u0015Ͽl)\u0013xo!{OE9-%\u0002\b\u07baVaGšWsC\u000bv.wCW{o6\u0007\tjƊ7̠\u0011iz̦t\u0007Wj\u001a2KQiW^\u001b߳{\u0010"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?M?8r4\f$dp9im3Mv4+TY3\u001b?r?\u0018 i\u001bb\u000e\u0017\fXA1D", "", "9dh", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoWJr65Uz'77\u0004*^C7h;\u001e\u0003w]H\u0007F6Uu'T0V7c(YB\u0010#VWU'\u0016\u0007#+!sD5.]o:", "5dc\u0018X@", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "@dV6f;Kg", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?M?8r4\f$dp9sc.R\u00056T`$", "5dc\u001fX.Ba(\f\u000f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005!FYy\u001d>m_\u001cIT;g1%\u0015Vp5\u0016c\u0019Nx+U[[@2", "Ag^B_+,O*~", "", "5dc [6NZ\u0018lvo,", "u(I", "Adc [6NZ\u0018lvo,", "uY\u0018#", "A`e2G6", "", ";`_", "", "", "", "", "@t]A\\4>\u001b'z\f^(y\u0010/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public final class RegistryHolder {
        private final Object key;
        private final SaveableStateRegistry registry;
        private boolean shouldSave = true;

        public RegistryHolder(Object obj) {
            this.key = obj;
            this.registry = SaveableStateRegistryKt.SaveableStateRegistry((Map) SaveableStateHolderImpl.this.savedStates.get(obj), new Function1<Object, Boolean>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$RegistryHolder$registry$1
                {
                    super(1);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(Object obj2) {
                    SaveableStateRegistry parentSaveableStateRegistry = saveableStateHolderImpl.getParentSaveableStateRegistry();
                    return Boolean.valueOf(parentSaveableStateRegistry != null ? parentSaveableStateRegistry.canBeSaved(obj2) : true);
                }
            });
        }

        public final Object getKey() {
            return this.key;
        }

        public final boolean getShouldSave() {
            return this.shouldSave;
        }

        public final void setShouldSave(boolean z2) {
            this.shouldSave = z2;
        }

        public final SaveableStateRegistry getRegistry() {
            return this.registry;
        }

        public final void saveTo(Map<Object, Map<String, List<Object>>> map) {
            if (this.shouldSave) {
                Map<String, List<Object>> mapPerformSave = this.registry.performSave();
                if (mapPerformSave.isEmpty()) {
                    map.remove(this.key);
                } else {
                    map.put(this.key, mapPerformSave);
                }
            }
        }
    }

    /* JADX INFO: compiled from: SaveableStateHolder.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\blʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$B\\IV2\b2\u000b_N\u0016j~J`\fq\u0011و\u001a~rߚaW~a \u0014̙Fu"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?M?8r4\f$dp9im3Mv4+TY3\u001b0|E\u001f\u000ec\u0012X4b", "", "u(E", "!`e2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?MP\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?M?8r4\f$dp9im3Mv4+TY32", "5dc T=>`", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005!FYy\u001d>m_\u001cIT;x\n", "@t]A\\4>\u001b'z\f^(y\u0010/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver<SaveableStateHolderImpl, ?> getSaver() {
            return SaveableStateHolderImpl.Saver;
        }
    }
}
