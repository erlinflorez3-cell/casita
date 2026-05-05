package com.facebook.react.views.scroll;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\nGָّ\u000bDȐ\u001d(\\\u0018\b\tvjgӄrd\u0001-X\u0014/\u0015kڷ8$i$ZCAV\u0003}(\u000b8NmjWJ`\u000f,\u000f\f\u001bѷn3"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001c:\u0004/<`G\u000e5z 5T#Lk=-\u0004|l9\\", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u0010D6\u0016A&\u001d@t`", "\u0013M3,7\u0019\u001a5", "!BA\u001c?\u0013", "\u001bN<\u0012A\u001b.;\u0013[Z@\u0010e", "\u001bN<\u0012A\u001b.;\u0013^c=", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ScrollEventType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ScrollEventType[] $VALUES;
    public static final Companion Companion;
    public static final ScrollEventType BEGIN_DRAG = new ScrollEventType("BEGIN_DRAG", 0);
    public static final ScrollEventType END_DRAG = new ScrollEventType("END_DRAG", 1);
    public static final ScrollEventType SCROLL = new ScrollEventType("SCROLL", 2);
    public static final ScrollEventType MOMENTUM_BEGIN = new ScrollEventType("MOMENTUM_BEGIN", 3);
    public static final ScrollEventType MOMENTUM_END = new ScrollEventType("MOMENTUM_END", 4);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\"B\u0012\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:QIV2}P\u000b\u007fRuj\u0007J\t\u000f\n\u0014َ\u001a}"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001c:\u0004/<`G\u000e5z 5T#Lk=-\u0004|l9EA6V\u0002#PPX52", "", "u(E", "5dc\u0017F\fOS\"\u000ecZ4|", "", "Bx_2", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001c:\u0004/<`G\u000e5z 5T#Lk=-\u0004|l9\\", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {

        @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ScrollEventType.values().length];
                try {
                    iArr[ScrollEventType.BEGIN_DRAG.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ScrollEventType.END_DRAG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ScrollEventType.SCROLL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ScrollEventType.MOMENTUM_BEGIN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ScrollEventType.MOMENTUM_END.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final String getJSEventName(ScrollEventType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            int i2 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            if (i2 == 1) {
                return "topScrollBeginDrag";
            }
            if (i2 == 2) {
                return "topScrollEndDrag";
            }
            if (i2 == 3) {
                return "topScroll";
            }
            if (i2 == 4) {
                return "topMomentumScrollBegin";
            }
            if (i2 == 5) {
                return "topMomentumScrollEnd";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    private static final /* synthetic */ ScrollEventType[] $values() {
        return new ScrollEventType[]{BEGIN_DRAG, END_DRAG, SCROLL, MOMENTUM_BEGIN, MOMENTUM_END};
    }

    static {
        ScrollEventType[] scrollEventTypeArr$values = $values();
        $VALUES = scrollEventTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(scrollEventTypeArr$values);
        Companion = new Companion(null);
    }

    private ScrollEventType(String str, int i2) {
    }

    public static EnumEntries<ScrollEventType> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    public static final String getJSEventName(ScrollEventType scrollEventType) {
        return Companion.getJSEventName(scrollEventType);
    }

    public static ScrollEventType valueOf(String str) {
        return (ScrollEventType) Enum.valueOf(ScrollEventType.class, str);
    }

    public static ScrollEventType[] values() {
        return (ScrollEventType[]) $VALUES.clone();
    }
}
