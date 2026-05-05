package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
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
/* JADX INFO: compiled from: InitializerViewModelFactory.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004O\u00158\u000bDB\u0007\"2\u0014\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<$a$wّQ٥J}P\b\u0010mw\u007f|Jr\u0017S\u0017\f\u0015\tn<I[y\f\u0014=3bsO3Spk;žx6\u0013#zMF~\u001d\u0001`0h\u0016|ٙQQ4\u0012^G!D`\u0015e\u000b*\u0014\u0016>f\u0007Le\u0018RDR\u0005]h:i\u0017ݦFN5k\u0001\u0017[\r^`7\u0015|`./P7;\u0016SU1\b)¼AƄCsE\u0005v+ݹ/V"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(EQ\u0005\u0017)Oy\r<}n\u0019b\u0002/;i\u001d2bCH\\8\u001e'Pk8\u0007j\rJt6QYb\u0002", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0010Bc\u000f$6m#l.?9z>+)>", "7mXA\\(EW.~\bl", "", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(EQ\u0005\u0017)Oy\r<}n&]}2\u001fw\u0015.T'DoC\"\u0011oeN\u0007p\u0002", "uZ;.a+K]\u001d}\u000e(3\u0001\n/c\u0014&\u0003@J(\u001bG\u0002\u0016Fu%<#n$7\u007f}8LCBO=\"$l]@\u000bx,[Lj8", ")KP;W9HW\u0018\u0012De0}\t-y}/{\n\u0012\u001b\u0017Yw\u0018;v,~J\u0002 IU -MJ\u001ft8-\u0019dh=\u001cc9$", "1qT.g,", "$L", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}z", ";nS2_\nEO'\r", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "3wc?T:", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(EQ\u0005\u0017)Oy\r<}n\u0013f}\u001cFq 7-VJx0,j", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sU\u000fwI\u007f$!Kn!\u0006})6Y{45t\u0016w^G;}<(\u0014hh\u0003dp,J\u0006+QU.?k_nKiUA\nW*\u001a\u000f]@78K; \b*]\u007fBhJ|\u001a\u000eGRzAV\u0017\u001d", ":hU2V@<Z\u0019F\fb,\u000f\u00119d\u007f/uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class InitializerViewModelFactory implements ViewModelProvider.Factory {
    private final ViewModelInitializer<?>[] initializers;

    public InitializerViewModelFactory(ViewModelInitializer<?>... initializers) {
        Intrinsics.checkNotNullParameter(initializers, "initializers");
        this.initializers = initializers;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <VM extends ViewModel> VM create(Class<VM> modelClass, CreationExtras extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        ViewModelProviders viewModelProviders = ViewModelProviders.INSTANCE;
        KClass<VM> kotlinClass = JvmClassMappingKt.getKotlinClass(modelClass);
        ViewModelInitializer<?>[] viewModelInitializerArr = this.initializers;
        return (VM) viewModelProviders.createViewModelFromInitializers$lifecycle_viewmodel_release(kotlinClass, extras, (ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length));
    }
}
