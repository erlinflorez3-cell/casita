package com.biocatch.client.android.sdk.collection.collectors.voip;

import android.content.Context;
import android.media.AudioManager;
import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.android.commonsdk.collection.ConfigKeys;
import com.biocatch.android.commonsdk.collection.Group;
import com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.core.exceptions.InvalidOperationException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

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
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?0Le^.Zݷ2\u000f\u0002{<$a%yCQU\"}(\nWNusvJ`\fK\u000f\u001c\u0016\u0001̓4Icxe܈\u00172XoG3SqC8vҚf\u000b0428(\u0005/\u0019j[ z\tDc\f@2PtHU%M3\u001eŪ\n>.\u0006fjudNH\u001btj31\u001b\u0002B|@&0ES\u001b`l';\u000e(\u001esFEP-%\u0002\u001aMf$E\u0011[\n=3\u007fm;{W\u0002]NZ\u0016\u0013C2&\u0558ię*\\\rĩ1\u001e53gcyYD|Nߕ}Ɂ@\b&\b-R<8jx\u0016\u001aKt!`v%XޠDȸ~eN\u0019+\u000eA:\n'tTy;GR\u000eީ\u0007ڟ\"#\t͙qmb\u001ex\u0015Ie.&\bҜBףLR\"[C\u007f\u0012\u00043\u00108\u0018HI\u0016.*&\u0005ϒ1ھ_9+ܩ<\u000eVE\u007fv3b?\u05c8kʐL@*Âޔ;G"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011]X0g\u001ccG\u0018\u001d8\nU2j\u000f`H$lSA,]", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p%VW;`[\u0003G$ 8\u0018U2\r\u0003hK1D", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011]X0g\u001ccG\u0018\u001d8\nU2t\u000fXA+D", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G\u001eAz\u0016w=R?rBs{dj8\u0014m0M@%QU],ea<\u001b\u001e\u001bi\u000ea:bHJ", "/tS6b\u0014:\\\u0015\u0001zk", "\u001a`]1e6BRb\u0007z]0xR\u000bu~,\u0006(| \u0013Io\u001b\u0012", "1n[9X*M]&bY", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "5dc\u0010b3ES\u0017\u000e\u0005k\u0010[", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^Fk@\u000ec*]\u00014++$", "1n]3\\.$S-", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001fqb=\tI,b\u0005|", "5dc\u0010b5?W\u001bdzr", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^FkB\bg.4v;U\"", "4qX2a+Eg\u0002z\u0003^", "", "5dc\u0013e0>\\\u0018\u0006\u000fG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", ";nS26/:\\\u001b~yE0\u000b\u0018/n\u007f5", "\u001a`]1e6BRb\u0007z]0xR\u000bu~,\u0006(| \u0013Io\u001bz`.\u001dc| \u0015p\u00127OC:R8,$hj9\u00149", "@d_<e;&]\u0018~Xa(\u0006\u000b/d", "", ";nS2", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011]X0g\u001ccG\u0018\u001d8\nU2z\u0014UP$D", "Adc\u001ab+>1\u001cz\u0004`,{o3s\u000f(\u0005@\u000e", "AsP?g", "As^=", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class VoipCallCollector extends ContinuousCollector<VoipCallModel> {
    private AudioManager audioManager;
    private final Context context;
    private AudioManager.OnModeChangedListener modeChangedListener;
    private final Utils utils;

    public VoipCallCollector(Utils utils, Context context) {
        Intrinsics.checkNotNullParameter(utils, "utils");
        Intrinsics.checkNotNullParameter(context, "context");
        this.utils = utils;
        this.context = context;
    }

    private final void reportModeChanged(VoipCallState voipCallState) {
        if (voipCallState == VoipCallState.UNSUPPORTED) {
            Log.Companion.getLogger().debug("Received an unknown voip call mode: " + voipCallState.ordinal());
            return;
        }
        addToQueue(new VoipCallModel(getContextIDCache().get(), getCurrentEventId(), this.utils.currentTimeMillis(), voipCallState));
    }

    private final void setModeChangedListener() {
        this.modeChangedListener = new AudioManager.OnModeChangedListener() { // from class: com.biocatch.client.android.sdk.collection.collectors.voip.VoipCallCollector$$ExternalSyntheticLambda0
            @Override // android.media.AudioManager.OnModeChangedListener
            public final void onModeChanged(int i2) {
                VoipCallCollector.m7042setModeChangedListener$lambda3(this.f$0, i2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setModeChangedListener$lambda-3, reason: not valid java name */
    public static final void m7042setModeChangedListener$lambda3(VoipCallCollector this$0, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.reportModeChanged(VoipCallState.Companion.getMode(i2));
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public CollectorID getCollectorID() {
        return CollectorID.Voip;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector, com.biocatch.android.commonsdk.collection.collectors.Collector
    public ConfigKeys getConfigKey() {
        return ConfigKeys.isVoip;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public String getFriendlyName() {
        return Group.VOIP;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void start() throws Throwable {
        AudioManager audioManager;
        if (isStarted()) {
            Log logger = Log.Companion.getLogger();
            short sXd = (short) (C1607wl.Xd() ^ 14736);
            int[] iArr = new int["7OHN|?JFE=:JDFr;Do0:?1,.Bg::&67'%m^~\u001f+-.\"&\u001eU)\u001c\u0018Q$$\u0010 !K\u001a\u001a\u000e\u001a\b\u001a\u000e\u0013\u0011O".length()];
            QB qb = new QB("7OHN|?JFE=:JDFr;Do0:?1,.Bg::&67'%m^~\u001f+-.\"&\u001eU)\u001c\u0018Q$$\u0010 !K\u001a\u001a\u000e\u001a\b\u001a\u000e\u0013\u0011O");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            String str = new String(iArr, 0, i2);
            logger.error(str);
            throw new InvalidOperationException(str);
        }
        if (!this.utils.isVersionGreaterOrEqualTo(31)) {
            Log.Companion.getLogger().info(C1561oA.od("+^LPU\u0005QDPBGDP|=KCxAJuCCGqDE?><>?/-g64d8+'`\u000f\u0012]3!--\"'%c\u000b#\u001c\"P\u0014\u0010\"\u000eK\"\u0013\u0015\u0014F\u0014\u0014\u0018B\u0004\u0006?\u0002\r\t\b\u007f|\r|z", (short) (C1580rY.Xd() ^ (-14044))));
            return;
        }
        Context context = this.context;
        String strKd = C1561oA.Kd("\u001c1!'.", (short) (C1499aX.Xd() ^ (-9351)));
        short sXd2 = (short) (ZN.Xd() ^ 20186);
        short sXd3 = (short) (ZN.Xd() ^ 14729);
        int[] iArr2 = new int["U+\rcDF-?h\u001dh\u0017\f=\u000fpy.U$9T|".length()];
        QB qb2 = new QB("U+\rcDF-?h\u001dh\u0017\f=\u000fpy.U$9T|");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
            i3++;
        }
        Object[] objArr = {strKd};
        Method method = Class.forName(new String(iArr2, 0, i3)).getMethod(Wg.vd("\u007f~\u000fn\u0016\u0011\u0013\u0005}dw\u0006\u000b~y|", (short) (OY.Xd() ^ 6319)), Class.forName(C1561oA.Xd("[SiU#bXf`(Npogmg", (short) (C1580rY.Xd() ^ (-7878)))));
        try {
            method.setAccessible(true);
            Object objInvoke = method.invoke(context, objArr);
            AudioManager audioManager2 = objInvoke instanceof AudioManager ? (AudioManager) objInvoke : null;
            this.audioManager = audioManager2;
            if (audioManager2 != null) {
                reportModeChanged(VoipCallState.Companion.getMode(audioManager2.getMode()));
            }
            setModeChangedListener();
            AudioManager.OnModeChangedListener onModeChangedListener = this.modeChangedListener;
            if (onModeChangedListener != null && (audioManager = this.audioManager) != null) {
                Context context2 = this.context;
                Class<?> cls = Class.forName(Qg.kd("\u001e*\u001f,(!\u001bc\u0018#!&\u0016\u001e#[o\u001b\u0019\u001e\u000e \u001b", (short) (FB.Xd() ^ 13040), (short) (FB.Xd() ^ 14882)));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr2 = new Object[0];
                short sXd4 = (short) (C1633zX.Xd() ^ (-19562));
                short sXd5 = (short) (C1633zX.Xd() ^ (-1124));
                int[] iArr3 = new int[" \u001d+\u0003\u0016\u001d!v)\u0015\u0012#!\u001b\u001d".length()];
                QB qb3 = new QB(" \u001d+\u0003\u0016\u001d!v)\u0015\u0012#!\u001b\u001d");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(sXd4 + i4 + xuXd3.CK(iKK3) + sXd5);
                    i4++;
                }
                Method method2 = cls.getMethod(new String(iArr3, 0, i4), clsArr);
                try {
                    method2.setAccessible(true);
                    audioManager.addOnModeChangedListener((Executor) method2.invoke(context2, objArr2), onModeChangedListener);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            setStarted(true);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void stop() {
        AudioManager audioManager;
        setStarted(false);
        AudioManager.OnModeChangedListener onModeChangedListener = this.modeChangedListener;
        if (onModeChangedListener != null && (audioManager = this.audioManager) != null) {
            audioManager.removeOnModeChangedListener(onModeChangedListener);
        }
        this.modeChangedListener = null;
        this.audioManager = null;
    }
}
