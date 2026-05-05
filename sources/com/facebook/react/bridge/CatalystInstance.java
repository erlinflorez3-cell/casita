package com.facebook.react.bridge;

import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.turbomodule.core.interfaces.NativeMethodCallInvokerHolder;
import java.util.Collection;
import kotlin.Deprecated;
import kotlin.Metadata;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
@Metadata(bv = {}, d1 = {"Яĩ\u0014D57\u001eq\u007fZDkt\u001aA\u000e0!.Jչ*, \u0001\u000ffp98D{H6RY+\u0017k\u00124,[*tK;k\u001a\u0006\"\u000fPVgu\u000bRZ!C\u0017\u0006\u001cyr,_U\u0001]\u0018\u0010:B\u0006?;Mu>A`\u000b6\r 8#@y\u0013\r\"*N\u0011~zQK\u0014۵8@\u0007:Z\rS\u0007\"\u0012\u001c>(\u0001$]oNLHtҗB/9\u0003qBT'g0\u0013M\u0015Ͽ\\'#vi\u001e1H?5#+[\u0003\u001dRc?\tIy=\u001bh/ݐ1/\nɎfX.\u0013E+}\r\u000erT]M_n4?+}\r{T\u001cR\u0010z*8\u0003(V&5tF-H\u00108\u0012A\"\u000bSnu2bP.\u0013ad<U\u0006AZQ\u001d|P\u0010k_s\u007f\u0002\u0013>6#/\u0018g\u007f\u001d\u001cnG3T&zaUNp`N8\u000e\u0004\u0012Lxp7B\u0006FF.eB5v<3ns;9 2:hJmϸ\u0013\u0019\u0011S\u0018\fxJ0).=:\u000b\u001cZ\u000b\u001d3'\u0017xг0\u0011[X\u001d,\fE+\"rv\u0003YE\u0016Tиv\"\u0013M\f\u001fU9tuqt{\u0010g9%kc\r*4уVv\"~\u0005r\u0013\u0016~Di\u000b\tqX&@\t\u0003\u0010&!\u000brT1@\u0001\n\u001cb/Q\u001fbéV;FBo\u00129ih'(\u0005d54\u00030\\#DGt%v}*\u0011IZ\u007f'FuG_x1&\u0004K/YE9\u0015C\f\u007fu\u0011|KZ2.u\u0004BP\u001a(hi/kZU$qH\u0010u]L!\u000f\u0002Q p\u0013|(Ukl<2 j\u001fQ'\u000f\u0013]bb:v\r\u001cS\fr*\u0012at&\u000e\b\u001d\u0011i\u000bar1\u0003\u0003r\u0001\u000b\u0013l6%/\u0019R\u0001C{['KL>8w+o-\u0002o\\#\u0013\u00134E}\u0004Z\tFsp#u2i]\u0010~GL0v\u0005\u0003pq\u001b{\u0016\u0016!4;\b\u000fe5\u0001d:e\u000b]\u0001=¥.ޛtZs<\u0019q\f8~q8x[}Bdy\u000bgߤUܭqqc^\u0011Q\u001d\u0012[\u0014?w*\u001ck*\r=9ץ2Ӓw\"FCAm\u0013H!&:9J\u0016[Sbx\u001e\u0010)\u0010\u001dݑ\u0011ł6F\f=\\\u001fb\u000b-lV\u0018xKp#:\u0001-$a2O\u009c3ܭqJl1iH\u000fjm\u0019)\u0003g~\u0015>\u0002\u0603Vۆ\u001f,p\u0003\u0011_k^\u001a\u0014D _+\u0004j\u001e)\u000fµ~ܫF\u001c3;W/m\u0016\u0001p\u0019u|Pzu@\b)ư$Ĺ\u0003~\u0015\u0010B,\u001d.ia\u0001\u0014z/bM&\\\u001a\u05f5\u0003ӢH-\u001f\u000e\u0003\nTBԇ\u0005זφ=Mr\u0016-\u001b\u0006Rȵ\u0002]÷$&"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW\u001ar41`\u0012.FQ\u001f<\\?Di4s", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW$v-?f\u0012\u000bDm$<]P;R8,$hj9\u00149", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW!d\t>g\r\u001c@k\u0016\u0004", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW!d\u0002Eb|'7T *LCHJ4%\u0015j]H\u00079", "7r32f;K]-~y", "", "u(I", "8`e.F*KW$\u000eXh5\f\tBtb2\u0003?\u0001$", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW!r61G{-;x%\fWLJkG-wrh8\u0007p\u0002", "5dc\u0017T=:A\u0017\f~i;Z\u00138t\u007f;\u000b#\u000b\u001e\u0016G|", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0014$Kn\u0010<@\n1jy\u000e5z\u001a9\\!EtC\u001e(wDC\u000eb,[L", "8r2._3\"\\*\t\u0001^9_\u00136d\u007f5", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EO\u0011$\u0014Qw\u0018;\u0007,5#{*Dm_2VR;x5\u001a\u0013ho\u0003d_3UZ0XVT,i5|D\u0013\u0012gc", "5dc\u0017F\n:Z b\u0004o6\u0003\t<H\n/z@\u000eU\u0013Px\u0018Kr49c\u0007.", "u(E", "5dc\u0017F\n:Z b\u0004o6\u0003\t<H\n/z@\u000e", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ&'Tl\u0018D\u0001$E`}i5w#.\u0017GDz4+\u0016d_9\u0015-\nJ}.+U_6bR\u007f \u001e\u0019Y\u000e[\u0001", "<`c6i,&S(\u0002\u0005]\nx\u00106I\t9\u0006F\u0001$yQv\r<\u0004", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EO\u0011$\u0014Qw\u0018;\u0007,5#{*Dm_2VR;x5\u001a\u0013ho\u0003o_;R\b'/L]/fQP9\u001b\u0019>\u0017_5\u0013\u0005f$.uC7,]", "5dc\u001bT;Bd\u0019fzm/\u0007\b\ra\u0007/_I\u0012!\u001dG|pF}$5f", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ&'Tl\u0018D\u0001$E`}i5w#.\u0017GDz4+\u0016d_9\u0015-\u0015J\u0006+XL6,kU|<q\u000ea\u001524\u001e\u000f_A1QN>\u001e\b9\u001f", "<`c6i,&]\u0018\u000f\u0002^:", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW%r49j}\bAl&5M\u0019", "5dc\u001bT;Bd\u0019f\u0005]<\u0004\t=", "u(;7T=:\u001d)\u000e~euZ\u00136l\u007f&\u000bD\u000b l", "@dP0g\u0018NS)~Xh5}\r1u\r$\u000bD\u000b ", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoWH\u0007%EYG\r7i\u0014=9S;{4{\u001fqb=\ts9J\u0006+QU$", "5dc\u001fX(<b\u0005\u000fzn,Z\u00138f\u0004*\fM|&\u001bQx", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0014$Kn\u0010<@1EY\u000e \u0001Z\u0016*KR'{4.\u0015FkB\bg.^\u0004#VPX52", "@t]A\\4>3,~xn;\u0007\u0016", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)\u0007.D]\u0006 \u0017\u0001\u0016,]REx\n", "5dc\u001fh5MW!~Zq,z\u0019>o\r", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0014$Kn\u0010<@\u0012Eb\r$?muAMAKz>+j", "@t]A\\4>A\u0017\u0002z]<\u0004\t<", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)\u0007.D]\u0006 %k\u0019.LSBkAs", "5dc\u001fh5MW!~h\\/|\b?l\u007f5", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0014$Kn\u0010<@\u0012Eb\r$?m\u0004,PC:{;\u001e\">", "And?V,.@\u007f", "", "5dc b<KQ\u0019ngE", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "/cS\u000fe0=U\u0019bye,[\t,u\u0002\u000f\u007fN\u0010\u0017 G|", "", ":hbAX5>`", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW%\u00014$\\\u000b 3l\u0004*NC\u0018x8\u001d\u0017hE8\u000ec\u000bNs7I3R:kR{=!g", "1`[99<GQ(\u0003\u0005g", ";nSB_,", ";dc5b+", "/qVB`,Gb'", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW%r49j}{Dz\u0012B#", "2dbAe6R", "3wc2a+'O(\u0003\f^\u0014\u0007\b?l\u007f6", ";nSB_,L", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW%r49j}\bAl&5M0;m8,$uu\u000f", "5dc\u0013T)KW\u0017n^F(\u0006\u00051e\r", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW,Z\r1by\"7zk", "5dc\u0017F\u0014HR)\u0006z", "\"", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW!r61G{-;x%\u0016WBKr4s", "8r8;g,KT\u0015|z", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sUkb>\u000b\u001f`Hk\f<s/?_G-7i\u0014=\u0017@Ho3 \u00152F5\u0018_\u001aL\u0004+R[66[by=i", "5dc\u001bT;Bd\u0019f\u0005]<\u0004\t", "<`c6i,&]\u0018\u000f\u0002^\u0010\u0006\u0018/r\u0001$y@", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sUkb>\u000b\u001f`Hk\f<s/?_G-7i\u0014=\u0017@Ho3 \u00152J5\u0016g=N^1F\\U,2", ";nSB_,'O!~", "6`b\u001bT;Bd\u0019f\u0005]<\u0004\t", "6`b\u001fh5#Au\u000f\u0004]3|", "7mXA\\(EW.~", "7me<^,\u001cO \u0006wZ*\u0003", "1`[9U(<Y|]", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW%r49j}{Dz\u0012B1LJkA\u001f\u0011fa\u000f", "@dV6f;>`\u0007~|f,\u0006\u0018", "AdV:X5M7\u0018", ">`c5", "@d\\<i,\u001b`\u001d}|^\u0010{\u0010/D\u007f%\fBg\u001b%Vo\u0017<\u0004", "@t]\u0017F\tN\\\u0018\u0006z", "Adc\u0013T)KW\u0017n^F(\u0006\u00051e\r", "4`Q?\\*.7\u0001z\u0004Z.|\u0016", "Adc\u0014_6;O ovk0x\u00066e", ">q^=A(FS", "8r^;I(Ec\u0019", "Adc!h9;]\u0001\tyn3|u/g\u00046\u000bM\u0015", "Bta/b\u0014HR)\u0006zK,~\r=t\r<", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tx\nC@4Efz*?w\u0015>TC\u0005i>+\u00152eB\u0016c9Or%GZ\u0018\u001bl_oG{\u001cY\u001eU+y\u0005[E2}QKt", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface CatalystInstance extends MemoryPressureListener, JSInstance, JSBundleLoaderDelegate {
    static /* synthetic */ void getJSCallInvokerHolder$annotations() {
    }

    void addBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener);

    void callFunction(String str, String str2, NativeArray nativeArray);

    /* JADX INFO: renamed from: destroy */
    void lambda$onNativeException$6();

    void extendNativeModules(NativeModuleRegistry nativeModuleRegistry);

    UIManager getFabricUIManager();

    @Deprecated(message = "\u0018Y\u0001tcy\u0016Zl*7\td\u001aDb*S\u000e;n[nS\u0003RWxd\u0004/kz4sNQazxO,FN\u0017WP")
    @InterfaceC1492Gx
    CallInvokerHolder getJSCallInvokerHolder();

    <T extends JavaScriptModule> T getJSModule(Class<T> cls);

    @Deprecated(message = "\u0018Y\u0001txy)ImU<\u0004]\u001a\u0011faO\u001e;\u0014zS\u001b6O|}by%j6")
    @InterfaceC1492Gx
    JavaScriptContextHolder getJavaScriptContextHolder();

    NativeMethodCallInvokerHolder getNativeMethodCallInvokerHolder();

    <T extends NativeModule> T getNativeModule(Class<T> cls);

    NativeModule getNativeModule(String str);

    Collection<NativeModule> getNativeModules();

    ReactQueueConfiguration getReactQueueConfiguration();

    RuntimeExecutor getRuntimeExecutor();

    RuntimeScheduler getRuntimeScheduler();

    String getSourceURL();

    <T extends NativeModule> boolean hasNativeModule(Class<T> cls);

    boolean hasRunJSBundle();

    @VisibleForTesting
    void initialize();

    @Override // com.facebook.react.bridge.JSInstance
    void invokeCallback(int i2, NativeArrayInterface nativeArrayInterface);

    boolean isDestroyed();

    void registerSegment(int i2, String str);

    void removeBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener);

    void runJSBundle();

    void setFabricUIManager(UIManager uIManager);

    @VisibleForTesting
    void setGlobalVariable(String str, String str2);

    void setTurboModuleRegistry(TurboModuleRegistry turboModuleRegistry);
}
