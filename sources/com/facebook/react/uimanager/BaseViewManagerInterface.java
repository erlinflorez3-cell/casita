package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&˛\bDZc|\u0004Oي8é6B\r\"4\u0012}\u0007njO0LeN/ZS@\u000fs{:'c$\u007fOCU \u0001*\teNogtOb\u000bQ\u0015\u000e\u0016~k4Ic}e\u0012\u0015AJoM<UoCQfYLӌH8(\u0600\b\u0004)\u001aXH@v)D\u0014) 2XphU=Q\u0013\u001e*\u0006tĨ1$jlf8^k\f@uGɨmB\\.(M\u000bU%F\u0003*=zo\"C@mߎE+a\f\u001fTq>1I8aݾl'56\u0012\u0011eBp\u007fB\u0018[S\u001ba\u000b&\u0013Ӥ\u0002f\u001a4CQyJ~\u0018n\u001cߡ\u007f\rJ\u000fV#5VF-Hi8\u0012Ax\u000bSvА2dP\u000f\u0013cL\u0016S\u0010yOݰ\u001ff_r\u00046\\I\u0014\u0005;!S\u0005|%sTD֫E!b\u000bi3g?kX\u0015.ՒAm\u0012\u0002+\u001f8\u0018HG.2,\u0015<\u001b=7\u0012ݽS'y\u0017`F}u3v/wׂVHN973EB!\f\tG\u0015\tyTlXbҊ}\"b \u0016\n)\u001f\u000b\b\u0003Eٚ\u0014N]y2\b[w\"%]ig]|o&WoӔc;_~(chuBO\u0003\u0007ۖ\\fPdTujD:2vm@{\nHf\fIԵou*QD1Gz[lҴ\"BO\u001cQzh\t(~\u00036T\u0007w(\r\t7ˆ\rt}\t\u0011IZ\u001f'FέEQC<np0\rL|Q\n/w\u000eK\u007fL}Ƃ\u001d\u001a\u0004v\u0014 D<\u007fuȠA\u0013\u001d\"qM\u0010R]L!h\u0002Q +\u0013|0Ҹkl<\t j\u001fN'\u000fߝST%E?y\u0001I d.|\u0012J\tK{TAϵnM\u0001$q<|ZC)ȷ\"%\u000f\u0013j\u0018CT['K\u0019(\u0018=\u0019y] ۰^}p0>t\u0014&r\b݁sb_\u0001zVFqq~l%Tp\u0011F`j.٤r\rB6KHo\u00077zиQ\u000b=!/\":7\tV\n=Cs\f8F_`ϒs\u0002\"\n[%?S\u001a\fƽqKj\u0012\u0013,\u00187\u00141\u001d\u0015LA.Zob?ݵ6y&cY=x\u0004j\u0019jXʙ@\b\u0019T\u001d\u0005\u0014>\u0013\u007ftb?\u001b@F\f;\rՕ\u0005|j\u0005`\u0005\u000fU'EǄ\u0005~\u001dDf\u0016C`\u001dmtW_g@\u0005k\u001d?ƅ\u001bU\r{=-ZSg+n|܁\u000fEkT\u0012\u001dD4_)\u001cn \u0010F\u001c\u0015\u001dxȰK=_Bwv^\u0001Qy͇Rd\u00055/m\\TA~)\u007f>@\u0018\u0013#\u0019\u0006Γ f;\u007ffwew`%ӢH)\u0015AE\u0001TQE\u0006c0mMx\u0018?{\u000eėk\u0004\u0016W8)\u001asOl\u001e2ҁ\u000e])K^\r$\u001b\u001a\tASP\b<N\rr@ڔ8:];K\u0002A\u0001 \u0010֏%@5N5!P\u0006\u0001x8f\u001dg|Y#\u0003\u001d۲\u0007}|hh\u001d7I\u0014R \\ZH4\u001c;fM\u0018\u0014C)O:\u0016fA\u0010\u0006ɪ\u0019ty\rs\rYQ2NՀ50`AF:\b4\u001c*\u0003+E?dQVd?Ϟ\u001dFeMvjV\u0003;0ì\u0018|\rg'.!t^rLg_;'#s\r}֜7\nS\u000b>#GQm+}Vцs(\u0005\"KWp7\u0018*p\f#\u0004u0EF\u000bشJ-gg\u0006f\u0019%yK~fݭ0\u0011\u001c\u0018wwFdV\\H\u001fkUAE1\u00117́h\f}L17\u0001P\u0002+p%Ϙ\u0005\rM\u0001y\u0007H:OrQ2?s)[~;[˟\u0016P5S\u001aex!\u0014\bȡ\u0013a:l}`,Bm@.\rO(2\n\u000e#6ӚaL8)t@\u0005\u0016\u001e(ڲ.6|gkdzC\f\nZlHwr_y4wʯD\u001fR\nB/\u0003\u0006sW/\u001e߃H\rS\u001f\u007f*\u0014uK\u0017+\u0013\u007fuN/ar\u0004ҍ\raJ`\f\u0004hT(Z̹K@gMȃ,\u009a˪cnroW~>7ݟ\u0011[վ{0"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\u0012U\f (q\u0016@5?Dg6\u001e\"LjH\u0007p-Jt'\u001d", "\"", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "", "Adc\u000eV*>a'\u0003wb3\u0001\u0018CA}7\u007fJ\n%", "", "DhTD", "/bR2f:BP\u001d\u0006~m@X\u0007>i\n1\n", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7I#;IW\u0011", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q'~!\u001f\u0011p\n:v\"?c\u0004iDm\u0012,\\\r8x8\u001d\u0017h+&\u0007_+Js.G([9XfH\u0001\u0005", "Adc\u000eV*>a'\u0003wb3\u0001\u0018CC\n/\u0003@~&\u001bQx", "/bR2f:BP\u001d\u0006~m@Z\u00136l\u007f&\u000bD\u000b ", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q'~!\u001f\u0011p\n:v\"?c\u0004iDm\u0012,\\\r8x8\u001d\u0017h+&\u0007_+Js.G4J72\u0016c", "Adc\u000eV*>a'\u0003wb3\u0001\u0018CC\n/\u0003@~&\u001bQxqKv-", "/bR2f:BP\u001d\u0006~m@Z\u00136l\u007f&\u000bD\u000b zVo\u0016", "Adc\u000eV*>a'\u0003wb3\u0001\u0018CH\u00041\u000b", "/bR2f:BP\u001d\u0006~m@_\r8t", "", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004\u00114", "Adc\u000eV*>a'\u0003wb3\u0001\u0018CL{%{G", "/bR2f:BP\u001d\u0006~m@c\u0005,e\u0007", "Adc\u000eV*>a'\u0003wb3\u0001\u0018CL{%{G\b\u0017\u0016$\u0004", "<`c6i,\"R", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW\u001b\u000b.1a\u0002\u001e\r", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q'~!\u001f\u0011p\n:v\"?c\u0004iDm\u0012,\\\r8x8\u001d\u0017h+\u0018\u001bl(Vz%\u001d\u0010?", "Adc\u000eV*>a'\u0003wb3\u0001\u0018CL\u00049{-\u0001\u0019\u001bQx", ":he2E,@W#\b", "Adc\u000eV*>a'\u0003wb3\u0001\u0018CR\n/{", "/bR2f:BP\u001d\u0006~m@i\u00136e", "Adc\u000fT*DU&\t\u000bg+Z\u00136o\r", "0`R8Z9Hc\"}Xh3\u0007\u0016", "", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q$D\b", "Adc\u000fb9=S&[\u0005m;\u0007\u0011\u0016e\u00017h<\u007f\u001b'U", "0na1X9+O\u0018\u0003\u000bl", "", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q!D\b", "Adc\u000fb9=S&[\u0005m;\u0007\u0011\u001ci\u0002+\u000b-|\u0016\u001bW}", "Adc\u000fb9=S&kv]0\r\u0017", "Adc\u000fb9=S&m\u0005i\u0013|\n>R{'\u007fP\u000f", "Adc\u000fb9=S&m\u0005i\u0019\u0001\u000b2tl$zD\u0011%", "Adc\u0012_,OO(\u0003\u0005g", "3kTCT;B]\"", "Adc\u0013\\3MS&", "4h[AX9", "Adc\u0016`7H`(z\u0004m\r\u0007\u0016\u000bc}(\nN\u0005\u0014\u001bNs\u001dP", "7l_<e;:\\(_\u0005k\bz\u0007/s\u000e,xD\b\u001b&[", "Adc\u001a\\?\u001bZ\u0019\byF6{\t", "Adc\u001bT;Bd\u0019by", "Adc\u001cc(<W(\u0013", "=oP0\\;R", "Adc\u001fX5=S&m\u0005A(\n\bAa\r(j@\u0014&'To", "CrT\u0015J\u001b>f(\u000f\b^", "", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q5D\b", "Adc\u001fb3>", "@n[2", "Adc\u001fb;:b\u001d\t\u0004", "@nc.g0H\\", "Adc V(ES\f", "AbP9X\u001f", "Adc V(ES\r", "AbP9X ", "Adc [(=]+\\\u0005e6\n", "AgP1b>\u001c] \t\b", "Adc!X:M7\u0018", "BdbA<+", "Adc!e(Ga\u001a\t\bf", ";`c?\\?", "Adc!e(Ga\u001a\t\bf\u0016\n\r1i\t", "BqP;f-H`!h\bb.\u0001\u0012", "Adc!e(Ga z\n^\u001f", "BqP;f3:b\u0019q", "Adc!e(Ga z\n^ ", "BqP;f3:b\u0019r", "Adc#\\,PA(z\n^", "/bR2f:BP\u001d\u0006~m@j\u0018+t\u007f", "Adc'<5=S,", "HH]1X?", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface BaseViewManagerInterface<T extends View> {
    void setAccessibilityActions(T t2, ReadableArray readableArray);

    void setAccessibilityCollection(T t2, ReadableMap readableMap);

    void setAccessibilityCollectionItem(T t2, ReadableMap readableMap);

    void setAccessibilityHint(T t2, String str);

    void setAccessibilityLabel(T t2, String str);

    void setAccessibilityLabelledBy(T t2, Dynamic dynamic);

    void setAccessibilityLiveRegion(T t2, String str);

    void setAccessibilityRole(T t2, String str);

    void setBackgroundColor(T t2, int i2);

    void setBorderBottomLeftRadius(T t2, float f2);

    void setBorderBottomRightRadius(T t2, float f2);

    void setBorderRadius(T t2, float f2);

    void setBorderTopLeftRadius(T t2, float f2);

    void setBorderTopRightRadius(T t2, float f2);

    void setElevation(T t2, float f2);

    void setFilter(T t2, ReadableArray readableArray);

    void setImportantForAccessibility(T t2, String str);

    void setMixBlendMode(T t2, String str);

    void setNativeId(T t2, String str);

    void setOpacity(T t2, float f2);

    void setRenderToHardwareTexture(T t2, boolean z2);

    void setRole(T t2, String str);

    void setRotation(T t2, float f2);

    void setScaleX(T t2, float f2);

    void setScaleY(T t2, float f2);

    void setShadowColor(T t2, int i2);

    void setTestId(T t2, String str);

    void setTransform(T t2, ReadableArray readableArray);

    void setTransformOrigin(T t2, ReadableArray readableArray);

    void setTranslateX(T t2, float f2);

    void setTranslateY(T t2, float f2);

    void setViewState(T t2, ReadableMap readableMap);

    void setZIndex(T t2, float f2);
}
