package com.braze.push;

import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.braze.IBrazeNotificationFactory;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.hS2\u000fq{<$q$yّCU0}*\tUOm{\u0005Ϻx\u001as\u000f4\u00151i;\nXޯa\u0012\u001d2\u000b\u001eM4eqS8\u000fvf\u000b.5::\u0010\u0004/\u001eZN\u001e{\u0013Ea\u000b@6pvHY%O\u001b\u0019@\u000en&\u000f'tid5vt&J=$\u001bkXMUa`\u0001[\u0017^TU\u0018=ufYNCM\u0017;R1\u0014\u0003aM\u0011WsS\u0004\u0017+W1Wxo8n~B\u001b[U\u001bd\u000b(r\u0004\u007fh<-9X{Mf\rV\u007fߧ\u007f\u001d"}, d2 = {"\u001ab^:\")KO.~Di<\u000b\fxB\r$\u0011@i!&Kp\u0012:r49c\u0007\u00013k%8ZW\u0011", "\u001ab^:\")KO.~DB\t\n\u0005Deh2\u000bD\u0002\u001b\u0015C~\u0012F\u007f\u00061W\r*D\u0002k", "u(E", "1qT.g,'](\u0003{b*x\u00183o\t", "\u001a`]1e6BRbz\u0006iue\u0013>i\u0001,y<\u0010\u001b!PE", "/o_\u0010b5?W\u001b\u000f\bZ;\u0001\u00138P\r2\rD\u007f\u0017$", "\u001ab^:\")KO.~D\\6\u0006\n3g\u00105wO\u0005! \u0011L\u001b8\f%\u0013c\u0007!;o&;IR?u=\t\"rr=\u0006c9$", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "<nc6Y0<O(\u0003\u0005g\f\u0010\u0018<a\u000e", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "0qPGX\fQb&z\t", ">`h9b(=", "\u001ab^:\")KO.~Df6{\t6sI3\fN\u0004`sTk#<_/D]~$5i%2WL&gH%\u001fd`\u000f", ">n_B_(MS\u0002\t\nb-\u0001\u0007+t\u00042\u0005\u001d\u0011\u001b\u001eFo\u001b", "\u001a`]1e6BR,Hxh9|R+p\u000bqdJ\u0010\u001b\u0018Km\nKz/>7\b(Bi%l*S?r3\u001e\">", "1n]3\\.N`\u0015\u000e~h5g\u00169v\u0004'{M", "\u0011n\\=T5B]\"", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class BrazeNotificationFactory implements IBrazeNotificationFactory {
    public static final Companion Companion = new Companion(null);
    private static final BrazeNotificationFactory internalInstance = new BrazeNotificationFactory();

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005%4\u0012\u000e\u0007nʑA0ZeP\u008cXݾ+%ӆ,4RZdvI;ڈ\u001e}0\t\u0018^un\u0007Lp\nq\u00176\u001a\u0007sDI\u0004\u0003$\u0017_JPpW3{qs}7Ң8ӯ$<2:\u007f\b\u000f\u001aBJ\u0016z\tH\u001c\u0018 6XphTcˢ\u0007ܨ\u0016\u0006FĨӞ\"g"}, d2 = {"\u001ab^:\")KO.~Di<\u000b\fxB\r$\u0011@i!&Kp\u0012:r49c\u0007\u00013k%8ZWyI>& dj=\u0011l\u0002", "", "u(E", "7mbAT5<S", "\u001ab^:\")KO.~Di<\u000b\fxB\r$\u0011@i!&Kp\u0012:r49c\u0007\u00013k%8ZW\u0011", "5dc\u0016a:MO\"|z\u001d(\u0006\u00129t{7\u007fJ\n%", "5dc\u0016a:MO\"|z", "u(;0b4\bP&z\u0010^u\b\u0019=hI\u0005\t<\u0016\u0017\u007fQ~\u0012=z#1h\u0002*@N\u0012,\\MH\u007f\n", "7mc2e5:Z|\b\tm(\u0006\u0007/", ">n_B_(MS\u0002\t\nb-\u0001\u0007+t\u00042\u0005\u001d\u0011\u001b\u001eFo\u001b", "\u001a`]1e6BR,Hxh9|R+p\u000bqdJ\u0010\u001b\u0018Km\nKz/>7\b(Bi%l*S?r3\u001e\">", ">`h9b(=", "\u001ab^:\")KO.~Df6{\t6sI3\fN\u0004`sTk#<_/D]~$5i%2WL&gH%\u001fd`\u000f", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getInstance$annotations() {
        }

        public final BrazeNotificationFactory getInstance() {
            return BrazeNotificationFactory.internalInstance;
        }

        @JvmStatic
        public final NotificationCompat.Builder populateNotificationBuilder(final BrazeNotificationPayload payload) throws Throwable {
            Intrinsics.checkNotNullParameter(payload, "payload");
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationFactory$Companion$populateNotificationBuilder$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Using BrazeNotificationPayload: " + payload;
                }
            }, 6, (Object) null);
            Context context = payload.getContext();
            if (context == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationFactory$Companion$populateNotificationBuilder$2
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "BrazeNotificationPayload has null context. Not creating notification";
                    }
                }, 7, (Object) null);
                return null;
            }
            BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
            if (configurationProvider == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationFactory$Companion$populateNotificationBuilder$3
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "BrazeNotificationPayload has null app configuration provider. Not creating notification";
                    }
                }, 7, (Object) null);
                return null;
            }
            Bundle notificationExtras = payload.getNotificationExtras();
            BrazeNotificationUtils.prefetchBitmapsIfNewlyReceivedStoryPush(payload);
            NotificationCompat.Builder autoCancel = new NotificationCompat.Builder(context, BrazeNotificationUtils.getOrCreateNotificationChannelId(payload)).setAutoCancel(true);
            Intrinsics.checkNotNullExpressionValue(autoCancel, "Builder(context, notific…     .setAutoCancel(true)");
            BrazeNotificationUtils.setTitleIfPresent(autoCancel, payload);
            BrazeNotificationUtils.setContentIfPresent(autoCancel, payload);
            BrazeNotificationUtils.setTickerIfPresent(autoCancel, payload);
            BrazeNotificationUtils.setSetShowWhen(autoCancel, payload);
            BrazeNotificationUtils.setContentIntentIfPresent(context, autoCancel, notificationExtras);
            BrazeNotificationUtils.setDeleteIntent(context, autoCancel, notificationExtras);
            BrazeNotificationUtils.setSmallIcon(configurationProvider, autoCancel);
            BrazeNotificationUtils.setLargeIconIfPresentAndSupported(autoCancel, payload);
            BrazeNotificationUtils.setSoundIfPresentAndSupported(autoCancel, payload);
            BrazeNotificationUtils.setSummaryTextIfPresentAndSupported(autoCancel, payload);
            BrazeNotificationUtils.setPriorityIfPresentAndSupported(autoCancel, payload);
            BrazeNotificationStyleFactory.Companion.setStyleIfSupported(autoCancel, payload);
            BrazeNotificationActionUtils.addNotificationActions(autoCancel, payload);
            BrazeNotificationUtils.setAccentColorIfPresentAndSupported(autoCancel, payload);
            BrazeNotificationUtils.setCategoryIfPresentAndSupported(autoCancel, payload);
            BrazeNotificationUtils.setVisibilityIfPresentAndSupported(autoCancel, payload);
            BrazeNotificationUtils.setPublicVersionIfPresentAndSupported(autoCancel, payload);
            BrazeNotificationUtils.setNotificationBadgeNumberIfPresent(autoCancel, payload);
            return autoCancel;
        }
    }

    public static final BrazeNotificationFactory getInstance() {
        return Companion.getInstance();
    }

    @JvmStatic
    public static final NotificationCompat.Builder populateNotificationBuilder(BrazeNotificationPayload brazeNotificationPayload) {
        return Companion.populateNotificationBuilder(brazeNotificationPayload);
    }

    public final Notification createNotification(BrazeConfigurationProvider brazeConfigurationProvider, Context context, Bundle bundle, Bundle bundle2) {
        return createNotification(new BrazeNotificationPayload(bundle, bundle2, context, brazeConfigurationProvider));
    }

    @Override // com.braze.IBrazeNotificationFactory
    public Notification createNotification(BrazeNotificationPayload payload) throws Throwable {
        Intrinsics.checkNotNullParameter(payload, "payload");
        NotificationCompat.Builder builderPopulateNotificationBuilder = Companion.populateNotificationBuilder(payload);
        if (builderPopulateNotificationBuilder != null) {
            return builderPopulateNotificationBuilder.build();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationFactory.createNotification.1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Notification could not be built. Returning null as created notification";
            }
        }, 6, (Object) null);
        return null;
    }

    public final NotificationCompat.Builder populateNotificationBuilder(BrazeConfigurationProvider brazeConfigurationProvider, Context context, Bundle bundle, Bundle bundle2) {
        return Companion.populateNotificationBuilder(new BrazeNotificationPayload(bundle, bundle2, context, brazeConfigurationProvider));
    }
}
