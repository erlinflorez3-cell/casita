package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import yg.InterfaceC1492Gx;

/* JADX INFO: Add missing generic type declarations: [T] */
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
/* JADX INFO: compiled from: SingleProcessDataStore.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A\u001f$2ߚ\u0006\u0007\u000fpI2Te\u000f.\u0001TpŪ*"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
@DebugMetadata(c = "drixvqm\u00039pn\u0003p\u0004\u0006\u0002\u0006yCy\u0007\u000b~Hn\u0006\f\u0006\f\u0006q\u0015\u0013\b\u000b\u001a\u001bl\u000b\u001f\r\u007f\"\u001e\"\u0016U\u0017\u0015)\u0017Zh", f = " 5915-\u001784'(54\u0004 2\u001e\u000f/)+\u001dd!)", i = {}, l = {117}, m = "8>GA>9(KJH>H?", n = {}, s = {})
final class SingleProcessDataStore$data$1<T> extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SingleProcessDataStore<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleProcessDataStore$data$1(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super SingleProcessDataStore$data$1> continuation) {
        super(2, continuation);
        this.this$0 = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SingleProcessDataStore$data$1 singleProcessDataStore$data$1 = new SingleProcessDataStore$data$1(this.this$0, continuation);
        singleProcessDataStore$data$1.L$0 = obj;
        return singleProcessDataStore$data$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
        return ((SingleProcessDataStore$data$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            State state = (State) ((SingleProcessDataStore) this.this$0).downstreamFlow.getValue();
            if (!(state instanceof Data)) {
                ((SingleProcessDataStore) this.this$0).actor.offer(new SingleProcessDataStore.Message.Read(state));
            }
            final Flow flowDropWhile = FlowKt.dropWhile(((SingleProcessDataStore) this.this$0).downstreamFlow, new AnonymousClass1(state, null));
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, new Flow<T>() { // from class: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: Collect.kt */
                @InterfaceC1492Gx
                @Metadata(bv = {}, d1 = {"Я\u0015\u001d̉=!4i\bӵLc\u0003\u0004I\u00066\u000eVAչ(4(Մ7lz;@D\u001c߉\\Q\u001cA\u001dk\u00144R\\TuQ=m\u001a4̝OѾ\r̭fñН^\u000bQ\u0012ب\u0016zr,Ol\u07b5a\u0016ƺ6H"}, d2 = {"9nc9\\5Q\u001d\u0017\t\bh<\f\r8e\u000eq|G\u000b)`(v\u0018N\\4/S[*>t\u0016,\\)J*2(\u001coa7\u0016\"y", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#", "3lXA", "", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxW:\u00012?i\r$@m$w+MDz8'%dp=\u0011l\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017", "9nc9\\5Q\u001d\u0017\t\bh<\f\r8e\u000eq|G\u000b)`(v\u0018N\\4/S](;|%.ZQ!zr.\u001ev]:\u0007R9J\u007f5HV[4\u001bYnE\u0011\u0011VU\u001aiK\tbH(wD6]\u00066P\t;f\u0010Ja", "9nc9\\5Q\u001d\u0017\t\bh<\f\r8e\u000eq|G\u000b)`(v\u0018N\\4/Sl-3v$/WPCQC\\\u001ddlwEg5Uz0GK\r<e`n>\u0014\u0001g\nW9\u000e\u000ffIb:\u0003\u0004"}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
                public static final class AnonymousClass2 implements FlowCollector<State<T>> {
                    final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;

                    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    @InterfaceC1492Gx
                    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
                    @DebugMetadata(c = "drixvqm\u00039pn\u0003p\u0004\u0006\u0002\u0006yCy\u0007\u000b~Hn\u0006\f\u0006\f\u0006q\u0015\u0013\b\u000b\u001a\u001bl\u000b\u001f\r\u007f\"\u001e\"\u0016U\u0017\u0015)\u0017Zh\\#)2,)$\u0013653)3*jk2875;33s>3Cw\u0006y\t", f = " 5915-\u001784'(54\u0004 2\u001e\u000f/)+\u001dd!)", i = {}, l = {137}, m = "4=:F", n = {}, s = {})
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow$inlined = flowCollector;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
                        /*
                            r5 = this;
                            boolean r0 = r7 instanceof androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L4e
                            r4 = r7
                            androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$1 r4 = (androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r4
                            int r2 = r4.label
                            r1 = -2147483648(0xffffffff80000000, float:-0.0)
                            int r0 = r2 + r1
                            r2 = r2 | r1
                            int r0 = r0 - r2
                            if (r0 == 0) goto L4e
                            int r0 = r4.label
                            int r0 = r0 - r1
                            r4.label = r0
                        L16:
                            java.lang.Object r1 = r4.result
                            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r0 = r4.label
                            r2 = 1
                            if (r0 == 0) goto L29
                            if (r0 != r2) goto L54
                            kotlin.ResultKt.throwOnFailure(r1)
                        L26:
                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                            return r0
                        L29:
                            kotlin.ResultKt.throwOnFailure(r1)
                            kotlinx.coroutines.flow.FlowCollector r1 = r5.$this_unsafeFlow$inlined
                            r0 = r4
                            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                            androidx.datastore.core.State r6 = (androidx.datastore.core.State) r6
                            boolean r0 = r6 instanceof androidx.datastore.core.ReadException
                            if (r0 != 0) goto L7b
                            boolean r0 = r6 instanceof androidx.datastore.core.Final
                            if (r0 != 0) goto L74
                            boolean r0 = r6 instanceof androidx.datastore.core.Data
                            if (r0 == 0) goto L5c
                            androidx.datastore.core.Data r6 = (androidx.datastore.core.Data) r6
                            java.lang.Object r0 = r6.getValue()
                            r4.label = r2
                            java.lang.Object r0 = r1.emit(r0, r4)
                            if (r0 != r3) goto L26
                            return r3
                        L4e:
                            androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$1 r4 = new androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$1
                            r4.<init>(r7)
                            goto L16
                        L54:
                            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r1.<init>(r0)
                            throw r1
                        L5c:
                            boolean r0 = r6 instanceof androidx.datastore.core.UnInitialized
                            if (r0 == 0) goto L6e
                            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                            java.lang.String r0 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                            java.lang.String r0 = r0.toString()
                            r1.<init>(r0)
                            java.lang.Throwable r1 = (java.lang.Throwable) r1
                            throw r1
                        L6e:
                            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                            r0.<init>()
                            throw r0
                        L74:
                            androidx.datastore.core.Final r6 = (androidx.datastore.core.Final) r6
                            java.lang.Throwable r0 = r6.getFinalException()
                            throw r0
                        L7b:
                            androidx.datastore.core.ReadException r6 = (androidx.datastore.core.ReadException) r6
                            java.lang.Throwable r0 = r6.getReadException()
                            throw r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector flowCollector2, Continuation continuation) {
                    Object objCollect = flowDropWhile.collect(new AnonymousClass2(flowCollector2), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,r\bDJc|\u0004W\u0006>éFB-!L\u0014}јtji:Rf`4bU:\u000f2{b&\"Ҡ0"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7s", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011]\u001d8\u0006%\u000b"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039pn\u0003p\u0004\u0006\u0002\u0006yCy\u0007\u000b~Hn\u0006\f\u0006\f\u0006q\u0015\u0013\b\u000b\u001a\u001bl\u000b\u001f\r\u007f\"\u001e\"\u0016U\u0017\u0015)\u0017Zh\\j", f = " 5915-\u001784'(54\u0004 2\u001e\u000f/)+\u001dd!)", i = {}, l = {}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<State<T>, Continuation<? super Boolean>, Object> {
        final /* synthetic */ State<T> $currentDownStreamFlowState;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(State<T> state, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$currentDownStreamFlowState = state;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentDownStreamFlowState, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(State<T> state, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass1) create(state, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                State<T> state = (State) this.L$0;
                State<T> state2 = this.$currentDownStreamFlowState;
                boolean z2 = false;
                if (!(state2 instanceof Data) && !(state2 instanceof Final) && state == state2) {
                    z2 = true;
                }
                return Boxing.boxBoolean(z2);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
