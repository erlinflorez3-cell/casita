package com.dynatrace.agent.view;

import com.dynatrace.agent.OneAgentEventDispatcher;
import com.dynatrace.agent.common.time.TimeProvider;
import com.dynatrace.agent.events.EventFlowGovernor;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u0010s{B$cҕyCIa\"}(\tWN}gvJ`\u000eIƤ\u001cǝ)jZH\u0016\u001em\u0016\u001d2Zom4]sK;xtd\b060<\u0012\u0005/\u001f:L\u001e|\u0013Cy\u0013ܘ4BvB`\u0016\u0016\u001f(\u001c\u001e>N\fNbuZNJ\u0003\\h<S\twPf)u/+ZSZ\u001d5\u001b\u0001y\u001eYKg9#4k\u00035b\"SKE\u007fN\u001dhU2q]<qDj\u0018\u0014C6\u007f\u0013k~>^\u001bP\u000f\u0019W1]qcR$'&\bB\r\u0005\u0012\u001c\u0018?H\\8Jj\u0016\u001dKt!c\u0007PJjP\u0013\u0013ad\"kıqڢ=\u001bte2G'NO{3\u000etŃ\u0003ͼ%[\\ו1!)V\u0010Q_T\u0017׃Jݳ\u000eYEЧT|p\u0006B\u0004^LV߿} 2\u0017-ڛ,E1'\u0004\u0002vK>ϻ\u0007¾lSqɭ͛D7"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0012\u001b\u0017Y9~@v7\u0013c\u0007/7\u0001%\u0016IL7m4+j", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0012\u001b\u0017Y9~@v7\u0013c\u0007/7\u0001%\u0016IL7m4+pse\u000f", "4k^D:6OS&\b\u0005k", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006V65b\r\u0001>w(\u0010WT;x=(\">", "Bh\\2C9Hd\u001d}zk", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fOy\u0017\u0006\u0006)=YG\u000f;u\u0016\u0019ZMLo3\u001e\">", "DhTDF<F[\u0015\f~s,\n", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0012\u001b\u0017Y9~@v7#i\u0006(3z\u001aCMP\u0011", "3uT;g\u000bBa$z\n\\/|\u0016", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\nj \u0017#q\u000eE\u0006\u0005FY\u0007/\u0016q$9IR9n4+j", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0017(Gx\u001dJ@\u0005FY\u0007/\u0018t @/MLkA'\u001fu7 \u0005m4\u0018u;PH]9XPr\u0007\u0010\u0014Z\u0017]t\u000b\u000faI.w\u000eF#\u0010,\u0013p?p\u0001v#\u0018FnoBce.w\u001f}\u000b(|OUn\u0007C?E,&f\fh,&K>$&;\n\u001fhb\u001c\u001a\u0004[\r\u007fV\u000fgt\u001d\u007fxB,\bloOA~b8r'hG}w\u001bA\"^4t\t\u000643ED\u0016Kp'\u001db\u0007 (k?*&C\u0012V0", "As^?X\nH\\(~\u000em", "", "DhTDA(FS", "", "2dc2V;>R\u0002z\u0003^", "4hT9W:", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "1kT.e\nH\\(~\u000em", "1qT.g,/W\u0019\u0011Xh5\f\tBt", "At\\:T9Bh\u0019Z\u0004]\u0019|\u0017/tp,{R^! Vo!K", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ViewContextManager implements ViewContextManagerApi {
    private final OneAgentEventDispatcher eventDispatcher;
    private final EventFlowGovernor flowGovernor;
    private final TimeProvider timeProvider;
    private final ViewSummarizer viewSummarizer;

    /* JADX INFO: renamed from: com.dynatrace.agent.view.ViewContextManager$clearContext$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return ViewContextManager.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (ViewContextManager.this.summarizeAndResetViewContext(this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.dynatrace.agent.view.ViewContextManager$storeContext$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C11411 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ String $detectedName;
        final /* synthetic */ String $viewName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11411(String str, String str2, Continuation<? super C11411> continuation) {
            super(1, continuation);
            this.$viewName = str;
            this.$detectedName = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return ViewContextManager.this.new C11411(this.$viewName, this.$detectedName, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C11411) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (ViewContextManager.this.summarizeAndResetViewContext(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ViewContextManager.this.createViewContext(this.$viewName, this.$detectedName);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.view.ViewContextManager$storeContext$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ JSONObject $fields;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(JSONObject jSONObject, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$fields = jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return ViewContextManager.this.new AnonymousClass2(this.$fields, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (ViewContextManager.this.summarizeAndResetViewContext(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ViewContextManager.this.createViewContext(this.$fields);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.view.ViewContextManager$summarizeAndResetViewContext$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C11421 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C11421(Continuation<? super C11421> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return ViewContextManager.this.summarizeAndResetViewContext(this);
        }
    }

    public ViewContextManager(EventFlowGovernor flowGovernor, TimeProvider timeProvider, ViewSummarizer viewSummarizer, OneAgentEventDispatcher eventDispatcher) {
        Intrinsics.checkNotNullParameter(flowGovernor, "flowGovernor");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(viewSummarizer, "viewSummarizer");
        Intrinsics.checkNotNullParameter(eventDispatcher, "eventDispatcher");
        this.flowGovernor = flowGovernor;
        this.timeProvider = timeProvider;
        this.viewSummarizer = viewSummarizer;
        this.eventDispatcher = eventDispatcher;
    }

    public final void createViewContext(String str, String str2) {
        this.viewSummarizer.openViewSummary(str, str2, this.timeProvider.millisSinceEpoch());
        Utility.devLog(OneAgentLoggingKt.TAG_VIEW, "view context for view name=" + str + " detectedName=" + str2 + " is created");
    }

    public final void createViewContext(JSONObject jSONObject) {
        this.viewSummarizer.openViewSummary(jSONObject, this.timeProvider.millisSinceEpoch());
        Utility.devLog(OneAgentLoggingKt.TAG_VIEW, "view context for view " + jSONObject + " is created");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object summarizeAndResetViewContext(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) throws org.json.JSONException {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.dynatrace.agent.view.ViewContextManager.C11421
            if (r0 == 0) goto L61
            r5 = r7
            com.dynatrace.agent.view.ViewContextManager$summarizeAndResetViewContext$1 r5 = (com.dynatrace.agent.view.ViewContextManager.C11421) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L61
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L13:
            java.lang.Object r1 = r5.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L37
            if (r0 != r3) goto L67
            java.lang.Object r0 = r5.L$0
            com.dynatrace.agent.view.ViewContextManager r0 = (com.dynatrace.agent.view.ViewContextManager) r0
            kotlin.ResultKt.throwOnFailure(r1)
        L27:
            com.dynatrace.agent.view.ViewSummarizer r0 = r0.viewSummarizer
            r0.resetViewSummary()
            java.lang.String r1 = "dtxViewContext"
            java.lang.String r0 = "created a view summary and closed the current view context"
            com.dynatrace.android.agent.util.Utility.devLog(r1, r0)
        L34:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L37:
            kotlin.ResultKt.throwOnFailure(r1)
            com.dynatrace.agent.view.ViewSummarizer r0 = r6.viewSummarizer
            com.dynatrace.agent.view.ViewContext r0 = r0.obtainViewContext()
            if (r0 == 0) goto L34
            com.dynatrace.agent.view.ViewSummarizer r2 = r6.viewSummarizer
            com.dynatrace.agent.common.time.TimeProvider r0 = r6.timeProvider
            long r0 = r0.millisSinceEpoch()
            com.dynatrace.agent.view.ViewSummary r0 = r2.generateViewSummary(r0)
            com.dynatrace.agent.OneAgentEventDispatcher r1 = r6.eventDispatcher
            org.json.JSONObject r0 = r0.toJson()
            r5.L$0 = r6
            r5.label = r3
            java.lang.Object r0 = r1.dispatchInternalEvent$com_dynatrace_agent_release(r0, r5)
            if (r0 != r4) goto L5f
            return r4
        L5f:
            r0 = r6
            goto L27
        L61:
            com.dynatrace.agent.view.ViewContextManager$summarizeAndResetViewContext$1 r5 = new com.dynatrace.agent.view.ViewContextManager$summarizeAndResetViewContext$1
            r5.<init>(r7)
            goto L13
        L67:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.view.ViewContextManager.summarizeAndResetViewContext(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.dynatrace.agent.view.ViewContextManagerApi
    public void clearContext() {
        this.flowGovernor.enqueue(new AnonymousClass1(null));
    }

    @Override // com.dynatrace.agent.view.ViewContextManagerApi
    public void storeContext(String str, String str2) {
        this.flowGovernor.enqueue(new C11411(str, str2, null));
    }

    @Override // com.dynatrace.agent.view.ViewContextManagerApi
    public void storeContext(JSONObject fields) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.flowGovernor.enqueue(new AnonymousClass2(fields, null));
    }
}
