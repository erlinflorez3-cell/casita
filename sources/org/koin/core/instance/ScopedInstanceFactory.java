package org.koin.core.instance;

import java.util.HashMap;
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
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&˛\bDZc|İI\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007njG<Le^.ZS@\u000fs{:$c$\bCCU }*\t]No˧vJp\u000bK\u000f\f\u0017\u0001j:R]xc\u0013\u00172PģG\u074ccڎe;fҚD\u0004P82:\n\u0005G\u0019XHP\b\u000bMY\r*6PrJRC˟3\u001cŪ\n>.\u0004fouWNH#җj31\r\u0002B|2&DƊQ\rT`o\u001d\u0005n6+nEe\u001b3b\u001b\thZm\u0013\u0006\u0006\u0006\u000bv8?+w\u0002\u001eJ!\u0013\"'COCƞ#*j\u000fi`:2qcӍOP\u001c4@\u000b\n T\u0004<\u001aWN<72h\u001e\ra\u007f9g\th\u0010sZ\u007f)of\u001f3\u0016K/g!OQ@BIRE\u0013\u001d\rL;Q\u001f/_l2p\u001b+X&W\u001aQ\u001fDXP\u001aYsЧ2uK\u0012:\n@K.5d\u0011\r\u001e59k9YܩJ\n\u001fֶsЛ\t`pׅ\u05c8Va"}, d2 = {"\u001ana4\"2HW\"Hxh9|R3n\u000e7wI~\u0017`5m\u0018Gv$\u0019b\f/3v\u0014..?9z>+)>", "\"", "\u001ana4\"2HW\"Hxh9|R3n\u000e7wI~\u0017`+x\u001cKr.3Y^\u001c5| ;a\u0019", "0dP;7,?W\"\u0003\nb6\u0006", "\u001ana4\"2HW\"Hxh9|R.e\u0001,\u0005D\u0010\u001b!P9j<r.\u0014Y~$@q%2WL\u0011", "uK^?ZuD]\u001d\bD\\6\n\txd\u007f)\u007fI\u0005&\u001bQxW\u0019v!>8}!;v\u001a=QMDAw\u000f", "D`[BX:", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u0017a\u000b}", "", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roq\u001bL", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E#|%\u001a/k\u0019\u0012", "1qT.g,", "1n]AX?M", "\u001ana4\"2HW\"Hxh9|R3n\u000e7wI~\u0017`+x\u001cKr.3Y[*@|\u0016A\\\u0019", "uK^?ZuD]\u001d\bD\\6\n\txi\t6\u000b<\n\u0015\u0017\u0011S\u0017J\u0006!>W}}Av%.`R\u0011/\u001b#\u0011y]\u0003\u000e_5P@\u0011DQN*k(", "2q^=", "", "Ab^=X", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "2q^=43E", "5dc", "7r2?X(MS\u0018", "", "@dU?X:A7\"\r\nZ5z\t", "Ab^=X\u0010\u001d", "7mbAT5<S", "", "9nX; *H`\u0019"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ScopedInstanceFactory<T> extends InstanceFactory<T> {
    private HashMap<String, T> values;

    /* JADX INFO: renamed from: org.koin.core.instance.ScopedInstanceFactory$get$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\nND\u0005Ӭ:\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7me<^,"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        final /* synthetic */ InstanceContext $context;
        final /* synthetic */ ScopedInstanceFactory<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ScopedInstanceFactory<T> scopedInstanceFactory, InstanceContext instanceContext) {
            super(0);
            this.this$0 = scopedInstanceFactory;
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
            ((ScopedInstanceFactory) this.this$0).values.put(instanceContext.getScope().getId(), this.this$0.create(instanceContext));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScopedInstanceFactory(BeanDefinition<T> beanDefinition) {
        super(beanDefinition);
        Intrinsics.checkNotNullParameter(beanDefinition, "beanDefinition");
        this.values = new HashMap<>();
    }

    @Override // org.koin.core.instance.InstanceFactory
    public T create(InstanceContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.values.get(context.getScope().getId()) == null) {
            return (T) super.create(context);
        }
        T t2 = this.values.get(context.getScope().getId());
        if (t2 != null) {
            return t2;
        }
        throw new IllegalStateException(("Scoped instance not found for " + context.getScope().getId() + " in " + getBeanDefinition()).toString());
    }

    @Override // org.koin.core.instance.InstanceFactory
    public void drop(Scope scope) {
        if (scope != null) {
            Function1<T, Unit> onClose = getBeanDefinition().getCallbacks().getOnClose();
            if (onClose != null) {
                onClose.invoke(this.values.get(scope.getId()));
            }
            this.values.remove(scope.getId());
        }
    }

    @Override // org.koin.core.instance.InstanceFactory
    public void dropAll() {
        this.values.clear();
    }

    @Override // org.koin.core.instance.InstanceFactory
    public T get(InstanceContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!Intrinsics.areEqual(context.getScope().getScopeQualifier(), getBeanDefinition().getScopeQualifier())) {
            throw new IllegalStateException(("Wrong Scope: trying to open instance for " + context.getScope().getId() + " in " + getBeanDefinition()).toString());
        }
        KoinPlatformTools.INSTANCE.m10850synchronized(this, new Function0<Unit>(this) { // from class: org.koin.core.instance.ScopedInstanceFactory.get.1
            final /* synthetic */ InstanceContext $context;
            final /* synthetic */ ScopedInstanceFactory<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ScopedInstanceFactory<T> this, InstanceContext context2) {
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
                ((ScopedInstanceFactory) this.this$0).values.put(instanceContext.getScope().getId(), this.this$0.create(instanceContext));
            }
        });
        T t2 = this.values.get(context2.getScope().getId());
        if (t2 != null) {
            return t2;
        }
        throw new IllegalStateException(("Scoped instance not found for " + context2.getScope().getId() + " in " + getBeanDefinition()).toString());
    }

    @Override // org.koin.core.instance.InstanceFactory
    public boolean isCreated(InstanceContext instanceContext) {
        Scope scope;
        return this.values.get((instanceContext == null || (scope = instanceContext.getScope()) == null) ? null : scope.getId()) != null;
    }

    public final void refreshInstance(String scopeID, Object instance) {
        Intrinsics.checkNotNullParameter(scopeID, "scopeID");
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.values.put(scopeID, instance);
    }
}
