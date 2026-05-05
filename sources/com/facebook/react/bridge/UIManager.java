package com.facebook.react.bridge;

import android.view.View;
import com.facebook.react.uimanager.events.EventDispatcher;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
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
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4C\u0007\":\u0018\u007fјnjO0LeN.ZS@\u000fs{:$c$\u007fCC٥\"}8\tWNmivJp\u000bK\u000f\u0014\"\u0001j2\\]xs\u0012\u00172HrE\u0018cڎm9\u000fs~..6:8(\n!\"0Ϻ\u001e|#Ea\u000b@7ptHZ%MK B\fL)\u0019 rf|@\u000f\u0012Һ>/1\u000e2R\\3w0+Z=Lb5%xw\u001dYO}Y]Ea\u0013\u001fR\nL3C\u007fN\u001dhU,[M\u0002iNX.\u0019E1] ut<[3e'0oK]scP<5(~\n\u001eT\u0004<\u000bWL<?2f6#cz\u0001fXR\u0018]p\u0014A\u0006~\u001d3\u0016K+g(-u*A'eO{3\u001adGI\u0005/sl\u000e\u000f\"KX\u0006jIQnBxR\u0018jUm2u)&r,>a\u0018/*\u001e^\u001b3Ps9Q&\u001c\u0006VU\u007fv3e\u0019Wwm`@P\u0004F=8%$\\Zc3u\u0017x!L\u001fg4T5\u000b8\u0017.m\u0010<O*@R]\u0004\u0002j{r:+=\u0003O[\u0005j<a\u007f\u0004{E_\u0001(a\u0001\u0004DEJp\u001dZ|A\u0002\u001b!\u0001p2@f\u0003\u0012\u000ezrc<\u0017@Z\n\u001cbAw>%%V\"6DW{7f\u000bl\u001e\u0010l3R\b0H=\u001f\u000fptp\u001et)M:\u000ex\"[F\u00029'Gm\"\u00179CGO@\u0002\"_gzLlt\u001c߯c\u0002H\u001808\u007f6m\u0017\u001d\u0007A2H3uP\u0001\tiM@<+\u0003\b\u0018SjDf6t!0n\u000fbO\u0003\u001cRzl\u0018;\b\u0013\u0005@\u0007â~GqzSiLp\u000b\u0003\bI~<\u000b\u001e7\u001eS\u00066GEK;k?\u001dD\u0005D3#zui\u001e3*f\u001d7\re21*:8z_\u0007J;fV\n\u0003L3<l1Gxp\u00062Z\u000bJ\fas\b\n9\u0005Fy#/,s70\u001b\u001en[h\u0018 \u0002BRw*\"H.\u0018lh=\u0011{X\u0018q{yt\u000bx\u0014:\u000f\n`\u0007\u0012JBf{(r\u00170\u001esF7\u0018ތdƀ@\r<62>\u0016\u000eψSȫе\u0010~\bHe.E1§wkښ\u0012S"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW,Z\r1by\"7zk", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW'v26c\u000b(3v\u0014.+MKtC\u001e\">", "3uT;g\u000bBa$z\n\\/|\u0016", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u000e^CDz\u0013\"#s]H\u0005f,[L", "5dc\u0012i,Gbw\u0003\ti(\f\u00072e\r", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ'\u001bOk\u00178x%B#}17v%<\u0017#Lk=-sloD\u0003r*Qv4\u001d", "/cS\u001fb6MD\u001d~\r", "", "\"", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "@n^AI0>e", "7mXA\\(E>&\t\u0006l", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW.\u0004)DUz'7U\u00129#", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q'~!\u001f\u0011p\n:v\"?c\u0004iDm\u0012,\\\r8x8\u001d\u0017h++\u0014g;Js.G4J72\u0016V", "/cS\"<\u0014:\\\u0015\u0001zk\f\u000e\t8tf,\nO\u0001 \u0017T", "", ":hbAX5>`", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW,Z\r1by\"7z|2[R;t4+j", "2hb=T;<Vv\t\u0003f(\u0006\b", "@dP0g\u001b:U", "1n\\:T5=7\u0018", "1n\\:T5=/&\u0001\t", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7I#;IW\u0011", "", "7mXA\\(EW.~", "7me._0=O(~", ";`a84*MW*~ih<z\f\u0010o\r\u0017wB", "Ata3T*>7\u0018", "@dR2\\=>3*~\u0004m", "3uT;g\u0015:[\u0019", "3uT;g", "@d\\<i,.7\u0001z\u0004Z.|\u0016\u000fv\u007f1\u000b'\u0005%&Gx\u000eI", "@db<_=>1)\r\nh4[\r<e}7[Q\u0001 &0k\u0016<", "@db<_=>D\u001d~\r", "Ad]14*<S'\r~[0\u0004\r>y_9{I\u0010", "3uT;g\u001bR^\u0019", "AsP?g\u001aN`\u001azx^", ";nSB_,'O!~", "EhSA[\u0014>O'\u000f\b^\u001a\b\t-", "6dX4[;&S\u0015\r\u000bk,j\u0014/c", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u00044AEs}\u001f\u0011fa6\u0011m2\u0018\u0004'CJ]uY_v<\u0016\u0012$\u007f[/\u001c\u0001VH$V@Btk\u0010\re", "As^=F<KT\u0015|z", "AvT2c\b<b\u001d\u0010zM6\r\u00072F\n5j<\u0003", "Ax]0[9H\\#\u000f\te@l\u0014.a\u000f(lD\u0001)\u0001P_q+y25U|", ">q^=f", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "CoS.g,+]#\u000eaZ@\u0007\u0019>S\u000b(yN", "@n^AG(@", "=eU@X;1", "=eU@X;2", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface UIManager extends PerformanceCounter {
    @Deprecated(message = "")
    <T extends View> int addRootView(T t2, WritableMap writableMap);

    void addUIManagerEventListener(UIManagerListener uIManagerListener);

    void dispatchCommand(int i2, int i3, ReadableArray readableArray);

    void dispatchCommand(int i2, String str, ReadableArray readableArray);

    EventDispatcher getEventDispatcher();

    void initialize();

    void invalidate();

    void markActiveTouchForTag(int i2, int i3);

    void receiveEvent(int i2, int i3, String str, WritableMap writableMap);

    @Deprecated(message = "", replaceWith = @ReplaceWith(expression = "receiveEvent(surfaceId, reactTag, eventName, event)", imports = {}))
    void receiveEvent(int i2, String str, WritableMap writableMap);

    void removeUIManagerEventListener(UIManagerListener uIManagerListener);

    @Deprecated(message = "")
    String resolveCustomDirectEventName(String str);

    View resolveView(int i2);

    void sendAccessibilityEvent(int i2, int i3);

    <T extends View> int startSurface(T t2, String str, WritableMap writableMap, int i2, int i3);

    void stopSurface(int i2);

    void sweepActiveTouchForTag(int i2, int i3);

    void synchronouslyUpdateViewOnUIThread(int i2, ReadableMap readableMap);

    void updateRootLayoutSpecs(int i2, int i3, int i4, int i5, int i6);
}
