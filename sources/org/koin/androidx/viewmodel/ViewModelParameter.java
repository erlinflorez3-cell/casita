package org.koin.androidx.viewmodel;

import android.os.Bundle;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	... 4 more
    */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated(message = "\u0007K\fGvw\u0016k]Kg[@}kWj\f\u000f(\u001bw\u001e\u0012\u0006L.U]}2\\qQ{/\\`mE,\u001f6N!he")
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&˛\bDRш|İI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0Le^.ZS@\u000fsڔ<$q$yCQU\"Ԃ*\teNo˧vJp\u000bK\u000f\f!~oBկ}~c܈\u001d1jom3}ok9!VF\u000f.3:>\n\u0007\u0011\u001a`Ϻ>x\u000bKQ\f 3XrPQ;Q\u0015.\u0018\u0006L%\u0019,li^6vss9])kkXM\u0006g@\u0011S\rT]?\u001b\u0007c.+nAK\u0014SYk\thZ\u001e\u000eOuK\u0011\u0001'U8Y{]6f\u000e,\u0017AN;lę*\\\u0013a1!5,gi[R\u001e(.\u07be*\u000fʀ\b\u0014\u000eΩ`03+t\u001a^P\u0003{kN`\u0004nB.\u0005w5E+h5A8yqЂeA!\u05cbO}\u000b ,7Q\u007f/^l\u0010v\u0014IXɐU7Y̵UJT\u001fgS>\u0015~p\u001a,\u001a/u\u000f\u009e\u007f\u00176Ϗ=9aP19<\u001fVI\u007f\u0005\u0015bxS\u0018Y^?Pt~9@\bjbֈh\u000bs¬lZ2*[0%\u0016\f\u0014+ \u000b\u0005˶%+\u0018ʚgjo\u0005[xܬ)K"}, d2 = {"\u001ana4\"2HW\"Hvg+\n\u00133d\u0013q\rD\u0001)\u001fQn\u000eC@\u00169Y\u0010\bAl\u001658?Hg<\u001e$hn\u000f", "\"", "", "1kPGm", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "?tP9\\-BS&", "\u001ana4\"2HW\"Hxh9|R;u{/\u007fA\u0005\u0017$\u0011[\u001e8})6]}-\r", "AsPAX", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "\u001ana4\"2HW\"Hvg+\n\u00133d\u0013q\rD\u0001)\u001fQn\u000eC@33c\t \u0001J&7LJ;J4\u001f\u0019qeH\u000bm5$", ">`a.`,MS&\r", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EL\u0016/QL?z8(\u001e>", "DhTD@6=S l\nh9|rAn\u007f5", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0013Dc\u000b !\u007f\u001f.Z\u0019", "@dV6f;Kg\u0003\u0011\u0004^9", "\u001a`]1e6BR,H\tZ=|\b=t{7{\nn\u0013(Gn{Kr45F}\";{%;a-Mt4+j", "uKZ<g3B\\b\fz_3|\u0007>/e\u0006\u0003<\u000f%l.y\u001b>@+?]\u0007i5w#.\u0017OKg;\"\u0016laFPO<J}+HPN929xG#\u0019^\u0017\u00180\u001e\r#B4wBF#\u00125WK\u001cx\n\n%\u0012?s;\u0018=\u0016Q\t\u001cyJrmWa)zWJCq.n\u0015mf=JC\"#u#$3&\u0015\u0006\u0005R\u001e|Vxz1N\u001d{8\"RkbF\u000f`Y<\u0007\u000f)J{~\u007fAb\u0002+^?\r47\fK\u0001Tf%Hbw(uj=8&5J\";Zc?Z:\u001fh\u001eO\u0017\nq5\u001e\u0019giqW\u001c\u001bG)d5n5D(", "5dc\u0010_(Sh", "u(;8b;EW\"H\b^-\u0004\t-tI\u000eYG|%%\u001d", "5dc\u001dT9:[\u0019\u000ezk:", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", "5dc\u001eh(EW\u001a\u0003zk", "u(;<e.\bY#\u0003\u0004(*\u0007\u0016//\f8wG\u0005\u0018\u001bG|W(\u0007!<]~$7zk", "5dc\u001fX.Ba(\f\u000fH>\u0006\t<", "u(;.a+K]\u001d}\u000e(:x\u001a/d\u000e7wO\u0001`\u0005C\u0001\u000e;d41h}\r7o\u001a<\\POUF'\u0015u7", "5dc g(MS", "5dc#\\,P;#}ze\u001a\f\u0013<ei:\u0005@\u000e", "u(;.a+K]\u001d}\u000e(3\u0001\n/c\u0014&\u0003@J\b\u001bG\u0002uFu%<G\r*Dm\u007f@VCHA", "9nX; (GR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ViewModelParameter<T> {
    private final KClass<T> clazz;
    private final Function0<ParametersHolder> parameters;
    private final Qualifier qualifier;
    private final SavedStateRegistryOwner registryOwner;
    private final Function0<Bundle> state;
    private final ViewModelStoreOwner viewModelStoreOwner;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewModelParameter(KClass<T> clazz, Qualifier qualifier, Function0<Bundle> function0, Function0<? extends ParametersHolder> function02, ViewModelStoreOwner viewModelStoreOwner, SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.clazz = clazz;
        this.qualifier = qualifier;
        this.state = function0;
        this.parameters = function02;
        this.viewModelStoreOwner = viewModelStoreOwner;
        this.registryOwner = savedStateRegistryOwner;
    }

    public /* synthetic */ ViewModelParameter(KClass kClass, Qualifier qualifier, Function0 function0, Function0 function02, ViewModelStoreOwner viewModelStoreOwner, SavedStateRegistryOwner savedStateRegistryOwner, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(kClass, (i2 + 2) - (2 | i2) != 0 ? null : qualifier, (i2 + 4) - (4 | i2) != 0 ? null : function0, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? null : function02, viewModelStoreOwner, (i2 & 32) == 0 ? savedStateRegistryOwner : null);
    }

    public final KClass<T> getClazz() {
        return this.clazz;
    }

    public final Function0<ParametersHolder> getParameters() {
        return this.parameters;
    }

    public final Qualifier getQualifier() {
        return this.qualifier;
    }

    public final SavedStateRegistryOwner getRegistryOwner() {
        return this.registryOwner;
    }

    public final Function0<Bundle> getState() {
        return this.state;
    }

    public final ViewModelStoreOwner getViewModelStoreOwner() {
        return this.viewModelStoreOwner;
    }
}
