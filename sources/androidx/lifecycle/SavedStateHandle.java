package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateRegistry;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
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
/* JADX INFO: compiled from: SavedStateHandle.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯZ\u001d<K!&i\u000eӵLш|\u0004O(8\u000b<N\u0007\"2\u0013\u007f\u0007t\u000eA0ZeP\u008cZS@\u000fs{:$c$\bCCU }*\t]NogtJb\u000bQ\u0018\u000e\u0016~l4Ikxe\u0012\u00156JoU3UoC9htD%(2(?\u0010ڎ\u001fBZH>u3Cs5RKF\u0005Jd\u001bM\u001d(\"\bN / lk^8^k\f9]$ɨmB\\* 5\u0003aϘJT5\u0011?o,9X7c$UW\u0011\u0017j[m\u0005\u0006v\u0006\u0014v8?+w\u0006\b:f\u0010,\u0015YQSƦrnx\u0013dx\u000e=*\u0016wkR\u0014ߊ\u0006\u000f,\u0011J\u0014&\u0006UJtƮ\u001aǴ\f\u000eA\n;mNf\u001adR\u0002\u000ba|+S\u0017S-?ӕte\u0012?'^O{3\u000fd(I\u0016/ql\u0014p\u0017+T>e_h`?Nݐ\u0018mmq\u0012\u0001z\u0002X\u0006`K\u000eG\u0014\u0011t+k<٦=#/\u0005JwR\u0002\u000f\u000bpjci\u0019\\n9\u000f\u0018=ѧ\u0017 \u000bHr\u0015\u0004P\u0003Z\\\u0015[7l\u0007,\u001aC$j\u0010T!k$\u0015OŹmj[yRL=\u0004O_~m\u001eW\u007fraSqe\u0016Р`\u000bDCJr\u001dX\u0015D\u0004\u0010ht@\"x\\1\u0015ȑ\u007fD\\+[>M\u00124:<3)\\CJ1?\tFE$m|\u0001\u0012\u0015Sy8#k*ڏ\u0017\u0015\u0001`~\u007f\u007fxw.CeĘ1A_Ja,c-\u00014+/M\u0004<$U\u000bdGz{6w[ݨ.*J=_?U\u0013=\u0001Y8\u0010Q]N\td\u0018aX\u0605z܃}\u000fI\u000ev}\u0016\u0011\t,\u000fyzSb':v\rtS\fr'\u0012at\u0007\u000eh%+iCa\u0007\u0013[LNf~\u0015).-\u0011s2~K,q&K\u001d&\u001a\u0006֕cԃmo6Ӡ3+4|}\u0014<e&o\u0011Sm8K<YY\u0005?P-\u001b\t\u0019טl͎\fB\u0011ͩ]MVK|~f:]\u000b]\u007fv\u000b<\u000f\u0007U\n9AuTұ0ʡ.sK͟djQ0)M\u0002sDޱMů\u000fJ\u0017Ϙ[\u0014?{*(M\"fW\u0011\u000b@\b\u0004\u0018dMih[¸\u000bӺ8,DފժG~"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E.|(\u0017F]\u001d8\u0006%\u0018U\u0007\u001f>mk", "", "7mXA\\(EA(z\n^", "", "", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005)p", "u(E", "4k^Df", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011W\u001eKr\"<Yk/3|\u0016\u000fTMMA", ":he27(MO'", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E.|(\u0017F]\u001d8\u0006%\u0018U\u0007\u001f>mT\u001cIT?t6\f$dp9mg=NU#VH$", "@dVB_(K", "A`e2W\u001aMO(~ek6\u000e\r.e\r", "\u001a`]1e6BR,H\tZ=|\b=t{7{\nn\u0013(Gn{Kr45F}\";{%;a\u0002)gE\u001e\u0014Vp5\u0016c\u0017[\u00018KKN92", "A`e2W\u001aMO(~ek6\u000e\r.e\r6", "1kT.e\u001a:d\u0019}hm(\f\t\u001ar\n9\u007f?\u0001$", "", "9dh", "1n]AT0Ga", "", "5dc", "\"", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "5dc\u0019\\=>2\u0015\u000ev", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E(\u0011&\u0013Dv\u000e#z658y/3C", "7mXA\\(ED\u0015\u0006\u000b^", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4?DjA(\u0019gt\u0003\u000eg-Nt;ESNuDb\u00029\u0011\u0019ZtR<\rcUP D", "5dc\u0019\\=>2\u0015\u000evB5\f\t<n{/", "6`b\u0016a0MW\u0015\u0006kZ3\r\t", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}p'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004\u0011*7t3+\u001fl`LPj0Ov%[JU,&:\u0003L\u0010\u000fa\u000e5/\u001e\u00058=3j\u001a", "5dc g(MSy\u0006\u0005p", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011]\u001d8\u0006%\u0016`\b2\r", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4IEz;\"\u001e{+7\u0011p6^\u0006+PL\\u]Y|O]\u007fi\n]+m\fcSy", "9dh@", "", "@d\\<i,", "Adc", "D`[BX", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq>", "Adc T=>R\u0007\u000evm,g\u00169v\u0004'{M", ">q^C\\+>`", "\u0011n\\=T5B]\"", "!`e6a.,b\u0015\u000ezE0\u000e\t\u000ea\u000f$", ":hU2V@<Z\u0019F\fb,\u000f\u00119d\u007f/CN|(\u0017F}\u001d8\u0006%/f}'7i$."}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SavedStateHandle {
    private static final String KEYS = "keys";
    private static final String VALUES = "values";
    private final Map<String, MutableStateFlow<Object>> flows;
    private final Map<String, SavingStateLiveData<?>> liveDatas;
    private final Map<String, Object> regular;
    private final SavedStateRegistry.SavedStateProvider savedStateProvider;
    private final Map<String, SavedStateRegistry.SavedStateProvider> savedStateProviders;
    public static final Companion Companion = new Companion(null);
    private static final Class<? extends Object>[] ACCEPTABLE_CLASSES = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    @JvmStatic
    public static final SavedStateHandle createHandle(Bundle bundle, Bundle bundle2) {
        return Companion.createHandle(bundle, bundle2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle savedStateProvider$lambda$0(SavedStateHandle this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        for (Map.Entry entry : MapsKt.toMap(this$0.savedStateProviders).entrySet()) {
            this$0.set((String) entry.getKey(), ((SavedStateRegistry.SavedStateProvider) entry.getValue()).saveState());
        }
        Set<String> setKeySet = this$0.regular.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(this$0.regular.get(str));
        }
        return BundleKt.bundleOf(TuplesKt.to("keys", arrayList), TuplesKt.to("values", arrayList2));
    }

    public SavedStateHandle(Map<String, ? extends Object> initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.regular = linkedHashMap;
        this.savedStateProviders = new LinkedHashMap();
        this.liveDatas = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.savedStateProvider = new SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.SavedStateHandle$$ExternalSyntheticLambda0
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                return SavedStateHandle.savedStateProvider$lambda$0(this.f$0);
            }
        };
        linkedHashMap.putAll(initialState);
    }

    public SavedStateHandle() {
        this.regular = new LinkedHashMap();
        this.savedStateProviders = new LinkedHashMap();
        this.liveDatas = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.savedStateProvider = new SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.SavedStateHandle$$ExternalSyntheticLambda0
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                return SavedStateHandle.savedStateProvider$lambda$0(this.f$0);
            }
        };
    }

    public final SavedStateRegistry.SavedStateProvider savedStateProvider() {
        return this.savedStateProvider;
    }

    public final boolean contains(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.regular.containsKey(key);
    }

    public final <T> MutableLiveData<T> getLiveData(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        MutableLiveData<T> liveDataInternal = getLiveDataInternal(key, false, null);
        Intrinsics.checkNotNull(liveDataInternal, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>");
        return liveDataInternal;
    }

    public final <T> MutableLiveData<T> getLiveData(String key, T t2) {
        Intrinsics.checkNotNullParameter(key, "key");
        return getLiveDataInternal(key, true, t2);
    }

    private final <T> MutableLiveData<T> getLiveDataInternal(String str, boolean z2, T t2) {
        SavingStateLiveData<?> savingStateLiveData;
        SavingStateLiveData<?> savingStateLiveData2 = this.liveDatas.get(str);
        SavingStateLiveData<?> savingStateLiveData3 = savingStateLiveData2 instanceof MutableLiveData ? savingStateLiveData2 : null;
        if (savingStateLiveData3 != null) {
            return savingStateLiveData3;
        }
        if (this.regular.containsKey(str)) {
            savingStateLiveData = new SavingStateLiveData<>(this, str, this.regular.get(str));
        } else if (z2) {
            this.regular.put(str, t2);
            savingStateLiveData = new SavingStateLiveData<>(this, str, t2);
        } else {
            savingStateLiveData = new SavingStateLiveData<>(this, str);
        }
        this.liveDatas.put(str, savingStateLiveData);
        return savingStateLiveData;
    }

    public final <T> StateFlow<T> getStateFlow(String key, T t2) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, MutableStateFlow<Object>> map = this.flows;
        MutableStateFlow<Object> MutableStateFlow = map.get(key);
        if (MutableStateFlow == null) {
            if (!this.regular.containsKey(key)) {
                this.regular.put(key, t2);
            }
            MutableStateFlow = StateFlowKt.MutableStateFlow(this.regular.get(key));
            this.flows.put(key, MutableStateFlow);
            map.put(key, MutableStateFlow);
        }
        StateFlow<T> stateFlowAsStateFlow = FlowKt.asStateFlow(MutableStateFlow);
        Intrinsics.checkNotNull(stateFlowAsStateFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.SavedStateHandle.getStateFlow>");
        return stateFlowAsStateFlow;
    }

    public final Set<String> keys() {
        return SetsKt.plus(SetsKt.plus((Set) this.regular.keySet(), (Iterable) this.savedStateProviders.keySet()), (Iterable) this.liveDatas.keySet());
    }

    public final <T> T get(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return (T) this.regular.get(key);
        } catch (ClassCastException unused) {
            remove(key);
            return null;
        }
    }

    public final <T> void set(String key, T t2) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!Companion.validateValue(t2)) {
            StringBuilder sb = new StringBuilder("Can't put value with type ");
            Intrinsics.checkNotNull(t2);
            throw new IllegalArgumentException(sb.append(t2.getClass()).append(" into saved state").toString());
        }
        SavingStateLiveData<?> savingStateLiveData = this.liveDatas.get(key);
        SavingStateLiveData<?> savingStateLiveData2 = savingStateLiveData instanceof MutableLiveData ? savingStateLiveData : null;
        if (savingStateLiveData2 != null) {
            savingStateLiveData2.setValue(t2);
        } else {
            this.regular.put(key, t2);
        }
        MutableStateFlow<Object> mutableStateFlow = this.flows.get(key);
        if (mutableStateFlow == null) {
            return;
        }
        mutableStateFlow.setValue(t2);
    }

    public final <T> T remove(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        T t2 = (T) this.regular.remove(key);
        SavingStateLiveData<?> savingStateLiveDataRemove = this.liveDatas.remove(key);
        if (savingStateLiveDataRemove != null) {
            savingStateLiveDataRemove.detach();
        }
        this.flows.remove(key);
        return t2;
    }

    public final void setSavedStateProvider(String key, SavedStateRegistry.SavedStateProvider provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.savedStateProviders.put(key, provider);
    }

    public final void clearSavedStateProvider(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.savedStateProviders.remove(key);
    }

    /* JADX INFO: compiled from: SavedStateHandle.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&˛\bDZc|İI\u0006F\u000b6Ȑ\u0007\":\u001e\u007f\u0007llA0ReP.XT0ş\u0002ڔ\\&aҕ\u007fBk[*\u007f2\t\u0016M\u0016g/i`\u001fS\u0015\u0014\u0017\u0011lBH\u0004zm\u0016\u001d5Zom7]sK>xtlӌڶ6\"F\u007fE\u0018 >X\u0016\u0005{[M\"\u0011^B\u0001>`\u0010e\u0005H\u0016ĂB \u000f%%k\\>`l\fCw6\u0011sZNUh`\u0001[\u0012^T]˙=uӿ/@E@e3a\u0004\u001fTq>1AHܸ\u0011ص+'3ɞDcD[\u0018\u0014C/&\u0558ię*\\\rĩԉ\u00103"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E.|(\u0017F]\u001d8\u0006%\u0018U\u0007\u001f>mT\u001cIT?t6\f$dp9mg=NU#VH$", "\"", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E(\u0011&\u0013Dv\u000e#z658y/3C", "6`]1_,", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E.|(\u0017F]\u001d8\u0006%\u0018U\u0007\u001f>mk", "9dh", "", "D`[BX", "uKP;W9HW\u0018\u0012De0}\t-y}/{\nn\u0013(Gn{Kr45<y)6t\u0016\u00044H7|0g\u001cdj;PQ;[z0I\"51Xcn\u0007\u001b\u000ec\u0010\u0018\u0015\n\nY?3D\b(", "uKP;W9HW\u0018\u0012De0}\t-y}/{\nn\u0013(Gn{Kr45<y)6t\u0016\u00044H7|0g\u001cdj;PQ;[z0I\"\u0012\u001d", "2dc.V/", "", "Adc#T3NS", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", ":hU2V@<Z\u0019F\fb,\u000f\u00119d\u007f/CN|(\u0017F}\u001d8\u0006%/f}'7i$."}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class SavingStateLiveData<T> extends MutableLiveData<T> {
        private SavedStateHandle handle;
        private String key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavingStateLiveData(SavedStateHandle savedStateHandle, String key, T t2) {
            super(t2);
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
            this.handle = savedStateHandle;
        }

        public SavingStateLiveData(SavedStateHandle savedStateHandle, String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
            this.handle = savedStateHandle;
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(T t2) {
            SavedStateHandle savedStateHandle = this.handle;
            if (savedStateHandle != null) {
                savedStateHandle.regular.put(this.key, t2);
                MutableStateFlow mutableStateFlow = (MutableStateFlow) savedStateHandle.flows.get(this.key);
                if (mutableStateFlow != null) {
                    mutableStateFlow.setValue(t2);
                }
            }
            super.setValue(t2);
        }

        public final void detach() {
            this.handle = null;
        }
    }

    /* JADX INFO: compiled from: SavedStateHandle.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u001a6B\u0015\"4\u0012}\u0007njG<LeN.ZS@\u000fsڔ<$q$yCAU\"}0\u0012WNmgtЁ[!¼?\u0006Dw+1OUޯa\u0012\u001d2\u000b\nM;eokB\u0011zD\u000f8487(\u00101 8T(x\u0011By\u0017X5\t\u0001H_%M3(B\fL/\u0019 rf|5\u000fq.X=$\u001byRZ7i@\u0001S\fVTU\f\r`L.n9\fՙ'٨\u0007\tZ[M\u0007\u0010}K\n\u0001'U1 ֘*͏\\\u007f\u001cƃ{[\u001bd\u000b&\u000b\u000b(ӣ^ˏ/Ok֟ם\u00128"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E.|(\u0017F]\u001d8\u0006%\u0018U\u0007\u001f>mT\fWKFg=\"\u001fq7", "", "u(E", "\u000fB2\u0012C\u001b\u001a0\u007f^t<\u0013Xv\u001dEm", "", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", ")KY.i(\bZ\u0015\b|(\n\u0004\u0005=sU", "\u0019DH ", "", "$@;\"8\u001a", "1qT.g,!O\"}\u0002^", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E.|(\u0017F]\u001d8\u0006%\u0018U\u0007\u001f>mk", "@dbAb9>R\u0007\u000evm,", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "2dU.h3MA(z\n^", "D`[6W(MS\nz\u0002n,", "", "D`[BX", ":hU2V@<Z\u0019F\fb,\u000f\u00119d\u007f/CN|(\u0017F}\u001d8\u0006%/f}'7i$."}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SavedStateHandle createHandle(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new SavedStateHandle();
                }
                HashMap map = new HashMap();
                for (String key : bundle2.keySet()) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    map.put(key, bundle2.get(key));
                }
                return new SavedStateHandle(map);
            }
            ClassLoader classLoader = SavedStateHandle.class.getClassLoader();
            Intrinsics.checkNotNull(classLoader);
            bundle.setClassLoader(classLoader);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = parcelableArrayList.get(i2);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i2));
            }
            return new SavedStateHandle(linkedHashMap);
        }

        public final boolean validateValue(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : SavedStateHandle.ACCEPTABLE_CLASSES) {
                Intrinsics.checkNotNull(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }
}
