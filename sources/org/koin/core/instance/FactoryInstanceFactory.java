package org.koin.core.instance;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.scope.Scope;
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
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&˛\bDZc|İI\u0006F\u000b6B\u0005\"4\u0012\u0006\u0007nʑA0ZeP.XT2\u000f\u0002{<$a$yCI^\"Ԃ8ޛwPm˧|I\u000b\u0011S\u0011\u0016\u0016?iZI\u0016\nm\u001c\u001d3ZuO5]osʠ\u000fvȥ\t @%\u0001\n\u0013\u00052*v\u0015'\u0001QQ$\u0014F?\u001fA\u0019!\u0016\u000b(\u001a\u001e>N\u0006dp0aDQ\u0005]pǂS\u0007wLf'\u000e;CaϘJT5\u0019?q,8X7c#UY\u0011\u0011j]U\u0002m|\u0004\u0019ػ+6"}, d2 = {"\u001ana4\"2HW\"Hxh9|R3n\u000e7wI~\u0017`(k\fK\u00012I=\u0007.Fi\u001f,M$7iC(\"|7", "\"", "\u001ana4\"2HW\"Hxh9|R3n\u000e7wI~\u0017`+x\u001cKr.3Y^\u001c5| ;a\u0019", "0dP;7,?W\"\u0003\nb6\u0006", "\u001ana4\"2HW\"Hxh9|R.e\u0001,\u0005D\u0010\u001b!P9j<r.\u0014Y~$@q%2WL\u0011", "uK^?ZuD]\u001d\bD\\6\n\txd\u007f)\u007fI\u0005&\u001bQxW\u0019v!>8}!;v\u001a=QMDAw\u000f", "2q^=", "", "Ab^=X", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "2q^=43E", "5dc", "1n]AX?M", "\u001ana4\"2HW\"Hxh9|R3n\u000e7wI~\u0017`+x\u001cKr.3Y[*@|\u0016A\\\u0019", "uK^?ZuD]\u001d\bD\\6\n\txi\t6\u000b<\n\u0015\u0017\u0011S\u0017J\u0006!>W}}Av%.`R\u0011/\u001b#\u0011y]\u0003\u000e_5P@\u0011DQN*k(", "7r2?X(MS\u0018", "", "9nX; *H`\u0019"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class FactoryInstanceFactory<T> extends InstanceFactory<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FactoryInstanceFactory(BeanDefinition<T> beanDefinition) {
        super(beanDefinition);
        Intrinsics.checkNotNullParameter(beanDefinition, "beanDefinition");
    }

    @Override // org.koin.core.instance.InstanceFactory
    public void drop(Scope scope) {
        Function1<T, Unit> onClose = getBeanDefinition().getCallbacks().getOnClose();
        if (onClose != null) {
            onClose.invoke(null);
        }
    }

    @Override // org.koin.core.instance.InstanceFactory
    public void dropAll() {
    }

    @Override // org.koin.core.instance.InstanceFactory
    public T get(InstanceContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return create(context);
    }

    @Override // org.koin.core.instance.InstanceFactory
    public boolean isCreated(InstanceContext instanceContext) {
        return false;
    }
}
