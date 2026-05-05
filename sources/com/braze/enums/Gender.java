package com.braze.enums;

import com.biocatch.client.android.sdk.core.Constants;
import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
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
@Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eRLc\u000b\u0004I\u0006>\u00176B\u0005-2ߢv\u001d߿\tF`JuJ>R\u0002ճ=j,:4]4qq<\u0004\u001a6!\u0016\u0010[mg~Nh\r[\u000f4\u0017ѱn,WXAc \u0015JB\u001e@ya@LGb\r63!ݨ&>\u0002ڎ\u0019\u001c0L\u001e{cCQ\u0013z0Fx#R\u0013Vm\u001a\u0018\u0010' \u0007)EgTBՈpk"}, d2 = {"\u001ab^:\")KO.~D^5\r\u0011=/a(\u0005?\u0001$l", "", "\u001ab^:\")KO.~Df6{\t6sI\ffP\u0010z VyrJ\u0001.\u000b", "", "D`[BX", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004\u00114", "5dc#T3NS", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "4na\u0017f6G>)\u000e", "\u001b@;\u0012", "\u0014D<\u000e?\f", "\u001dS7\u0012E", "#M:\u001bB\u001e'", "\u001cNC,4\u0017):|\\V;\u0013\\", "\u001eQ4\u00138\u00198<\u0003mtM\u0016vv\u000bY", "\u0011n\\=T5B]\"", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public enum Gender implements IPutIntoJson<String> {
    MALE("m"),
    FEMALE(Constants.FLUSH_KEY),
    OTHER("o"),
    UNKNOWN("u"),
    NOT_APPLICABLE(com.braze.Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID),
    PREFER_NOT_TO_SAY("p");

    public static final Companion Companion = new Companion(null);
    private final String value;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u001e\u007fјlʙ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:UIV2\u007f8\b}P\u0018m|Mr\rY\u000e4\u001a?o\u0082MZ"}, d2 = {"\u001ab^:\")KO.~D^5\r\u0011=/a(\u0005?\u0001$U%y\u0016Gr.9c\u0007u", "", "u(E", "5dc\u0014X5=S&", "\u001ab^:\")KO.~D^5\r\u0011=/a(\u0005?\u0001$l", "D`[BX", "", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final Gender getGender(String str) {
            String lowerCase;
            Gender gender = null;
            if (str != null) {
                lowerCase = str.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            } else {
                lowerCase = null;
            }
            Gender[] genderArrValues = Gender.values();
            int length = genderArrValues.length;
            int i2 = 0;
            Gender gender2 = null;
            boolean z2 = false;
            while (true) {
                if (i2 < length) {
                    Gender gender3 = genderArrValues[i2];
                    if (Intrinsics.areEqual(gender3.getValue(), lowerCase)) {
                        if (z2) {
                            break;
                        }
                        z2 = true;
                        gender2 = gender3;
                    }
                    i2++;
                } else if (z2) {
                    gender = gender2;
                }
            }
            if (gender == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new c(str), 6, (Object) null);
            }
            return gender;
        }
    }

    Gender(String str) {
        this.value = str;
    }

    @JvmStatic
    public static final Gender getGender(String str) {
        return Companion.getGender(str);
    }

    @Override // com.braze.models.IPutIntoJson
    public String forJsonPut() {
        return this.value;
    }

    public final String getValue() {
        return this.value;
    }
}
