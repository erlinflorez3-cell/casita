package com.ticnow.sdk.idnowonboarding.steps.helper.compression;

import android.content.Context;
import com.ticnow.sdk.idnowonboarding.steps.helper.compression.constraint.Compression;
import com.ticnow.sdk.idnowonboarding.steps.helper.compression.constraint.Constraint;
import com.ticnow.sdk.idnowonboarding.steps.helper.compression.constraint.DefaultConstraintKt;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Я6\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljA0ZeP\u008cZS@\u000fs{J$c$\u007fCCU0}*\tUNm̮n`ҙ;C=\u0005V}p,֒Yxk\u0012WvPpW3{qm=nwN\u0005N6R<\b\n\u0019\u001aXJ@|\u0001CY\u0012*0nwji\u0013M\u0013\"*\u0017N\"\u0011\u001e\u000bq^8Xl\fE],ɨmBT3&ܥ;ת\fϿù+\r\u0005nӟ+B?5\u001b<ٮ\u0007\u0015"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f/7x$wPCBv4+^fkA\u0012p,\\\u0005+QU\u0018\nfZ}J\u0014 h\u0018[\u0001", "", "u(E", "1n\\=e,La", "\u001aiPCTuB]b_~e,R", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7lP4X\rBZ\u0019", "1na<h;B\\\u0019\\\u0005g;|\u001c>", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "1n\\=e,La\u001d\t\u0004I(\f\u00072", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f/7x$wPCBv4+^fkA\u0012p,\\\u0005+QU\u0018*f[\u0001L!\u000e^\u0017]tj\u000faL1nRE#\u00125\u001f", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0002*\u0001N\u001a5M\u0019\"q>-\u001clj\u0003\u0005m9X\u00076KUN:&0|J\u001e\"i\u0012W+j\u000fbP$\u0002S\r\u0006\u000e6X\t?qJ\u0011'\u0016~k\u0001KT\u001fK\u0004\u001e\u0004\u000b\nxOWn}QJ\u00118\u0011j\u0016n$`C\u0004\"\u001e~#+wT7\n\n\u001dn|[\tkpW\u0015\n<.GC\u001f-Jkf8>.\u001bT}A{/]t)\u0004\u0003", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class Compressor {
    public static final Compressor INSTANCE = new Compressor();

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.helper.compression.Compressor$compress$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f/7x$wPCBv4+^fkA\u0012p,\\\u0005+QU\u0018*f[\u0001L!\u000e^\u0017]tj\u000faL1nRE#\u00125\u001f", "7me<^,"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class AnonymousClass2 extends Lambda implements Function1<Compression, Unit> {
        public static final AnonymousClass2 INSTANCE = ;

        AnonymousClass2() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Compression compression) {
            invoke2(compression);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(Compression receiver) {
            Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
            DefaultConstraintKt.default$default(receiver, 0, 0, null, 0, 15, null);
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.helper.compression.Compressor$compress$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0010\u001d̉=!4i\bDZc|\u0004G\u0006>éFB-!T\u0012&\u0007-ʜwӧHgN/`U"}, d2 = {"\n`]<a@F])\rS", "\u001aiPCTuB]b_~e,R", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "7me<^,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4H7|0g\u001cdj;PM)Sv%V\""}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super File>, Object> {
        final /* synthetic */ Function1 $compressionPatch;
        final /* synthetic */ Context $context;
        final /* synthetic */ File $imageFile;
        int label;
        private CoroutineScope p$;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(Function1 function1, Context context, File file, Continuation continuation) {
            super(2, continuation);
            this.$compressionPatch = function1;
            this.$context = context;
            this.$imageFile = file;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> completion) {
            Intrinsics.checkParameterIsNotNull(completion, "completion");
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$compressionPatch, this.$context, this.$imageFile, completion);
            anonymousClass3.p$ = (CoroutineScope) obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Compression compression = new Compression();
            this.$compressionPatch.invoke(compression);
            File fileCopyToCache = UtilKt.copyToCache(this.$context, this.$imageFile);
            for (Constraint constraint : compression.getConstraints$IDNowOnboarding_release()) {
                while (!constraint.isSatisfied(fileCopyToCache)) {
                    fileCopyToCache = constraint.satisfy(fileCopyToCache);
                }
            }
            return fileCopyToCache;
        }
    }

    private Compressor() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object compress$default(Compressor compressor, Context context, File file, CoroutineContext coroutineContext, Function1 function1, Continuation continuation, int i2, Object obj) {
        if ((i2 + 4) - (4 | i2) != 0) {
            coroutineContext = Dispatchers.getIO();
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            function1 = AnonymousClass2.INSTANCE;
        }
        return compressor.compress(context, file, coroutineContext, function1, continuation);
    }

    public final Object compress(Context context, File file, CoroutineContext coroutineContext, Function1<? super Compression, Unit> function1, Continuation<? super File> continuation) {
        return BuildersKt.withContext(coroutineContext, new AnonymousClass3(function1, context, file, null), continuation);
    }
}
