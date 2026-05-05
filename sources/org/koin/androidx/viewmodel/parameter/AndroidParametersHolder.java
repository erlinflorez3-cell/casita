package org.koin.androidx.viewmodel.parameter;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.viewmodel.CreationExtras;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.core.parameter.ParametersHolder;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLш|\u0004W\u00068\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?4Le^.ZS0\u0011s{B*c$wEQ٥J}P\b\u0010qw{tJh\u000b[\u001d\u0016\u0018\tjZHkw\f\u0013w4Xn\u001e5]sK<xtd\tڶ6\"F~M,(2`\u0010=\u0004cM\u0012۵>I!B`\u0017e\t*\u0012\f?N\fNfuZNN|_J/i\f\u0018C\u0015'ۢ4|[\u001a\u000fy5\u001b\u000fad4`9;Ֆ3\\3\u000b`jW\u0003m\u0002m\rv1?/Ys]7\u0007\u000bZ)ۣS\rk\u0004n{\u0013cx\u000e=*\u0016lkR\u0014ߊ\u0006\u0004,\u0015J\u000e&\n7H4.HqN\"\u07baxraS!\u0011lE\u0018z\u0010:а)\u0006;ٿQ\u001dlWoBϳRK"}, d2 = {"\u001ana4\"2HW\"Hvg+\n\u00133d\u0013q\rD\u0001)\u001fQn\u000eC@01fy(7|\u0016;\u0017\u001fDjA(\u0019gL5\u0014_4N\u0006'TZ16cQrJi", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7mXA\\(ED\u0015\u0006\u000b^:", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EL\u0016/QL?z8(\u001e>", "3wc?T:", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(EQ\u0005\u0017)Oy\r<}n\u0013f}\u001cFq 7-VJx0,j", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u00073v\u0015;WG:~}%\u0019ia7\u001ba3N@8KL`4fQrD]og\u000eJ:\u0011\u000fb!7}Q3-]o:", "5dc\u0012k;KO'", "u(;.a+K]\u001d}\u000e(3\u0001\n/c\u0014&\u0003@J(\u001bG\u0002\u0016Fu%<#[-7i%2WL\u001b~C+\u0011v7", "1qT.g,,O*~yL;x\u0018/H{1zG\u0001\u0001$'v\u001c<", "\"", "1kPGm", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "0k^0^", "uKZ<g3B\\b\fz_3|\u0007>/e\u0006\u0003<\u000f%l.u\u0018K})>#\u00031?7\u0017>VAJo>'#2BI\u0010a;R\u00010\u0012\"\u0012\u0013aN\u00049]\u0019V\u0017Ptv\u0002^A\"}\u001a", "3kT:X5M/(", "7", "", "uH;8b;EW\"H\b^-\u0004\t-tI\u000eYG|%%\u001d3tAr61#\u0005\u001c@o_\u0018JH;iCs", "5dc\u001ce\u0015NZ ", "uKZ<g3B\\b\fz_3|\u0007>/e\u0006\u0003<\u000f%l\u000bV\u00138\b!~`y)97\u007f+RC9z\n", "9nX; (GR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class AndroidParametersHolder extends ParametersHolder {
    private final CreationExtras extras;

    /* JADX WARN: Illegal instructions before constructor call */
    public AndroidParametersHolder(Function0<? extends ParametersHolder> function0, CreationExtras extras) {
        ParametersHolder parametersHolderInvoke;
        List<Object> values;
        ArrayList mutableList;
        Intrinsics.checkNotNullParameter(extras, "extras");
        super((function0 == null || (parametersHolderInvoke = function0.invoke()) == null || (values = parametersHolderInvoke.getValues()) == null || (mutableList = CollectionsKt.toMutableList((Collection) values)) == null) ? new ArrayList() : mutableList, null, 2, null);
        this.extras = extras;
    }

    public /* synthetic */ AndroidParametersHolder(Function0 function0, CreationExtras creationExtras, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (i2 | 1) != 0 ? null : function0, creationExtras);
    }

    private final <T> T createSavedStateHandleOrElse(KClass<?> kClass, Function0<? extends T> function0) {
        return Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(SavedStateHandle.class)) ? (T) SavedStateHandleSupport.createSavedStateHandle(this.extras) : function0.invoke();
    }

    @Override // org.koin.core.parameter.ParametersHolder
    public <T> T elementAt(final int i2, final KClass<?> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (T) createSavedStateHandleOrElse(clazz, new Function0<T>() { // from class: org.koin.androidx.viewmodel.parameter.AndroidParametersHolder.elementAt.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                return (T) AndroidParametersHolder.super.elementAt(i2, clazz);
            }
        });
    }

    public final CreationExtras getExtras() {
        return this.extras;
    }

    @Override // org.koin.core.parameter.ParametersHolder
    public <T> T getOrNull(final KClass<?> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (T) createSavedStateHandleOrElse(clazz, new Function0<T>() { // from class: org.koin.androidx.viewmodel.parameter.AndroidParametersHolder.getOrNull.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                return (T) AndroidParametersHolder.super.getOrNull(clazz);
            }
        });
    }
}
