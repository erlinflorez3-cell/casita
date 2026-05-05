package com.biocatch.client.android.sdk.backend.communication;

import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.android.commonsdk.technicalServices.events.EventBusService;
import com.biocatch.client.android.sdk.backend.communication.exceptions.HttpException;
import com.biocatch.client.android.sdk.backend.communication.http.HttpCommunicator;
import com.biocatch.client.android.sdk.backend.communication.messaging.Message;
import com.biocatch.client.android.sdk.contract.events.wupInfoEvent.WupInfoEvent;
import com.biocatch.client.android.sdk.core.Delay;
import com.biocatch.client.android.sdk.core.exceptions.InvalidOperationException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZO;

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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яb\u001d<K!&˛\bDZc|\u0004W\u00068é6B\r.4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<řc$\bCCU }*\teNo˧vJh\u0014K\u000f\f\u0017\u0001j:O]ތe\u0012%2JoE3UoS9hҚ>\u0005.2*\u0600\u0002\u0005\u0017\u001a2H\u0016\u0004\u0001ŏaÈ:6F\u0081HQ5M3\u001aB\u0006l!AOlk\\8`l\f=?-\u0011mZT7a@|\u0004εtY7\u0011\u0005g6+n>E\u00193[\u001b\u0007\u0001dO\u0007M{U\u0005\u00172ݳ/I\u0002c~d\u000e.-+}(\u000ev4x\u001dQ\u000f)o1]\u0002cP<C>zD\u001eJ#&\u0006Uc^1(\u0007 \u000eiοɤW@^#'H\u000e\u001dy6E@F3s?)\niai4\u0015KD\"\u001bB;\u0001\u001d<\fX\u001c\u0006-\u001b\u000bȭ\u00027W@Knf\n\bM4\u0004Ͳf\u00028+xZ\u000eW\u0014\u0011\\2U;i^;!\"ȵ\u000fDϼz\u0005n\n\u001cm`qX\"\u001d1\u007f.\u00176rD\u0013 4Vb\u0004D\u0011{7\u001b\u0007N\u0014!*twj,{ĮPћlirܔ.\u00163<~7\b|BސYߍb3=ȡ4\u001coX\u000f\u0014mC9ڶZڋFS\u0014ȗ-D0C`j>\b,H\\\u001b+2m\u0002Zt\u0003ւ%Å\u0019N\u000bٜZC\u0003\u001aml9\u001c\rgK$1}zڒ\u0015ɹT\\xב8\u0005W.\u0015`P0\u0018ٞ7Ԋ*U*ֻ\u0005\u000f1\u000b\u0017y\u0010IwL}Ƃ\u001b\u001bLɠ}°\u001a\u001aA֗\u007fI!\u0017\u0017)`\u000b\u0004թNȌiQUȼw\u0007\u000b\u000f';\u0017D>ŐlҔ0`r\u07ba `%9\u000f^!3^۰\f\u05fbeF\u0003ò4b\u0019sVK\t\u0002\bU%˾\tġ#\u001e-˚Ȥ&)"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011;[(e`zA#!Z\u001b$", "\"", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011TN:jNtA\u001d\u0014$uN9\u001b\u0001[Ay", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "<`\\2", "", "?tTBX", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011;[(e`zA\" ^\u0018W\u0017\u001d\u0005iAy", "6sc=66F[)\b~\\(\f\u0013<", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011O];g\u001cUL#\u001d8\u0018V3\u001d\u000e]? }NDt", "@dc?T5L[\u001d\u000e]Z5{\u0010/r", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u00119N;iN{K\u001c\u0016ipJ4\f\fYNy", "3uT;g\tNa", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\r 5p\u001f2K?BY4+&l_9\u0015-,_v0VZ\u0018\fmR{Lp\"h{N8\u001e\tWAy", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b>\u000b\u001f`Ds\u0018:r43\\G\u001e>q\u00167\\\r7t3+\u001fl`\u0003\u0015b2\u0018s#ERN5[\u001cpG\u001c\u001aj\u0017R)\t\u0014]K-83D\u001b\u0011:Q\u0006Iv\u0005\u0016\u001fyEj\u0001B,vE\u0004\u001d?>-rDUnwJ\u000bCi.d\u0015nfXC91\u001eu\u0018dvO4SxO\u000fxR\u0003f1E#\u0003@4GqYBTs_E>*.Z\u0007AtAg\u007f\t~5\fD3:b\u0001Zq%\u0014Ev\u001f4&>+048\"=N-ssB\u000eq.+\u0004\u0017aB;\u001dd/qG\u0015PZ\u0013Y;ah\u007f\u0001P\u0010FQ\u007f\u001e+DzQ_\u0004\u001eRs$|rEL)\\\u0005)S@+^\u0018\u0003\u0010<~\u001a8\u001e\u0007V\u0013r([FK\u0016RdA\u000b\tcG\u0014:F\u001auS|den*\u007f\b\u0011G$<O:rY1o\u001d'8~\u000b\rfszB\u0003E!n\u0005NYAq=?\u0019US/*k6\u001ctp\"", "3wT0h;H`", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJv*Gm\u001eK\u00012#Y\u000b1;k\u0016\u0004", "\nrTA \u0006\u0017", "", "7r00g0OS", "u(I", ";`g\u001aX:LO\u001b~\tM6]\u0010?s\u0003", "", "@dc?l\u000b>Z\u0015\u0013zk", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w,CBgHs", "Ag^B_++c\"", "Bga2T+", "\u001aiPCTuEO\"\u0001DM/\n\t+dU", "1n]3\\.N`\u0019", "", "BqP;f4Bb(~\bL,\f\u00183n\u00026", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011;[(e`zA#!Z\u001b<+\u001c\u0014]J&|\u001a", "1n]@h4>", "3m`BX<>", "2`c.", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i4i\u00144ML:52(\u001dpqB\u000ba(]z1P\u0016V,j`n?\u0018\u001b\\W6+\u001b\u0013UC$D\b(", "4kd@[\u0014>a'z|^:", "@t]", "Ad]1@,La\u0015\u0001z", ";db@T.>", "E`XA96K@\u0019\r\u0006h5\u000b\t", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i4i\u00144ML:52(\u001dpqB\u000ba(]z1P\u0016V,j`n?\u0018\u001b\\W6+\u001b\u0013UC$D9z\u0010", "Ad]1@,La\u0015\u0001zP0\f\f\u001ce\u000f5\u007f@\u000f", "AsP?g", "As^=", "Dda6Y@-`\u0015\b\tf0\f\u0018/rc6W>\u0010\u001b(G", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class Transmitter<T extends Message> implements Runnable {
    private final EventBusService eventBus;
    private final ExecutorService executor;
    private final HttpCommunicator httpCommunicator;
    private boolean isActive;
    private int maxMessagesToFlush;
    private final String name;
    private final TransmissionQueue<T> queue;
    private final RetransmitHandler retransmitHandler;
    private final Delay retryDelayer;
    private boolean shouldRun;
    private Thread thread;

    public Transmitter(String str, TransmissionQueue<T> transmissionQueue, HttpCommunicator httpCommunicator, RetransmitHandler retransmitHandler, EventBusService eventBusService) throws Throwable {
        Intrinsics.checkNotNullParameter(str, C1561oA.Yd("QERK", (short) (FB.Xd() ^ 25606)));
        Intrinsics.checkNotNullParameter(transmissionQueue, Xg.qd("chYj[", (short) (C1580rY.Xd() ^ (-2339)), (short) (C1580rY.Xd() ^ (-4711))));
        Intrinsics.checkNotNullParameter(httpCommunicator, Jg.Wd("`%\u000ef\";\u0012>O%\u0005[B\u0002U%", (short) (C1633zX.Xd() ^ (-27859)), (short) (C1633zX.Xd() ^ (-15058))));
        Intrinsics.checkNotNullParameter(retransmitHandler, ZO.xd("\u0010\u001dJp\\li\u000ek!agU\u0011A\u001a5", (short) (C1633zX.Xd() ^ (-7081)), (short) (C1633zX.Xd() ^ (-14630))));
        Intrinsics.checkNotNullParameter(eventBusService, C1626yg.Ud("\u001f\u0016&n\u0011\"xV", (short) (OY.Xd() ^ 10027), (short) (OY.Xd() ^ 9210)));
        this.name = str;
        this.queue = transmissionQueue;
        this.httpCommunicator = httpCommunicator;
        this.retransmitHandler = retransmitHandler;
        this.eventBus = eventBusService;
        this.retryDelayer = new Delay();
        short sXd = (short) (FB.Xd() ^ 3072);
        int[] iArr = new int["e\u0006\u000bXs\u000e#6}\u0012C7\u0003HXx0#Qa`!pc\u00133M\u0004'S".length()];
        QB qb = new QB("e\u0006\u000bXs\u000e#6}\u0012C7\u0003HXx0#Qa`!pc\u00133M\u0004'S");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd2 = (short) (FB.Xd() ^ 12947);
        int[] iArr2 = new int["5Z\\\u0017^@Kj2s\u0004m+7\u0004I9Bz\u0003@uP".length()];
        QB qb2 = new QB("5Z\\\u0017^@Kj2s\u0004m+7\u0004I9Bz\u0003@uP");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd2 + sXd2) + i3)) + xuXd2.CK(iKK2));
            i3++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
        try {
            declaredMethod.setAccessible(true);
            ExecutorService executorService = (ExecutorService) declaredMethod.invoke(null, objArr);
            Intrinsics.checkNotNullExpressionValue(executorService, C1561oA.Qd("$\u001a+\u0006\u001b\u001f\u0017\u001b\u0013\u0001\u0014\u001d\u000f\n\fk\u001e\n\u0007\u0018\u0016\u0010\u0012FF", (short) (C1633zX.Xd() ^ (-22782))));
            this.executor = executorService;
            this.maxMessagesToFlush = retransmitHandler.getMaxMessagesToFlush();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final void consume() {
        while (this.shouldRun) {
            try {
                T message = this.queue.take();
                Intrinsics.checkNotNullExpressionValue(message, "message");
                sendMessageWithRetries(message);
            } catch (InterruptedException e2) {
                Log.Companion.getLogger().debug("Transmitter thread " + this.name + " was interrupted. Attempting to shutdown gracefully.", e2);
            } catch (Throwable th) {
                Log.Companion.getLogger().error("An error occurred in transmitter thread " + this.name + ". Will attempt to recover in the next message.", th);
            }
        }
    }

    private final void flushMessages() {
        Log logger;
        StringBuilder sbAppend;
        ArrayList<Message> arrayList = new ArrayList();
        this.queue.drainTo(arrayList);
        if (this.maxMessagesToFlush <= 0) {
            logger = Log.Companion.getLogger();
            sbAppend = new StringBuilder("Transmitter thread ").append(this.name).append(" is aborting flush operation since number of messages to flush is ").append(this.maxMessagesToFlush);
        } else {
            if (arrayList.size() > this.maxMessagesToFlush) {
                Log.Companion.getLogger().info("Detected " + arrayList.size() + " messages to flush. Will take only " + this.maxMessagesToFlush + " messages according to the max setting");
                arrayList = new ArrayList(arrayList.subList(0, this.maxMessagesToFlush));
            }
            Log.Companion.getLogger().info("Transmitter thread " + this.name + " messages is about to flush " + arrayList.size() + " messages.");
            for (Message message : arrayList) {
                try {
                    Intrinsics.checkNotNullExpressionValue(message, "message");
                    sendMessage(message, false);
                } catch (Exception e2) {
                    Log.Companion.getLogger().error("An error has occurred while flushing messages", e2);
                }
            }
            logger = Log.Companion.getLogger();
            sbAppend = new StringBuilder("Transmitter thread ").append(this.name).append(" messages flush completed.");
        }
        logger.info(sbAppend.toString());
    }

    private final void sendMessage(final T t2, boolean z2) throws Exception {
        String str;
        Date date;
        Date date2 = new Date();
        Date date3 = new Date();
        String str2 = "";
        Future futureSubmit = this.executor.submit(new Callable() { // from class: com.biocatch.client.android.sdk.backend.communication.Transmitter$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Transmitter.m7040sendMessage$lambda0(this.f$0, t2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(futureSubmit, "this.executor.submit(Cal…etFormatted())\n        })");
        if (z2) {
            try {
                Object obj = futureSubmit.get();
                Intrinsics.checkNotNullExpressionValue(obj, "postHttpFuture.get()");
                str = (String) obj;
            } catch (InterruptedException e2) {
                e = e2;
            } catch (Exception e3) {
                e = e3;
                str = "";
            }
            try {
                date = new Date();
                e = null;
            } catch (InterruptedException e4) {
                e = e4;
                str2 = str;
                str = str2;
                date = date3;
            } catch (Exception e5) {
                e = e5;
                e = new HttpException("Http post failure", e);
                date = date3;
            }
            this.eventBus.publish(new WupInfoEvent(date2, date, t2, e));
            if (e != null) {
                throw e;
            }
            t2.getResultHandler().onSuccess(str, t2);
        }
    }

    static /* synthetic */ void sendMessage$default(Transmitter transmitter, Message message, boolean z2, int i2, Object obj) throws Exception {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        transmitter.sendMessage(message, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendMessage$lambda-0, reason: not valid java name */
    public static final String m7040sendMessage$lambda0(Transmitter this$0, Message message) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(message, "$message");
        return this$0.httpCommunicator.post(message.getFormatted());
    }

    private final void sendMessageWithRetries(T t2) throws Exception {
        this.retransmitHandler.initRetransmission();
        while (this.retransmitHandler.shouldRetransmit(t2.isMandatory())) {
            try {
                if (this.retransmitHandler.shouldDelay()) {
                    Log logger = Log.Companion.getLogger();
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str = String.format(this.name + " - Retrying to send message... #%s", Arrays.copyOf(new Object[]{Integer.valueOf(this.retransmitHandler.getTriesNum())}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                    logger.warning(str);
                    this.retryDelayer.milliseconds(this.retransmitHandler.getNextInterval());
                }
                sendMessage$default(this, t2, false, 2, null);
                this.retransmitHandler.setRetransmitSucceeded();
            } catch (HttpException e2) {
                Log.Companion.getLogger().warning(this.name + " - failed sending message", e2);
                this.retransmitHandler.setRetransmitFailed();
            }
        }
        if (this.retransmitHandler.isTransmissionSuccessful()) {
            return;
        }
        Log.Companion.getLogger().warning(this.name + " - Discarding message after " + (this.retransmitHandler.getTriesNum() - 1) + " failed attempts.");
        t2.getResultHandler().onError("Failed sending wup message. Max retry count reached, discarding message");
    }

    private final void verifyTransmitterIsActive() {
        if (!this.shouldRun) {
            throw new InvalidOperationException("Transmitter is not active. Enqueuing new items is not allowed");
        }
    }

    public final void configure(TransmitterSettings transmitterSettings) {
        Intrinsics.checkNotNullParameter(transmitterSettings, "transmitterSettings");
        this.retransmitHandler.updateTransmitterSettings(transmitterSettings);
        this.maxMessagesToFlush = transmitterSettings.getMaxMessagesToFlush();
    }

    public final void enqueue(T data) {
        Intrinsics.checkNotNullParameter(data, "data");
        verifyTransmitterIsActive();
        this.queue.offer(data);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.isActive = true;
        try {
            try {
                consume();
                flushMessages();
            } catch (InterruptedException e2) {
                Log.Companion.getLogger().debug("Transmitter thread " + this.name + " was interrupted. Attempting to shutdown gracefully.", e2);
            } catch (Exception e3) {
                Log.Companion.getLogger().error("An error occurred in transmitter thread. Thread " + this.name + " is shutting down.", e3);
            }
            this.isActive = false;
            Log.Companion.getLogger().info("Transmitter thread " + this.name + " was shut down.");
        } catch (Throwable th) {
            this.isActive = false;
            throw th;
        }
    }

    public final void start() {
        if (this.thread != null) {
            throw new InvalidOperationException("Transmitter already started");
        }
        Thread thread = new Thread(this, this.name);
        this.thread = thread;
        this.shouldRun = true;
        Intrinsics.checkNotNull(thread);
        thread.start();
    }

    public final void stop() throws InterruptedException {
        if (this.shouldRun) {
            this.shouldRun = false;
            Thread thread = this.thread;
            Intrinsics.checkNotNull(thread);
            thread.interrupt();
            Thread thread2 = this.thread;
            Intrinsics.checkNotNull(thread2);
            thread2.join();
            this.thread = null;
        }
    }
}
