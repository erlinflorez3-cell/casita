package com.facebook.react.uimanager;

import com.dynatrace.android.agent.Global;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import yg.InterfaceC1492Gx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
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
@Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\tGָّ\u000bDȐ\u001d'\\\u0018\b\tvjgӄrd\u0001-W\u0014/\u0015kڷ8$i$ZCAV\u0003}(\u000b8NmjWJ`\u000få\u0013\f"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n c\u0002)Fm#\u000e^CDzBs", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u001cN=\u0012", "\u0010NG,A\u0016'3", "\u0010NG,B\u0015%G", "\u000fTC\u001c", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class PointerEvents {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PointerEvents[] $VALUES;
    public static final Companion Companion;
    public static final PointerEvents NONE = new PointerEvents("NONE", 0);
    public static final PointerEvents BOX_NONE = new PointerEvents("BOX_NONE", 1);
    public static final PointerEvents BOX_ONLY = new PointerEvents("BOX_ONLY", 2);
    public static final PointerEvents AUTO = new PointerEvents("AUTO", 3);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146Ȑ\u0007\"B\u0012\u007f\u0007lkA0RqP\u008cXݾ+%ӆ,4RZdvI;ڈ\u001e}0\t\u0018\\uh\u0007J\t\rs\u0013\u0014\u0019\u0011jZM\u001c}& \u001d7Zom5}sK<xtd\tf7jH\b\u000b\u0019\u001aXL@|\tJc\u000e(/nx\u0001WұQ\u000e"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n c\u0002)Fm#\u000e^CDzB\\rriD\u0003l0X\u007f|", "", "u(E", "1`]\u000fX\u001bHc\u0017\u0002iZ9~\t>", "", ">nX;g,K3*~\u0004m:", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n c\u0002)Fm#\u000e^CDzBs", "1`]\u0010[0ER&~\u0004;,k\u0013?c\u0003\u0017wM\u0003\u0017&", ">`a@X\u0017HW\"\u000ezk\f\u000e\t8t\u000e", ">nX;g,K3*~\u0004m:j\u0018<", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final boolean canBeTouchTarget(PointerEvents pointerEvents) {
            Intrinsics.checkNotNullParameter(pointerEvents, "pointerEvents");
            return pointerEvents == PointerEvents.AUTO || pointerEvents == PointerEvents.BOX_ONLY;
        }

        @JvmStatic
        public final boolean canChildrenBeTouchTarget(PointerEvents pointerEvents) {
            Intrinsics.checkNotNullParameter(pointerEvents, "pointerEvents");
            return pointerEvents == PointerEvents.AUTO || pointerEvents == PointerEvents.BOX_NONE;
        }

        @JvmStatic
        public final PointerEvents parsePointerEvents(String str) {
            if (str == null) {
                return PointerEvents.AUTO;
            }
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String upperCase = str.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return PointerEvents.valueOf(StringsKt.replace$default(upperCase, Global.HYPHEN, Global.UNDERSCORE, false, 4, (Object) null));
        }
    }

    private static final /* synthetic */ PointerEvents[] $values() {
        return new PointerEvents[]{NONE, BOX_NONE, BOX_ONLY, AUTO};
    }

    static {
        PointerEvents[] pointerEventsArr$values = $values();
        $VALUES = pointerEventsArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(pointerEventsArr$values);
        Companion = new Companion(null);
    }

    private PointerEvents(String str, int i2) {
    }

    @JvmStatic
    public static final boolean canBeTouchTarget(PointerEvents pointerEvents) {
        return Companion.canBeTouchTarget(pointerEvents);
    }

    @JvmStatic
    public static final boolean canChildrenBeTouchTarget(PointerEvents pointerEvents) {
        return Companion.canChildrenBeTouchTarget(pointerEvents);
    }

    public static EnumEntries<PointerEvents> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    public static final PointerEvents parsePointerEvents(String str) {
        return Companion.parsePointerEvents(str);
    }

    public static PointerEvents valueOf(String str) {
        return (PointerEvents) Enum.valueOf(PointerEvents.class, str);
    }

    public static PointerEvents[] values() {
        return (PointerEvents[]) $VALUES.clone();
    }
}
