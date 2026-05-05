package com.reactnativebiocatch;

import android.app.Activity;
import android.app.Application;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import defpackage.BioCatchSDKManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u0012\u007fјnjG<L͜P.hS2\u000fq\u0004<$i*yCAX\"}0\u0012WNmj\u0005Ϻx(s\u000f4\u00151iI\n`\ta \u000fJB\u001e@ݯQoK;)\u000bD\b82P<*\t\u000f\u001fBH>|+GY\u0013*0nx\u0001WU[\u0013#*\u0006l$1\"jnf6vt$?w)\u0011sZNUev\u0011\u0016\u001bT_?\r%eN/N>M\u0015S[I\f\u001biM\u000fWqk\t\u0019+52as\u0006>\u001f\u0005\\#9\\%]!*\r\t_g$'YW*P\u0019\u001c6\u0006\u0013{;@4\u0012\u0014.`.[\"-\rVI\u0003\u0002k@~\u0006\u000fF\u000e\u000by6E+079@3f\u007fi\u0002\u001e\u0017M\n\u0016%\u001eQ\u0005\u001f%if&`C.\u0005{_8i@kP\u0015\u000f\"o{\u0018\tb0.44U\u0015G{?4G)EqQ#Oq2NR~\u000f\u0007vg\u0002o\u0003NF\"|.O*7%\u000bHr\f\u0004P\u0003`r\u0016\u00164b!\u0016\bA$\r}J8=\u0012dN\u0017o\u001bQk\u0011=/\u0015? s4\u001ceTv3cU\u0014\u0014oY\u000f\u0014mD)\n!|Po$Z\u000b,R6V\u0002(w*J~\u0010!9WqJ<r6ǲ`3"}, d2 = {"\u001ab^:\"9>O\u0017\u000e\u0004Z;\u0001\u001a/b\u00042y<\u0010\u0015\u001a\u0011L\u0012Ft!DW\u0001\bAl&5M\u0019", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\ 7y4\u0003\u0011y]!\u0011b<Uv|", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$:\u0018", "1gP;Z,\u001c]\"\u000ezq;", "", "1n]AX?M<\u0015\u0007z", "", ">q^:\\:>", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW'\u0004/=]\f \r", "4kd@[", "5dc\u001bT4>", "5dc g(MS", "5dc#X9LW#\b", ">`d@X", "@dbB`,", "Adc\u0010h:M]!~\b;9x\u0012.", "1tbAb4>`u\fvg+", "Adc\u0019b.%S*~\u0002", ":nV\u0019X=>Z|\b\n", "", "AsP?g", "Et_\"e3", "1tbAb4>`|}", "1tbAb4>`\u0007~\tl0\u0007\u0012\u0013d", "3mP/_,!g\u0016\f~]\u001a\u0007\u0010?t\u00042\u0005", "", "AsP?g\u0015>e\u0007~\tl0\u0007\u0012", "As^=", "CoS.g,\u001cc'\u000e\u0005f,\nv/s\u000e,\u0006Idu", "\u0011n\\=T5B]\"", "@dP0gsGO(\u0003\f^sy\r9c{7yCz$\u0017No\nJv"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class BiocatchModule extends ReactContextBaseJavaModule {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "BiocatchModule";

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\":\u0012\u007f\u0007lkA0ZeP.XS2\u000fy\u0005<řc$\bCC٥ ԉ#\u001fѧ~g\u0016m\u000b_\u0011CǇ\n\u0016\u0007jt\u0004c{u\u0012=6rsM8eok;\u0011xD\u000b82P:*\t\u000f!BH>~+IY\u0015*2VohT=S\u000b\u001a \u0010V /)\rm\\B`ns9]0SuPO?_^~$θ\u0019ù+\r~ѭԅ/N"}, d2 = {"\u001ab^:\"9>O\u0017\u000e\u0004Z;\u0001\u001a/b\u00042y<\u0010\u0015\u001a\u0011L\u0012Ft!DW\u0001\bAl&5M\u0002\u0019u<)\u0011qeC\u00109", "", "u(E", "\"@6", "", "AsP?g\u0015:b\u001d\u0010ze@", "", "Et_\"e3", "1tbAb4>`|}", "/o_9\\*:b\u001d\t\u0004", "\u001a`]1e6BRbz\u0006iuX\u0014:l\u0004&wO\u0005! \u001d", "1tbAb4>`\u0007~\tl0\u0007\u0012\u0013d", "3mP/_,!g\u0016\f~]\u001a\u0007\u0010?t\u00042\u0005", "", "/bc6i0Mg", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "@dP0gsGO(\u0003\f^sy\r9c{7yCz$\u0017No\nJv"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void startNatively$default(Companion companion, String str, String str2, Application application, String str3, boolean z2, Activity activity, int i2, Object obj) throws Throwable {
            if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
                z2 = false;
            }
            companion.startNatively(str, str2, application, str3, z2, activity);
        }

        public final void startNatively(String wupUrl, String customerId, Application application, String str, boolean z2, final Activity activity) throws Throwable {
            Intrinsics.checkNotNullParameter(wupUrl, "wupUrl");
            Intrinsics.checkNotNullParameter(customerId, "customerId");
            Intrinsics.checkNotNullParameter(application, "application");
            BioCatchSDKManager.Companion.startSDK(wupUrl, customerId, str, application, z2, activity, new Function1<Boolean, Unit>() { // from class: com.reactnativebiocatch.BiocatchModule$Companion$startNatively$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z3) {
                    if (z3) {
                        String str2 = "BioCatch SDK started with Activity: " + activity;
                    }
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiocatchModule(ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    public static /* synthetic */ void start$default(BiocatchModule biocatchModule, String str, String str2, String str3, boolean z2, Promise promise, int i2, Object obj) throws Throwable {
        if ((i2 + 8) - (i2 | 8) != 0) {
            z2 = false;
        }
        biocatchModule.start(str, str2, str3, z2, promise);
    }

    @ReactMethod
    public final void changeContext(String contextName, final Promise promise) throws Throwable {
        Unit unit;
        Intrinsics.checkNotNullParameter(contextName, "contextName");
        Intrinsics.checkNotNullParameter(promise, "promise");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            BioCatchSDKManager.Companion.changeContext(contextName, currentActivity.getApplication(), new Function1<Boolean, Unit>() { // from class: com.reactnativebiocatch.BiocatchModule$changeContext$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z2) {
                    if (z2) {
                        promise.resolve(true);
                    } else {
                        promise.reject("-1", "BioCatch error change context");
                    }
                }
            });
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            promise.reject("-2", "BioCatch does not work, 'this.currentActivity' reference is null at this point.");
        }
    }

    @ReactMethod
    public final void flush(final Promise promise) throws Throwable {
        Unit unit;
        Intrinsics.checkNotNullParameter(promise, "promise");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            BioCatchSDKManager.Companion.flush(currentActivity.getApplication(), new Function1<Boolean, Unit>() { // from class: com.reactnativebiocatch.BiocatchModule$flush$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z2) {
                    if (z2) {
                        promise.resolve(true);
                    } else {
                        promise.reject("-1", "BioCatch error flush");
                    }
                }
            });
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            promise.reject("-2", "BioCatch does not work, 'this.currentActivity' reference is null at this point.");
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Biocatch";
    }

    @ReactMethod
    public final void getState(final Promise promise) throws Throwable {
        Unit unit;
        Intrinsics.checkNotNullParameter(promise, "promise");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            BioCatchSDKManager.Companion.getState(currentActivity.getApplication(), new Function1<String, Unit>() { // from class: com.reactnativebiocatch.BiocatchModule$getState$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String result) {
                    Intrinsics.checkNotNullParameter(result, "result");
                    promise.resolve(result);
                }
            });
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            promise.reject("-2", "BioCatch does not work, 'this.currentActivity' reference is null at this point.");
        }
    }

    @ReactMethod
    public final void getVersion(final Promise promise) throws Throwable {
        Unit unit;
        Intrinsics.checkNotNullParameter(promise, "promise");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            BioCatchSDKManager.Companion.getVersion(currentActivity.getApplication(), new Function1<String, Unit>() { // from class: com.reactnativebiocatch.BiocatchModule$getVersion$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String result) {
                    Intrinsics.checkNotNullParameter(result, "result");
                    promise.resolve(result);
                }
            });
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            promise.reject("-2", "BioCatch does not work, 'this.currentActivity' reference is null at this point.");
        }
    }

    @ReactMethod
    public final void pause(final Promise promise) throws Throwable {
        Unit unit;
        Intrinsics.checkNotNullParameter(promise, "promise");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            BioCatchSDKManager.Companion.pause(currentActivity.getApplication(), new Function1<Boolean, Unit>() { // from class: com.reactnativebiocatch.BiocatchModule$pause$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z2) {
                    if (z2) {
                        promise.resolve(true);
                    } else {
                        promise.reject("-1", "BioCatch error pause");
                    }
                }
            });
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            promise.reject("-2", "BioCatch does not work, 'this.currentActivity' reference is null at this point.");
        }
    }

    @ReactMethod
    public final void resume(final Promise promise) throws Throwable {
        Unit unit;
        Intrinsics.checkNotNullParameter(promise, "promise");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            BioCatchSDKManager.Companion.resume(currentActivity.getApplication(), new Function1<Boolean, Unit>() { // from class: com.reactnativebiocatch.BiocatchModule$resume$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z2) {
                    if (z2) {
                        promise.resolve(true);
                    } else {
                        promise.reject("-1", "BioCatch error resume");
                    }
                }
            });
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            promise.reject("-2", "BioCatch does not work, 'this.currentActivity' reference is null at this point.");
        }
    }

    @ReactMethod
    public final void setCustomerBrand(String customerBrand, final Promise promise) throws Throwable {
        Unit unit;
        Intrinsics.checkNotNullParameter(customerBrand, "customerBrand");
        Intrinsics.checkNotNullParameter(promise, "promise");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            BioCatchSDKManager.Companion.setCustomerBrand(customerBrand, currentActivity.getApplication(), new Function1<Boolean, Unit>() { // from class: com.reactnativebiocatch.BiocatchModule$setCustomerBrand$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z2) {
                    if (z2) {
                        promise.resolve(true);
                    } else {
                        promise.reject("-1", "BioCatch error setting brand");
                    }
                }
            });
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            promise.reject("-2", "BioCatch does not work, 'this.currentActivity' reference is null at this point.");
        }
    }

    @ReactMethod
    public final void setLogLevel(int i2, final Promise promise) throws Throwable {
        Unit unit;
        Intrinsics.checkNotNullParameter(promise, "promise");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            BioCatchSDKManager.Companion.setLogLevel(i2, currentActivity.getApplication(), new Function1<Boolean, Unit>() { // from class: com.reactnativebiocatch.BiocatchModule$setLogLevel$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z2) {
                    if (z2) {
                        promise.resolve(true);
                    } else {
                        promise.reject("-1", "BioCatch error setting log level");
                    }
                }
            });
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            promise.reject("-2", "BioCatch does not work, 'this.currentActivity' reference is null at this point.");
        }
    }

    @ReactMethod
    public final void start(String wupUrl, String customerId, String str, boolean z2, final Promise promise) throws Throwable {
        Unit unit;
        Intrinsics.checkNotNullParameter(wupUrl, "wupUrl");
        Intrinsics.checkNotNullParameter(customerId, "customerId");
        Intrinsics.checkNotNullParameter(promise, "promise");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            try {
                BioCatchSDKManager.Companion companion = BioCatchSDKManager.Companion;
                Application application = currentActivity.getApplication();
                Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
                companion.startSDK(wupUrl, customerId, str, application, z2, currentActivity, new Function1<Boolean, Unit>() { // from class: com.reactnativebiocatch.BiocatchModule$start$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z3) {
                        if (z3) {
                            promise.resolve(true);
                        } else {
                            promise.reject("-1", "BioCatch could not start");
                        }
                    }
                });
            } catch (NullPointerException e2) {
                promise.reject("-2", "An exception (BCM - NPE) occurred with BioCatch: " + e2);
            } catch (RuntimeException e3) {
                promise.reject("-2", "An exception (BCM - RE) occurred with BioCatch: " + e3);
            } catch (Exception e4) {
                promise.reject("-2", "An exception (BCM - E) occurred with BioCatch: " + e4);
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            promise.reject("-2", "BioCatch could not start, 'this.currentActivity' reference is null at this point.");
        }
    }

    @ReactMethod
    public final void startNewSession(String str, final Promise promise) throws Throwable {
        Unit unit;
        Intrinsics.checkNotNullParameter(promise, "promise");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            BioCatchSDKManager.Companion.startNewSession(str, currentActivity.getApplication(), new Function1<Boolean, Unit>() { // from class: com.reactnativebiocatch.BiocatchModule$startNewSession$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z2) {
                    if (z2) {
                        promise.resolve(true);
                    } else {
                        promise.reject("-1", "BioCatch error starting new session");
                    }
                }
            });
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            promise.reject("-2", "BioCatch does not work, 'this.currentActivity' reference is null at this point.");
        }
    }

    @ReactMethod
    public final void stop(final Promise promise) throws Throwable {
        Unit unit;
        Intrinsics.checkNotNullParameter(promise, "promise");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            BioCatchSDKManager.Companion.stop(currentActivity.getApplication(), new Function1<Boolean, Unit>() { // from class: com.reactnativebiocatch.BiocatchModule$stop$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z2) {
                    if (z2) {
                        promise.resolve(true);
                    } else {
                        promise.reject("-1", "BioCatch error stop");
                    }
                }
            });
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            promise.reject("-2", "BioCatch does not work, 'this.currentActivity' reference is null at this point.");
        }
    }

    @ReactMethod
    public final void updateCustomerSessionID(String customerSessionId, final Promise promise) throws Throwable {
        Unit unit;
        Intrinsics.checkNotNullParameter(customerSessionId, "customerSessionId");
        Intrinsics.checkNotNullParameter(promise, "promise");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            BioCatchSDKManager.Companion.updateCustomerSessionID(customerSessionId, currentActivity.getApplication(), new Function1<Boolean, Unit>() { // from class: com.reactnativebiocatch.BiocatchModule$updateCustomerSessionID$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z2) {
                    if (z2) {
                        promise.resolve(true);
                    } else {
                        promise.reject("-1", "BioCatch error updating customer session Id");
                    }
                }
            });
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            promise.reject("-2", "BioCatch does not work, 'this.currentActivity' reference is null at this point.");
        }
    }
}
