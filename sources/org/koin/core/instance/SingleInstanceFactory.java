package org.koin.core.instance;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.definition.BeanDefinition;
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
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&˛\bDZc|İI\u0006F\u000b6B\u0005%4\u0012\u000e\u0007nj?0LeV.Zݷ2\u000f\u0002{<$a'yCI^\"Ԃ8ޛwPm˧|I\u000b\u0011S\u0011\u0016\u0016?iZI\u0016\nm\u001c\u001d3ZuO5]osʠ\u000fvȥ\t @%\u0001\r\u0013\u00072*~Ƶ'~QR$\u0012^H7Nň\u0011M\u0013#Z\u0016L*\u0019\u001e\u000br~<Vxu<E\"1v\tboe>\u000be\rt_m!?t,:X7kՖUW\u0011\u000ej[m\u000b\u0006\u0006ݘ\th50sT\u0002gNX6Ϭ[+̠\u0011]\u00017%\u0015_r$'Yb\u0014Q^\u0015@y\u0011z;DJ\"V7V2E\u001c|\u0007DޗKɄ_ĖT\u0004fB\u000e\u007fˑ:+"}, d2 = {"\u001ana4\"2HW\"Hxh9|R3n\u000e7wI~\u0017`5s\u0017>}%\u0019b\f/3v\u0014..?9z>+)>", "\"", "\u001ana4\"2HW\"Hxh9|R3n\u000e7wI~\u0017`+x\u001cKr.3Y^\u001c5| ;a\u0019", "0dP;7,?W\"\u0003\nb6\u0006", "\u001ana4\"2HW\"Hxh9|R.e\u0001,\u0005D\u0010\u001b!P9j<r.\u0014Y~$@q%2WL\u0011", "uK^?ZuD]\u001d\bD\\6\n\txd\u007f)\u007fI\u0005&\u001bQxW\u0019v!>8}!;v\u001a=QMDAw\u000f", "D`[BX", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "1qT.g,", "1n]AX?M", "\u001ana4\"2HW\"Hxh9|R3n\u000e7wI~\u0017`+x\u001cKr.3Y[*@|\u0016A\\\u0019", "uK^?ZuD]\u001d\bD\\6\n\txi\t6\u000b<\n\u0015\u0017\u0011S\u0017J\u0006!>W}}Av%.`R\u0011/\u001b#\u0011y]\u0003\u000e_5P@\u0011DQN*k(", "2q^=", "", "Ab^=X", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "2q^=43E", "5dc", "5dc#T3NS", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "7r2?X(MS\u0018", "", "9nX; *H`\u0019"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class SingleInstanceFactory<T> extends InstanceFactory<T> {
    private T value;

    /* JADX INFO: renamed from: org.koin.core.instance.SingleInstanceFactory$get$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\nND\u0005Ӭ:\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7me<^,"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        final /* synthetic */ InstanceContext $context;
        final /* synthetic */ SingleInstanceFactory<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SingleInstanceFactory<T> singleInstanceFactory, InstanceContext instanceContext) {
            super(0);
            this.this$0 = singleInstanceFactory;
            instanceContext = instanceContext;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            if (this.this$0.isCreated(instanceContext)) {
                return;
            }
            SingleInstanceFactory<T> singleInstanceFactory = this.this$0;
            ((SingleInstanceFactory) singleInstanceFactory).value = singleInstanceFactory.create(instanceContext);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleInstanceFactory(BeanDefinition<T> beanDefinition) {
        super(beanDefinition);
        Intrinsics.checkNotNullParameter(beanDefinition, "beanDefinition");
    }

    private final T getValue() {
        T t2 = this.value;
        if (t2 != null) {
            return t2;
        }
        throw new IllegalStateException("Single instance created couldn't return value".toString());
    }

    @Override // org.koin.core.instance.InstanceFactory
    public T create(InstanceContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.value == null ? (T) super.create(context) : getValue();
    }

    @Override // org.koin.core.instance.InstanceFactory
    public void drop(Scope scope) {
        Function1<T, Unit> onClose = getBeanDefinition().getCallbacks().getOnClose();
        if (onClose != null) {
            onClose.invoke(this.value);
        }
        this.value = null;
    }

    @Override // org.koin.core.instance.InstanceFactory
    public void dropAll() {
        InstanceFactory.drop$default(this, null, 1, null);
    }

    @Override // org.koin.core.instance.InstanceFactory
    public T get(InstanceContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        KoinPlatformTools.INSTANCE.m10850synchronized(this, new Function0<Unit>(this) { // from class: org.koin.core.instance.SingleInstanceFactory.get.1
            final /* synthetic */ InstanceContext $context;
            final /* synthetic */ SingleInstanceFactory<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SingleInstanceFactory<T> this, InstanceContext context2) {
                super(0);
                this.this$0 = this;
                instanceContext = context2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                if (this.this$0.isCreated(instanceContext)) {
                    return;
                }
                SingleInstanceFactory<T> singleInstanceFactory = this.this$0;
                ((SingleInstanceFactory) singleInstanceFactory).value = singleInstanceFactory.create(instanceContext);
            }
        });
        return getValue();
    }

    @Override // org.koin.core.instance.InstanceFactory
    public boolean isCreated(InstanceContext instanceContext) {
        return this.value != null;
    }
}
