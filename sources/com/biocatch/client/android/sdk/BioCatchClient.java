package com.biocatch.client.android.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.biocatch.android.commonsdk.collection.collectors.Collector;
import com.biocatch.android.commonsdk.contract.exceptions.InvalidOperationException;
import com.biocatch.client.android.sdk.Client;
import com.biocatch.client.android.sdk.contract.BCConsentStatus;
import com.biocatch.client.android.sdk.contract.BCConsentType;
import com.biocatch.client.android.sdk.contract.ExtendedOptions;
import com.biocatch.client.android.sdk.contract.LogClientEx;
import com.biocatch.client.android.sdk.contract.LogLevel;
import com.biocatch.client.android.sdk.contract.State;
import com.biocatch.client.android.sdk.contract.events.IEventListener;
import com.biocatch.client.android.sdk.contract.exceptions.IncompleteGroupException;
import com.biocatch.client.android.sdk.contract.exceptions.InvalidCustomerIDException;
import com.biocatch.client.android.sdk.contract.exceptions.InvalidCustomerSessionIDException;
import com.biocatch.client.android.sdk.contract.exceptions.InvalidServerURLFormatException;
import com.biocatch.client.android.sdk.contract.exceptions.InvalidStateException;
import com.biocatch.client.android.sdk.contract.exceptions.InvalidThreadException;
import com.biocatch.client.android.sdk.contract.exceptions.LibraryAlreadyStartedException;
import com.biocatch.client.android.sdk.contract.exceptions.LibraryAlreadyStoppedException;
import com.biocatch.client.android.sdk.contract.exceptions.LibraryNotInitializedException;
import com.biocatch.client.android.sdk.contract.exceptions.OperationFailedException;
import com.biocatch.client.android.sdk.core.exceptions.SDKException;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
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
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipMessage(CodedInputStream.java:305)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:251)
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
@Metadata(bv = {}, d1 = {"Яć\u0014D57\u001eq\u007fR܀kt\nA\u000e0!.J~(.\u001aw\u0015rr96EmHDR[*\u0015n\u000442[,ڎK;k\u001a\u0006\"\u000fVVguwRZ\u0011E\u0017\u0006,xr,OV\u0001](\u000f:ԏw?IMw=?`|6\u001b :\">{\r\u0001(HP\u0010\rzKK\u0012\u00148@\u0007:Z\rS\u0006\"\u0012\u001c>(ҵ&\\}N>ԟt]P/+\u0003oBTВ_Fŧ}\rtSg\u0012|aӿ/@E5]1a\u0013\u001fR\nP3C\u007fO\u001dhU:sU\u0002kNX.%E/]\"urTcMWn\"?+}t\u0012PV,\u0006\u0012\u0014\rj\u0015V\n5`F-HwP\u001aA\u000e\u000bSna2bP\u0012\u0013ad*m\u0004AEQ\u001b\u0015b*G'iO{3\u001eN'\u000f\u000b9[\u0003+)!)r\u0010Q_bpAVm\"YktL|p\"B\u0004^X03\n2F\u0017SY$Y1D\u0004\u0002vU\u0018z\u0013\u0005\u0001S\u0018YxD0\u0014.7X/<`Jd\u0013\u0013hT\u0007TWRd\r\u0015! \u0013Nm(@/I(N}o\u001an[\u0003\"%]\rgatk\u001c\u0001Q`I4\u007fj@gXv\"fTb3\u0001\u0017JY\fh\u0007@$HG\u0019;>\u0001\rt\u001a6J? -d0?=t\u0015v\nNFO)!_\to@\u0003bX<\u0003\u0018J%\u000f\u0007Pj\u0018\bg'qt=nEEA\u007fFI*cF\u00014+*7\u0003\u0002,_gzN|p$\u001bm{N<JAW/K<'\u0001?104uRxe_t*')%*\u0017Ah<\u0012 l\u0007+\u000f\u0016\u0011T\u001d_0\u001avrQ\u0019\u0015\u0004\b\u000f^zuj\u0005\u0011ilat\u0019XjUh\u0001\u0013K6%/vR\u0001CR['K<(\u001c5\u0015o\u0007\u0002qDx\u0011\u0016Vzk\u0004:\u000b.o\u0011y\u000e:A8W\u0004\u0017@8#\u001b.\u000b!x\u001b B7E=7Vn|p\u0005?}\u0011=,~\tB\f\u001f]\f>!\u001c\u00164\\fZwQ#,^qKAUYg{\u0017c^!I=\u0011;\b7n KU&fYr\t^7\"HfGAb\u0013c!$bTl\u0010\u0011Cb\u0014\u001e\u0012\u0011~t\u000bW)@t\f;\u0005\u001f\u0005\u0001bVV.xGv X\bE\u0014{\"\u0007hI\u0005\u001cW\u001d;qf\u0019SK\u001aKn]4~%Yz\u001dE)_p\u00019V\u000eGW7N\u0004u_6\b}DP\u0018+.r\u001c)ri\u0011\u000e1`b\u0019\u0011|N\u00133Bj`\f:)-9E\u001aJI'\u000bG`#spVdN&>\u0014,\u000f\u0018\\)5\u000e3$\u001dɔ/ޅ91UKp\u00175\u007f(aI\u0003 \"6&2vwƻcˍj\neͩ\u000b'\u007f\u001cz\u0004\u001f\u0012~':rؠxv\"0\u000e>]\u000b\u0004\u0011!hqk&,vk߿p\nZMn\u0005\u0018p=r|c#\u0003\u00158\r>ӊ1T5\u000b-\\<\u001cͦ^z"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G|;ws*\\A>I;\"\u0015qp\u000f", "", "u(E", "1kX2a;", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G}>q\u00167\\\u0019", "5dc\u0010_0>\\(", "u(;0b4\bP\u001d\txZ;z\fxc\u0007,{I\u0010`\u0013Pn\u001bFz$~g|&\u0001K\u001d2MLJA", "2hb=b::P ~Xe0|\u0012>", "Adb@\\6G7w", "", "5dc X:LW#\b^=", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "AsPAX", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ5\"-\u0011wa\u000f", "5dc g(MS", "u(;0b4\bP\u001d\txZ;z\fxc\u0007,{I\u0010`\u0013Pn\u001bFz$~g|&\u0001k 7\\P7iCg\u0003w]H\u00079", "Dda@\\6G", "5dc#X9LW#\b", "/cS\u0012i,Gb\u007f\u0003\tm,\u0006\t<", "", "3uT;g\u0013Ba(~\u0004^9", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ54/\u0015qpGPG\f_v0V3R:kR{=!g", "1gP;Z,\u001c]\"\u000ezq;", "1n]AX?M<\u0015\u0007z", "2hb=b:>1 \u0003zg;", "4kd@[", ">`d@X", "@d\\<i,\u001ed\u0019\b\nE0\u000b\u0018/n\u007f5", "@dbB`,", "Adc\u0010b6KR\u001d\bvm,\u000bp+s\u0006,\u0005B", "7r4;T)ES", "", "Adc\u0010h:M]!~\b;9x\u0012.", "0qP;W\u0015:[\u0019", "Adc\u0019b.%S*~\u0002", ":nV\u0019X=>Z", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ5\u001b(\u0017OaJ\u0007j\u0002", "AsP?g", "AdaCX9.` ", "/o_9\\*:b\u001d\t\u0004", "\u001a`]1e6BRbz\u0006iuX\u0014:l\u0004&wO\u0005! \u001d", "3wc2a+>R\u0003\n\nb6\u0006\u0017", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ5\u00141$hj8\u0007b\u0016Y\u0006+QU\\\u0002", "1tbAb4>`\u0007~\tl0\u0007\u0012\u0013D", "1ta?X5M/\u0017\u000e~o0\f\u001d", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "1tbAb4>`|]", "AdaCX9.@\u007f", ":nV\u000eW+KS'\rjK\u0013", "3wc2e5:Zv\t\u0002e,z\u00189r\u000e", "", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p%VU3\\P\u0002G!g", "AsP?g\u0015>e\u0007~\tl0\u0007\u0012", "As^=", "AtQ@V9BP\u0019e\u0005`\n\u0004\r/n\u000f", ":nV\u0010_0>\\(^\u000e", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ5\u001b(\u0017Fh=\u0007l;.\n|", "CmbBU:<`\u001d{zE6~f6i\u007f1\u000b", "CoS.g,\u001c]\"\rzg;j\u0018+t\u00106", "1n]@X5MB-\nz", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ5\u0011{rrjG\u0007l;=\u000b2G\"", "1n]@X5MA(z\nn:", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ5\u0011{rrjG\u0007l;<\u0006#V\\\\\u0002", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "CoS.g,\u001cc'\u000e\u0005f,\nv/s\u000e,\u0006Idu", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class BioCatchClient {
    public static final BioCatchClient INSTANCE = new BioCatchClient();
    private static Client disposableClient = null;

    private BioCatchClient() {
    }

    private final void disposeClient() {
        disposableClient = null;
    }

    private final Client getClient() {
        Client client = disposableClient;
        if (client != null) {
            return client;
        }
        Client client2 = new Client();
        disposableClient = client2;
        return client2;
    }

    public static /* synthetic */ void start$default(BioCatchClient bioCatchClient, String str, Application application, ExtendedOptions extendedOptions, int i2, Object obj) throws InvalidOperationException, InvalidStateException, LibraryAlreadyStoppedException, InvalidThreadException, InvalidServerURLFormatException, OperationFailedException, LibraryAlreadyStartedException {
        if ((i2 & 4) != 0) {
            extendedOptions = new ExtendedOptions();
        }
        bioCatchClient.start(str, application, extendedOptions);
    }

    public static /* synthetic */ void start$default(BioCatchClient bioCatchClient, String str, Application application, String str2, ExtendedOptions extendedOptions, Activity activity, int i2, Object obj) throws InvalidOperationException, InvalidStateException, LibraryAlreadyStoppedException, InvalidThreadException, InvalidServerURLFormatException, OperationFailedException, LibraryAlreadyStartedException {
        ExtendedOptions extendedOptions2 = extendedOptions;
        String str3 = str2;
        if ((i2 + 4) - (4 | i2) != 0) {
            str3 = null;
        }
        if ((i2 + 8) - (8 | i2) != 0) {
            extendedOptions2 = new ExtendedOptions();
        }
        bioCatchClient.start(str, application, str3, extendedOptions2, (i2 + 16) - (i2 | 16) == 0 ? activity : null);
    }

    public static /* synthetic */ void start$default(BioCatchClient bioCatchClient, String str, String str2, Application application, ExtendedOptions extendedOptions, int i2, Object obj) throws InvalidOperationException, InvalidStateException, LibraryAlreadyStoppedException, InvalidCustomerIDException, InvalidThreadException, InvalidServerURLFormatException, IncompleteGroupException, OperationFailedException, LibraryAlreadyStartedException {
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            extendedOptions = new ExtendedOptions();
        }
        bioCatchClient.start(str, str2, application, extendedOptions);
    }

    public static /* synthetic */ void start$default(BioCatchClient bioCatchClient, String str, String str2, Application application, String str3, ExtendedOptions extendedOptions, Activity activity, int i2, Object obj) throws InvalidOperationException, InvalidStateException, LibraryAlreadyStoppedException, InvalidCustomerIDException, InvalidThreadException, InvalidServerURLFormatException, IncompleteGroupException, OperationFailedException, LibraryAlreadyStartedException {
        ExtendedOptions extendedOptions2 = extendedOptions;
        String str4 = str3;
        if ((i2 + 8) - (8 | i2) != 0) {
            str4 = null;
        }
        if ((i2 + 16) - (16 | i2) != 0) {
            extendedOptions2 = new ExtendedOptions();
        }
        bioCatchClient.start(str, str2, application, str4, extendedOptions2, (i2 + 32) - (i2 | 32) == 0 ? activity : null);
    }

    public static /* synthetic */ void start$default(BioCatchClient bioCatchClient, String str, String str2, String str3, Application application, String str4, ExtendedOptions extendedOptions, Activity activity, int i2, Object obj) throws InvalidOperationException, InvalidStateException, LibraryAlreadyStoppedException, InvalidCustomerIDException, InvalidThreadException, InvalidServerURLFormatException, IncompleteGroupException, OperationFailedException, LibraryAlreadyStartedException {
        ExtendedOptions extendedOptions2 = extendedOptions;
        String str5 = str4;
        if ((i2 & 16) != 0) {
            str5 = null;
        }
        if ((i2 & 32) != 0) {
            extendedOptions2 = new ExtendedOptions();
        }
        bioCatchClient.start(str, str2, str3, application, str5, extendedOptions2, (i2 + 64) - (i2 | 64) == 0 ? activity : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void start$default(BioCatchClient bioCatchClient, String str, String str2, String str3, Application application, String str4, List list, ExtendedOptions extendedOptions, Activity activity, int i2, Object obj) throws InvalidOperationException, InvalidStateException, LibraryAlreadyStoppedException, InvalidCustomerIDException, InvalidThreadException, InvalidServerURLFormatException, IncompleteGroupException, OperationFailedException, LibraryAlreadyStartedException {
        ExtendedOptions extendedOptions2 = extendedOptions;
        List listEmptyList = list;
        String str5 = str4;
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            str5 = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
            listEmptyList = CollectionsKt.emptyList();
        }
        if ((i2 + 64) - (i2 | 64) != 0) {
            extendedOptions2 = new ExtendedOptions();
        }
        bioCatchClient.start(str, str2, str3, application, str5, listEmptyList, extendedOptions2, (i2 & 128) == 0 ? activity : null);
    }

    public static /* synthetic */ void startNewSession$default(BioCatchClient bioCatchClient, String str, int i2, Object obj) throws LibraryNotInitializedException, InvalidCustomerSessionIDException, InvalidThreadException, OperationFailedException {
        if ((i2 & 1) != 0) {
            str = null;
        }
        bioCatchClient.startNewSession(str);
    }

    public final void addEventListener(IEventListener eventListener) throws InvalidThreadException, SDKException, OperationFailedException {
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Client.Companion.verifyMainThread();
        getClient().addEventListener(eventListener);
    }

    public final void changeContext(String contextName) throws LibraryNotInitializedException, InvalidThreadException, OperationFailedException {
        Intrinsics.checkNotNullParameter(contextName, "contextName");
        Client.Companion.verifyMainThread();
        try {
            getClient().changeContext(contextName);
        } catch (Exception e2) {
            throw new OperationFailedException(e2.getMessage(), null, 2, null);
        }
    }

    public final void flush() throws LibraryNotInitializedException, InvalidThreadException, OperationFailedException {
        Client.Companion.verifyMainThread();
        try {
            getClient().flush();
        } catch (Exception e2) {
            throw new OperationFailedException(e2.getMessage(), null, 2, null);
        }
    }

    public final String getSessionID() throws LibraryNotInitializedException, InvalidThreadException {
        Client.Companion.verifyMainThread();
        return getClient().getSessionID();
    }

    public final State getState() throws LibraryNotInitializedException, InvalidThreadException, OperationFailedException {
        Client.Companion.verifyMainThread();
        return getClient().getState();
    }

    public final String getVersion() throws InvalidThreadException {
        Client.Companion companion = Client.Companion;
        companion.verifyMainThread();
        return companion.getVersion();
    }

    public final void pause() throws LibraryNotInitializedException, InvalidStateException, InvalidThreadException, OperationFailedException {
        Client.Companion.verifyMainThread();
        getClient().pause();
    }

    public final void removeEventListener(IEventListener eventListener) throws InvalidThreadException, SDKException, OperationFailedException {
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Client.Companion.verifyMainThread();
        getClient().removeEventListener(eventListener);
    }

    public final void resume() throws LibraryNotInitializedException, InvalidStateException, InvalidThreadException, OperationFailedException {
        Client.Companion.verifyMainThread();
        getClient().resume();
    }

    public final void setCoordinatesMasking(boolean z2) throws LibraryNotInitializedException, InvalidThreadException, OperationFailedException {
        Client.Companion.verifyMainThread();
        try {
            getClient().setCoordinatesMasking(z2);
        } catch (Exception e2) {
            throw new OperationFailedException(e2.getMessage(), null, 2, null);
        }
    }

    public final void setCustomerBrand(String brandName) throws LibraryNotInitializedException, InvalidThreadException, OperationFailedException {
        Intrinsics.checkNotNullParameter(brandName, "brandName");
        Client.Companion.verifyMainThread();
        try {
            getClient().setBrand(brandName);
        } catch (Exception e2) {
            throw new OperationFailedException(e2.getMessage(), null, 2, null);
        }
    }

    public final void setLogLevel(LogLevel logLevel) throws InvalidThreadException {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        Client.Companion.setLogLevel(logLevel);
    }

    @Deprecated(message = "\u0010K\u0010=\u0001xT`k\u0007,\u007f`'1Q]`\u000e+Di\u001aV6]wvZ4&k(^iO\\rm=\u0006 Ly\u0017dP91^\b\r5\u0010\u0004_K<'IZw@\u0016w\u001e}80T\u0014\u0001\u001d/\r\u0010P\u001fC\u000e\u000176Dgt<Wi")
    @InterfaceC1492Gx
    public final void start(String serverUrl, Application application) throws InvalidOperationException, InvalidStateException, LibraryAlreadyStoppedException, InvalidThreadException, InvalidServerURLFormatException, OperationFailedException, LibraryAlreadyStartedException {
        Intrinsics.checkNotNullParameter(serverUrl, "serverUrl");
        Intrinsics.checkNotNullParameter(application, "application");
        start$default(this, serverUrl, application, null, null, null, 28, null);
    }

    @Deprecated(message = "\u0010K\u0010=\u0001xT`k\u0007,\u007f`'1Q]`\u000e+Di\u001aV6]wvZ4&k(^iO\\rm=\u0006 Ly\u0017dP91^\b\r5\u0010\u0004_K<'IZw@\u0016w\u001e}80T\u0014\u0001\u001d/\r\u0010P\u001fC\u000e\u000176Dgt<Wi")
    @InterfaceC1492Gx
    public final void start(String serverUrl, Application application, ExtendedOptions extendedOptions) throws InvalidOperationException, InvalidStateException, LibraryAlreadyStoppedException, InvalidThreadException, InvalidServerURLFormatException, OperationFailedException, LibraryAlreadyStartedException {
        Intrinsics.checkNotNullParameter(serverUrl, "serverUrl");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(extendedOptions, "extendedOptions");
        start$default(this, serverUrl, application, null, extendedOptions, null, 16, null);
    }

    @Deprecated(message = "\u0010K\u0010=\u0001xT`k\u0007,\u007f`'1Q]`\u000e+Di\u001aV6]wvZ4&k(^iO\\rm=\u0006 Ly\u0017dP91^\b\r5\u0010\u0004_K<'IZw@\u0016w\u001e}80T\u0014\u0001\u001d/\r\u0010P\u001fC\u000e\u000176Dgt<Wi")
    @InterfaceC1492Gx
    public final void start(String serverUrl, Application application, String str) throws InvalidOperationException, InvalidStateException, LibraryAlreadyStoppedException, InvalidThreadException, InvalidServerURLFormatException, OperationFailedException, LibraryAlreadyStartedException {
        Intrinsics.checkNotNullParameter(serverUrl, "serverUrl");
        Intrinsics.checkNotNullParameter(application, "application");
        start$default(this, serverUrl, application, str, null, null, 24, null);
    }

    @Deprecated(message = "\u0010K\u0010=\u0001xT`k\u0007,\u007f`'1Q]`\u000e+Di\u001aV6]wvZ4&k(^iO\\rm=\u0006 Ly\u0017dP91^\b\r5\u0010\u0004_K<'IZw@\u0016w\u001e}80T\u0014\u0001\u001d/\r\u0010P\u001fC\u000e\u000176Dgt<Wi")
    @InterfaceC1492Gx
    public final void start(String serverUrl, Application application, String str, ExtendedOptions extendedOptions) throws InvalidOperationException, InvalidStateException, LibraryAlreadyStoppedException, InvalidThreadException, InvalidServerURLFormatException, OperationFailedException, LibraryAlreadyStartedException {
        Intrinsics.checkNotNullParameter(serverUrl, "serverUrl");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(extendedOptions, "extendedOptions");
        start$default(this, serverUrl, application, str, extendedOptions, null, 16, null);
    }

    @Deprecated(message = "\u0010K\u0010=\u0001xT`k\u0007,\u007f`'1Q]`\u000e+Di\u001aV6]wvZ4&k(^iO\\rm=\u0006 Ly\u0017dP91^\b\r5\u0010\u0004_K<'IZw@\u0016w\u001e}80T\u0014\u0001\u001d/\r\u0010P\u001fC\u000e\u000176Dgt<Wi")
    @InterfaceC1492Gx
    public final void start(String serverUrl, Application application, String str, ExtendedOptions extendedOptions, Activity activity) throws InvalidOperationException, InvalidStateException, LibraryAlreadyStoppedException, InvalidThreadException, InvalidServerURLFormatException, OperationFailedException, LibraryAlreadyStartedException {
        Intrinsics.checkNotNullParameter(serverUrl, "serverUrl");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(extendedOptions, "extendedOptions");
        Client.Companion.verifyMainThread();
        if (getClient().getState() != State.STOPPED) {
            throw new InvalidStateException("Library is not stopped. Unable to start", null, 2, null);
        }
        getClient().start(serverUrl, application, str, extendedOptions, activity);
    }

    public final void start(String serverUrl, String customerID, Application application) throws InvalidOperationException, InvalidStateException, LibraryAlreadyStoppedException, InvalidCustomerIDException, InvalidThreadException, InvalidServerURLFormatException, IncompleteGroupException, OperationFailedException, LibraryAlreadyStartedException {
        Intrinsics.checkNotNullParameter(serverUrl, "serverUrl");
        Intrinsics.checkNotNullParameter(customerID, "customerID");
        Intrinsics.checkNotNullParameter(application, "application");
        start$default(this, serverUrl, customerID, application, null, null, null, 56, null);
    }

    public final void start(String serverUrl, String customerID, Application application, ExtendedOptions extendedOptions) throws InvalidOperationException, InvalidStateException, LibraryAlreadyStoppedException, InvalidCustomerIDException, InvalidThreadException, InvalidServerURLFormatException, IncompleteGroupException, OperationFailedException, LibraryAlreadyStartedException {
        Intrinsics.checkNotNullParameter(serverUrl, "serverUrl");
        Intrinsics.checkNotNullParameter(customerID, "customerID");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(extendedOptions, "extendedOptions");
        start(serverUrl, customerID, application, null, extendedOptions, null);
    }

    public final void start(String serverUrl, String customerID, Application application, String str) throws InvalidOperationException, InvalidStateException, LibraryAlreadyStoppedException, InvalidCustomerIDException, InvalidThreadException, InvalidServerURLFormatException, IncompleteGroupException, OperationFailedException, LibraryAlreadyStartedException {
        Intrinsics.checkNotNullParameter(serverUrl, "serverUrl");
        Intrinsics.checkNotNullParameter(customerID, "customerID");
        Intrinsics.checkNotNullParameter(application, "application");
        start$default(this, serverUrl, customerID, application, str, null, null, 48, null);
    }

    public final void start(String serverUrl, String customerID, Application application, String str, ExtendedOptions extendedOptions) throws InvalidOperationException, InvalidStateException, LibraryAlreadyStoppedException, InvalidCustomerIDException, InvalidThreadException, InvalidServerURLFormatException, IncompleteGroupException, OperationFailedException, LibraryAlreadyStartedException {
        Intrinsics.checkNotNullParameter(serverUrl, "serverUrl");
        Intrinsics.checkNotNullParameter(customerID, "customerID");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(extendedOptions, "extendedOptions");
        start$default(this, serverUrl, customerID, application, str, extendedOptions, null, 32, null);
    }

    public final void start(String serverUrl, String customerID, Application application, String str, ExtendedOptions extendedOptions, Activity activity) throws InvalidOperationException, InvalidStateException, LibraryAlreadyStoppedException, InvalidCustomerIDException, InvalidThreadException, InvalidServerURLFormatException, IncompleteGroupException, OperationFailedException, LibraryAlreadyStartedException {
        Intrinsics.checkNotNullParameter(serverUrl, "serverUrl");
        Intrinsics.checkNotNullParameter(customerID, "customerID");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(extendedOptions, "extendedOptions");
        Client.Companion.verifyMainThread();
        if (getClient().getState() != State.STOPPED) {
            throw new InvalidStateException("Library is not stopped. Unable to start", null, 2, null);
        }
        start(serverUrl, null, customerID, application, str, CollectionsKt.emptyList(), extendedOptions, activity);
    }

    public final void start(String serverURL, String str, String customerID, Application application, String str2, ExtendedOptions extendedOptions, Activity activity) throws InvalidOperationException, InvalidStateException, LibraryAlreadyStoppedException, InvalidCustomerIDException, InvalidThreadException, InvalidServerURLFormatException, IncompleteGroupException, OperationFailedException, LibraryAlreadyStartedException {
        Intrinsics.checkNotNullParameter(serverURL, "serverURL");
        Intrinsics.checkNotNullParameter(customerID, "customerID");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(extendedOptions, "extendedOptions");
        Client.Companion.verifyMainThread();
        if (getClient().getState() != State.STOPPED) {
            throw new InvalidStateException("Library is not stopped. Unable to start", null, 2, null);
        }
        start(serverURL, str, customerID, application, str2, CollectionsKt.emptyList(), extendedOptions, activity);
    }

    public final void start(String serverURL, String str, String customerID, Application application, String str2, List<? extends Collector> externalCollectors, ExtendedOptions extendedOptions, Activity activity) throws InvalidOperationException, InvalidStateException, LibraryAlreadyStoppedException, InvalidCustomerIDException, InvalidThreadException, InvalidServerURLFormatException, IncompleteGroupException, OperationFailedException, LibraryAlreadyStartedException {
        Intrinsics.checkNotNullParameter(serverURL, "serverURL");
        Intrinsics.checkNotNullParameter(customerID, "customerID");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(externalCollectors, "externalCollectors");
        Intrinsics.checkNotNullParameter(extendedOptions, "extendedOptions");
        Client.Companion.verifyMainThread();
        if (getClient().getState() != State.STOPPED) {
            throw new InvalidStateException("Library is not stopped. Unable to start", null, 2, null);
        }
        getClient().start(serverURL, str, customerID, application, str2, externalCollectors, extendedOptions, activity);
    }

    public final void startNewSession() throws LibraryNotInitializedException, InvalidCustomerSessionIDException, InvalidThreadException, OperationFailedException {
        startNewSession$default(this, null, 1, null);
    }

    public final void startNewSession(String str) throws LibraryNotInitializedException, InvalidCustomerSessionIDException, InvalidThreadException, OperationFailedException {
        Client.Companion.verifyMainThread();
        getClient().startNewSession(str);
    }

    public final void stop() throws LibraryNotInitializedException, InvalidThreadException, OperationFailedException {
        Client.Companion.verifyMainThread();
        try {
            getClient().stop();
        } finally {
            disposeClient();
        }
    }

    public final void subscribeLogClient(LogClientEx logClientEx) throws InvalidThreadException, OperationFailedException {
        Intrinsics.checkNotNullParameter(logClientEx, "logClientEx");
        Client.Companion companion = Client.Companion;
        companion.verifyMainThread();
        try {
            companion.subscribeLogClient(logClientEx);
        } catch (Exception e2) {
            throw new OperationFailedException(e2.getMessage(), null, 2, null);
        }
    }

    public final void unsubscribeLogClient(LogClientEx logClientEx) throws InvalidThreadException, OperationFailedException {
        Intrinsics.checkNotNullParameter(logClientEx, "logClientEx");
        Client.Companion companion = Client.Companion;
        companion.verifyMainThread();
        try {
            companion.unsubscribeLogClient(logClientEx);
        } catch (Exception e2) {
            throw new OperationFailedException(e2.getMessage(), null, 2, null);
        }
    }

    public final void updateConsentStatus(BCConsentType consentType, BCConsentStatus consentStatus, Context context) {
        Intrinsics.checkNotNullParameter(consentType, "consentType");
        Intrinsics.checkNotNullParameter(consentStatus, "consentStatus");
        Intrinsics.checkNotNullParameter(context, "context");
        getClient().updateConsentStatus(consentType, consentStatus, context);
    }

    public final void updateCustomerSessionID(String customerSessionID) throws LibraryNotInitializedException, InvalidCustomerSessionIDException, InvalidThreadException, SDKException, OperationFailedException {
        Intrinsics.checkNotNullParameter(customerSessionID, "customerSessionID");
        Client.Companion.verifyMainThread();
        getClient().setCustomerSessionID(customerSessionID);
    }
}
