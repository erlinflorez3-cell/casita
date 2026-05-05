package org.koin.androidx.viewmodel;

import androidx.lifecycle.StateViewModelFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.koin.androidx.viewmodel.factory.DefaultViewModelFactory;
import org.koin.core.scope.Scope;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d̉=!4i\bӵLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0LeN.ju8ş\u0004{b#{*wّIUB}P\nwN\u0016i\u001fTh\u000e[\u0015\u0016\u0018\tjrI\u0004|$\u0017'YPtW3\u0014o]?fҚD\u0005H2P9\"\u0005/ ZR\u001ey\u0013I[\u000e\"0\u0007phVSLŋ\u001e\u0012\u0014Eő\u0005&"}, d2 = {">hR89(<b#\f\u000f", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0010Bc\u000f$6m#l.?9z>+)>", "\"", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}z", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "DhTD@6=S ivk(\u0005\t>e\r6", "\u001ana4\"2HW\"Hvg+\n\u00133d\u0013q\rD\u0001)\u001fQn\u000eC@\u00169Y\u0010\bAl\u001658?Hg<\u001e$hn\u000f", "@db<_=>7\"\r\nZ5z\t", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0010Bc\u000f$6m#\u0004", "uKP;W9HW\u0018\u0012De0}\t-y}/{\nq\u001b\u0017YW\u0018;v, f\b1;l\u0016;#*Ex6g\u001breBP_5M\u00041KKaumVrO\u001c\u001cY\u000eUt}\tYS\fxC7&r(V}Ch\u0010\f#cxQlKU\u001dQ}\u0014\t\u000b0lGY]\u000eEHE,\u001bh\fq\u0005f9:+i", "9nX; (GR&\t~]&\n\t6e{6{"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ViewModelResolverKt {
    @Deprecated(message = "\u0007K\fGvw\u0016k]Kg[@}kWj\f\u000f(\u001bw\u001e\u0012\u0006L.U]}2\\qQ{/\\`mE,\u001f6N!he")
    @InterfaceC1492Gx
    public static final <T extends ViewModel> ViewModelProvider.Factory pickFactory(Scope scope, ViewModelParameter<T> viewModelParameters) {
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(viewModelParameters, "viewModelParameters");
        return (viewModelParameters.getRegistryOwner() == null || viewModelParameters.getState() == null) ? new DefaultViewModelFactory(scope, viewModelParameters) : new StateViewModelFactory(scope, viewModelParameters);
    }

    @Deprecated(message = "\u0007K\fGvw\u0016k]Kg[@}kWj\f\u000f(\u001bw\u001e\u0012\u0006L.U]}2\\qQ{/\\`mE,\u001f6N!he")
    @InterfaceC1492Gx
    public static final <T extends ViewModel> T resolveInstance(ViewModelProvider viewModelProvider, ViewModelParameter<T> viewModelParameters) {
        Intrinsics.checkNotNullParameter(viewModelProvider, "<this>");
        Intrinsics.checkNotNullParameter(viewModelParameters, "viewModelParameters");
        Class<T> javaClass = JvmClassMappingKt.getJavaClass((KClass) viewModelParameters.getClazz());
        return viewModelParameters.getQualifier() != null ? (T) viewModelProvider.get(viewModelParameters.getQualifier().toString(), javaClass) : (T) viewModelProvider.get(javaClass);
    }
}
