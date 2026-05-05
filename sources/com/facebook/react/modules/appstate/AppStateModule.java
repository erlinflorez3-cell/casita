package com.facebook.react.modules.appstate;

import com.facebook.fbreact.specs.NativeAppStateSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WindowFocusChangeListener;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
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
@ReactModule(name = "\u0001/.\u00100\u001c.\u001e")
@Metadata(bv = {}, d1 = {"ЯV\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljA0RqP\u008cZS8\u000fs{:$c$\bCCU }*\teNogtJb\u000bQ1\u000e\u0016\u0007̓4I[|e\u0012\u001d;JoE3UoK=ht<\b&78\u0600\u0018%1\u001aXG@v)C{\f@1xoZ\u0013\u0018]\t(\u0014\u001e>N\u0004ɉ`g\\:\u0011|kAG#1qrT5hH~c\ftZm!?g,5X7c kSK\u001f`gW\u0003mym\tv4?+w\u0002\b<f\u000f,\u0017AN;k9:%\u0017_p$3;QsK~\u00148y\u000b{;N2\u001fL;\u00114;-~\b<;;\u0007\u001cF^\u0016vB.\u0003(J_+\u000eHC9In\u0018u\u0004\u001f\\M\u0014\u0005;&i\u00157/ik&`C#\u0005{_Ii@ka\u0015\u001e\"K{\u001e\tb0244U\u001bG{?J]9\u007faG@9k0P\u000bg?\u001dn\u0007ki\u0001Pp&|\u001fO*7\u0012\u000bJr$\u0004RjWZ#\u0014\u001c%\u0013\f\r+ \u000b}\u0013Ɯ1ŎROpȉҽQ~"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006r0@g\r\u001cFm_\nXN)z0-\u0015Pk8\u0017j,$", "\u001ab^:\"-:Q\u0019{\u0005h2F\n,r\u007f$yOJ%\"Gm\u001c\u0006_!D]\u000f \u0013x!\u001c\\?Jk\")\u0015f7", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW#z&5W\u0012\u001e>mu?MLJR8,$hj9\u00149", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW.z.4c\u0010\u0001Ak&<+F7t6\u001e{loH\u0007l,[L", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$:\u0018", "/o_ g(MS", "", "/cS\u0019\\:MS\"~\b", "", "3uT;g\u0015:[\u0019", "1qT.g,\u001a^$l\nZ;|h@e\t7c<\f", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW.\u0004)DUz'7U\u00129#", "5dc\u0010h9KS\"\u000eVi7j\u0018+t\u007f", "AtR0X:L", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW\u001ar,<Vy\u001e=C", "3qa<e", "5dc!l7>Rx\u0012\u0006h9\f\t.C\n1\nO| &U", "", "", "7me._0=O(~", "=m7<f;\u001dS'\u000e\bh@", "=m7<f;)O)\rz", "=m7<f;+S'\u000f\u0003^", "=mF6a+Hey\txn:Z\f+n\u0002(", "6`b\u0013b*Na", "", "@d\\<i,%W'\u000ezg,\n\u0017", "1nd;g", "", "Ad]147IA(z\n^\n\u007f\u00058g\u007f\b\r@\n&", "Ad]18=>\\(", "2`c.", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class AppStateModule extends NativeAppStateSpec implements LifecycleEventListener, WindowFocusChangeListener {
    public static final String APP_STATE_ACTIVE = "active";
    public static final String APP_STATE_BACKGROUND = "background";
    public static final Companion Companion = new Companion(null);
    private static final String INITIAL_STATE = "initialAppState";
    public static final String NAME = "AppState";
    private String appState;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005$2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԉt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̚~֒Yxe܈_>PsW3{q\u0014ʣ3ҽ:\u0005(݅rD\b\n\u0019\u001aXJf͓MŲO\f\u001aؓϴt@"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006r0@g\r\u001cFm_\nXN)z0-\u0015Pk8\u0017j,\rT1OWJ5`\\{\u0013", "", "u(E", "\u000fO?,F\u001b\u001aBxxV<\u001b`y\u000f", "", "\u000fO?,F\u001b\u001aBxxW:\nbj\u001cOo\u0011Z", "\u0017M8!<\b%M\u0007mVM\f", "\u001c@<\u0012", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppStateModule(ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        reactContext.addLifecycleEventListener(this);
        reactContext.addWindowFocusChangeListener(this);
        this.appState = reactContext.getLifecycleState() == LifecycleState.RESUMED ? "active" : APP_STATE_BACKGROUND;
    }

    private final WritableMap createAppStateEventMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("app_state", this.appState);
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "apply(...)");
        return writableMapCreateMap;
    }

    private final void sendAppStateChangeEvent() {
        sendEvent("appStateDidChange", createAppStateEventMap());
    }

    private final void sendEvent(String str, Object obj) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext != null && reactApplicationContext.hasActiveReactInstance()) {
            reactApplicationContext.emitDeviceEvent(str, obj);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAppStateSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeAppStateSpec
    public void getCurrentAppState(Callback success, Callback callback) {
        Intrinsics.checkNotNullParameter(success, "success");
        success.invoke(createAppStateEventMap());
    }

    @Override // com.facebook.fbreact.specs.NativeAppStateSpec
    public Map<String, Object> getTypedExportedConstants() {
        return MapsKt.mapOf(TuplesKt.to(INITIAL_STATE, this.appState));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        super.invalidate();
        getReactApplicationContext().removeLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.appState = APP_STATE_BACKGROUND;
        sendAppStateChangeEvent();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.appState = "active";
        sendAppStateChangeEvent();
    }

    @Override // com.facebook.react.bridge.WindowFocusChangeListener
    public void onWindowFocusChange(boolean z2) {
        sendEvent("appStateFocusChange", Boolean.valueOf(z2));
    }

    @Override // com.facebook.fbreact.specs.NativeAppStateSpec
    public void removeListeners(double d2) {
    }
}
