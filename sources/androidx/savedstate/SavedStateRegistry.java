package androidx.savedstate;

import android.os.Bundle;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.Recreator;
import java.util.Map;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: SavedStateRegistry.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146Ȑ\u0007\"B\u0012\u007f\u0007tvA0ZeP.XY2\u000f\u0002{<řc$\bCCU \u007f*\t]No˧vJp\u000bK\u000f\f\u001e\u0001jBI]xs\u0012\u00172HrE8cڎ[`\u0011td\u0004X3H_\"E\u0006 ݒН\u0014v\tC\u0014\u001c BXrPQ;^5\u001e \u0019V /##l\u0017DV\u0001u<E\"1orR5rH|{\u0012\u000fg5\"\u000faLAp;C,=S1\u001f\u0019Zύ\u0007?wVM}5ACI\"mf^\u000e/--e\f\f\u0004l[ԇU`\u0012Cs]qhh\u000eV\u000e+\u007f\u001bZ\u001c\u000e48\u000f3u0t'&3#\t\u0004D^\u0015vB.\u007f\u0012:%E\u00183Y?ak\u001awI:f7*\u001b=*1#\u0007)kX\u0014_%\u001b\u0003\u001c\u007fT\u0018E\u0006V\\/q=\u001c\u001a!f\u0010=\u001c0u\u0005u\u0001a:%&O[g%wȀ\u000eҩHg~ݓ1\u0001aljTP$~\u0016e/\u0019\u000ejD\u0013\u000b\u001aT+Г.ҭQ\u001c\\͵N !'twj#{ĬZћlurܔu\f+7t@ypq\u0018eD/QC^{\u0010\u0010T'\u0018MHz\u0005\u0007hx\u0019J\u001b3̬.ĘLp\u0018Ǯ\u0014FT\u0019!;\u0010\u007f*BD3/[CWYٟN˩\u0001\tgʳ9\u001e\rdK&\u0019hR\u0006_ə\\ʷtooծ͋0&"}, d2 = {"\u001a`]1e6BR,H\tZ=|\b=t{7{\nn\u0013(Gn{Kr45F}\";{%;a\u0019", "", "u(E", "/sc.V/>R", "", "1n\\=b5>\\(\r", "\u001a`]1e6BR,Hvk*\u007fR-o\r(ED\n&\u0017Tx\nC@\u00131Z}\u0004Fm#*JJ;S0)j", "", "\u001a`]1e6BR,H\tZ=|\b=t{7{\nn\u0013(Gn{Kr45F}\";{%;a\u0002)gE\u001e\u0014Vp5\u0016c\u0017[\u00018KKN92", "7r09_6PW\"\u0001hZ=\u0001\u00121S\u000f$\u000b@", "7r09_6PW\"\u0001hZ=\u0001\u00121S\u000f$\u000b@?%\u0013Xo\rJ\u0006!DYw-7t\u0016*[C", "u(I", "Adc\u000e_3He\u001d\b|L(\u000e\r8gm7wO\u0001U%C\u0001\u000e;\u000541h}\u001aDm\u001d.IQ;", "uY\u0018#", "\nrTA \u0006\u0017", "7rA2f;H`\u0019}", "@dR?X(M]&i\bh=\u0001\b/r", "\u001a`]1e6BR,H\tZ=|\b=t{7{\nm\u0017\u0015To\nK\u00012sGy17l\u0004=IR;VA(&l`9\u00149", "@dbAb9>R\u0007\u000evm,", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "1n]@h4>@\u0019\r\nh9|\b\u001dt{7{!\u000b$|G\u0004", "9dh", "5dc T=>R\u0007\u000evm,g\u00169v\u0004'{M", ">da3b9F/(\u000ev\\/", "", ":hU2V@<Z\u0019", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvz", ">da3b9F/(\u000ev\\/;\u0017+v\u007f'\nO|&\u0017A|\u000eCv!CY", ">da3b9F@\u0019\r\nh9|", "A`e2W\u001aMO(~", ">da3b9F@\u0019\r\nh9|G=a\u0011(zN\u0010\u0013&Gi\u001b<}%1g}", ">da3b9FA\u0015\u0010z", "=tc\u000fh5=Z\u0019", "@dV6f;>`\u0007z\f^+j\u0018+t\u007f\u0013\tJ\u0012\u001b\u0016G|", ">q^C\\+>`", "@t]\u001ca\u0015>f(kz\\9|\u0005>i\n1", "1kPGm", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "\u001a`]1e6BR,H\tZ=|\b=t{7{\nn\u0013(Gn{Kr45F}\";{%;a\u0002\u0017{C(\u0002h_F\u0007_;Nu|", "Cma2Z0Lb\u0019\fhZ=|\b\u001dt{7{+\u000e!(Kn\u000eI", "\u000ftc<E,<`\u0019z\n^+", "\u0011n\\=T5B]\"", "!`e2W\u001aMO(~ek6\u000e\r.e\r", "A`e2W:MO(~tk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SavedStateRegistry {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final String SAVED_COMPONENTS_KEY = "androidx.lifecycle.BundlableSavedStateRegistry.key";
    private boolean attached;
    private final SafeIterableMap<String, SavedStateProvider> components = new SafeIterableMap<>();
    private boolean isAllowingSavingState = true;
    private boolean isRestored;
    private Recreator.SavedStateProvider recreatorProvider;
    private Bundle restoredState;

    /* JADX INFO: compiled from: SavedStateRegistry.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\u0015\"4ߚ}k|ʑi0rd\u0011<`SB\u000f\u001a|d(i&\nCiX`\"Ζ\bѧȡgkvL`*q\u000eَ\u001a|͔0H"}, d2 = {"\u001a`]1e6BR,H\tZ=|\b=t{7{\nn\u0013(Gn{Kr45F}\";{%;a\u0002\u0017{C(\u0002h_F\u0007_;Nu|", "", "=mA2V9>O(~y", "", "=v]2e", "\u001a`]1e6BR,H\tZ=|\b=t{7{\nn\u0013(Gn{Kr45F}\";{%;a-Mt4+j", "A`e2W:MO(~tk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface AutoRecreated {
        void onRecreated(SavedStateRegistryOwner savedStateRegistryOwner);
    }

    /* JADX INFO: compiled from: SavedStateRegistry.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u000eӵLш|\u0004W\u00068é4ɷպ!Bߚ(\u0007\u0015i\u00026Re`.\u0001Tp3ԿzéŜ[(yEAtH|͆\rQɟkf"}, d2 = {"\u001a`]1e6BR,H\tZ=|\b=t{7{\nn\u0013(Gn{Kr45F}\";{%;a\u0002)gE\u001e\u0014Vp5\u0016c\u0017[\u00018KKN92", "", "A`e2F;:b\u0019", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "A`e2W:MO(~tk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface SavedStateProvider {
        Bundle saveState();
    }

    public final boolean isRestored() {
        return this.isRestored;
    }

    public final boolean isAllowingSavingState$savedstate_release() {
        return this.isAllowingSavingState;
    }

    public final void setAllowingSavingState$savedstate_release(boolean z2) {
        this.isAllowingSavingState = z2;
    }

    public final Bundle consumeRestoredStateForKey(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.isRestored) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.restoredState;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.restoredState;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.restoredState;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.restoredState = null;
        }
        return bundle2;
    }

    public final void registerSavedStateProvider(String key, SavedStateProvider provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (this.components.putIfAbsent(key, provider) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final SavedStateProvider getSavedStateProvider(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        for (Map.Entry<String, SavedStateProvider> components : this.components) {
            Intrinsics.checkNotNullExpressionValue(components, "components");
            String key2 = components.getKey();
            SavedStateProvider value = components.getValue();
            if (Intrinsics.areEqual(key2, key)) {
                return value;
            }
        }
        return null;
    }

    public final void unregisterSavedStateProvider(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.components.remove(key);
    }

    public final void runOnNextRecreation(Class<? extends AutoRecreated> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (!this.isAllowingSavingState) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        Recreator.SavedStateProvider savedStateProvider = this.recreatorProvider;
        if (savedStateProvider == null) {
            savedStateProvider = new Recreator.SavedStateProvider(this);
        }
        this.recreatorProvider = savedStateProvider;
        try {
            clazz.getDeclaredConstructor(new Class[0]);
            Recreator.SavedStateProvider savedStateProvider2 = this.recreatorProvider;
            if (savedStateProvider2 != null) {
                String name = clazz.getName();
                Intrinsics.checkNotNullExpressionValue(name, "clazz.name");
                savedStateProvider2.add(name);
            }
        } catch (NoSuchMethodException e2) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
        }
    }

    public final void performAttach$savedstate_release(Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (this.attached) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: androidx.savedstate.SavedStateRegistry$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                SavedStateRegistry.performAttach$lambda$4(this.f$0, lifecycleOwner, event);
            }
        });
        this.attached = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void performAttach$lambda$4(SavedStateRegistry this$0, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.Event.ON_START) {
            this$0.isAllowingSavingState = true;
        } else if (event == Lifecycle.Event.ON_STOP) {
            this$0.isAllowingSavingState = false;
        }
    }

    public final void performRestore$savedstate_release(Bundle bundle) {
        if (!this.attached) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (this.isRestored) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        this.restoredState = bundle != null ? bundle.getBundle(SAVED_COMPONENTS_KEY) : null;
        this.isRestored = true;
    }

    public final void performSave(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.restoredState;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        SafeIterableMap<String, SavedStateProvider>.IteratorWithAdditions iteratorWithAdditions = this.components.iteratorWithAdditions();
        Intrinsics.checkNotNullExpressionValue(iteratorWithAdditions, "this.components.iteratorWithAdditions()");
        SafeIterableMap<String, SavedStateProvider>.IteratorWithAdditions iteratorWithAdditions2 = iteratorWithAdditions;
        while (iteratorWithAdditions2.hasNext()) {
            Map.Entry next = iteratorWithAdditions2.next();
            bundle.putBundle((String) next.getKey(), ((SavedStateProvider) next.getValue()).saveState());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle(SAVED_COMPONENTS_KEY, bundle);
    }

    /* JADX INFO: compiled from: SavedStateRegistry.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӯ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٨lԥ&\tWȞ˝kq"}, d2 = {"\u001a`]1e6BR,H\tZ=|\b=t{7{\nn\u0013(Gn{Kr45F}\";{%;a\u0002\u0019u<)\u0011qeC\u00109", "", "u(E", "!@E\u00127&\u001c=\u0001idG\few\u001d_e\bo", "", "A`e2W:MO(~tk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
