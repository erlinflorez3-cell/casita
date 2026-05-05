package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.ViewModel;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.koin.androidx.viewmodel.ViewModelParameter;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.scope.Scope;
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
/* JADX INFO: compiled from: StateViewModelFactory.kt */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated(message = "8Y\u0001t\\\u0004\u001eeNP-\u0012=$0Sh2\n*\u0019w\u001ek")
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&˛\bDZc|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JiP.hS2\u000f\u0002{<$q$yّCU0}*\tUNog|VbŏK\u000f\u001c\u0016\u0001j2I[}s܈78HģM2uok9\u0011td\u0006`K2<\b\u0007\u0019\u001aXK \u0001\tGc\u0012\"2Pppĥ;Rŋ\u001e\u0012\u0014Dh\u0019,g\u007fXFJ|]h<Q\u000fRB-5\u00104\u000b\\%F\u00037Sv*Q9QO5[$s\t\rQi>+? =5l59CI\"jfb\u000e(-1_\u000fmrl[3f\u0011\u00105:gcy`T:Þ~{\u001bRT#\u0014+`4=\u001cv\bDޗ#wՂDV\nމZ\u0002\u0001hD\u001fu\u000fA-Q\u001b\u0015Tň?\u001fVљ\u0014\u0007\u0013'1\u000b\u0382%r"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E.\u0010\u0013&G`\u0012<\t\r?X}'\u0018i\u0014=WPOA", "\"", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}z", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E\u001c}%&Tk\fKd!FY|\u000eFi%.>G;}\u001c(\u0014hh\u001a\u0003a;X\u0004;\u001d", "Ab^=X", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", ">`a.`,MS&\r", "\u001ana4\"2HW\"Hvg+\n\u00133d\u0013q\rD\u0001)\u001fQn\u000eC@\u00169Y\u0010\bAl\u001658?Hg<\u001e$hn\u000f", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwIL:x>\"\u0014{+J\u000bc>V\u0001&GS\u0018\u001d`R\u0005%\u001e\u0011Z\u00159'\u001a\u0001aA3nQ\rbx", "5dc\u001dT9:[\u0019\u000ezk:", "u(;<e.\bY#\u0003\u0004((\u0006\b<o\u0004'\u000f\n\u0012\u001b\u0017Yw\u0018;v,~J\u0002 IU -MJ&gA\u001a\u001dhp9\u00149", "5dc V6IS", "u(;<e.\bY#\u0003\u0004(*\u0007\u0016//\u000e&\u0006K\u0001`\u0005Ey\u0019<L", "/cS\u0015T5=Z\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EL\u0016/QL?z8(\u001e>", "6`]1_,", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E.|(\u0017F]\u001d8\u0006%\u0018U\u0007\u001f>mk", "1qT.g,", "9dh", "", ";nS2_\nEO'\r", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u0013`y.EC|*VBHu8\u001d(2h=\bc*bt.G\u0016<(mRq+#\u000ei\u000e1'\u0016\u0004`Ay2+3(\u00079S\u0006:{J\u0013\u001a\u000f5h\u0005@]\u0010\u0011j\u0019uS\u0011rEYfO", "9nX; (GR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class StateViewModelFactory<T extends ViewModel> extends AbstractSavedStateViewModelFactory {
    private final ViewModelParameter<T> parameters;
    private final Scope scope;

    public final Scope getScope() {
        return this.scope;
    }

    public final ViewModelParameter<T> getParameters() {
        return this.parameters;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public StateViewModelFactory(Scope scope, ViewModelParameter<T> parameters) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        SavedStateRegistryOwner registryOwner = parameters.getRegistryOwner();
        if (registryOwner == null) {
            throw new IllegalStateException("Can't create SavedStateViewModelFactory without a proper stateRegistryOwner".toString());
        }
        Function0<Bundle> state = parameters.getState();
        super(registryOwner, state != null ? state.invoke() : null);
        this.scope = scope;
        this.parameters = parameters;
    }

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    protected <T extends ViewModel> T create(String key, Class<T> modelClass, SavedStateHandle handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(handle, "handle");
        return (T) this.scope.get(this.parameters.getClazz(), this.parameters.getQualifier(), addHandle(handle));
    }

    private final Function0<ParametersHolder> addHandle(final SavedStateHandle savedStateHandle) {
        final ParametersHolder parametersHolderEmptyParametersHolder;
        Function0<ParametersHolder> parameters = this.parameters.getParameters();
        if (parameters == null || (parametersHolderEmptyParametersHolder = parameters.invoke()) == null) {
            parametersHolderEmptyParametersHolder = ParametersHolderKt.emptyParametersHolder();
        }
        return new Function0<ParametersHolder>() { // from class: androidx.lifecycle.StateViewModelFactory.addHandle.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ParametersHolder invoke() {
                return parametersHolderEmptyParametersHolder.add(savedStateHandle);
            }
        };
    }
}
