package org.koin.androidx.viewmodel;

import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.Deprecated;
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
/* JADX INFO: loaded from: classes2.dex */
@Deprecated(message = "\u0015K\fArw\u001a[\u0018IA:F\u001e1eI[\r,\u0011[ a\tK]\u0002\\y6")
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\floOӄbnx.\u0001Rb\u000et<K4_2q[;\u0004\u001b\u000e*\u000fO\\i\u007fp`Y9FǇ\n\u0016\u0007n|Zczu\u0014%1prУ7SwމQbz;\u0013&\u00031Fy\u001d\u0001H+Н\u0014|\u0003ŏc\u000e\u00187NxĖV\u0017"}, d2 = {"\u001ana4\"2HW\"Hvg+\n\u00133d\u0013q\rD\u0001)\u001fQn\u000eC@\u00169Y\u0010\bAl\u001657UDkAs", "", "As^?X\u0016P\\\u0019\f", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0013Dc\u000b !\u007f\u001f.Z\u0019", "AsPAX\u0019>U\u001d\r\nk@", "\u001a`]1e6BR,H\tZ=|\b=t{7{\nn\u0013(Gn{Kr45F}\";{%;a-Mt4+j", "uKP;W9HW\u0018\u0012De0}\t-y}/{\nq\u001b\u0017YW\u0018;v,#h\b-7W(7MP\u0011R0'\u0014uk=\u0006vu\\r8GK\\;Xar\u0007\u0002\u000ek\u000eM\u0019\u001c\u0001hA\u0011nF;-\u00179]kMq\u0001\u0019kQ&", "5dc g(MS\u0006~|b:\f\u0016C", "u(;.a+K]\u001d}\u000e(:x\u001a/d\u000e7wO\u0001`\u0005C\u0001\u000e;d41h}\r7o\u001a<\\POUF'\u0015u7", "5dc g6KS\u0003\u0011\u0004^9", "u(;.a+K]\u001d}\u000e(3\u0001\n/c\u0014&\u0003@J\b\u001bG\u0002uFu%<G\r*Dm\u007f@VCHA", "\u0011n\\=T5B]\"", "9nX; (GR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ViewModelOwner {
    public static final Companion Companion = new Companion(null);
    private final SavedStateRegistryOwner stateRegistry;
    private final ViewModelStoreOwner storeOwner;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0LeN/Xݾ+%ӆ,4RZdvI;ڈ\u001e}0\t\u0018\\uh\u0007J\t\rs\u0013\u0014\u0019\u0011jZM\u001c}&,\u001d3Zom5}sK<xtd\tP:(8\b\n\u0019\u001c@G>|AH\u0014\u001a 7XphT=Q\u0013\"*\u0006l\u001fG#֚kW"}, d2 = {"\u001ana4\"2HW\"Hvg+\n\u00133d\u0013q\rD\u0001)\u001fQn\u000eC@\u00169Y\u0010\bAl\u001657UDkA\\rriD\u0003l0X\u007f|", "", "u(E", "4q^:", "\u001ana4\"2HW\"Hvg+\n\u00133d\u0013q\rD\u0001)\u001fQn\u000eC@\u00169Y\u0010\bAl\u001657UDkAs", "As^?X\u0016P\\\u0019\f", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0013Dc\u000b !\u007f\u001f.Z\u0019", "AsPAX\u0019>U\u001d\r\nk@", "\u001a`]1e6BR,H\tZ=|\b=t{7{\nn\u0013(Gn{Kr45F}\";{%;a-Mt4+j", "4q^:45R", "=v]2e", "9nX; (GR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ViewModelOwner from$default(Companion companion, ViewModelStoreOwner viewModelStoreOwner, SavedStateRegistryOwner savedStateRegistryOwner, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                savedStateRegistryOwner = null;
            }
            return companion.from(viewModelStoreOwner, savedStateRegistryOwner);
        }

        @Deprecated(message = "\u0015K\fArw\u001a[\u0018IA:F\u001e1eI[\r,\u0011[ a\tK]\u0002\\y6")
        @InterfaceC1492Gx
        public final ViewModelOwner from(ViewModelStoreOwner storeOwner) {
            Intrinsics.checkNotNullParameter(storeOwner, "storeOwner");
            return new ViewModelOwner(storeOwner, null, 2, 0 == true ? 1 : 0);
        }

        @Deprecated(message = "\u0015K\fArw\u001a[\u0018IA:F\u001e1eI[\r,\u0011[ a\tK]\u0002\\y6")
        @InterfaceC1492Gx
        public final ViewModelOwner from(ViewModelStoreOwner storeOwner, SavedStateRegistryOwner savedStateRegistryOwner) {
            Intrinsics.checkNotNullParameter(storeOwner, "storeOwner");
            return new ViewModelOwner(storeOwner, savedStateRegistryOwner);
        }

        @Deprecated(message = "\u0015K\fArw\u001a[\u0018IA:F\u001e1eI[\r,\u0011[ a\tK]\u0002\\y6")
        @InterfaceC1492Gx
        public final ViewModelOwner fromAny(Object owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            return new ViewModelOwner((ViewModelStoreOwner) owner, owner instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) owner : null);
        }
    }

    public ViewModelOwner(ViewModelStoreOwner storeOwner, SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(storeOwner, "storeOwner");
        this.storeOwner = storeOwner;
        this.stateRegistry = savedStateRegistryOwner;
    }

    public /* synthetic */ ViewModelOwner(ViewModelStoreOwner viewModelStoreOwner, SavedStateRegistryOwner savedStateRegistryOwner, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewModelStoreOwner, (i2 + 2) - (i2 | 2) != 0 ? null : savedStateRegistryOwner);
    }

    public final SavedStateRegistryOwner getStateRegistry() {
        return this.stateRegistry;
    }

    public final ViewModelStoreOwner getStoreOwner() {
        return this.storeOwner;
    }
}
