package androidx.lifecycle;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
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
/* JADX INFO: compiled from: Lifecycle.jvm.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u000e\u0007nʑA0ZeP.hS2\u000fy{<$iҕyCQU\"}(\u000bUr}˧\u001fJ\t\n\u0004\u0014\fǝѱn,WUA\u0012 \u0014JB\u001eEcr}DQ\u0002z5\u0015\"B\"fx\u0015\t*0X\u0012\u0007zqU:\u001b@D\u0001<h\f{\u0010H\u001aĂB \u0007*#lߑ:Hzj\u0003c1\u0011\u0002B|-\u0010U\u000bT%gZ&\u001dxq\u001eY?G=%+c\u0005\u0017R\nI1H\u0002A\u0015j=&YT\"_͏\\\u007f\u001a!qTոar4iM\u0006n\u001b?+}i{u\u001c/\u0010\u001c\u0002\fL\u0006\u001e\u0006UG>5*l\u0018\u0010Ct!]nY\u0012bR\u0002\u0011`d\"S\bĴ/9!r\u0018fޅ\u001dNE\tU\u001d,$\u0019nO]+\u05f6bڠ\u001fX\u0010S7TNA˙R\u001a"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u0003?f\b0Fq\u001f.;AEv4s", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "u(E", ":hU2V@<Z\u0019", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvz", "5dc\u0019\\->Q-|\u0002^j\u0004\r0e}<yG\u0001\u0011\u0015Qw\u0016F\u007f", "u(;.a+K]\u001d}\u000e(3\u0001\n/c\u0014&\u0003@J}\u001bHo\fPt,5/", ":`d;V/0V\u0019\bXk,x\u0018/d", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&Sc\u001es =TGD~}\u001c\u001fukI\u0016g5N\u0005p,VK\u0002", ":`d;V/0V\u0019\bg^:\r\u0011/d", ":`d;V/0V\u0019\bhm(\n\u0018/d", ":hU2V@<Z\u0019Fxh4\u0005\u00138"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class LifecycleCoroutineScope implements CoroutineScope {
    public abstract Lifecycle getLifecycle$lifecycle_common();

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1, reason: invalid class name */
    /* JADX INFO: compiled from: Lifecycle.jvm.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039xvtts\u000bu\u007fyCb\u0001~~}\u0015\u007f\n\u0004b\u0010\u0014\u0012\u0019\u0019\u000f\u0015\r{\r\u001a\u001c\u0012Q\u001b\u0011& \u0016\u001c\f\u001e\u001c&{, \u001d1##cq", f = "\u001951/,A*2*q-8.m*2", i = {}, l = {55}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LifecycleCoroutineScope.this.new AnonymousClass1(this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (PausingDispatcherKt.whenCreated(LifecycleCoroutineScope.this.getLifecycle$lifecycle_common(), this.$block, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Deprecated(message = "/G\u0011Ct|\f_]U\u000b\rU\u0016@S`\f\u0012:Dl\u0011b\tKqkby(&i_$Ka\u001ck:T]??\u0013Z\f\u000e1\u0018_<xR9\u0016KY\u0019W*\fF\u0005w\u001f/@*\u000b\u0011\u000bj'G~I#D\u000e\u000fm\u001a6c{<V!.\u0013)\n*\u0004#;\u0012+\u001a\u0019=[ '^P<u\u007f\u0018:0IBfQ6\u001fh<>sdtBW\u0012\u001a\u0012nxs\u001d\u0004Yc\u0019\"-:O\u0005Y\u000b{Z#;:|xO\u001fL7\u0012sk%m$3(avu|`\u000e%Z&J-\u001a4$aXKK-:NQ%tN,4\u001b\u0013\u001dhv;5TET\u0007(8\u0018a")
    @InterfaceC1492Gx
    public final Job launchWhenCreated(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return BuildersKt__Builders_commonKt.launch$default(this, null, null, new AnonymousClass1(block, null), 3, null);
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Lifecycle.jvm.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039xvtts\u000bu\u007fyCb\u0001~~}\u0015\u007f\n\u0004b\u0010\u0014\u0012\u0019\u0019\u000f\u0015\r{\r\u001a\u001c\u0012Q\u001b\u0011& \u0016\u001c\f\u001e\u001c&\f.\u001c.1##cq", f = "\u001951/,A*2*q-8.m*2", i = {}, l = {74}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C08171 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C08171(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C08171> continuation) {
            super(2, continuation);
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LifecycleCoroutineScope.this.new C08171(this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (PausingDispatcherKt.whenStarted(LifecycleCoroutineScope.this.getLifecycle$lifecycle_common(), this.$block, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Deprecated(message = "/G\u0011Ct|\f_]U\u001b\u000fQ'@S`\f\u0012:Dl\u0011b\tKqkby(&i_$Ka\u001ck:T]??\u0013Z\f\u000e1\u0018_<xR9\u0016KY\u0019W*\fF\u0005w\u001f/@*\u000b\u0011\u000bj'G~I#D\u000e\u000fm\u001a6c{<V!.\u0013)\n*\u0004#;\u0012+\u001a\u0019=[ '^P<u\u007f\u0018:0IBfQ6\u001fh<>sdtBW\u0012\u001a\u0012nxs\u001d\u0004Yc\u0019\"-:O\u0005Y\u000b{Z#;:|xO\u001fL7\u0012sk%m$3(avu|`\u000e%Z&J-\u001a4$aXKK-:NQ%tN,4\u001b\u0013\u001dhv;5dGP\u0018(8\u0018a")
    @InterfaceC1492Gx
    public final Job launchWhenStarted(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return BuildersKt__Builders_commonKt.launch$default(this, null, null, new C08171(block, null), 3, null);
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Lifecycle.jvm.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039xvtts\u000bu\u007fyCb\u0001~~}\u0015\u007f\n\u0004b\u0010\u0014\u0012\u0019\u0019\u000f\u0015\r{\r\u001a\u001c\u0012Q\u001b\u0011& \u0016\u001c\f\u001e\u001c&\u000b\u001f.1*##cq", f = "\u001951/,A*2*q-8.m*2", i = {}, l = {93}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C08161 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C08161(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C08161> continuation) {
            super(2, continuation);
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LifecycleCoroutineScope.this.new C08161(this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (PausingDispatcherKt.whenResumed(LifecycleCoroutineScope.this.getLifecycle$lifecycle_common(), this.$block, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Deprecated(message = "/G\u0011Ct|\f_]U\u001a\u007fc*9S`\f\u0012:Dl\u0011b\tKqkby(&i_$Ka\u001ck:T]??\u0013Z\f\u000e1\u0018_<xR9\u0016KY\u0019W*\fF\u0005w\u001f/@*\u000b\u0011\u000bj'G~I#D\u000e\u000fm\u001a6c{<V!.\u0013)\n*\u0004#;\u0012+\u001a\u0019=[ '^P<u\u007f\u0018:0IBfQ6\u001fh<>sdtBW\u0012\u001a\u0012nxs\u001d\u0004Yc\u0019\"-:O\u0005Y\u000b{Z#;:|xO\u001fL7\u0012sk%m$3(avu|`\u000e%Z&J-\u001a4$aXKK-:NQ%tN,4\u001b\u0013\u001dhv;5c8b\u001b!8\u0018a")
    @InterfaceC1492Gx
    public final Job launchWhenResumed(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return BuildersKt__Builders_commonKt.launch$default(this, null, null, new C08161(block, null), 3, null);
    }
}
