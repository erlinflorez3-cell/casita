package com.facebook.react.modules.debug;

import com.facebook.fbreact.specs.NativeDevSettingsSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.devsupport.interfaces.DevOptionHandler;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.module.annotations.ReactModule;
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
@ReactModule(name = "\u0004$4\u0010!/.\"&\u001e)")
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njG0L͜P.`_2\u000fq\u0003<$i(yCAU\"}0\u0012WNmmtOpŏs\u000f4\u00159\u007f<Ocxu\u0014%1ppO7[qU9\u000fwȥ\t @&\u0001\b\u0013\u00062*v\u0016'~QR$\u0012^H7N\u001b\u001b[\u000e2\u00124DP\u0005,f\u007fNdP3q\u000351\u000e\u0002B|-&DES\u001bRl';|(2sFEB-%\u0002\tMf$M\u0011M\n=3nW+9X\fWd`F(]9]\u001durTb5Un\u001d?+}u\u0012dV6\u0006\u000e\u0014\rj\n>\n5\\F-H{N\"{\u0003\u0001iXP0dr\u0004\txN\u0017S\u0015y?\u0002)tiy;GTg\u007f\u0013&6#/\u0004go\u001d\u001cn/3T&WaUNX`N8n\u0004\u0002Lvp\u001eB\u0004^MFCL\u001d<\u0019=7\n<yܬmɘLDoϸݼd\u0006"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006u%2i\u007fi\u0016m'\u001cMRJo= #Pk8\u0017j,$", "\u001ab^:\"-:Q\u0019{\u0005h2F\n,r\u007f$yOJ%\"Gm\u001c\u0006_!D]\u000f \u0016m'\u001cMRJo= #Vl9\u00059", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "2de h7I]&\u000ebZ5x\u000b/r", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5\u0013\u001e&VqD\u0012m9]^#PHP,i(", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$]%QT\u0018-XPr:\u001e\u001c`W[+\t\u0003h\u000b#nUE/\u00137S\u000fJ2\u0005\u0015%\u000eBkl@V\u001e\u0011X\u0015\u0007/9sQcl\t/=N^,d\u00195`M", "/cS\u0019\\:MS\"~\b", "", "3uT;g\u0015:[\u0019", "", "/cS\u001aX5N7(~\u0003", "Bhc9X", "=m5.f;+S\u001a\fzl/", "=oT;7,;c\u001b\u0001zk", "@d[<T+", "@d[<T+0W(\u0002g^(\u000b\u00138", "@dP@b5", "@d\\<i,%W'\u000ezg,\n\u0017", "1nd;g", "", "Adc\u0015b;%]\u0015}~g.\\\u0012+b\u0007(z", "7r7<g\u0013HO\u0018\u0003\u0004`\f\u0006\u0005,l\u007f'", "", "Adc\u0016f\u000b>P)\u0001|b5~u/m\n7{G\u0015", "7r32U<@U\u001d\bg^4\u0007\u0018/l\u0014\b\u0005<}\u001e\u0017F", "Adc\u0016f\u001aAO\u001f~ih\u001a\u007f\u0013AD\u007f9c@\n'vPk\u000bCv$", "3mP/_,=", "Adc\u001de6?W \u0003\u0004`\f\u0006\u0005,l\u007f'", "7r??b-BZ\u001d\b|>5x\u00066e~", "BnV4_,\u001eZ\u0019\u0007zg;`\u0012=p\u007f&\u000bJ\u000e", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class DevSettingsModule extends NativeDevSettingsSpec {
    private final DevSupportManager devSupportManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevSettingsModule(ReactApplicationContext reactApplicationContext, DevSupportManager devSupportManager) {
        super(reactApplicationContext);
        Intrinsics.checkNotNullParameter(devSupportManager, "devSupportManager");
        this.devSupportManager = devSupportManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addMenuItem$lambda$1(String title, DevSettingsModule this$0) {
        Intrinsics.checkNotNullParameter(title, "$title");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("title", title);
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = this$0.getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent("didPressMenuItem", writableMapCreateMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reload$lambda$0(DevSettingsModule this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.devSupportManager.handleReloadJS();
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void addListener(String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void addMenuItem(final String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.devSupportManager.addCustomDevOption(title, new DevOptionHandler() { // from class: com.facebook.react.modules.debug.DevSettingsModule$$ExternalSyntheticLambda0
            @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
            public final void onOptionSelected() {
                DevSettingsModule.addMenuItem$lambda$1(title, this);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void onFastRefresh() {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void openDebugger() {
        this.devSupportManager.openDebugger();
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void reload() {
        if (this.devSupportManager.getDevSupportEnabled()) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.debug.DevSettingsModule$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    DevSettingsModule.reload$lambda$0(this.f$0);
                }
            });
        }
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void reloadWithReason(String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        reload();
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void removeListeners(double d2) {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void setHotLoadingEnabled(boolean z2) {
        this.devSupportManager.setHotModuleReplacementEnabled(z2);
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void setIsDebuggingRemotely(boolean z2) {
        this.devSupportManager.setRemoteJSDebugEnabled(z2);
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void setIsShakeToShowDevMenuEnabled(boolean z2) {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void setProfilingEnabled(boolean z2) {
        this.devSupportManager.setFpsDebugEnabled(z2);
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void toggleElementInspector() {
        this.devSupportManager.toggleElementInspector();
    }
}
