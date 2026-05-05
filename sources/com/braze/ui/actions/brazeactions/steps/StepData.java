package com.braze.ui.actions.brazeactions.steps;

import com.braze.enums.Channel;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
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
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njGNLeN<ZS@\u000fsڔ<$i*yCAW\"}0\u0012WNmlvJp\u000bK\u000f\f\u0017\u0001j:U]xc\u0012\u0015˱H\u0006ЀQx =g_-50`G2<\b\u0005\u0019\u001aXI |\u0001CY\u000e*0nsĐV\r[\tb \u0014T8\u00034[\u0016efLzuR/Q\u001c2I\\Aw0+NSцUo\u0014\u0005|6+n:{֝&\u001c\u001e\u0015ns?1ӊ\"C\u000bh5'CI\"Xf^\u0006\u0014#-g\r\fulٟ\u0004\u001aq\u001aDCO\u0012i\u0001\u00146\u0017\u0013}#;2\rLЀIvB(\u0007 \u0010Is!RpT\u0010vZ\u007f)z|\u0016Ӿ\u000431Zcm_\u0004S\u0019|PB̳\ff=\u000f\u00129[\u0003,\u0011\u001b!T\u0006uIQnVxV\u0010YK\u0013\u001crx\u0001X*xS\u000eV\u0014\u0011\\5U;iQ;!\u001a\u001b\u0011Pu\u001f\u001d`\u0017q\u001aVVX:nDPr\u000f\u001a\u0004\\d3\u0016\u0017h)K\u001fR4Z\u0017\u007f\u0018\u0013N[&BWefʝнhȬnWe\f+8tAqpq\u0015eA/BCS{\u0010\u0010Uλ\u0018EDϵ\u001dZlMa\u0018+w6/JJ\u0001\u000f&zz\u0013bƕԺ?ۇ >43\u001fl#R\u001b HO\u000b\u00180uv!\u0017VI#1hZ9_ɝˋ\\ʼsq\u0001K2\u0010n,ECWG'5&1v4\u0015#5\u007f\u0381\u0004Moն_Nr*\u0004jޑ$B"}, d2 = {"\u001ab^:\")KO.~Dn0F\u0005-t\u00042\u0005NJ\u0014$C\u0005\u000e8t49c\u0007.\u0001{%.XQ\u0005YC\u001e G]H\u00039", "", "AqR\u0017f6G", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "1gP;a,E", "\u001ab^:\")KO.~D^5\r\u0011=/]+wI\n\u0017\u001e\u001d", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV}\u0015QwW9\u0004!JYG @}\u001e<\u0017!>g='\u0015o7|w", "/qV@", "", "5dc\u000ee.L", "u(;7T=:\u001d)\u000e~euc\r=tU", "/qV@\u0017+>Z\u0019\u0001vm,", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "5dc\u0010[(G\\\u0019\u0006", "u(;0b4\bP&z\u0010^u|\u0012?m\u000eqYC|  Gvc", "4ha@g\bKU", "5dc\u0013\\9Lbt\f|", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "4ha@g\bKUW}ze,~\u0005>e", "AdR<a+\u001a`\u001b", "5dc X*H\\\u0018Z\b`", "AdR<a+\u001a`\u001b=y^3|\u000b+t\u007f", "5dc e*#a#\b", "u(;<e.\bX'\t\u0004(\u0011jr\u0018O|-{>\u0010l", "1nT?V,\u001a`\u001bm\u0005I9\u0007\u0014/r\u000f,{Nj$\u007fWv\u0015", "\u001ab^:\")KO.~Df6{\t6sI2\fO\u0003!\u001bPqW\u0019\u0004!JYh-Ax\u0016;\\G;y\n", "7mS2k", "", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "5dc\u000ee.", "5dc\u000ee.|O\"}\bh0{\u0003=d\u0006\"\fDz$\u0017No\nJv", "6`b566=S", "7r0?Z\nHc\"\u000e^g\t\u0007\u00198d\u000e", "4hg2W\bKUv\t\u000bg;", "@`]4X+\u001a`\u001b\\\u0005n5\f", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0015wI\u0003\u0017l", "7r0?Z\u0016Ib\u001d\t\u0004Z3a\u00179ni%\u0001@~&", "7r0?Z\u001aM`\u001d\b|", "BnBAe0GU", "", "\u0011n\\=T5B]\"", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class StepData {
    public static final String ARGS = "args";
    public static final Companion Companion = new Companion(null);
    private final Lazy args$delegate;
    private final Channel channel;
    private final Lazy firstArg$delegate;
    private final Lazy secondArg$delegate;
    private final JSONObject srcJson;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٦lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\")KO.~Dn0F\u0005-t\u00042\u0005NJ\u0014$C\u0005\u000e8t49c\u0007.\u0001{%.XQ\u0005YC\u001e G]H\u0003\"\nX~2CUR6e(", "", "u(E", "\u000fQ6 ", "", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public StepData(JSONObject srcJson, Channel channel) {
        Intrinsics.checkNotNullParameter(srcJson, "srcJson");
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.srcJson = srcJson;
        this.channel = channel;
        this.args$delegate = LazyKt.lazy(new Function0<List<? extends Object>>() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$args$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends Object> invoke() {
                final JSONArray jSONArrayOptJSONArray = this.this$0.getSrcJson().optJSONArray(StepData.ARGS);
                return SequencesKt.toList(SequencesKt.asSequence(jSONArrayOptJSONArray == null ? CollectionsKt.emptyList().iterator() : SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, jSONArrayOptJSONArray.length())), new Function1<Integer, Boolean>() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$args$2$invoke$$inlined$iterator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final Boolean invoke(int i2) {
                        return Boolean.valueOf(jSONArrayOptJSONArray.opt(i2) instanceof Object);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                        return invoke(num.intValue());
                    }
                }), new Function1<Integer, Object>() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$args$2$invoke$$inlined$iterator$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final Object invoke(int i2) throws JSONException {
                        Object obj = jSONArrayOptJSONArray.get(i2);
                        if (obj != null) {
                            return obj;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }
                }).iterator()));
            }
        });
        this.firstArg$delegate = LazyKt.lazy(new Function0<Object>() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$firstArg$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.this$0.getArg$android_sdk_ui_release(0);
            }
        });
        this.secondArg$delegate = LazyKt.lazy(new Function0<Object>() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$secondArg$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.this$0.getArg$android_sdk_ui_release(1);
            }
        });
    }

    public /* synthetic */ StepData(JSONObject jSONObject, Channel channel, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? Channel.UNKNOWN : channel);
    }

    public static /* synthetic */ StepData copy$default(StepData stepData, JSONObject jSONObject, Channel channel, int i2, Object obj) {
        if ((1 & i2) != 0) {
            jSONObject = stepData.srcJson;
        }
        if ((i2 & 2) != 0) {
            channel = stepData.channel;
        }
        return stepData.copy(jSONObject, channel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Object> getArgs() {
        return (List) this.args$delegate.getValue();
    }

    public static /* synthetic */ boolean isArgCountInBounds$default(StepData stepData, int i2, IntRange intRange, int i3, Object obj) {
        if ((1 & i3) != 0) {
            i2 = -1;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            intRange = null;
        }
        return stepData.isArgCountInBounds(i2, intRange);
    }

    public final BrazeProperties coerceArgToPropertiesOrNull(int i2) {
        Object orNull = CollectionsKt.getOrNull(getArgs(), i2);
        if (orNull == null || !(orNull instanceof JSONObject)) {
            return null;
        }
        return new BrazeProperties((JSONObject) orNull);
    }

    public final JSONObject component1() {
        return this.srcJson;
    }

    public final Channel component2() {
        return this.channel;
    }

    public final StepData copy(JSONObject srcJson, Channel channel) {
        Intrinsics.checkNotNullParameter(srcJson, "srcJson");
        Intrinsics.checkNotNullParameter(channel, "channel");
        return new StepData(srcJson, channel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StepData)) {
            return false;
        }
        StepData stepData = (StepData) obj;
        return Intrinsics.areEqual(this.srcJson, stepData.srcJson) && this.channel == stepData.channel;
    }

    public final Object getArg$android_sdk_ui_release(int i2) {
        return CollectionsKt.getOrNull(getArgs(), i2);
    }

    public final Channel getChannel() {
        return this.channel;
    }

    public final Object getFirstArg() {
        return this.firstArg$delegate.getValue();
    }

    public final Object getSecondArg() {
        return this.secondArg$delegate.getValue();
    }

    public final JSONObject getSrcJson() {
        return this.srcJson;
    }

    public int hashCode() {
        return (this.srcJson.hashCode() * 31) + this.channel.hashCode();
    }

    public final boolean isArgCountInBounds(final int i2, final IntRange intRange) {
        if (i2 != -1 && getArgs().size() != i2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.actions.brazeactions.steps.StepData.isArgCountInBounds.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Expected " + i2 + " arguments. Got: " + this.getArgs();
                }
            }, 7, (Object) null);
            return false;
        }
        if (intRange == null || intRange.contains(getArgs().size())) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.actions.brazeactions.steps.StepData.isArgCountInBounds.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Expected " + intRange + " arguments. Got: " + this.getArgs();
            }
        }, 7, (Object) null);
        return false;
    }

    public final boolean isArgOptionalJsonObject(final int i2) {
        Object arg$android_sdk_ui_release = getArg$android_sdk_ui_release(i2);
        if (arg$android_sdk_ui_release == null || (arg$android_sdk_ui_release instanceof JSONObject)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.actions.brazeactions.steps.StepData.isArgOptionalJsonObject.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Argument [" + i2 + "] is not a JSONObject. Source: " + this.getSrcJson();
            }
        }, 7, (Object) null);
        return false;
    }

    public final boolean isArgString(final int i2) {
        if (getArg$android_sdk_ui_release(i2) instanceof String) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.actions.brazeactions.steps.StepData.isArgString.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Argument [" + i2 + "] is not a String. Source: " + this.getSrcJson();
            }
        }, 7, (Object) null);
        return false;
    }

    public String toString() {
        return "Channel " + this.channel + " and json\n" + JsonUtils.getPrettyPrintedString(this.srcJson);
    }
}
