package org.koin.androidx.viewmodel.factory;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.koin.androidx.viewmodel.parameter.AndroidParametersHolder;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
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
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0016DLш|\u0004W\u00068\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fs{J$c$\bCCU \u007f*\teNo˧vJp\u000bK\u000f\f\u0016\u000f̓\\I\u0004w\u001eQ\u001f>PoW;]sC8ptd\u0007N32<\b\b\u0019\u001aXL ~\u0001CY\u0011*2VohX\u001da\u000b\u001a \rV.\u0011 lg|?^k\fB\u0018%\u0019h!XϮc0\u000bXUqb3%v(+KF=ߎ#2{\u00035T\fI\u0011M\nC\u0015j7'qV\"ff\\\u000e$-+}\u001e$\u0007͉`\u0005_r\\;9O{S`\u0012.v\u000b{;>2\u000f\\άJͶ1\u001anڜ^M\u0003ykN`\u0004nB.\u0004w5E-h5A8yp(Ĩ=ϭR7\u0004˜],1\u0006\u0007#qS<fkÔVɐU1Y̵\u000eT\\\rq=\u001c\bGê\u0004ò\b0Oĉ¤\u007f$"}, d2 = {"\u001ana4\"2HW\"Hvg+\n\u00133d\u0013q\rD\u0001)\u001fQn\u000eC@&1W\r*D\u0002_\u0014WGD\\8\u001e'Pk8\u0007j\rJt6QYb\u0002", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0010Bc\u000f$6m#l.?9z>+)>", "9B[.f:", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}z", "Ab^=X", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "?tP9\\-BS&", "\u001ana4\"2HW\"Hxh9|R;u{/\u007fA\u0005\u0017$\u0011[\u001e8})6]}-\r", ">`a.`:", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EL\u0016/QL?z8(\u001e>", "uKZ<g3B\\b\fz_3|\u0007>/e\u0006\u0003<\u000f%l.y\u001b>@+?]\u0007i5w#.\u0017Q9u?\u001e^V_C\u0012c\u00025\u00014I\u0016T6`[<;\u001e\u001fZWZ;\t\f]B(nQ\u0001\u000b\u0018(P\u0006<l\u0001\u0019kt;t\u007fIZ\u0019\u0011~&}\u000b*xOWn}QJS,\u000bt\u0015],`DCni5\n", "1qT.g,", "\"", ";nS2_\nEO'\r", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "3wc?T:", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(EQ\u0005\u0017)Oy\r<}n\u0013f}\u001cFq 7-VJx0,j", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sU\u000fwI\u007f$!Kn!\u0006})6Y{45t\u0016w^G;}<(\u0014hh\u0003dp,J\u0006+QU.?k_nKiUA\nW*\u001a\u000f]@78K; \b*]\u007fBhJ|\u001a\u000eGRzAV\u0017\u001d", "9nX; (GR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class KoinViewModelFactory implements ViewModelProvider.Factory {
    private final KClass<? extends ViewModel> kClass;
    private final Function0<ParametersHolder> params;
    private final Qualifier qualifier;
    private final Scope scope;

    /* JADX WARN: Multi-variable type inference failed */
    public KoinViewModelFactory(KClass<? extends ViewModel> kClass, Scope scope, Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.kClass = kClass;
        this.scope = scope;
        this.qualifier = qualifier;
        this.params = function0;
    }

    public /* synthetic */ KoinViewModelFactory(KClass kClass, Scope scope, Qualifier qualifier, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(kClass, scope, (i2 + 4) - (4 | i2) != 0 ? null : qualifier, (i2 + 8) - (i2 | 8) != 0 ? null : function0);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        final AndroidParametersHolder androidParametersHolder = new AndroidParametersHolder(this.params, extras);
        return (T) this.scope.get(this.kClass, this.qualifier, new Function0<ParametersHolder>() { // from class: org.koin.androidx.viewmodel.factory.KoinViewModelFactory.create.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ParametersHolder invoke() {
                return androidParametersHolder;
            }
        });
    }
}
