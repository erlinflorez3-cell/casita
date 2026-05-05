package com.braze.ui.inappmessage.utils;

import android.content.Context;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.BrazeViewBounds;
import com.braze.enums.inappmessage.MessageType;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageWithImage;
import com.braze.models.inappmessage.IInAppMessageZippedAssetHtml;
import com.braze.models.inappmessage.InAppMessageFull;
import com.braze.models.inappmessage.InAppMessageHtml;
import com.braze.support.BrazeLogger;
import com.braze.support.WebContentUtils;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljA0ZeP\u008cZS8\u0018sڔ<$i0yّCU0}*ޛWN}gvϺb\u000bY\u000f\u000e\u0016~n4Ikxe\u0012\u00152JoU3UڎC˧`\u000bȂ5 `!x~\u000b\u0001ʀ.H\u001evCZY\r*0nrjV\u001bP\u001d\u001a@\n\u0005ī?ʟ[ɡߑ:Hzb\u0003=1\t\u0002B|.\u00104\u000bP%F\u0003+Sv*T9HO5C.\u0004\u0007\u0015\\s?1J\"A\u0013t?'YV$[Df\u0018\u0014C:\u007f\u0011k\u0003>\\3b\u0011\u00105.gcyT>,\u0006\r\u0014\rj\u000bT\u0006oX<@2h\u001e\rax#WNd\u001a^p\u0004Aa~%3\u0015K+g\u001d\u0017UoO1Ne\u007fK\u0012f3\u000f\u00059[\u0003\u0017\u0011\u001b)W\u0010SGPnA\u000fSRgK\u0005\u001cp\u0011\u0004Z\b>J\u0018/*)t\u001cmEiR;!\u001a\u000bxHu\u0011\u001d`\u0017n0W̵@$v\u0016=AÇ\u0010v"}, d2 = {"\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWL\u0006)<gG|3k\u001c0ZMKt3\u0002\u001eDlDnc:\\r)G7[,gN\u007f=!g", "", "u(E", "2hb=_(R>&~\u0006Z9|\b\u0013n[3\u0007(\u0001%%Cq\u000e", "", "7m0=c\u0014>a'z|^", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=a)\u0013x!\u0016MQIg6\u001ej", "uKR<`u;`\u0015\u0014z(4\u0007\b/l\u000eq\u007fI|\"\"Oo\u001cJr'5#a\u0004@I!95CIy0 \u0015>H?\u0011r3R\u007fpEV[6lavF\u0014 $kX4\u001c\tbQ }HA(]o0\u00077y|U\u001d\n>l:,S\u0015Gw$K", "5dc#\\,P0#\u000f\u0004]:Y\u001d\u001ey\u000b(", "\u001ab^:\")KO.~D^5\r\u0011=/\\5wU\u0001\b\u001bG\u0002jF\u0007.4gS", "6`]1_,%]\u0017z\u0002B4x\u000b/", "", ":nR._\u0010FO\u001b~jk3", "", "7m0=c\u0014>a'z|^\u001e\u0001\u00182I\b$}@", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=a)\u0013x!\u0016MQIg6\u001e\u0007lp<jk(Pv|", "7lP4X\u0013HO\u0018~\b", "\u001ab^:\")KO.~Db4x\u000b/sI\fXM|,\u0017+w\n>v\f?U| DC", "/o_9\\*:b\u001d\t\u0004<6\u0006\u0018/x\u000f", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "DhTD56N\\\u0018\r", ">qT=T9>7\"Z\u0006i\u0014|\u0017=a\u0002(", "7m0=c\u0014>a'z|^\u001b\u0007s<e\u000b$\t@", ">qT=T9>7\"Z\u0006i\u0014|\u0017=a\u0002(\\J\u000eu\u001bUz\u00158\u000b", ">qT=T9>7\"Z\u0006i\u0014|\u0017=a\u0002(mD\u0010\u001asK~\u00168\u0002\u0004?k\u0007'Ai\u0015", ">qT=T9>7\"Z\u0006i\u0014|\u0017=a\u0002(mD\u0010\u001ayVw\u0015", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=\u0007{Bx}.[Q7m4\u0001$ph\u000f", ">qT=T9>7\"Z\u0006i\u0014|\u0017=a\u0002(mD\u0010\u001a\fKz\u0019<u\u0001Cg}/\u001a|\u001e5", "7m0=c\u0014>a'z|^\u000f\f\u00116", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=a)\u0013x!\u0016MQIg6\u001e\nllD\u0007b\b\\\u0005'V/]4c(", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BackgroundInAppMessagePreparer {
    public static final BackgroundInAppMessagePreparer INSTANCE = new BackgroundInAppMessagePreparer();

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageType.values().length];
            try {
                iArr[MessageType.HTML_FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageType.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageType.SLIDEUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageType.MODAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ IInAppMessage $inAppMessage;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(IInAppMessage iInAppMessage, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$inAppMessage = iInAppMessage;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BackgroundInAppMessagePreparer.this.new AnonymousClass2(this.$inAppMessage, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) BackgroundInAppMessagePreparer.this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.displayPreparedInAppMessage.2.1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Displaying in-app message.";
                }
            }, 7, (Object) null);
            BrazeInAppMessageManager.Companion.getInstance().displayInAppMessage(this.$inAppMessage, false);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10711 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ IInAppMessage $inAppMessageToPrepare;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10711(IInAppMessage iInAppMessage, Continuation<? super C10711> continuation) {
            super(2, continuation);
            this.$inAppMessageToPrepare = iInAppMessage;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C10711 c10711 = new C10711(this.$inAppMessageToPrepare, continuation);
            c10711.L$0 = obj;
            return c10711;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                try {
                    IInAppMessage iInAppMessagePrepareInAppMessage = BackgroundInAppMessagePreparer.INSTANCE.prepareInAppMessage(this.$inAppMessageToPrepare);
                    if (iInAppMessagePrepareInAppMessage == null) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) coroutineScope, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessageForDisplay.1.1
                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                return "Cannot display the in-app message because the in-app message was null.";
                            }
                        }, 6, (Object) null);
                    } else {
                        this.L$0 = coroutineScope;
                        this.label = 1;
                        if (BackgroundInAppMessagePreparer.INSTANCE.displayPreparedInAppMessage(iInAppMessagePrepareInAppMessage, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) coroutineScope, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessageForDisplay.1.2
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Caught error while preparing in app message in background";
                        }
                    }, 4, (Object) null);
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Exception e3) {
                    e = e3;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) coroutineScope, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessageForDisplay.1.2
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Caught error while preparing in app message in background";
                        }
                    }, 4, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    private BackgroundInAppMessagePreparer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object displayPreparedInAppMessage(IInAppMessage iInAppMessage, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass2(iInAppMessage, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    private final BrazeViewBounds getViewBoundsByType(IInAppMessage iInAppMessage) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[iInAppMessage.getMessageType().ordinal()];
        return i2 != 3 ? i2 != 4 ? BrazeViewBounds.NO_BOUNDS : BrazeViewBounds.IN_APP_MESSAGE_MODAL : BrazeViewBounds.IN_APP_MESSAGE_SLIDEUP;
    }

    private final boolean handleLocalImage(final String str, IInAppMessageWithImage iInAppMessageWithImage, IBrazeImageLoader iBrazeImageLoader, Context context, IInAppMessage iInAppMessage, BrazeViewBounds brazeViewBounds) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.handleLocalImage.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Passing in-app message local image url to image loader: " + str;
            }
        }, 6, (Object) null);
        iInAppMessageWithImage.setBitmap(iBrazeImageLoader.getInAppMessageBitmapFromUrl(context, iInAppMessage, str, brazeViewBounds));
        if (iInAppMessageWithImage.getBitmap() != null) {
            iInAppMessageWithImage.setImageDownloadSuccessful(true);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.handleLocalImage.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Removing local image url from IAM since it could not be loaded. URL: " + str;
            }
        }, 7, (Object) null);
        iInAppMessageWithImage.setLocalImageUrl(null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IInAppMessage prepareInAppMessage(IInAppMessage iInAppMessage) {
        if (iInAppMessage.isControl()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessage.1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Skipping in-app message preparation for control in-app message.";
                }
            }, 7, (Object) null);
            return iInAppMessage;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessage.2
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Starting asynchronous in-app message preparation for message.";
            }
        }, 7, (Object) null);
        int i2 = WhenMappings.$EnumSwitchMapping$0[iInAppMessage.getMessageType().ordinal()];
        if (i2 == 1) {
            Intrinsics.checkNotNull(iInAppMessage, "null cannot be cast to non-null type com.braze.models.inappmessage.IInAppMessageZippedAssetHtml");
            if (!prepareInAppMessageWithZippedAssetHtml((IInAppMessageZippedAssetHtml) iInAppMessage)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessage.3
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Html in-app message zip asset download failed. Cannot display in-app message.";
                    }
                }, 6, (Object) null);
                return null;
            }
        } else if (i2 == 2) {
            Intrinsics.checkNotNull(iInAppMessage, "null cannot be cast to non-null type com.braze.models.inappmessage.InAppMessageHtml");
            prepareInAppMessageWithHtml((InAppMessageHtml) iInAppMessage);
        } else if (!prepareInAppMessageWithBitmapDownload(iInAppMessage)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessage.4
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "In-app message image download failed. Cannot display in-app message.";
                }
            }, 6, (Object) null);
            return null;
        }
        return iInAppMessage;
    }

    @JvmStatic
    public static final void prepareInAppMessageForDisplay(IInAppMessage inAppMessageToPrepare) {
        Intrinsics.checkNotNullParameter(inAppMessageToPrepare, "inAppMessageToPrepare");
        BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new C10711(inAppMessageToPrepare, null), 3, null);
    }

    @JvmStatic
    public static final boolean prepareInAppMessageWithBitmapDownload(IInAppMessage iInAppMessage) {
        if (!(iInAppMessage instanceof IInAppMessageWithImage)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessageWithBitmapDownload.1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Cannot prepare non IInAppMessageWithImage object with bitmap download.";
                }
            }, 7, (Object) null);
            return false;
        }
        IInAppMessageWithImage iInAppMessageWithImage = (IInAppMessageWithImage) iInAppMessage;
        if (iInAppMessageWithImage.getBitmap() != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessageWithBitmapDownload.2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "In-app message already contains image bitmap. Not downloading image from URL.";
                }
            }, 6, (Object) null);
            iInAppMessageWithImage.setImageDownloadSuccessful(true);
            return true;
        }
        BackgroundInAppMessagePreparer backgroundInAppMessagePreparer = INSTANCE;
        BrazeViewBounds viewBoundsByType = backgroundInAppMessagePreparer.getViewBoundsByType(iInAppMessage);
        Context applicationContext = BrazeInAppMessageManager.Companion.getInstance().getApplicationContext();
        if (applicationContext == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) backgroundInAppMessagePreparer, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessageWithBitmapDownload.3
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "BrazeInAppMessageManager applicationContext is null. Not downloading image.";
                }
            }, 6, (Object) null);
            return false;
        }
        IBrazeImageLoader imageLoader = Braze.Companion.getInstance(applicationContext).getImageLoader();
        String localImageUrl = iInAppMessageWithImage.getLocalImageUrl();
        String str = localImageUrl;
        if (str != null && !StringsKt.isBlank(str)) {
            backgroundInAppMessagePreparer = backgroundInAppMessagePreparer;
            if (backgroundInAppMessagePreparer.handleLocalImage(localImageUrl, iInAppMessageWithImage, imageLoader, applicationContext, iInAppMessage, viewBoundsByType)) {
                return true;
            }
        }
        final String remoteImageUrl = iInAppMessageWithImage.getRemoteImageUrl();
        String str2 = remoteImageUrl;
        if (str2 == null || StringsKt.isBlank(str2)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) backgroundInAppMessagePreparer, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessageWithBitmapDownload.5
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "In-app message has no remote image url. Not downloading image.";
                }
            }, 6, (Object) null);
            if (!(iInAppMessageWithImage instanceof InAppMessageFull)) {
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) backgroundInAppMessagePreparer, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessageWithBitmapDownload.6
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "In-app message full has no remote image url yet is required to have an image. Failing message display.";
                }
            }, 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) backgroundInAppMessagePreparer, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessageWithBitmapDownload.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "In-app message has remote image url. Downloading image at url: " + remoteImageUrl;
            }
        }, 6, (Object) null);
        iInAppMessageWithImage.setBitmap(imageLoader.getInAppMessageBitmapFromUrl(applicationContext, iInAppMessage, remoteImageUrl, viewBoundsByType));
        if (iInAppMessageWithImage.getBitmap() == null) {
            return false;
        }
        iInAppMessageWithImage.setImageDownloadSuccessful(true);
        return true;
    }

    @JvmStatic
    public static final boolean prepareInAppMessageWithZippedAssetHtml(final IInAppMessageZippedAssetHtml inAppMessageHtml) {
        Intrinsics.checkNotNullParameter(inAppMessageHtml, "inAppMessageHtml");
        final String localAssetsDirectoryUrl = inAppMessageHtml.getLocalAssetsDirectoryUrl();
        String str = localAssetsDirectoryUrl;
        if (str != null && !StringsKt.isBlank(str) && new File(localAssetsDirectoryUrl).exists()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessageWithZippedAssetHtml.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Local assets for html in-app message are already populated. Not downloading assets. Location = " + localAssetsDirectoryUrl;
                }
            }, 6, (Object) null);
            return true;
        }
        String assetsZipRemoteUrl = inAppMessageHtml.getAssetsZipRemoteUrl();
        String str2 = assetsZipRemoteUrl;
        if (str2 == null || StringsKt.isBlank(str2)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessageWithZippedAssetHtml.2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Html in-app message has no remote asset zip. Continuing with in-app message preparation.";
                }
            }, 6, (Object) null);
            return true;
        }
        Context applicationContext = BrazeInAppMessageManager.Companion.getInstance().getApplicationContext();
        if (applicationContext == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessageWithZippedAssetHtml.3
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "BrazeInAppMessageManager applicationContext is null. Not downloading image.";
                }
            }, 6, (Object) null);
            return false;
        }
        final String localHtmlUrlFromRemoteUrl = WebContentUtils.getLocalHtmlUrlFromRemoteUrl(WebContentUtils.getHtmlInAppMessageAssetCacheDirectory(applicationContext), assetsZipRemoteUrl);
        String str3 = localHtmlUrlFromRemoteUrl;
        if (str3 == null || StringsKt.isBlank(str3)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessageWithZippedAssetHtml.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Download of html content to local directory failed for remote url: " + inAppMessageHtml.getAssetsZipRemoteUrl() + " . Returned local url is: " + localHtmlUrlFromRemoteUrl;
                }
            }, 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessageWithZippedAssetHtml.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Local url for html in-app message assets is " + localHtmlUrlFromRemoteUrl;
            }
        }, 7, (Object) null);
        inAppMessageHtml.setLocalAssetsDirectoryUrl(localHtmlUrlFromRemoteUrl);
        return true;
    }

    public final void prepareInAppMessageWithHtml(InAppMessageHtml inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        if (inAppMessage.getLocalPrefetchedAssetPaths().isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessageWithHtml.1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "HTML in-app message does not have prefetched assets. Not performing any substitutions.";
                }
            }, 7, (Object) null);
            return;
        }
        String message = inAppMessage.getMessage();
        if (message == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessageWithHtml.2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "HTML in-app message does not have message. Not performing any substitutions.";
                }
            }, 7, (Object) null);
        } else {
            inAppMessage.setMessage(WebContentUtils.replacePrefetchedUrlsWithLocalAssets(message, inAppMessage.getLocalPrefetchedAssetPaths()));
        }
    }
}
