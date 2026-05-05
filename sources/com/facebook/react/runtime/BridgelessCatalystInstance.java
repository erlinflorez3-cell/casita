package com.facebook.react.runtime;

import android.content.res.AssetManager;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeArrayInterface;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.RuntimeScheduler;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.turbomodule.core.interfaces.NativeMethodCallInvokerHolder;
import java.util.Collection;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.truncatedMessage(InvalidProtocolBufferException.java:70)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.refillBuffer(CodedInputStream.java:1094)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.ensureAvailable(CodedInputStream.java:1080)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readRawBytesSlowPath(CodedInputStream.java:1215)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readBytes(CodedInputStream.java:529)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:244)
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
@Metadata(bv = {}, d1 = {"Яĵ\u0014D57\u001eq\u007fZDkŞ\fA\u001c0\u0013.H~*, \u0001\u000ffp98D{H6RY+\u0017k\u00124,[*tK;k\u001a\u0006\"\u000fPVgu\u000bRZ!C\u0017\u0006\u001cyr,_U\u0001]\u0018\u0010:B\u0006?;Mu>A`\u000b6\r 8#@y\u0013\r\"*N\u0011~zQK\u0014۵8@\u0007:Z\rS\u0007\"\u0012\u001c>(\u0001$]oNLHtҗB/9\u0003qBT'g0\u0013M\u0015Ͽ\\'#vi\u001e1E?5#+[\u0003\rUc?\u0019?y=\u000bh/'AI{W<j\b\u0014++WՕcw<ؘ5Q\u000f\u000bg6_gYP&(&{ԫ\u0011<\u0012\u0010N5VWE\u001a\u00152>7\u0003\u001ek@~.%VH\u001boc/%.][=)\u0015iai?~;\n4%\u001eQ'\u001f'i\u0005&b+\u001a\u0003)\u0018E\u001aFKzf\n\bg4\u00189p\u0010]\u001c0u*_\u007f\u001fb/%e\u0011\u007f7iq\u0010~\\g%<'|\u001c\u000f`\u0001X$\u0005\u0015}c)\u0012`եr>\u0014P\u0003\u0013\\\u001b[Wl\r\u000e\n# #1j]k$ʽShw(\u0016\u0003\u0018cGhMX5%.]?ӔAnyc>w\u0003\u0001\"~Th\u0015ZvB\u001aE\t\u0019n6ĘLj\u001e8DT\\J+4UpJJ\\5'\u001e-H1D\tUE\u0017m\u001d\u0001\u0010-~c(\u0011-<t7E\u0017p9\u000eu>a,+dB3GٛCRNUP~d\u00071F\u0017y\u0010IwL\u000e\u0006\u001bR<iD&$`QQ]AY#G/@IEEz\u001d,f\u0016(5C\u0015y=e\u00192uQ\u0003pZ%\u001bN]\u0005/\"%)98P\u0003\u000eEyF)q\u0014X\u0019(VI!P\n@\\\u0007\u0015\u0005MDU\u0005}q\u00155[Gm1^\u0016\"\u007f-a\f\u0014 2\b4'&#\f40q;\bb\u007f\u0004b?F\u0019q~l&j\u0001KXV=\u0010\bp3d\u0011A\u001aYd\u001f|hQ\u0019T\u0016f5RS\u0005\u001fqHf\b}bX\u0010.\u0002\u0018\u0016\u0014\r\bU\u0015[)\u007fm\u001cq#\u001f\u0013\u001d\u0018a\u00141\u001d<LA.\u0002ob7\\L\b`<O\u0013z\u0005j3jHtJ\u0016c[T\u00180@~\u000e w\u000fEi\t\b\u0004l\u001c/\u0011\\\u0005r5dS<9*/%?7,UM13\u0014\riwy@^k\u001d7E\u001bS\rE=+rzi\u001f68\u0019\u000bs\u0004\n]JD\u0012(Am\u001a\u001a<<&^5BF}\u007feaq\u00053v\u000b\u0004h\u00059MԺhŽR&A\u0001\u0001\u007f\u001cAZ!\u0019\u001fgr\u001eic!%߮9ƴ\u001e\u0005/F/\u000f\u001a\u00064^)7\u001e5[H\u007f@jմ}\u009cWE\u000e\n&,5\u0011\r#be\u001cuZo)J.qDs8]iк\"ɯ2N\rt\u0010@\u0016I \u001aA\u0016+dim\b!n=Y\u0002<\u0017\"ЬzƠgp{p[\"\u0011~\u0002b\bnEPK\n}Ӑ0 \\ZBÎ$2f*\u0018\u0014C@U\u000b^Ԋ+֤Sg\u0001rqji){CyGy3FQL\u001cUNLù,ķ,\u0019SXS]r)-\u0001Px&`\u0001'\u0013\u0017B}jΰ\u0001Ŀb\u0015+6L\u0016,\t\u007fK'Ds\u000f]_5*{\u001e|Њ3ĿC\u001fO4\u0011\u00176\u001fה\u0007\u001e"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EM\u0011 &Kw\u000e\u0006S29X\u007f >m$<+?Jg;2#wEB\u0015r(Wt'\u001d", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW\u001ar41`\u0012.FQ\u001f<\\?Di4s", "@dP0g\u000fHa(", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EM\u0011 &Kw\u000e\u0006c%1W\r\u0003A{%\u0012UNBA", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\u000e' Vs\u0016<@\u00125U{/\u001aw$=1KFr\na\u0006", "7r32f;K]-~y", "", "u(I", "8`e.F*KW$\u000eXh5\f\tBtb2\u0003?\u0001$", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW!r61G{-;x%\fWLJkG-wrh8\u0007p\u0002", "5dc\u0017T=:A\u0017\f~i;Z\u00138t\u007f;\u000b#\u000b\u001e\u0016G|", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0014$Kn\u0010<@\n1jy\u000e5z\u001a9\\!EtC\u001e(wDC\u000eb,[L", "8r2._3\"\\*\t\u0001^9_\u00136d\u007f5", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EO\u0011$\u0014Qw\u0018;\u0007,5#{*Dm_2VR;x5\u001a\u0013ho\u0003d_3UZ0XVT,i5|D\u0013\u0012gc", "5dc\u0017F\n:Z b\u0004o6\u0003\t<H\n/z@\u000eU\u0013Px\u0018Kr49c\u0007.", "u(E", "5dc\u0017F\n:Z b\u0004o6\u0003\t<H\n/z@\u000e", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ&'Tl\u0018D\u0001$E`}i5w#.\u0017GDz4+\u0016d_9\u0015-\nJ}.+U_6bR\u007f \u001e\u0019Y\u000e[\u0001", "<`c6i,&S(\u0002\u0005]\nx\u00106I\t9\u0006F\u0001$yQv\r<\u0004", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EO\u0011$\u0014Qw\u0018;\u0007,5#{*Dm_2VR;x5\u001a\u0013ho\u0003o_;R\b'/L]/fQP9\u001b\u0019>\u0017_5\u0013\u0005f$.uC7,]", "5dc\u001bT;Bd\u0019fzm/\u0007\b\ra\u0007/_I\u0012!\u001dG|pF}$5f", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ&'Tl\u0018D\u0001$E`}i5w#.\u0017GDz4+\u0016d_9\u0015-\u0015J\u0006+XL6,kU|<q\u000ea\u001524\u001e\u000f_A1QN>\u001e\b9\u001f", "<`c6i,&]\u0018\u000f\u0002^:", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW%r49j}\bAl&5M\u0019", "5dc\u001bT;Bd\u0019f\u0005]<\u0004\t=", "u(;7T=:\u001d)\u000e~euZ\u00136l\u007f&\u000bD\u000b l", "@dP0g\u0018NS)~Xh5}\r1u\r$\u000bD\u000b ", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoWH\u0007%EYG\r7i\u0014=9S;{4{\u001fqb=\ts9J\u0006+QU$", "5dc\u001fX(<b\u0005\u000fzn,Z\u00138f\u0004*\fM|&\u001bQx", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0014$Kn\u0010<@1EY\u000e \u0001Z\u0016*KR'{4.\u0015FkB\bg.^\u0004#VPX52", "@t]A\\4>3,~xn;\u0007\u0016", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)\u0007.D]\u0006 \u0017\u0001\u0016,]REx\n", "5dc\u001fh5MW!~Zq,z\u0019>o\r", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0014$Kn\u0010<@\u0012Eb\r$?muAMAKz>+j", "@t]A\\4>A\u0017\u0002z]<\u0004\t<", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)\u0007.D]\u0006 %k\u0019.LSBkAs", "5dc\u001fh5MW!~h\\/|\b?l\u007f5", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0014$Kn\u0010<@\u0012Eb\r$?m\u0004,PC:{;\u001e\">", "And?V,.@\u007f", "", "5dc b<KQ\u0019ngE", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "/cS\u000fe0=U\u0019bye,[\t,u\u0002\u000f\u007fN\u0010\u0017 G|", "", ":hbAX5>`", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW%\u00014$\\\u000b 3l\u0004*NC\u0018x8\u001d\u0017hE8\u000ec\u000bNs7I3R:kR{=!g", "1`[99<GQ(\u0003\u0005g", ";nSB_,", ";dc5b+", "/qVB`,Gb'", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW%r49j}{Dz\u0012B#", "2dbAe6R", "3wc2a+'O(\u0003\f^\u0014\u0007\b?l\u007f6", ";nSB_,L", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW%r49j}\bAl&5M0;m8,$uu\u000f", "5dc\u0013T)KW\u0017n^F(\u0006\u00051e\r", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW,Z\r1by\"7zk", "5dc\u0017F\u0014HR)\u0006z", "\"", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW!r61G{-;x%\u0016WBKr4s", "8r8;g,KT\u0015|z", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sUkb>\u000b\u001f`Hk\f<s/?_G-7i\u0014=\u0017@Ho3 \u00152F5\u0018_\u001aL\u0004+R[66[by=i", "5dc\u001bT;Bd\u0019f\u0005]<\u0004\t", "<`c6i,&]\u0018\u000f\u0002^\u0010\u0006\u0018/r\u0001$y@", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sUkb>\u000b\u001f`Hk\f<s/?_G-7i\u0014=\u0017@Ho3 \u00152J5\u0016g=N^1F\\U,2", ";nSB_,'O!~", "6`]1_,&S!\t\br\u0017\n\t=s\u00105{", ":de2_", "", "6`b\u001bT;Bd\u0019f\u0005]<\u0004\t", "6`b\u001fh5#Au\u000f\u0004]3|", "7mXA\\(EW.~", "7me<^,\u001cO \u0006wZ*\u0003", "1`[9U(<Y|]", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW%r49j}{Dz\u0012B1LJkA\u001f\u0011fa\u000f", ":nP1F*KW$\u000e[k6\u0005d=s\u007f7\n", "/rb2g\u0014:\\\u0015\u0001zk", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\n\\%%G~u8\u007f!7Y\u000bu", "/rb2g\u001c+:", ":nP1F@GQ\u001c\f\u0005g6\r\u00176y", ":nP1F*KW$\u000e[k6\u0005i3l\u007f", "4h[2A(FS", ":nP1F7EW([\u000bg+\u0004\t\u0010r\n0\\D\b\u0017", "@dV6f;>`\u0007~|f,\u0006\u0018", "AdV:X5M7\u0018", ">`c5", "@d\\<i,\u001b`\u001d}|^\u0010{\u0010/D\u007f%\fBg\u001b%Vo\u0017<\u0004", "@t]\u0017F\tN\\\u0018\u0006z", "Adc\u0013T)KW\u0017n^F(\u0006\u00051e\r", "4`Q?\\*.7\u0001z\u0004Z.|\u0016", "Adc\u0014_6;O ovk0x\u00066e", ">q^=A(FS", "8r^;I(Ec\u0019", "Adc b<KQ\u0019ngE:", "2de6V,.@\u007f", "@d\\<g,.@\u007f", "Adc!h9;]\u0001\tyn3|u/g\u00046\u000bM\u0015", "Bta/b\u0014HR)\u0006zK,~\r=t\r<", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tx\nC@4Efz*?w\u0015>TC\u0005i>+\u00152eB\u0016c9Or%GZ\u0018\u001bl_oG{\u001cY\u001eU+y\u0005[E2}QKt", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class BridgelessCatalystInstance implements CatalystInstance {
    private final ReactHostImpl reactHost;

    public BridgelessCatalystInstance(ReactHostImpl reactHost) {
        Intrinsics.checkNotNullParameter(reactHost, "reactHost");
        this.reactHost = reactHost;
    }

    public static /* synthetic */ void getJSCallInvokerHolder$annotations() {
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void addBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        throw new UnsupportedOperationException("Unimplemented method 'addBridgeIdleDebugListener'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void callFunction(String module, String method, NativeArray nativeArray) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(method, "method");
        throw new UnsupportedOperationException("Unimplemented method 'callFunction'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void destroy() {
        throw new UnsupportedOperationException("Unimplemented method 'destroy'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void extendNativeModules(NativeModuleRegistry modules) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        throw new UnsupportedOperationException("Unimplemented method 'extendNativeModules'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public UIManager getFabricUIManager() {
        throw new UnsupportedOperationException("Unimplemented method 'getFabricUIManager'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public CallInvokerHolder getJSCallInvokerHolder() {
        CallInvokerHolder jSCallInvokerHolder = this.reactHost.getJSCallInvokerHolder();
        Intrinsics.checkNotNull(jSCallInvokerHolder);
        return jSCallInvokerHolder;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public <T extends JavaScriptModule> T getJSModule(Class<T> jsInterface) {
        Intrinsics.checkNotNullParameter(jsInterface, "jsInterface");
        ReactContext currentReactContext = this.reactHost.getCurrentReactContext();
        if (currentReactContext != null) {
            return (T) currentReactContext.getJSModule(jsInterface);
        }
        return null;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public JavaScriptContextHolder getJavaScriptContextHolder() {
        JavaScriptContextHolder javaScriptContextHolder = this.reactHost.getJavaScriptContextHolder();
        Intrinsics.checkNotNull(javaScriptContextHolder);
        return javaScriptContextHolder;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public NativeMethodCallInvokerHolder getNativeMethodCallInvokerHolder() {
        throw new UnsupportedOperationException("Unimplemented method 'getNativeMethodCallInvokerHolder'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public <T extends NativeModule> T getNativeModule(Class<T> nativeModuleInterface) {
        Intrinsics.checkNotNullParameter(nativeModuleInterface, "nativeModuleInterface");
        return (T) this.reactHost.getNativeModule(nativeModuleInterface);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public NativeModule getNativeModule(String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        return this.reactHost.getNativeModule(moduleName);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public Collection<NativeModule> getNativeModules() {
        Collection<NativeModule> nativeModules = this.reactHost.getNativeModules();
        Intrinsics.checkNotNullExpressionValue(nativeModules, "getNativeModules(...)");
        return nativeModules;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public ReactQueueConfiguration getReactQueueConfiguration() {
        ReactQueueConfiguration reactQueueConfiguration = this.reactHost.getReactQueueConfiguration();
        Intrinsics.checkNotNull(reactQueueConfiguration);
        return reactQueueConfiguration;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public RuntimeExecutor getRuntimeExecutor() {
        return this.reactHost.getRuntimeExecutor();
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public RuntimeScheduler getRuntimeScheduler() {
        throw new UnsupportedOperationException("Unimplemented method 'getRuntimeScheduler'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public String getSourceURL() {
        throw new UnsupportedOperationException("Unimplemented method 'getSourceURL'");
    }

    @Override // com.facebook.react.bridge.MemoryPressureListener
    public void handleMemoryPressure(int i2) {
        throw new UnsupportedOperationException("Unimplemented method 'handleMemoryPressure'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public <T extends NativeModule> boolean hasNativeModule(Class<T> nativeModuleInterface) {
        Intrinsics.checkNotNullParameter(nativeModuleInterface, "nativeModuleInterface");
        return this.reactHost.hasNativeModule(nativeModuleInterface);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public boolean hasRunJSBundle() {
        throw new UnsupportedOperationException("Unimplemented method 'hasRunJSBundle'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    @VisibleForTesting
    public void initialize() {
        throw new UnsupportedOperationException("Unimplemented method 'initialize'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance, com.facebook.react.bridge.JSInstance
    public void invokeCallback(int i2, NativeArrayInterface arguments) {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        throw new UnsupportedOperationException("Unimplemented method 'invokeCallback'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public boolean isDestroyed() {
        throw new UnsupportedOperationException("Unimplemented method 'isDestroyed'");
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadScriptFromAssets(AssetManager assetManager, String assetURL, boolean z2) {
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        Intrinsics.checkNotNullParameter(assetURL, "assetURL");
        throw new UnsupportedOperationException("Unimplemented method 'loadScriptFromAssets'");
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadScriptFromFile(String fileName, String sourceURL, boolean z2) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(sourceURL, "sourceURL");
        throw new UnsupportedOperationException("Unimplemented method 'loadScriptFromFile'");
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadSplitBundleFromFile(String fileName, String sourceURL) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(sourceURL, "sourceURL");
        throw new UnsupportedOperationException("Unimplemented method 'loadSplitBundleFromFile'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void registerSegment(int i2, String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new UnsupportedOperationException("Unimplemented method 'registerSegment'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void removeBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        throw new UnsupportedOperationException("Unimplemented method 'removeBridgeIdleDebugListener'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void runJSBundle() {
        throw new UnsupportedOperationException("Unimplemented method 'runJSBundle'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void setFabricUIManager(UIManager fabricUIManager) {
        Intrinsics.checkNotNullParameter(fabricUIManager, "fabricUIManager");
        throw new UnsupportedOperationException("Unimplemented method 'setFabricUIManager'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    @VisibleForTesting
    public void setGlobalVariable(String propName, String jsonValue) {
        Intrinsics.checkNotNullParameter(propName, "propName");
        Intrinsics.checkNotNullParameter(jsonValue, "jsonValue");
        throw new UnsupportedOperationException("Unimplemented method 'setGlobalVariable'");
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void setSourceURLs(String deviceURL, String remoteURL) {
        Intrinsics.checkNotNullParameter(deviceURL, "deviceURL");
        Intrinsics.checkNotNullParameter(remoteURL, "remoteURL");
        throw new UnsupportedOperationException("Unimplemented method 'setSourceURLs'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void setTurboModuleRegistry(TurboModuleRegistry turboModuleRegistry) {
        Intrinsics.checkNotNullParameter(turboModuleRegistry, "turboModuleRegistry");
        throw new UnsupportedOperationException("Unimplemented method 'setTurboModuleRegistry'");
    }
}
