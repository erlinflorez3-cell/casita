package com.ticnow.sdk.idnowonboarding.model.customization;

import com.facetec.sdk.FaceTecCancelButtonCustomization;
import com.google.android.gms.common.ConnectionResult;
import com.google.gson.annotations.SerializedName;
import com.ticnow.sdk.idnowonboarding.R;
import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"ЯF\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005%4\u0012\u000e\u0007nj?3Le^.ZS0\u0012s{J$c$wFCU0}*\tUQog\u0005Jb\u000bI\u0012\u000e\u0016\u000fj4I[\u0003s܈?2pnw8x\u001cjg\u0010%gE#ݨ&8\b\u0005Q68I(v)E\u0002\u0010P4\u0017\u0089Fň\u0011Y\r܅*\bD#\u000f\"|iT;Vr.V=*\u001bipV]cn\u0001$νRù+\u0019~ѭ6-F@C\u001fEU\t\u0012`g\u0010\u001fM~U\u0005\u00175]/\bw.̴dÿ\u0018!3˽%_x5j\u0015qb\u001289a4g^!@w)\u0010C@B\u0012\\αTͶ1&nڜ&5z\baVp\u0004dY\u000e\u00132R%>\u00183YSQj\u0010e\u0012ϒZѼ\u007f\u0011\u0015̔;\u0003t<ip.b\u001b8b\u0016\"M__UH|*\u0010A,\bGï\u000eò\b<OĉG}\u0017O%GW]?F/\u0010RdR\r\u000f\u0005\u000f\u000f\nm\u0011L\u0017̖zގ;6\u0011ȱrFj,yxtZ2:[FΪ\u000b0"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`!f\\z\u001b$ i\u0018V/\"\u0001hE.w\u001a", "", "u(E", "1`]0X3\u001bc(\u000e\u0005g\n\r\u0017>o\b,\u0011<\u0010\u001b!P", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`!f\\z\u001b$ i\u0018V/\"\u0001hE.w\u0003\u0015\u001b\u0011*I\t\u0018x\u0010\u001b \u0017\u0013z~Q`\u0018K\u000f\u0011\u0005E3q\u001c", "5dc\u0010T5<S [\u000bm;\u0007\u0012\ru\u000e7\u0006H\u0005,\u0013Vs\u0018E", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi?w\u0015.T\r9{B-\u001fpeN\u0003r0X\u007fp+K76nG|G\u001coj\u001c]5\u0015\tn=3rN@]e(R\u007f;o]\u001c%\u001d?sNRd\u001fQ\u0002\u0019\u000b=8lPb5", "Adc\u0010T5<S [\u000bm;\u0007\u0012\ru\u000e7\u0006H\u0005,\u0013Vs\u0018E", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017AKyC(\u001dlv5\u0016g6W@\u000bF5X>Q\\|Eq\"h\u001dX3\u0011\u001aUP(xMu|\u00045G\u0002BE\u0011\u001b%\u0018>H\u0001Pe\u001aO}*qP-rO/#j", "4dT1U(<Yv\u000f\tm6\u0005\rDa\u000f,\u0006I", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`!f\\z\u001b$ i\u0018V/\"\u0001hE.w\u0003\u0018\u001f\b+F}9n^\u001c$\u001d?rtWR\u001fK\u0004\u001eK", "5dc\u0013X,=P\u0015|\u0001<<\u000b\u00189m\u0004=wO\u0005! ", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi?w\u0015.T\r9{B-\u001fpeN\u0003r0X\u007fp+K76nG|G\u001coj\u001c]5\u0015\tn=3rN@]h,I\u00018d~\u0012s\u001eCyzJZ%C\t\u0019\u007fJ~", "Adc\u0013X,=P\u0015|\u0001<<\u000b\u00189m\u0004=wO\u0005! ", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017AKyC(\u001dlv5\u0016g6W@\u000bF5X>Q\\|Eq\"h\u001dX3\u0011\u001aUP(xMu\u007f\b,H~7f\u0007i&\u001cDtxFk\fV}\u001f~\u0017lY", "4qP:X\nNa(\t\u0003bAx\u00183o\t", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`!f\\z\u001b$ i\u0018V/\"\u0001hE.w\u0003\u0018,\u00044I_Kv\u0010\u0016\u001e\u0012Jf\u007fF`\u0019\u001d", "5dc\u0013e(FSv\u000f\tm6\u0005\rDa\u000f,\u0006I", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi?w\u0015.T\r9{B-\u001fpeN\u0003r0X\u007fp+K76nG|G\u001coj\u001c]5\u0015\tn=3rN@]h9E\n;F\u0011\u001a%\u0018=n\u0006>e\u0014Q\u0003j", "Adc\u0013e(FSv\u000f\tm6\u0005\rDa\u000f,\u0006I", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017AKyC(\u001dlv5\u0016g6W@\u000bF5X>Q\\|Eq\"h\u001dX3\u0011\u001aUP(xMu\u007f\u0015(Q\u0002\u0019x\u000f\u001b \u00169\u007flQZ\u001aPOXf", "5tX1T5<Sv\u000f\tm6\u0005\rDa\u000f,\u0006I", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`!f\\z\u001b$ i\u0018V/\"\u0001hE.w\u0003\u0019/\f+E\u000b9h^\u001c$\u001d?rtWR\u001fK\u0004\u001eK", "5dc\u0014h0=O\"|z<<\u000b\u00189m\u0004=wO\u0005! ", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi?w\u0015.T\r9{B-\u001fpeN\u0003r0X\u007fp+K76nG|G\u001coj\u001c]5\u0015\tn=3rN@]i<M\u00017q~\fs\u001eCyzJZ%C\t\u0019\u007fJ~", "Adc\u0014h0=O\"|z<<\u000b\u00189m\u0004=wO\u0005! ", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017AKyC(\u001dlv5\u0016g6W@\u000bF5X>Q\\|Eq\"h\u001dX3\u0011\u001aUP(xMu\u0001\u00180H}Df\u0001i&\u001cDtxFk\fV}\u001f~\u0017lY", "=uP96<Lb#\u0007~s(\f\r9n", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`!f\\z\u001b$ i\u0018V/\"\u0001hE.w\u0003!0\u00043'\u0012Iw\u000b\u0014\u001a#1ytL_e", "5dc\u001ci(E1)\r\nh4\u0001\u001e+t\u00042\u0005", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi?w\u0015.T\r9{B-\u001fpeN\u0003r0X\u007fp+K76nG|G\u001coj\u001c]5\u0015\tn=3rN@]q=E\t\u0019x\u000f\u001b \u00169\u007flQZ\u001aPO", "Adc\u001ci(E1)\r\nh4\u0001\u001e+t\u00042\u0005", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017AKyC(\u001dlv5\u0016g6W@\u000bF5X>Q\\|Eq\"h\u001dX3\u0011\u001aUP(xMu\t\u0019(P_Kv\u0010\u0016\u001e\u0012Jf\u007fF`\u0019\u001d=\u0006", "=uT?_(R1)\r\nh4\u0001\u001e+t\u00042\u0005", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`!f\\z\u001b$ i\u0018V/\"\u0001hE.w\u0003!0\b9P}OF\u0011\u001a%\u0018=n\u0006>e\u0014Q\u0003j", "5dc\u001ci,KZ\u0015\u0013Xn:\f\u00137i\u0015$\u000bD\u000b ", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi?w\u0015.T\r9{B-\u001fpeN\u0003r0X\u007fp+K76nG|G\u001coj\u001c]5\u0015\tn=3rN@]q=I\u000fBd\u0015i&\u001cDtxFk\fV}\u001f~\u0017", "Adc\u001ci,KZ\u0015\u0013Xn:\f\u00137i\u0015$\u000bD\u000b ", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017AKyC(\u001dlv5\u0016g6W@\u000bF5X>Q\\|Eq\"h\u001dX3\u0011\u001aUP(xMu\t\u0019,V\t7|^\u001c$\u001d?rtWR\u001fK\u0004\u001eK\u0005\u001a", "@dbB_;,Q&~zg\n\r\u0017>o\b,\u0011<\u0010\u001b!P", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`!f\\z\u001b$ i\u0018V/\"\u0001hE.w\u0003$\u001f\u0016<P\u0011)f\u000e\f\u0016\u0017\u0013z~Q`\u0018K\u000f\u0011\u0005E3q\u001c", "5dc\u001fX:NZ(lxk,|\u0012\ru\u000e7\u0006H\u0005,\u0013Vs\u0018E", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi?w\u0015.T\r9{B-\u001fpeN\u0003r0X\u007fp+K76nG|G\u001coj\u001c]5\u0015\tn=3rN@]t,W\u0012Bwn\n#\u000e5sNRd\u001fQ\u0002\u0019\u000b=8lPb5", "Adc\u001fX:NZ(lxk,|\u0012\ru\u000e7\u0006H\u0005,\u0013Vs\u0018E", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017AKyC(\u001dlv5\u0016g6W@\u000bF5X>Q\\|Eq\"h\u001dX3\u0011\u001aUP(xMu\f\b:Y\tJV~\u0019\u0016\u000e>H\u0001Pe\u001aO}*qP-rO/#j", "\u0011`]0X3\u001bc(\u000e\u0005g\n\r\u0017>o\b,\u0011<\u0010\u001b!P", "\u0014dT1U(<Yv\u000f\tm6\u0005\rDa\u000f,\u0006I", "\u0014qP:X\nNa(\t\u0003bAx\u00183o\t", "\u0015tX1T5<Sv\u000f\tm6\u0005\rDa\u000f,\u0006I", "\u001duP96<Lb#\u0007~s(\f\r9n", "\u001duT?_(R1)\r\nh4\u0001\u001e+t\u00042\u0005", " dbB_;,Q&~zg\n\r\u0017>o\b,\u0011<\u0010\u001b!P", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class IdNowZoomCustomization {

    @SerializedName(alternate = {}, value = "\n\u0007\u0013\u0007\b\u000eb\u0015\u0013\u0012\f\n]\u000f\f\f\u0006\u0003}\u000es\u0006y~|")
    @InterfaceC1492Gx
    private CancelButtonCustomization cancelButtonCustomization = new CancelButtonCustomization();

    @SerializedName(alternate = {}, value = "\r\u0018\u0006\u0011\bd\u0016\u0013\u0013\r\n\u0005\u0015z\r\u0001\u0006\u0004")
    @InterfaceC1492Gx
    private FrameCustomization frameCustomization = new FrameCustomization();

    @SerializedName(alternate = {}, value = "")
    private OverlayCustomization overlayCustomization = new OverlayCustomization();

    @SerializedName(alternate = {}, value = "\r\u000b\n\b\u0005\u0003\u0004\u000ba\u0013\u0010\u0010\n\u0007\u0002\u0012w\n}\u0003\u0001")
    @InterfaceC1492Gx
    private FeedbackCustomization feedbackCustomization = new FeedbackCustomization();

    @SerializedName(alternate = {}, value = "\u0016\u001c\u0006\u0010e\u0017\u0014\u0014\u000e\u000b\u0006\u0016{\u000e\u0002\u0007\u0005")
    @InterfaceC1492Gx
    private OvalCustomization ovalCustomization = new OvalCustomization();

    @SerializedName(alternate = {}, value = "")
    private GuidanceCustomization guidanceCustomization = new GuidanceCustomization();

    @SerializedName(alternate = {}, value = "")
    private ResultScreenCustomization resultScreenCustomization = new ResultScreenCustomization();

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005%4\u0012\u000e\u0007nj?3Z͜x.\u0001Rj\u0012ө\u007f42[t\u000eQ<m\u001a,$?S\rk>ùVҼ\u000fO\u0017إ.zp/WY\u0019_\u0018\u0014@H@[AT\b=gh+:C$\tĺDѩ\t\r\"ݒ`\u0012|\u0004QU,\u00146K~FŎ\u0011Z"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`!f\\z\u001b$ i\u0018V/\"\u0001hE.w\u0003\u0015\u001b\u0011*I\t\u0018x\u0010\u001b \u0017\u0013z~Q`\u0018K\u000f\u0011\u0005E3q\u001c", "", "u(E", "1tbAb4\"[\u0015\u0001z", "", "5dc\u0010h:M]!b\u0003Z.|", "u(8", "Adc\u0010h:M]!b\u0003Z.|", "uH\u0018#", ":nR.g0H\\", "\u001ab^:\"-:Q\u0019\u000ez\\u\u000b\b5/`$y@o\u0017\u0015%k\u0017:v,\u0012i\r/Avs>[REs83\u0011weC\u0010\"\t^\u00066QU56ZN\u0002A\u001e\u001b0", "5dc\u0019b*:b\u001d\t\u0004", "u(;0b4\bT\u0015|zm,zR=d\u0006q\\<~\u0017\u0006Gmk8\u007f#5`Z0F| 7+SIz>&\u0019}]H\u000bm5\rS7V[X5C\\p9#\u0016d\u0017$", "Adc\u0019b*:b\u001d\t\u0004", "uKR<`u?O\u0017~\n^*F\u0017.kI\tw>\u0001\u0006\u0017EM\nEt%<6\u000e/Fw\u001f\f]QJu<\"*dp=\u0011lj+\u00076VVW\u0013fPnL\u0018\u001ccc\u0012\u001c", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class CancelButtonCustomization {

        @SerializedName(alternate = {}, value = "\n\u001b\u0018\u0018\u0012\u000fi\r\u007f\u0005\u0002")
        @InterfaceC1492Gx
        private int customImage = R.drawable.ic_back_dav_white;

        @SerializedName(alternate = {}, value = "\u0013\u0015\b\u0005\u0017\u000b\u0010\u000e")
        @InterfaceC1492Gx
        private FaceTecCancelButtonCustomization.ButtonLocation location = FaceTecCancelButtonCustomization.ButtonLocation.TOP_LEFT;

        public final int getCustomImage() {
            return this.customImage;
        }

        public final FaceTecCancelButtonCustomization.ButtonLocation getLocation() {
            return this.location;
        }

        public final void setCustomImage(int i2) {
            this.customImage = i2;
        }

        public final void setLocation(FaceTecCancelButtonCustomization.ButtonLocation buttonLocation) {
            Intrinsics.checkParameterIsNotNull(buttonLocation, "<set-?>");
            this.location = buttonLocation;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005%4\u0012\u0006\rnj?6LeV3ZS0\u001e\u0002ڔd$\n#2FтY\u001a\f\"Yk\\h\u007fnx\\AGM\nlіv߽Ma\u0001ز*\u00118E}CSOuBGfER\u0013'J\"f\u0002;\u0005X.\u001fƽ\u0003ټGW\u0014۵HBvC`\u0017m\u0007 \u001d\u0014Jp\u001d,i\u007fNdP#ax3yɍuŌR3gܞ\u0015O\u0013Tb1-xg-9L\bQ#5k\u00035c\u0012CACHܽ\u0011ص+33ɞ\fY<j\u000e'5-U!k\bvx\u0013gx\fU-\u0006g\nTdߒ\u0004ߡ\u007f\u0019Dǉ&\b-_<1:h\u000e&AzCoNi\u001a^p\u00021et\u001b{Ķ?ڢ='nϟy=\u001fhE\u007f%\u000f$>\u000ftqwb*x\u0015I\\.UoU\u0017\u05c8Tݳ\u000eeEЧ\u001crh\u001f8\u000ePI\u0006M\n\u001d~33Vs9Q2\"\u0006\u0007H>Ѐ\u0011¾l_qɭ`B(\u000f$JJ\u000b\u0012{Ryʶor"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`!f\\z\u001b$ i\u0018V/\"\u0001hE.w\u0003\u0018\u001f\b+F}9n^\u001c$\u001d?rtWR\u001fK\u0004\u001eK", "", "u(E", "0`R8Z9Hc\"}Xh3\u0007\u0016=", "", "5dc\u000fT*DU&\t\u000bg+Z\u00136o\r6", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u000fT*DU&\t\u000bg+Z\u00136o\r6", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "1na;X9+O\u0018\u0003\u000bl", "", "5dc\u0010b9GS&kv]0\r\u0017", "u(8", "Adc\u0010b9GS&kv]0\r\u0017", "uH\u0018#", "3kTCT;B]\"", "5dc\u0012_,OO(\u0003\u0005g", "Adc\u0012_,OO(\u0003\u0005g", "@d[.g0OS\u000b\u0003ym/", "", "5dc\u001fX3:b\u001d\u0010zP0{\u00182", "u(5", "Adc\u001fX3:b\u001d\u0010zP0{\u00182", "uE\u0018#", "BdgA66E]&", "5dc!X?M1#\u0006\u0005k", "Adc!X?M1#\u0006\u0005k", "BdgA96Gb", "5dc!X?M4#\b\n", "Adc!X?M4#\b\n", "BdgAF0SS", "5dc!X?MA\u001d\u0014z", "Adc!X?MA\u001d\u0014z", "BdgAF7:Q\u001d\b|", "5dc!X?MA$zxb5~", "Adc!X?MA$zxb5~", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class FeedbackCustomization {

        @SerializedName(alternate = {}, value = "\f\u0012\n\u001a\u0004\u0016\n\u000f\r")
        @InterfaceC1492Gx
        private int elevation;

        @SerializedName(alternate = {}, value = "\t\u0007\b\u000f\n\u0014\u0010\u0015\r\u0002_\u000b\u0007\t\u000b\u000b")
        @InterfaceC1492Gx
        private String backgroundColors = "#000000";

        @SerializedName(alternate = {}, value = "\u001b\u000b\u001d\u0018e\u0011\r\u000f\u0011")
        @InterfaceC1492Gx
        private String textColor = "#FFFFFF";

        @SerializedName(alternate = {}, value = "\u001b\u000b\u001d\u0018h\u0011\u000f\u0014")
        @InterfaceC1492Gx
        private String textFont = "avenirltstd_book_0";

        @SerializedName(alternate = {}, value = "\u001b\u000b\u001d\u0018u\u000b\u001b\u0005")
        @InterfaceC1492Gx
        private int textSize = 20;

        @SerializedName(alternate = {}, value = "\u001b\u000b\u001d\u0018u\u0012\u0002\u0003\b\f\u0004")
        @InterfaceC1492Gx
        private float textSpacing = 0.05f;

        @SerializedName(alternate = {}, value = "\n\u0015\u0017\u0012\b\u0014r\u0001\u0003\u0007\u0012\u000f")
        @InterfaceC1492Gx
        private int cornerRadius = 2;

        @SerializedName(alternate = {}, value = "\u0019\u000b\u0011\u0005\u0017\u000b\u0017\u0005u\u0007\u0001\u0010\u0003")
        @InterfaceC1492Gx
        private float relativeWidth = 1.0f;

        public final String getBackgroundColors() {
            return this.backgroundColors;
        }

        public final int getCornerRadius() {
            return this.cornerRadius;
        }

        public final int getElevation() {
            return this.elevation;
        }

        public final float getRelativeWidth() {
            return this.relativeWidth;
        }

        public final String getTextColor() {
            return this.textColor;
        }

        public final String getTextFont() {
            return this.textFont;
        }

        public final int getTextSize() {
            return this.textSize;
        }

        public final float getTextSpacing() {
            return this.textSpacing;
        }

        public final void setBackgroundColors(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.backgroundColors = str;
        }

        public final void setCornerRadius(int i2) {
            this.cornerRadius = i2;
        }

        public final void setElevation(int i2) {
            this.elevation = i2;
        }

        public final void setRelativeWidth(float f2) {
            this.relativeWidth = f2;
        }

        public final void setTextColor(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.textColor = str;
        }

        public final void setTextFont(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.textFont = str;
        }

        public final void setTextSize(int i2) {
            this.textSize = i2;
        }

        public final void setTextSpacing(float f2) {
            this.textSpacing = f2;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005(4\u0012\u0006\rnj?9Z͜x.\u0001Rj\u0012ө\u007f42[t\u000eQ<m\u001a,$?S\rk>ùVҼ\u000fO\u0017إ.zp/WY\u0019_\u0018\u0014@H@[AT\b=gb+:C$\tĺDѩ\t\r\"ݒ`\u0012|\u0003QO,\u00146I~@#)[\u000f2\u00124IV\u0005\\`>\u07b6BՂpiBǂ;\u0005oN\\4\u007f2\u0003[\u001bU%C\u001b\u0007y\u001eYKm9S)*ΐ\u0013қ_K\u000bӊ\n?\u000by54KKyiDgP0#>g\r\f}\\`CU7Ϸ3˦SoSִ&*}\u000f\n\u001a\\\u0006\u0014\u001b5Wͼ10"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`!f\\z\u001b$ i\u0018V/\"\u0001hE.w\u0003\u0018,\u00044I_Kv\u0010\u0016\u001e\u0012Jf\u007fF`\u0019\u001d", "", "u(E", "0`R8Z9Hc\"}Xh3\u0007\u0016", "", "5dc\u000fT*DU&\t\u000bg+Z\u00136o\r", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u000fT*DU&\t\u000bg+Z\u00136o\r", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "0na1X9\u001c] \t\b", "5dc\u000fb9=S&\\\u0005e6\n", "Adc\u000fb9=S&\\\u0005e6\n", "0na1X90W\u0018\u000e}", "", "5dc\u000fb9=S&p~];\u007f", "u(8", "Adc\u000fb9=S&p~];\u007f", "uH\u0018#", "1na;X9+O\u0018\u0003\u000bl", "5dc\u0010b9GS&kv]0\r\u0017", "Adc\u0010b9GS&kv]0\r\u0017", "3kTCT;B]\"", "5dc\u0012_,OO(\u0003\u0005g", "Adc\u0012_,OO(\u0003\u0005g", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class FrameCustomization {

        @SerializedName(alternate = {}, value = "\t\u0007\b\u000f\n\u0014\u0010\u0015\r\u0002_\u000b\u0007\t\u000b")
        @InterfaceC1492Gx
        private String backgroundColor = "#000000";

        @SerializedName(alternate = {}, value = "\t\u0015\u0017\b\b\u0014c\u000f\u000b\r\u000f")
        @InterfaceC1492Gx
        private String borderColor = "#00000000";

        @SerializedName(alternate = {}, value = "\t\u0015\u0017\b\b\u0014w\t\u0003\u0012\u0005")
        @InterfaceC1492Gx
        private int borderWidth = 2;

        @SerializedName(alternate = {}, value = "\n\u0015\u0017\u0012\b\u0014r\u0001\u0003\u0007\u0012\u000f")
        @InterfaceC1492Gx
        private int cornerRadius = 12;

        @SerializedName(alternate = {}, value = "\f\u0012\n\u001a\u0004\u0016\n\u000f\r")
        @InterfaceC1492Gx
        private int elevation;

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getBorderColor() {
            return this.borderColor;
        }

        public final int getBorderWidth() {
            return this.borderWidth;
        }

        public final int getCornerRadius() {
            return this.cornerRadius;
        }

        public final int getElevation() {
            return this.elevation;
        }

        public final void setBackgroundColor(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.backgroundColor = str;
        }

        public final void setBorderColor(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.borderColor = str;
        }

        public final void setBorderWidth(int i2) {
            this.borderWidth = i2;
        }

        public final void setCornerRadius(int i2) {
            this.cornerRadius = i2;
        }

        public final void setElevation(int i2) {
            this.elevation = i2;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я6\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u000514\u0012\u0006\rnj?9LeV3ZS0$s{B-c$wsCU(\u0011*\tU`}˧\u001fJ\t\n\u0004\u0012و\u001axx,\u001aq\u0007^*\u000f`D&CqQFޑEžxB\rړJ$>|\u0013\u0005:,N\u0015\u0005\u0001\u0014g\u001a\u0019H@\u001f<\t\u0011\f\tpŏ\u0012̧$\r&ձ\u007fP<PzaZ1)\fwH\u001fCm:\u0015M;H\u000b+Kz8Ӥ7Ë;A\u001dǬk\u0005\r]iC#AwI\u0013nwC9V\fWdZ6\u0018S/&՝ię*h\rĩx\u000e-9]gkR\u00147\u0006\u0001L)J\u0014&\u0006UJd1Xj^Ԍ?Ϣv_HА\u001a`H\u0011\teV\u0019+\u0012A1\n7tdy;Gbm\u007fC\u0011tň\rͼ%g\\וx\u0017!i\u0006gQSFTVfZuK\u0007\u001cp\u0011\u0016`\bnKV\u0083\b 2#-ڛs;);y\u0018hFm\u0012\u0013x9own`@PpL;h\rbɶP\u0081\twXӹp.\u0017j*X'\u007f\u000e1.bHX/D(N}\t n\fa`ɠ;Ϭ;ev\u0088&Y?\u007fAWqe\u0016\u0005`\u001bd[J\b\u001dX\u0015D\n\u0010\u0019`~η>ʮn\u001c\u007fӻ\\P\u00129@C\u0012\u001e:S?\u001f-1V+6Bo~?c\u0019lfп`տ(\u000fq˅\r\u000b\u0007yjt\u0010i~s:\u00031>;li5G(\f&'8SɅ\u0013ҋw\fOхdIR\u0019$yu}&C(?\"KKA'~WF81\u0004PIϔ]̊\u00163\u0003۠\u0012\u0011A\u0018<}(lv\\n\u0003\u001bkbH:v\r\u0013Y\f#\u0004PӛRیKo\\ެs@O%\u0011{\\P>0\u0013CnA\u000f$:|cAy+[\u001aNҩ;ֵeiq۰F{hD4\u000b\u0006\u00062\u001a$\b3mkiS8w\u00125B`(CßN\u05f8n\u0004\u0010ȷ!6\u0013lV{\u0005r\\s[G\u007f\u001atDD\r\u001f\u000f\u0012>QsTҶ:ʡ.\u007fK͟,`Ic\u001f\bsis-Y\u0019[f\u001dJ#{_pH {$-̸nס4\u0012{̸NCA$\u0013@)&:nJ\u000e[_b-\u001e\u0010)\u0002|cM\u001b\t\u0086\u007fŌZ\u001a\\ۿtXNInI\u0001#0F\r\u0015\u0004:\u0007{I\u0005\u001cZ\u000b3\"6Wҽ)͢\u001fvWƫ~'1\fbO;*^I\u0019]._WKN\u0004uI$o.\u0010\u000f\u0096\tܫF$#ʃi\u0013eA>\u0001+Wj\u001ar\u001bb\u0003`\u001b:)-|3\u0012z\u000eeԭ%۽v{j\u03a2dP}\u0005Q\u001e!\u0019Jw\u0015\u0012M\u007fTjE\u0006c/sM)\u0018}ػcĺ?\n\u0010¶8)\nE/`w\u0010l[k!\u000b2\u007fhz\u00027\u0015\u0007$B2!ƛ~˹2\u0014>О\u001a5\bfl]\fy'\u001551=\"P!\u0001x8e#g-YaӎrܕZ\u0006v߲h\u001f\u000f}[23Z`\u0012\u001fYpt\u001fX,\u0015T3l\f!-f˞o\u05cftwW܀%-5E8wQ2Xx\f7J\u0012\u0012\u0006l(C=\rQ|h_Ϧxܣ[\u001afȥ@fzh7\u0018\u001d\u0001N<\u001f\u0019\u0005b\u0001||/e\u001bU_KK7Ԋ\u0010٣M2)ܐjA!\u0017@\u000f\u0010*|q\u0011@3\u0011\u000e\fZ\t!\u0014\u001e0kJ+ؼ&ž]0uѦ\u001b(Q(FX(.\u0017q\u001fG+T.#t\u001aJO\b7\u007f\u001dgۼ!Ƭ\n{\u000fؒMlW93@!~\u0007sM\u0012\u0002\bH[OrQ1EsY[=ն1̂iX/ڄ\u001agPg[gv\u0011g\u0016W;\u0016:\b@X\u007f8\u000bZ(DyyǏQ˜L6gЇXXyD\u0012\u0014J8t317=\u0015\u0002zDiF\b\u001b_ 8\u0018ʷ ԯHJ2˵\u0005\tK?v\u0010+F\u00138\"O_\"7'/|>Q(DiMIّ;ۺaH\u001bŎ\u001c<8VD}gB_ \u00143bpqa\u0003m\u007faF<P\u0011cՅ\u0004ٽVl\bу5\u001a-C\u0005JV^~FOh[\\\u001d\u001ev.p A\nT2\u001fǎ\u000eҍNl\u001d͵KIy<U(v}'\u0019\u001fsu#3d\u0003Gmu(\\{=\nٖyՕ\\Bmڤ\u001dW'IrM5\u0003pݝ-Uzö\u001e߯W"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`!f\\z\u001b$ i\u0018V/\"\u0001hE.w\u0003\u0019/\f+E\u000b9h^\u001c$\u001d?rtWR\u001fK\u0004\u001eK", "", "u(E", "0`R8Z9Hc\"}Xh3\u0007\u0016=", "", "5dc\u000fT*DU&\t\u000bg+Z\u00136o\r6", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u000fT*DU&\t\u000bg+Z\u00136o\r6", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "0tcAb5\u001bO\u0017\u0005|k6\r\u0012.D\u00046w=\b\u0017\u0016%y\u0015F\u0004", "5dc\u000fh;M]\"[v\\2~\u00169u\t'ZD\u000f\u0013\u0014No\r\u001a\u0001,?f", "Adc\u000fh;M]\"[v\\2~\u00169u\t'ZD\u000f\u0013\u0014No\r\u001a\u0001,?f", "0tcAb5\u001bO\u0017\u0005|k6\r\u0012.H\u0004*~G\u0005\u0019\u001aVM\u0018C\u00012", "5dc\u000fh;M]\"[v\\2~\u00169u\t'^D\u0003\u001a\u001eKq\u0011KT/<c\u000b", "Adc\u000fh;M]\"[v\\2~\u00169u\t'^D\u0003\u001a\u001eKq\u0011KT/<c\u000b", "0tcAb5\u001bO\u0017\u0005|k6\r\u0012.N\n5\u0004<\bt!Ny\u001b", "5dc\u000fh;M]\"[v\\2~\u00169u\t'dJ\u000e\u001f\u0013NM\u0018C\u00012", "Adc\u000fh;M]\"[v\\2~\u00169u\t'dJ\u000e\u001f\u0013NM\u0018C\u00012", "0tcAb5\u001b]&}zk\n\u0007\u00109r", "5dc\u000fh;M]\"[\u0005k+|\u0016\ro\u00072\t", "Adc\u000fh;M]\"[\u0005k+|\u0016\ro\u00072\t", "0tcAb5\u001b]&}zk\u001e\u0001\b>h", "", "5dc\u000fh;M]\"[\u0005k+|\u0016!i~7~", "u(8", "Adc\u000fh;M]\"[\u0005k+|\u0016!i~7~", "uH\u0018#", "0tcAb5\u001c]&\bzk\u0019x\b3u\u000e", "5dc\u000fh;M]\"\\\u0005k5|\u0016\u001ca~,\fN", "Adc\u000fh;M]\"\\\u0005k5|\u0016\u001ca~,\fN", "0tcAb5\u001f]\"\u000e", "5dc\u000fh;M]\"_\u0005g;", "Adc\u000fh;M]\"_\u0005g;", "0tcAb5+S z\nb=|z3d\u000f+", "", "5dc\u000fh;M]\"kze(\f\r@eq,zO\u0004", "u(5", "Adc\u000fh;M]\"kze(\f\r@eq,zO\u0004", "uE\u0018#", "0tcAb5-S,\u000eYb:x\u00066e~\u0006\u0006G\u000b$", "5dc\u000fh;M]\"mzq;[\r=a|/{?^!\u001eQ|", "Adc\u000fh;M]\"mzq;[\r=a|/{?^!\u001eQ|", "0tcAb5-S,\u000e]b.\u007f\u00103g\u00037YJ\b!$", "5dc\u000fh;M]\"mzq;_\r1h\u0007,}C\u0010t!Ny\u001b", "Adc\u000fh;M]\"mzq;_\r1h\u0007,}C\u0010t!Ny\u001b", "0tcAb5-S,\u000ech9\u0005\u00056C\n/\u0006M", "5dc\u000fh;M]\"mzq;e\u0013<m{/YJ\b!$", "Adc\u000fh;M]\"mzq;e\u0013<m{/YJ\b!$", "0tcAb5-S,\u000ehbA|", "5dc\u000fh;M]\"mzq;j\rDe", "Adc\u000fh;M]\"mzq;j\rDe", "0tcAb5-S,\u000ehi(z\r8g", "5dc\u000fh;M]\"mzq;j\u0014+c\u00041}", "Adc\u000fh;M]\"mzq;j\u0014+c\u00041}", "1`\\2e()S&\u0007~l:\u0001\u00138sm&\t@\u0001 zOk\u0010<", "5dc\u0010T4>`\u0015izk4\u0001\u0017=i\n1\n.~$\u0017GxqDr'5", "Adc\u0010T4>`\u0015izk4\u0001\u0017=i\n1\n.~$\u0017GxqDr'5", "3mP/_,+S(\f\u000fL*\n\t/n\\8\u0003G\u0001&\u0017FS\u0017J\u00062EW\r$Av$", "", "5dc\u0012a(;Z\u0019kzm9\u0011v-r\u007f(\u0005\u001d\u0011\u001e\u001eG~\u000e;Z.Ch\u000b05|\u001a8VQ", "u(I", "Adc\u0012a(;Z\u0019kzm9\u0011v-r\u007f(\u0005\u001d\u0011\u001e\u001eG~\u000e;Z.Ch\u000b05|\u001a8VQ", "uY\u0018#", "3mP/_,+S(\f\u000fL*\n\t/nm/\u007f?\u0001%\u001aQ\u0002{?\u0007&6`}", "5dc\u0012a(;Z\u0019kzm9\u0011v-r\u007f(\u0005.\b\u001b\u0016G}\u0011F\t\u00138i~!>m", "Adc\u0012a(;Z\u0019kzm9\u0011v-r\u007f(\u0005.\b\u001b\u0016G}\u0011F\t\u00138i~!>m", "4na2Z9Hc\"}Xh3\u0007\u0016", "5dc\u0013b9>U&\t\u000bg+Z\u00136o\r", "Adc\u0013b9>U&\t\u000bg+Z\u00136o\r", "6dP1X9\u001f]\"\u000e", "5dc\u0015X(=S&_\u0005g;", "Adc\u0015X(=S&_\u0005g;", "6dP1X9-S,\u000ehbA|", "5dc\u0015X(=S&mzq;j\rDe", "Adc\u0015X(=S&mzq;j\rDe", "6dP1X9-S,\u000ehi(z\r8g", "5dc\u0015X(=S&mzq;j\u0014+c\u00041}", "Adc\u0015X(=S&mzq;j\u0014+c\u00041}", "@dP1l\u001a<`\u0019~\u0004A,x\b/rn(\u000fO^!\u001eQ|", "5dc\u001fX(=g\u0007|\b^,\u0006k/a~(\t/\u0001*&%y\u0015F\u0004", "Adc\u001fX(=g\u0007|\b^,\u0006k/a~(\t/\u0001*&%y\u0015F\u0004", "@dP1l\u001a<`\u0019~\u0004H=x\u0010\u0010i\u0007/YJ\b!$", "5dc\u001fX(=g\u0007|\b^,\u0006r@a\u0007\t\u007fG\bt!Ny\u001b", "Adc\u001fX(=g\u0007|\b^,\u0006r@a\u0007\t\u007fG\bt!Ny\u001b", "@dP1l\u001a<`\u0019~\u0004L<y\u0018/x\u000f\u0017{S\u0010t!Ny\u001b", "5dc\u001fX(=g\u0007|\b^,\u0006v?b\u000f(\u000fOo\u0017*VM\u0018C\u00012", "Adc\u001fX(=g\u0007|\b^,\u0006v?b\u000f(\u000fOo\u0017*VM\u0018C\u00012", "@dP1l\u001a<`\u0019~\u0004M,\u0010\u0018\fa}.}M\u000b' FM\u0018C\u00012", "5dc\u001fX(=g\u0007|\b^,\u0006w/x\u000f\u0005w>\u0007\u0019$Q\u007f\u0017;T/<c\u000b", "Adc\u001fX(=g\u0007|\b^,\u0006w/x\u000f\u0005w>\u0007\u0019$Q\u007f\u0017;T/<c\u000b", "@dP1l\u001a<`\u0019~\u0004M,\u0010\u0018\fa}.}M\u000b' FM\u0018I\u007f%BFy\u001f;}$", "5dc\u001fX(=g\u0007|\b^,\u0006w/x\u000f\u0005w>\u0007\u0019$Q\u007f\u0017;T/Bb}-$i\u00152]Q", "Adc\u001fX(=g\u0007|\b^,\u0006w/x\u000f\u0005w>\u0007\u0019$Q\u007f\u0017;T/Bb}-$i\u00152]Q", "@dc?l\u001a<`\u0019~\u0004A,x\b/rn(\u000fO^!\u001eQ|", "5dc\u001fX;Kg\u0007|\b^,\u0006k/a~(\t/\u0001*&%y\u0015F\u0004", "Adc\u001fX;Kg\u0007|\b^,\u0006k/a~(\t/\u0001*&%y\u0015F\u0004", "@dc?l\u001a<`\u0019~\u0004B4x\u000b/B\n5z@\u000et!Ny\u001b", "5dc\u001fX;Kg\u0007|\b^,\u0006l7a\u0002(XJ\u000e\u0016\u0017TM\u0018C\u00012", "Adc\u001fX;Kg\u0007|\b^,\u0006l7a\u0002(XJ\u000e\u0016\u0017TM\u0018C\u00012", "@dc?l\u001a<`\u0019~\u0004B4x\u000b/B\n5z@\u000e\t\u001bF~\u0011", "5dc\u001fX;Kg\u0007|\b^,\u0006l7a\u0002(XJ\u000e\u0016\u0017Ta\u0012;\u0006(", "Adc\u001fX;Kg\u0007|\b^,\u0006l7a\u0002(XJ\u000e\u0016\u0017Ta\u0012;\u0006(", "@dc?l\u001a<`\u0019~\u0004B4x\u000b/C\n5\u0005@\u000e\u0004\u0013Fs\u001eJ", "5dc\u001fX;Kg\u0007|\b^,\u0006l7a\u0002(YJ\u000e \u0017T\\\n;z5C", "Adc\u001fX;Kg\u0007|\b^,\u0006l7a\u0002(YJ\u000e \u0017T\\\n;z5C", "@dc?l\u001a<`\u0019~\u0004H=x\u0010\u001dt\r2\u0002@^!\u001eQ|", "5dc\u001fX;Kg\u0007|\b^,\u0006r@a\u0007\u0016\u000bM\u000b\u001d\u0017%y\u0015F\u0004", "Adc\u001fX;Kg\u0007|\b^,\u0006r@a\u0007\u0016\u000bM\u000b\u001d\u0017%y\u0015F\u0004", "@dc?l\u001a<`\u0019~\u0004L3\u0001\b/s\u00032\u000e$\t\u0013\u0019G}", "", "5dc\u001fX;Kg\u0007|\b^,\u0006v6i~(\nC\u000b)zOk\u0010<\u0005", "u(J\u0016", "Adc\u001fX;Kg\u0007|\b^,\u0006v6i~(\nC\u000b)zOk\u0010<\u0005", "uZ8uI", "@dc?l\u001a<`\u0019~\u0004L3\u0001\b/s\u00032\u000e$\n&\u0017T\u0001\nC", "5dc\u001fX;Kg\u0007|\b^,\u0006v6i~(\nC\u000b)zP~\u000eI\b!<", "Adc\u001fX;Kg\u0007|\b^,\u0006v6i~(\nC\u000b)zP~\u000eI\b!<", "@dc?l\u001a<`\u0019~\u0004L<y\u0018/x\u000f\u0017{S\u0010t!Ny\u001b", "5dc\u001fX;Kg\u0007|\b^,\u0006v?b\u000f(\u000fOo\u0017*VM\u0018C\u00012", "Adc\u001fX;Kg\u0007|\b^,\u0006v?b\u000f(\u000fOo\u0017*VM\u0018C\u00012", "AtQAX?M4#\b\n", "5dc h)MS,\u000e[h5\f", "Adc h)MS,\u000e[h5\f", "AtQAX?MB\u0019\u0012\nL0\u0012\t", "5dc h)MS,\u000ei^?\fv3z\u007f", "Adc h)MS,\u000ei^?\fv3z\u007f", "AtQAX?MB\u0019\u0012\nL7x\u00073n\u0002", "5dc h)MS,\u000ei^?\fv:a},\u0005B", "Adc h)MS,\u000ei^?\fv:a},\u0005B", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class GuidanceCustomization {

        @SerializedName(alternate = {}, value = "\n\u0007\u0012\t\u0015\u0003p\u0005\u0011\u000b\u0006\u000f\u000e\u0003\b\u0006\nhw\u0006wv~X{nsp")
        @InterfaceC1492Gx
        private int cameraPermissionsScreenImage;

        @SerializedName(alternate = {}, value = "\f\u0014\u0006\u0006\u000f\u0007r\u0005\u0013\u0010\u0016n}\f}|\u0005W\n\u007f~v\u0005trVz~~{}jznsqu")
        @InterfaceC1492Gx
        private boolean enableRetryScreenBulletedInstructions;

        @SerializedName(alternate = {}, value = "\f\u0014\u0006\u0006\u000f\u0007r\u0005\u0013\u0010\u0016n}\f}|\u0005h\u0001|vv\u0004w}\u0005_s\u007fonsk")
        @InterfaceC1492Gx
        private boolean enableRetryScreenSlideshowShuffle;

        @SerializedName(alternate = {}, value = "\u001a\u001b\u0007\u0018\b\u001a\u0015s\u0004\u0016\u0011n\u000bz{\u0001\u0005|")
        @InterfaceC1492Gx
        private float subtextTextSpacing;

        @SerializedName(alternate = {}, value = "")
        private String headerFont = "avenirltstd_book_0";

        @SerializedName(alternate = {}, value = "")
        private int headerTextSize = 20;

        @SerializedName(alternate = {}, value = "")
        private float headerTextSpacing = 0.05f;

        @SerializedName(alternate = {}, value = "\u001a\u001b\u0007\u0018\b\u001a\u0015e\u000e\f\u0011")
        @InterfaceC1492Gx
        private String subtextFont = "avenirltstd_book_0";

        @SerializedName(alternate = {}, value = "\u001a\u001b\u0007\u0018\b\u001a\u0015s\u0004\u0016\u0011n\u0004\u0014}")
        @InterfaceC1492Gx
        private int subtextTextSize = 16;

        @SerializedName(alternate = {}, value = "\t\u001b\u0019\u0018\u0012\u0010f\u000f\r\u0012")
        @InterfaceC1492Gx
        private String buttonFont = "avenirltstd_book_0";

        @SerializedName(alternate = {}, value = "\t\u001b\u0019\u0018\u0012\u0010t\u0005\u0017\u0012o\u0005\u0015~")
        @InterfaceC1492Gx
        private int buttonTextSize = 16;

        @SerializedName(alternate = {}, value = "\t\u001b\u0019\u0018\u0012\u0010t\u0005\u0017\u0012o\f{|\u0002\u0006}")
        @InterfaceC1492Gx
        private float buttonTextSpacing = 0.05f;

        @SerializedName(alternate = {}, value = "\t\u001b\u0019\u0018\u0012\u0010b\u000f\u0011\u0002\u0002\u000e]\t\u0005\u0007\t")
        @InterfaceC1492Gx
        private String buttonBorderColor = "#00000000";

        @SerializedName(alternate = {}, value = "\t\u001b\u0019\u0018\u0012\u0010b\u000f\u0011\u0002\u0002\u000eq\u0003|\f~")
        @InterfaceC1492Gx
        private int buttonBorderWidth = 2;

        @SerializedName(alternate = {}, value = "\t\u001b\u0019\u0018\u0012\u0010c\u000f\u0011\f\u0002\u000elz|\u0001\f\t")
        @InterfaceC1492Gx
        private int buttonCornerRadius = 25;

        @SerializedName(alternate = {}, value = "\t\u001b\u0019\u0018\u0012\u0010r\u0005\u000b~\u0011\u0005\u0011~o\u0001z\n|")
        @InterfaceC1492Gx
        private float buttonRelativeWidth = 0.5f;

        @SerializedName(alternate = {}, value = "\t\u001b\u0019\u0018\u0012\u0010t\u0005\u0017\u0012j\u000b\r\u0007y\u0004Y\u0005\u0001\u0003\u0005")
        @InterfaceC1492Gx
        private String buttonTextNormalColor = "#FFFFFF";

        @SerializedName(alternate = {}, value = "\t\u001b\u0019\u0018\u0012\u0010b\u0001\u0002\t\u0004\u000e\n\u000f\u0007{d\u0005\u0007\u0001s}S~z|~")
        @InterfaceC1492Gx
        private String buttonBackgroundNormalColor = "#dd141d";

        @SerializedName(alternate = {}, value = "\t\u001b\u0019\u0018\u0012\u0010t\u0005\u0017\u0012`\u0005\u000ezz\u0004{yW\u0003~\u0001\u0003")
        @InterfaceC1492Gx
        private String buttonTextDisabledColor = "#000000";

        @SerializedName(alternate = {}, value = "\t\u001b\u0019\u0018\u0012\u0010b\u0001\u0002\t\u0004\u000e\n\u000f\u0007{Z~\btt}usQ|xz|")
        @InterfaceC1492Gx
        private String buttonBackgroundDisabledColor = "#000000";

        @SerializedName(alternate = {}, value = "\t\u001b\u0019\u0018\u0012\u0010t\u0005\u0017\u0012d\u0005\u0002\u0002\u0005\u0001}}\tV\u0002}\u007f\u0002")
        @InterfaceC1492Gx
        private String buttonTextHighlightColor = "#000000";

        @SerializedName(alternate = {}, value = "\t\u001b\u0019\u0018\u0012\u0010b\u0001\u0002\t\u0004\u000e\n\u000f\u0007{^~{{~zww\u0003P{wy{")
        @InterfaceC1492Gx
        private String buttonBackgroundHighlightColor = "#000000";

        @SerializedName(alternate = {}, value = "")
        private String backgroundColors = "#000000";

        @SerializedName(alternate = {}, value = "")
        private String foregroundColor = "#00FFFFFF";

        @SerializedName(alternate = {}, value = "\u0019\u000b\u0006\b\u001ct\u0004\u0012\u0004\u0003\u000bc\u007fz||\tiy\f\u0007T\u007f{}\u007f")
        @InterfaceC1492Gx
        private String readyScreenHeaderTextColor = "#FFFFFF";

        @SerializedName(alternate = {}, value = "\u0019\u000b\u0006\b\u001ct\u0004\u0012\u0004\u0003\u000bj\u0011z\u0005]\u007f\u0002\u0001V\u0002}\u007f\u0002")
        @InterfaceC1492Gx
        private String readyScreenOvalFillColor = "#00FFFFFF";

        @SerializedName(alternate = {}, value = "\u0019\u000b\u0006\b\u001ct\u0004\u0012\u0004\u0003\u000bn\u0010{\r|\u000f\nhx\u000b\u0006S~z|~")
        @InterfaceC1492Gx
        private String readyScreenSubtextTextColor = "#FFFFFF";

        @SerializedName(alternate = {}, value = "\u0019\u000b\u0006\b\u001ct\u0004\u0012\u0004\u0003\u000bo\u007f\u0012\rYwx\u007fz\u0005\u0001\u0006}rP{wy{")
        @InterfaceC1492Gx
        private String readyScreenTextBackgroundColor = "#000000";

        @SerializedName(alternate = {}, value = "\u0019\u000b\u0006\b\u001ct\u0004\u0012\u0004\u0003\u000bo\u007f\u0012\rYwx\u007fz\u0005\u0001\u0006}rP{}xnzYgimxu")
        @InterfaceC1492Gx
        private int readyScreenTextBackgroundCornerRadius = 2;

        @SerializedName(alternate = {}, value = "\u0019\u000b\u0019\u0016\u001ct\u0004\u0012\u0004\u0003\u000bc\u007fz||\tiy\f\u0007T\u007f{}\u007f")
        @InterfaceC1492Gx
        private String retryScreenHeaderTextColor = "#FFFFFF";

        @SerializedName(alternate = {}, value = "\u0019\u000b\u0019\u0016\u001ct\u0004\u0012\u0004\u0003\u000bd\bz\u007f|X\u0005\u0007ww\u0004S~z|~")
        @InterfaceC1492Gx
        private String retryScreenImageBorderColor = "#000000";

        @SerializedName(alternate = {}, value = "\u0019\u000b\u0019\u0016\u001ct\u0004\u0012\u0004\u0003\u000bd\bz\u007f|X\u0005\u0007ww\u0004gxr\u0002t")
        @InterfaceC1492Gx
        private int retryScreenImageBorderWidth = 2;

        @SerializedName(alternate = {}, value = "\u0019\u000b\u0019\u0016\u001ct\u0004\u0012\u0004\u0003\u000bd\bz\u007f|Y\u0005\u0007\u0002w\u0004bprv\u0002~")
        @InterfaceC1492Gx
        private int retryScreenImageCornerRadius = 2;

        @SerializedName(alternate = {}, value = "\u0019\u000b\u0019\u0016\u001ct\u0004\u0012\u0004\u0003\u000bj\u0011z\u0005j\u000b\b\u0004~wT\u007f{}\u007f")
        @InterfaceC1492Gx
        private String retryScreenOvalStrokeColor = "#FFFFFF";

        @SerializedName(alternate = {}, value = "\u0019\u000b\u0019\u0016\u001ct\u0004\u0012\u0004\u0003\u000bn\u0007\u0003||\n}\u0004\u000b[~qvs\u0001")
        @InterfaceC1492Gx
        private int[] retryScreenSlideshowImages = {R.drawable.zoom_ideal_1, R.drawable.zoom_ideal_2, R.drawable.zoom_ideal_3, R.drawable.zoom_ideal_4, R.drawable.zoom_ideal_5};

        @SerializedName(alternate = {}, value = "\u0019\u000b\u0019\u0016\u001ct\u0004\u0012\u0004\u0003\u000bn\u0007\u0003||\n}\u0004\u000b[\u007f\u0005t\u0001\u0004mw")
        @InterfaceC1492Gx
        private int retryScreenSlideshowInterval = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;

        @SerializedName(alternate = {}, value = "\u0019\u000b\u0019\u0016\u001ct\u0004\u0012\u0004\u0003\u000bn\u0010{\r|\u000f\nhx\u000b\u0006S~z|~")
        @InterfaceC1492Gx
        private String retryScreenSubtextTextColor = "#FFFFFF";

        public final String getBackgroundColors() {
            return this.backgroundColors;
        }

        public final String getButtonBackgroundDisabledColor() {
            return this.buttonBackgroundDisabledColor;
        }

        public final String getButtonBackgroundHighlightColor() {
            return this.buttonBackgroundHighlightColor;
        }

        public final String getButtonBackgroundNormalColor() {
            return this.buttonBackgroundNormalColor;
        }

        public final String getButtonBorderColor() {
            return this.buttonBorderColor;
        }

        public final int getButtonBorderWidth() {
            return this.buttonBorderWidth;
        }

        public final int getButtonCornerRadius() {
            return this.buttonCornerRadius;
        }

        public final String getButtonFont() {
            return this.buttonFont;
        }

        public final float getButtonRelativeWidth() {
            return this.buttonRelativeWidth;
        }

        public final String getButtonTextDisabledColor() {
            return this.buttonTextDisabledColor;
        }

        public final String getButtonTextHighlightColor() {
            return this.buttonTextHighlightColor;
        }

        public final String getButtonTextNormalColor() {
            return this.buttonTextNormalColor;
        }

        public final int getButtonTextSize() {
            return this.buttonTextSize;
        }

        public final float getButtonTextSpacing() {
            return this.buttonTextSpacing;
        }

        public final int getCameraPermissionsScreenImage() {
            return this.cameraPermissionsScreenImage;
        }

        public final boolean getEnableRetryScreenBulletedInstructions() {
            return this.enableRetryScreenBulletedInstructions;
        }

        public final boolean getEnableRetryScreenSlideshowShuffle() {
            return this.enableRetryScreenSlideshowShuffle;
        }

        public final String getForegroundColor() {
            return this.foregroundColor;
        }

        public final String getHeaderFont() {
            return this.headerFont;
        }

        public final int getHeaderTextSize() {
            return this.headerTextSize;
        }

        public final float getHeaderTextSpacing() {
            return this.headerTextSpacing;
        }

        public final String getReadyScreenHeaderTextColor() {
            return this.readyScreenHeaderTextColor;
        }

        public final String getReadyScreenOvalFillColor() {
            return this.readyScreenOvalFillColor;
        }

        public final String getReadyScreenSubtextTextColor() {
            return this.readyScreenSubtextTextColor;
        }

        public final String getReadyScreenTextBackgroundColor() {
            return this.readyScreenTextBackgroundColor;
        }

        public final int getReadyScreenTextBackgroundCornerRadius() {
            return this.readyScreenTextBackgroundCornerRadius;
        }

        public final String getRetryScreenHeaderTextColor() {
            return this.retryScreenHeaderTextColor;
        }

        public final String getRetryScreenImageBorderColor() {
            return this.retryScreenImageBorderColor;
        }

        public final int getRetryScreenImageBorderWidth() {
            return this.retryScreenImageBorderWidth;
        }

        public final int getRetryScreenImageCornerRadius() {
            return this.retryScreenImageCornerRadius;
        }

        public final String getRetryScreenOvalStrokeColor() {
            return this.retryScreenOvalStrokeColor;
        }

        public final int[] getRetryScreenSlideshowImages() {
            return this.retryScreenSlideshowImages;
        }

        public final int getRetryScreenSlideshowInterval() {
            return this.retryScreenSlideshowInterval;
        }

        public final String getRetryScreenSubtextTextColor() {
            return this.retryScreenSubtextTextColor;
        }

        public final String getSubtextFont() {
            return this.subtextFont;
        }

        public final int getSubtextTextSize() {
            return this.subtextTextSize;
        }

        public final float getSubtextTextSpacing() {
            return this.subtextTextSpacing;
        }

        public final void setBackgroundColors(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.backgroundColors = str;
        }

        public final void setButtonBackgroundDisabledColor(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.buttonBackgroundDisabledColor = str;
        }

        public final void setButtonBackgroundHighlightColor(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.buttonBackgroundHighlightColor = str;
        }

        public final void setButtonBackgroundNormalColor(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.buttonBackgroundNormalColor = str;
        }

        public final void setButtonBorderColor(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.buttonBorderColor = str;
        }

        public final void setButtonBorderWidth(int i2) {
            this.buttonBorderWidth = i2;
        }

        public final void setButtonCornerRadius(int i2) {
            this.buttonCornerRadius = i2;
        }

        public final void setButtonFont(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.buttonFont = str;
        }

        public final void setButtonRelativeWidth(float f2) {
            this.buttonRelativeWidth = f2;
        }

        public final void setButtonTextDisabledColor(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.buttonTextDisabledColor = str;
        }

        public final void setButtonTextHighlightColor(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.buttonTextHighlightColor = str;
        }

        public final void setButtonTextNormalColor(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.buttonTextNormalColor = str;
        }

        public final void setButtonTextSize(int i2) {
            this.buttonTextSize = i2;
        }

        public final void setButtonTextSpacing(float f2) {
            this.buttonTextSpacing = f2;
        }

        public final void setCameraPermissionsScreenImage(int i2) {
            this.cameraPermissionsScreenImage = i2;
        }

        public final void setEnableRetryScreenBulletedInstructions(boolean z2) {
            this.enableRetryScreenBulletedInstructions = z2;
        }

        public final void setEnableRetryScreenSlideshowShuffle(boolean z2) {
            this.enableRetryScreenSlideshowShuffle = z2;
        }

        public final void setForegroundColor(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.foregroundColor = str;
        }

        public final void setHeaderFont(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.headerFont = str;
        }

        public final void setHeaderTextSize(int i2) {
            this.headerTextSize = i2;
        }

        public final void setHeaderTextSpacing(float f2) {
            this.headerTextSpacing = f2;
        }

        public final void setReadyScreenHeaderTextColor(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.readyScreenHeaderTextColor = str;
        }

        public final void setReadyScreenOvalFillColor(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.readyScreenOvalFillColor = str;
        }

        public final void setReadyScreenSubtextTextColor(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.readyScreenSubtextTextColor = str;
        }

        public final void setReadyScreenTextBackgroundColor(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.readyScreenTextBackgroundColor = str;
        }

        public final void setReadyScreenTextBackgroundCornerRadius(int i2) {
            this.readyScreenTextBackgroundCornerRadius = i2;
        }

        public final void setRetryScreenHeaderTextColor(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.retryScreenHeaderTextColor = str;
        }

        public final void setRetryScreenImageBorderColor(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.retryScreenImageBorderColor = str;
        }

        public final void setRetryScreenImageBorderWidth(int i2) {
            this.retryScreenImageBorderWidth = i2;
        }

        public final void setRetryScreenImageCornerRadius(int i2) {
            this.retryScreenImageCornerRadius = i2;
        }

        public final void setRetryScreenOvalStrokeColor(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.retryScreenOvalStrokeColor = str;
        }

        public final void setRetryScreenSlideshowImages(int[] iArr) {
            Intrinsics.checkParameterIsNotNull(iArr, "<set-?>");
            this.retryScreenSlideshowImages = iArr;
        }

        public final void setRetryScreenSlideshowInterval(int i2) {
            this.retryScreenSlideshowInterval = i2;
        }

        public final void setRetryScreenSubtextTextColor(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.retryScreenSubtextTextColor = str;
        }

        public final void setSubtextFont(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.subtextFont = str;
        }

        public final void setSubtextTextSize(int i2) {
            this.subtextTextSize = i2;
        }

        public final void setSubtextTextSpacing(float f2) {
            this.subtextTextSpacing = f2;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005+4\u0012\u0006\rnj?3Z͜x.\u0001Rj\u0012ө\u007f42[t\u000eQ<m\u001a,$?S\rk>ùVҼ\u000fO\u0017إ.zp/WY\u0019_\u0018\u0014@H@[AT\b=gb+:C$\tĺDѩ\t\r\"ݒ`\u0012|\u0003QO,\u00146I~@#)[\u000f2\u00124@V\u0005\\`>\u07b6BՂpiBǂ;\u0005oM\\+\u007f2\u0003Y\u001bL%C\u001b\u0004y\u001eYNm9S)*ΐ\u0013қ_K\u000bӊ\n?\u000bw57KKyhDją\u0018("}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`!f\\z\u001b$ i\u0018V/\"\u0001hE.w\u0003!0\u00043'\u0012Iw\u000b\u0014\u001a#1ytL_e", "", "u(E", ">q^4e,Lav\t\u0002h9H", "", "5dc\u001de6@`\u0019\r\t<6\u0004\u0013<1", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u001de6@`\u0019\r\t<6\u0004\u0013<1", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", ">q^4e,Lav\t\u0002h9I", "5dc\u001de6@`\u0019\r\t<6\u0004\u0013<2", "Adc\u001de6@`\u0019\r\t<6\u0004\u0013<2", "Asa<^,\u001c] \t\b", "5dc g9HY\u0019\\\u0005e6\n", "Adc g9HY\u0019\\\u0005e6\n", "Asa<^,0W\u0018\u000e}", "", "5dc g9HY\u0019p~];\u007f", "u(8", "Adc g9HY\u0019p~];\u007f", "uH\u0018#", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class OvalCustomization {

        @SerializedName(alternate = {}, value = "\u001a\u001a\u0017\u0013\u000e\u0007c\u000f\u000b\r\u000f")
        @InterfaceC1492Gx
        private String strokeColor = "#FFFFFF";

        @SerializedName(alternate = {}, value = "\u0017\u0018\u0014\u000b\u0015\u0007\u0014\u0013a\r\t\u000b\rJ")
        @InterfaceC1492Gx
        private String progressColor1 = "#dd141d";

        @SerializedName(alternate = {}, value = "\u0017\u0018\u0014\u000b\u0015\u0007\u0014\u0013a\r\t\u000b\rK")
        @InterfaceC1492Gx
        private String progressColor2 = "#c3141c";

        @SerializedName(alternate = {}, value = "\u001a\u001a\u0017\u0013\u000e\u0007w\t\u0003\u0012\u0005")
        @InterfaceC1492Gx
        private int strokeWidth = 1;

        public final String getProgressColor1() {
            return this.progressColor1;
        }

        public final String getProgressColor2() {
            return this.progressColor2;
        }

        public final String getStrokeColor() {
            return this.strokeColor;
        }

        public final int getStrokeWidth() {
            return this.strokeWidth;
        }

        public final void setProgressColor1(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.progressColor1 = str;
        }

        public final void setProgressColor2(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.progressColor2 = str;
        }

        public final void setStrokeColor(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.strokeColor = str;
        }

        public final void setStrokeWidth(int i2) {
            this.strokeWidth = i2;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005%4\u0012\u0006\rnj?3LeV7ZS0\u0012\u0002ڔd$\n#2FтY\u001a\f\"Yk\\h\u007fnx\\AGM\nlіv߽Ma\u0001ز*\u00118E}CSOuBGfER\u0013'J\"f\u0002;\u0005X.\u001fƽ\u0003ټGW\u0014۵HBvC`\u0017m\u0007 \u001d\u0014Jp\u001d,i\u007fNdV#ax3yɍuŌR3gܞ\u0015O\u0013Ub7-xg/9Rˣ9("}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`!f\\z\u001b$ i\u0018V/\"\u0001hE.w\u0003!0\b9P}OF\u0011\u001a%\u0018=n\u0006>e\u0014Q\u0003j", "", "u(E", "0`R8Z9Hc\"}Xh3\u0007\u0016", "", "5dc\u000fT*DU&\t\u000bg+Z\u00136o\r", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u000fT*DU&\t\u000bg+Z\u00136o\r", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "0qP;W0GU|\u0007v`,", "", "5dc\u000fe(GR\u001d\b|B4x\u000b/", "u(8", "Adc\u000fe(GR\u001d\b|B4x\u000b/", "uH\u0018#", "Ag^D59:\\\u0018\u0003\u0004`\u0010\u0005\u00051e", "", "5dc [6P0&z\u0004]0\u0006\u000b\u0013m{*{", "u(I", "Adc [6P0&z\u0004]0\u0006\u000b\u0013m{*{", "uY\u0018#", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class OverlayCustomization {

        @SerializedName(alternate = {}, value = "\t\u0007\b\u000f\n\u0014\u0010\u0015\r\u0002_\u000b\u0007\t\u000b")
        @InterfaceC1492Gx
        private String backgroundColor = "#000000";

        @SerializedName(alternate = {}, value = "")
        private int brandingImage = R.drawable.ic_enterprise_logo;

        @SerializedName(alternate = {}, value = "")
        private boolean showBrandingImage;

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final int getBrandingImage() {
            return this.brandingImage;
        }

        public final boolean getShowBrandingImage() {
            return this.showBrandingImage;
        }

        public final void setBackgroundColor(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.backgroundColor = str;
        }

        public final void setBrandingImage(int i2) {
            this.brandingImage = i2;
        }

        public final void setShowBrandingImage(boolean z2) {
            this.showBrandingImage = z2;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я.\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005%4\u0012\u0006\fnj?6LeV4ZS0<s{B-c$wLQ٥J}P\b\u0010Q˗knXZ[_\u001d\u0007.x\u0019.\u007fY7ahƉ>ԲsK;ݹ\b??c\u0003:%\"8'F\u007fU\u001d(1`\u0010%\u0003yOJ\u0016\u0007ϓ|ĐV\u0019UĨ2\u0014\fG.\u000b>^mYDT=yH<;\u0003\u0018D\u0005+\u001e4Sչ\u0019ТX3\u0015Ǹy 1NE95'Y\u0012\u0015X,[\u0011O\n=3y]+iMJɖBݼ\u0004 \u001dۀg\u000fc\u00054o%Sf 5@ \u007fYf&(&\f2\u0011z\bd\u03823ρ29\"Ǒ \u00109\f\u0001f`R\bvP\u0015K}D0=\u007fa<o\u001f%U8ݪ%\u05ee;\b\rټ6%\u0007\t/nt\u0010f0)iHm?mX=v_@]{qZ͗n͆.\u00108Ϛ\u00181\u0002.<*E9aW16<\u001eVc\u007fv3q\u001fW(V\u001f؟.å\u001aC2\u009e$\\J\u0005\u0013~pV^M\u001fblp\u0015  \u0013Nm.@_)fʢ[ŹmvUΪ\"'5\nEl\u000fm\u0014{Gs\u0004Q_\t(a\u0001\bJCzf[֢r͞W\u0018b٢@$8nx#\u0018}Ju\u001a(\u0003[\u007fDL,_\u001b\u0013\u0019\u0007\u0007t՛MҴ\rkbӐ(\u0001Z\\2\u0007\n&z3\u000fV-\r}\u0013\u0011IZ~\u0017&kE(ډ%łY.pؔ\u0015%\r+\u0002\u0004giRtZrf\u0012c*8\u0016HJ\b3{\u0017eȷ5ɨ\u00069Mɣ\u000bgW| :\u001b~\u007f?I}~\u0004\u0016\u001c\t,\u000fr\u0001S\u0013\u001bxԶjѓ'\u0014lр\u0012cL-Umt\raqW~SuJ\u0003P|3!T)?sxĤAԩG3%ȶ\u0010\u00165Joa\nq40p\u0015v\u0011s;DcDq\u0019U\u001c6\u0012ͷU˕\u0003J*غ\u0005\u0005H\u0001x{(D\u000fm\u001b9\u0019]r+n8{\u001ce\u0002%\u000b\u0003ހ|Æ_F\u001b̊\u001664\u001b8\u0007c\u007f\u001a\u001bQ:aia%\u0006mymANM\u000ea֒=ߎ\u0016(EղnYhG>\u0019\u0014\u001a<\u0001IwUX\u0017dL,jIAG\u0013m\\ؓ\u0007ķJk\u0017ğJDy}dQtzb\u001bVJ1angB\u0001-\u0011i\"79\bܒyܑX;kѢ\u0019U#P)no\u0001lm9J%U)qp\u00019G\u0014G\b\u0006\r߬SԆqwwȯP\u001a\u0003gP\u001c;;W\\m|ғbW"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`!f\\z\u001b$ i\u0018V/\"\u0001hE.w\u0003$\u001f\u0016<P\u0011)f\u000e\f\u0016\u0017\u0013z~Q`\u0018K\u000f\u0011\u0005E3q\u001c", "", "u(E", "/bc6i0Mg|\byb*x\u00189r]2\u0003J\u000e", "", "5dc\u000eV;Bd\u001d\u000e\u000fB5{\r-a\u000f2\t\u001e\u000b\u001e!T", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u000eV;Bd\u001d\u000e\u000fB5{\r-a\u000f2\t\u001e\u000b\u001e!T", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "/mX:T;B]\"kze(\f\r@em&wG\u0001", "", "5dc\u000ea0FO(\u0003\u0005g\u0019|\u0010+t\u00049{.~\u0013\u001eG", "u(5", "Adc\u000ea0FO(\u0003\u0005g\u0019|\u0010+t\u00049{.~\u0013\u001eG", "uE\u0018#", "0`R8Z9Hc\"}Xh3\u0007\u0016=", "5dc\u000fT*DU&\t\u000bg+Z\u00136o\r6", "Adc\u000fT*DU&\t\u000bg+Z\u00136o\r6", "1tbAb4\u001aQ(\u0003\fb;\u0011l8d\u0004&wO\u000b$rPs\u00168\u0006)?b", "", "5dc\u0010h:M]!Zxm0\u000e\r>yc1zD~\u0013&Q|iEz-1h\u0002*@", "u(8", "Adc\u0010h:M]!Zxm0\u000e\r>yc1zD~\u0013&Q|iEz-1h\u0002*@", "uH\u0018#", "1tbAb4\u001aQ(\u0003\fb;\u0011l8d\u0004&wO\u000b$zOk\u0010<", "5dc\u0010h:M]!Zxm0\u000e\r>yc1zD~\u0013&Q|qDr'5", "Adc\u0010h:M]!Zxm0\u000e\r>yc1zD~\u0013&Q|qDr'5", "1tbAb4\u001aQ(\u0003\fb;\u0011l8d\u0004&wO\u000b$\u0004Q~\nKz/>=\u0007/7z'*T", "5dc\u0010h:M]!Zxm0\u000e\r>yc1zD~\u0013&Q|zF\u0006!D]\b)\u001bv%.ZT7r", "Adc\u0010h:M]!Zxm0\u000e\r>yc1zD~\u0013&Q|zF\u0006!D]\b)\u001bv%.ZT7r", "1tbAb4+S'\u000f\u0002m\b\u0006\r7a\u000f,\u0006In'\u0015Eo\u001cJ", "5dc\u0010h:M]!kzl<\u0004\u0018\u000bn\u00040wO\u0005! 5\u007f\f:v3C", "Adc\u0010h:M]!kzl<\u0004\u0018\u000bn\u00040wO\u0005! 5\u007f\f:v3C", "1tbAb4+S'\u000f\u0002m\b\u0006\r7a\u000f,\u0006Ip %Wm\f<\u00053", "5dc\u0010h:M]!kzl<\u0004\u0018\u000bn\u00040wO\u0005! 7x\u001cLt#5g\f", "Adc\u0010h:M]!kzl<\u0004\u0018\u000bn\u00040wO\u0005! 7x\u001cLt#5g\f", "1tbAb4,b\u0015\u000e~\\\u0019|\u0017?l\u000f\u0004\u0005D\t\u0013&Ky\u0017*\u0007#3Y\f.", "5dc\u0010h:M]!l\nZ;\u0001\u0007\u001ce\u000e8\u0003O\\ \u001bOk\u001d@\u0001.#i{\u001e7{$", "Adc\u0010h:M]!l\nZ;\u0001\u0007\u001ce\u000e8\u0003O\\ \u001bOk\u001d@\u0001.#i{\u001e7{$", "1tbAb4,b\u0015\u000e~\\\u0019|\u0017?l\u000f\u0004\u0005D\t\u0013&Ky\u0017,\u007f3EW{ E{", "5dc\u0010h:M]!l\nZ;\u0001\u0007\u001ce\u000e8\u0003O\\ \u001bOk\u001d@\u0001.%b\f05k\u0016<[", "Adc\u0010h:M]!l\nZ;\u0001\u0007\u001ce\u000e8\u0003O\\ \u001bOk\u001d@\u0001.%b\f05k\u0016<[", "4na2Z9Hc\"}Xh3\u0007\u0016", "5dc\u0013b9>U&\t\u000bg+Z\u00136o\r", "Adc\u0013b9>U&\t\u000bg+Z\u00136o\r", ";db@T.>4#\b\n", "5dc\u001aX:LO\u001b~[h5\f", "Adc\u001aX:LO\u001b~[h5\f", ";db@T.>B\u0019\u0012\nL0\u0012\t", "5dc\u001aX:LO\u001b~i^?\fv3z\u007f", "Adc\u001aX:LO\u001b~i^?\fv3z\u007f", ";db@T.>B\u0019\u0012\nL7x\u00073n\u0002", "5dc\u001aX:LO\u001b~i^?\fv:a},\u0005B", "Adc\u001aX:LO\u001b~i^?\fv:a},\u0005B", "@dbB_;\u001a\\\u001d\u0007vm0\u0007\u0012\fa}.}M\u000b' FM\u0018C\u00012", "5dc\u001fX:NZ(Z\u0004b4x\u00183o\t\u0005w>\u0007\u0019$Q\u007f\u0017;T/<c\u000b", "Adc\u001fX:NZ(Z\u0004b4x\u00183o\t\u0005w>\u0007\u0019$Q\u007f\u0017;T/<c\u000b", "@dbB_;\u001a\\\u001d\u0007vm0\u0007\u0012\u0010o\r(}M\u000b' FM\u0018C\u00012", "5dc\u001fX:NZ(Z\u0004b4x\u00183o\t\t\u0006M\u0001\u0019$Q\u007f\u0017;T/<c\u000b", "Adc\u001fX:NZ(Z\u0004b4x\u00183o\t\t\u0006M\u0001\u0019$Q\u007f\u0017;T/<c\u000b", "@dbB_;\u001a\\\u001d\u0007vm0\u0007\u0012\u001du}&{N\u000fs\u0013Eu\u0010I\u00015>Xa(3o\u0016", "5dc\u001fX:NZ(Z\u0004b4x\u00183o\t\u0016\f>~\u0017%UL\n:|'Bc\u000e)6Q\u001e*OC", "Adc\u001fX:NZ(Z\u0004b4x\u00183o\t\u0016\f>~\u0017%UL\n:|'Bc\u000e)6Q\u001e*OC", "@dbB_;\u001a\\\u001d\u0007vm0\u0007\u0012\u001fn\u000e8y>\u0001%%$k\fBx2?i\u0007\u001f\u001bu\u00120M", "5dc\u001fX:NZ(Z\u0004b4x\u00183o\t\u0018\u0005N\u0011\u0015\u0015G}\u001c\u0019r#;[\u000b*Gv\u0015\u0012U?=k", "Adc\u001fX:NZ(Z\u0004b4x\u00183o\t\u0018\u0005N\u0011\u0015\u0015G}\u001c\u0019r#;[\u000b*Gv\u0015\u0012U?=k", "Ag^DH7E]\u0015}ek6~\u0016/s\u000e\u0005wM", "", "5dc [6PC$\u0006\u0005Z+g\u00169g\r(\nN]\u0013$", "u(I", "Adc [6PC$\u0006\u0005Z+g\u00169g\r(\nN]\u0013$", "uY\u0018#", "Co[<T+)`#\u0001\b^:\u000bi3l\u0007\u0006\u0006G\u000b$", "5dc\"c3HO\u0018i\bh.\n\t=s`,\u0003G^!\u001eQ|", "Adc\"c3HO\u0018i\bh.\n\t=s`,\u0003G^!\u001eQ|", "Co[<T+)`#\u0001\b^:\u000bw<a}.YJ\b!$", "5dc\"c3HO\u0018i\bh.\n\t=sn5w>\u0007t!Ny\u001b", "Adc\"c3HO\u0018i\bh.\n\t=sn5w>\u0007t!Ny\u001b", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class ResultScreenCustomization {

        @SerializedName(alternate = {}, value = "\n\u001b\u0018\u0018\u0012\u000fa\u0003\u0013\u0007\u0013\u0005\u000f\u0013a\u0006z~wt\u0007\u0001\u0003P|vyl~rwu")
        @InterfaceC1492Gx
        private int customActivityIndicatorAnimation;

        @SerializedName(alternate = {}, value = "\n\u001b\u0018\u0018\u0012\u000fa\u0003\u0013\u0007\u0013\u0005\u000f\u0013a\u0006z~wt\u0007\u0001\u0003X{nsp")
        @InterfaceC1492Gx
        private int customActivityIndicatorImage;

        @SerializedName(alternate = {}, value = "\n\u001b\u0018\u0018\u0012\u000fr\u0005\u0012\u0013\t\u0010[\b\u0002\u0005w\n}\u0003\u0001d\u0006rqr\u007f~")
        @InterfaceC1492Gx
        private int customResultAnimationSuccess;

        @SerializedName(alternate = {}, value = "\n\u001b\u0018\u0018\u0012\u000fr\u0005\u0012\u0013\t\u0010[\b\u0002\u0005w\n}\u0003\u0001f~\u0003\u0004pop}|")
        @InterfaceC1492Gx
        private int customResultAnimationUnsuccess;

        @SerializedName(alternate = {}, value = "\n\u001b\u0018\u0018\u0012\u000fs\u0014\u007f\u0012\u0006~l~\f\r\u0003\nU\u0002{~q\u0004w|z^\u007flklyx")
        @InterfaceC1492Gx
        private int customStaticResultAnimationSuccess;

        @SerializedName(alternate = {}, value = "\n\u001b\u0018\u0018\u0012\u000fs\u0014\u007f\u0012\u0006~l~\f\r\u0003\nU\u0002{~q\u0004w|z`x|}jijwv")
        @InterfaceC1492Gx
        private int customStaticResultAnimationUnsuccess;

        @SerializedName(alternate = {}, value = "\b\t\u0019\r\u0019\u000b\u0015\u0019g\f\u0001\u0005}z\r\u0007\tX\u0004\u007f\u0002\u0004")
        @InterfaceC1492Gx
        private String activityIndicatorColor = "#dd141d";

        @SerializedName(alternate = {}, value = "\b\u0014\u000e\u0011\u0004\u0016\n\u000f\ro\u0002\b{\u000e\u0002\u000e{hwt~v")
        @InterfaceC1492Gx
        private float animationRelativeScale = 1.0f;

        @SerializedName(alternate = {}, value = "\t\u0007\b\u000f\n\u0014\u0010\u0015\r\u0002_\u000b\u0007\t\u000b\u000b")
        @InterfaceC1492Gx
        private String backgroundColors = "#ececec";

        @SerializedName(alternate = {}, value = "\n\u001b\u0018\u0018\u0012\u000fa\u0003\u0013\u0007\u0013\u0005\u000f\u0013a\u0006z~wt\u0007\u0001\u0003a}\u0002m\u007fsxvPtyiuxbl")
        @InterfaceC1492Gx
        private int customActivityIndicatorRotationInterval = 1000;

        @SerializedName(alternate = {}, value = "\r\u0015\u0017\t\n\u0014\u0010\u0015\r\u0002_\u000b\u0007\t\u000b")
        @InterfaceC1492Gx
        private String foregroundColor = "#565656";

        @SerializedName(alternate = {}, value = "\u0014\u000b\u0018\u0017\u0004\t\u0006e\u000e\f\u0011")
        @InterfaceC1492Gx
        private String messageFont = "avenirltstd_book_0";

        @SerializedName(alternate = {}, value = "\u0014\u000b\u0018\u0017\u0004\t\u0006s\u0004\u0016\u0011n\u0004\u0014}")
        @InterfaceC1492Gx
        private int messageTextSize = 20;

        @SerializedName(alternate = {}, value = "\u0014\u000b\u0018\u0017\u0004\t\u0006s\u0004\u0016\u0011n\u000bz{\u0001\u0005|")
        @InterfaceC1492Gx
        private float messageTextSpacing = 0.05f;

        @SerializedName(alternate = {}, value = "\u0019\u000b\u0018\u0019\u000f\u0016a\u000e\b\u000b}\u0010\u0004\t\u0007Ywx\u007fz\u0005\u0001\u0006}rP{wy{")
        @InterfaceC1492Gx
        private String resultAnimationBackgroundColor = "#00FFFFFF";

        @SerializedName(alternate = {}, value = "\u0019\u000b\u0018\u0019\u000f\u0016a\u000e\b\u000b}\u0010\u0004\t\u0007]\u0006\byz\u0005\u0001\u0006}rP{wy{")
        @InterfaceC1492Gx
        private String resultAnimationForegroundColor = "#dd141d";

        @SerializedName(alternate = {}, value = "\u0019\u000b\u0018\u0019\u000f\u0016a\u000e\b\u000b}\u0010\u0004\t\u0007j\fxwx\u0006\u0005Rpqxs}y~vkOrejg")
        @InterfaceC1492Gx
        private int resultAnimationSuccessBackgroundImage = R.drawable.ic_null;

        @SerializedName(alternate = {}, value = "\u0019\u000b\u0018\u0019\u000f\u0016a\u000e\b\u000b}\u0010\u0004\t\u0007l\u0005\t\nvuv\u0004\u0003Pnovq{w|tiMpche")
        @InterfaceC1492Gx
        private int resultAnimationUnsuccessBackgroundImage = R.drawable.ic_null;

        @SerializedName(alternate = {}, value = "\u001a\u000e\u0014\u001bw\u0012\r\u000f\u007f\u0002l\u000e\n\u0001\u000b|\n\tVt\u0005")
        @InterfaceC1492Gx
        private boolean showUploadProgressBar = true;

        @SerializedName(alternate = {}, value = "\u001c\u0016\u0011\u0013\u0004\u0006p\u0012\u000e\u0005\u000f\u0001\u000e\r^\u0001\u0003\u0002W\u0003~\u0001\u0003")
        @InterfaceC1492Gx
        private String uploadProgressFillColor = "#dd141d";

        @SerializedName(alternate = {}, value = "\u001c\u0016\u0011\u0013\u0004\u0006p\u0012\u000e\u0005\u000f\u0001\u000e\rl\nwx\u007fV\u0002}\u007f\u0002")
        @InterfaceC1492Gx
        private String uploadProgressTrackColor = "#c7c7c7";

        public final String getActivityIndicatorColor() {
            return this.activityIndicatorColor;
        }

        public final float getAnimationRelativeScale() {
            return this.animationRelativeScale;
        }

        public final String getBackgroundColors() {
            return this.backgroundColors;
        }

        public final int getCustomActivityIndicatorAnimation() {
            return this.customActivityIndicatorAnimation;
        }

        public final int getCustomActivityIndicatorImage() {
            return this.customActivityIndicatorImage;
        }

        public final int getCustomActivityIndicatorRotationInterval() {
            return this.customActivityIndicatorRotationInterval;
        }

        public final int getCustomResultAnimationSuccess() {
            return this.customResultAnimationSuccess;
        }

        public final int getCustomResultAnimationUnsuccess() {
            return this.customResultAnimationUnsuccess;
        }

        public final int getCustomStaticResultAnimationSuccess() {
            return this.customStaticResultAnimationSuccess;
        }

        public final int getCustomStaticResultAnimationUnsuccess() {
            return this.customStaticResultAnimationUnsuccess;
        }

        public final String getForegroundColor() {
            return this.foregroundColor;
        }

        public final String getMessageFont() {
            return this.messageFont;
        }

        public final int getMessageTextSize() {
            return this.messageTextSize;
        }

        public final float getMessageTextSpacing() {
            return this.messageTextSpacing;
        }

        public final String getResultAnimationBackgroundColor() {
            return this.resultAnimationBackgroundColor;
        }

        public final String getResultAnimationForegroundColor() {
            return this.resultAnimationForegroundColor;
        }

        public final int getResultAnimationSuccessBackgroundImage() {
            return this.resultAnimationSuccessBackgroundImage;
        }

        public final int getResultAnimationUnsuccessBackgroundImage() {
            return this.resultAnimationUnsuccessBackgroundImage;
        }

        public final boolean getShowUploadProgressBar() {
            return this.showUploadProgressBar;
        }

        public final String getUploadProgressFillColor() {
            return this.uploadProgressFillColor;
        }

        public final String getUploadProgressTrackColor() {
            return this.uploadProgressTrackColor;
        }

        public final void setActivityIndicatorColor(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.activityIndicatorColor = str;
        }

        public final void setAnimationRelativeScale(float f2) {
            this.animationRelativeScale = f2;
        }

        public final void setBackgroundColors(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.backgroundColors = str;
        }

        public final void setCustomActivityIndicatorAnimation(int i2) {
            this.customActivityIndicatorAnimation = i2;
        }

        public final void setCustomActivityIndicatorImage(int i2) {
            this.customActivityIndicatorImage = i2;
        }

        public final void setCustomActivityIndicatorRotationInterval(int i2) {
            this.customActivityIndicatorRotationInterval = i2;
        }

        public final void setCustomResultAnimationSuccess(int i2) {
            this.customResultAnimationSuccess = i2;
        }

        public final void setCustomResultAnimationUnsuccess(int i2) {
            this.customResultAnimationUnsuccess = i2;
        }

        public final void setCustomStaticResultAnimationSuccess(int i2) {
            this.customStaticResultAnimationSuccess = i2;
        }

        public final void setCustomStaticResultAnimationUnsuccess(int i2) {
            this.customStaticResultAnimationUnsuccess = i2;
        }

        public final void setForegroundColor(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.foregroundColor = str;
        }

        public final void setMessageFont(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.messageFont = str;
        }

        public final void setMessageTextSize(int i2) {
            this.messageTextSize = i2;
        }

        public final void setMessageTextSpacing(float f2) {
            this.messageTextSpacing = f2;
        }

        public final void setResultAnimationBackgroundColor(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.resultAnimationBackgroundColor = str;
        }

        public final void setResultAnimationForegroundColor(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.resultAnimationForegroundColor = str;
        }

        public final void setResultAnimationSuccessBackgroundImage(int i2) {
            this.resultAnimationSuccessBackgroundImage = i2;
        }

        public final void setResultAnimationUnsuccessBackgroundImage(int i2) {
            this.resultAnimationUnsuccessBackgroundImage = i2;
        }

        public final void setShowUploadProgressBar(boolean z2) {
            this.showUploadProgressBar = z2;
        }

        public final void setUploadProgressFillColor(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.uploadProgressFillColor = str;
        }

        public final void setUploadProgressTrackColor(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.uploadProgressTrackColor = str;
        }
    }

    public final CancelButtonCustomization getCancelButtonCustomization() {
        return this.cancelButtonCustomization;
    }

    public final FeedbackCustomization getFeedbackCustomization() {
        return this.feedbackCustomization;
    }

    public final FrameCustomization getFrameCustomization() {
        return this.frameCustomization;
    }

    public final GuidanceCustomization getGuidanceCustomization() {
        return this.guidanceCustomization;
    }

    public final OvalCustomization getOvalCustomization() {
        return this.ovalCustomization;
    }

    public final OverlayCustomization getOverlayCustomization() {
        return this.overlayCustomization;
    }

    public final ResultScreenCustomization getResultScreenCustomization() {
        return this.resultScreenCustomization;
    }

    public final void setCancelButtonCustomization(CancelButtonCustomization cancelButtonCustomization) {
        Intrinsics.checkParameterIsNotNull(cancelButtonCustomization, "<set-?>");
        this.cancelButtonCustomization = cancelButtonCustomization;
    }

    public final void setFeedbackCustomization(FeedbackCustomization feedbackCustomization) {
        Intrinsics.checkParameterIsNotNull(feedbackCustomization, "<set-?>");
        this.feedbackCustomization = feedbackCustomization;
    }

    public final void setFrameCustomization(FrameCustomization frameCustomization) {
        Intrinsics.checkParameterIsNotNull(frameCustomization, "<set-?>");
        this.frameCustomization = frameCustomization;
    }

    public final void setGuidanceCustomization(GuidanceCustomization guidanceCustomization) {
        Intrinsics.checkParameterIsNotNull(guidanceCustomization, "<set-?>");
        this.guidanceCustomization = guidanceCustomization;
    }

    public final void setOvalCustomization(OvalCustomization ovalCustomization) {
        Intrinsics.checkParameterIsNotNull(ovalCustomization, "<set-?>");
        this.ovalCustomization = ovalCustomization;
    }

    public final void setOverlayCustomization(OverlayCustomization overlayCustomization) {
        Intrinsics.checkParameterIsNotNull(overlayCustomization, "<set-?>");
        this.overlayCustomization = overlayCustomization;
    }

    public final void setResultScreenCustomization(ResultScreenCustomization resultScreenCustomization) {
        Intrinsics.checkParameterIsNotNull(resultScreenCustomization, "<set-?>");
        this.resultScreenCustomization = resultScreenCustomization;
    }
}
