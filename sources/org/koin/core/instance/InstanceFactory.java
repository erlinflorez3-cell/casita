package org.koin.core.instance;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.error.InstanceCreationException;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;
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
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&˛\bDRш|\u0004W\u00068é6B\u0015\"4\u0012}\nnjO0LeN.ZS8\u000fsڔ<$q$yCAU\"}0\u0012WNmhvJh\u0011K\u000f\f\u0017~\u000fBկs\u0010\u0006\u0014\u0015˰Pno7{o&9?un\u00047r3H\u0004\u0013\u000320X\u0012\u0007zyŷ:\u0015ضDpHVU`\u0013!*\u0006tĨ1\"jof6vu$Nǥ'\u0003wL\u00179m;\u0015M;R\u0005/\u0013vo+CBM4C3\u001a'OXiN\u001b? IK\ro89Y\fWdi0\u001a#=g\u000fsqT\\Kŀ`T:9b{K\u0007ʫX{\t\u0004%<2\u0017LKρ2-(pP\u0014A\t\u000bSneHr\u000b\u0012\twN\u0017S\u0011c3?\u001btYy=/Me\u0005K1n8\u000fp9ad\u0010p\u0015QƘ&TśUFEʰf\f_B{\n\u0378f\u001a"}, d2 = {"\u001ana4\"2HW\"Hxh9|R3n\u000e7wI~\u0017`+x\u001cKr.3Y^\u001c5| ;a\u0019", "\"", "", "\u001ana4\"2HW\"H\u0003iuc\u0013-k{%\u0003@V", "0dP;7,?W\"\u0003\nb6\u0006", "\u001ana4\"2HW\"Hxh9|R.e\u0001,\u0005D\u0010\u001b!P9j<r.\u0014Y~$@q%2WL\u0011", "uK^?ZuD]\u001d\bD\\6\n\txd\u007f)\u007fI\u0005&\u001bQxW\u0019v!>8}!;v\u001a=QMDAw\u000f", "5dc\u000fX(G2\u0019\u007f~g0\f\r9n", "u(;<e.\bY#\u0003\u0004(*\u0007\u0016//~(|D\n\u001b&Ky\u0017\u0006S%1b\\ 8q\u001f2\\GEt\n", "1qT.g,", "1n]AX?M", "\u001ana4\"2HW\"Hxh9|R3n\u000e7wI~\u0017`+x\u001cKr.3Y[*@|\u0016A\\\u0019", "uK^?ZuD]\u001d\bD\\6\n\txi\t6\u000b<\n\u0015\u0017\u0011S\u0017J\u0006!>W}}Av%.`R\u0011/\u001b#\u0011y]\u0003\u000e_5P@\u0011DQN*k(", "2q^=", "", "Ab^=X", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "2q^=43E", "3pd._:", "", "=sW2e", "5dc", "6`b566=S", "", "7r2?X(MS\u0018", "\u0011n\\=T5B]\"", "9nX; *H`\u0019"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public abstract class InstanceFactory<T> {
    public static final Companion Companion = new Companion(null);
    public static final String ERROR_SEPARATOR = "\n\t";
    private final BeanDefinition<T> beanDefinition;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٬lԥ&\tWȞ˝kq"}, d2 = {"\u001ana4\"2HW\"Hxh9|R3n\u000e7wI~\u0017`+x\u001cKr.3Y^\u001c5| ;a\u0002\u0019u<)\u0011qeC\u00109", "", "u(E", "\u0013QA\u001cE&,3\u0004Zg:\u001bfu", "", "9nX; *H`\u0019"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public InstanceFactory(BeanDefinition<T> beanDefinition) {
        Intrinsics.checkNotNullParameter(beanDefinition, "beanDefinition");
        this.beanDefinition = beanDefinition;
    }

    public static /* synthetic */ void drop$default(InstanceFactory instanceFactory, Scope scope, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drop");
        }
        if ((i2 + 1) - (i2 | 1) != 0) {
            scope = null;
        }
        instanceFactory.drop(scope);
    }

    public static /* synthetic */ boolean isCreated$default(InstanceFactory instanceFactory, InstanceContext instanceContext, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isCreated");
        }
        if ((i2 + 1) - (i2 | 1) != 0) {
            instanceContext = null;
        }
        return instanceFactory.isCreated(instanceContext);
    }

    public T create(InstanceContext context) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getLogger().debug("| (+) '" + this.beanDefinition + '\'');
        try {
            ParametersHolder parameters = context.getParameters();
            if (parameters == null) {
                parameters = ParametersHolderKt.emptyParametersHolder();
            }
            return this.beanDefinition.getDefinition().invoke(context.getScope(), parameters);
        } catch (Exception e2) {
            context.getLogger().error("* Instance creation error : could not create instance for '" + this.beanDefinition + "': " + KoinPlatformTools.INSTANCE.getStackTrace(e2));
            throw new InstanceCreationException("Could not create instance for '" + this.beanDefinition + '\'', e2);
        }
    }

    public abstract void drop(Scope scope);

    public abstract void dropAll();

    public boolean equals(Object obj) {
        InstanceFactory instanceFactory = obj instanceof InstanceFactory ? (InstanceFactory) obj : null;
        return Intrinsics.areEqual(this.beanDefinition, instanceFactory != null ? instanceFactory.beanDefinition : null);
    }

    public abstract T get(InstanceContext instanceContext);

    public final BeanDefinition<T> getBeanDefinition() {
        return this.beanDefinition;
    }

    public int hashCode() {
        return this.beanDefinition.hashCode();
    }

    public abstract boolean isCreated(InstanceContext instanceContext);
}
