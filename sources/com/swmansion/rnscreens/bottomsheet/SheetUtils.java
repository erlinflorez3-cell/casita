package com.swmansion.rnscreens.bottomsheet;

import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005#4\u0012\u0006\u0010nj?3JΣHDɟ\u0004*=j<9*[ҸuCIUb\u00120\ngN\u0016i\u001fNh\u000e[\u000f4\u0018)n:Mmx\f\u0014WFPtW3{um=nwN\u0005N4R<\b\f\u0019\u001aXJX\u0003\tKc\f@6ptHU%M3\u001cZ\u001aL)\u0019\u001e\u000bi~:Vvu:]%3mPR?_^~֚\u0011Q"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011l\u0018K\u0006/=g\u0001 7|_\u001cPC;z$-\u0019oo\u000f", "", "u(E", "2dc2a;\"\\\u0018~\u000e?9\u0007\u0011\u001dh\u007f(\u000b.\u0010\u0013&G", "", "AsPAX", "2dc2a;\u001c])\b\n", "7rBAT;>:\u0019\r\t>8\r\u00056T\u0003$\u0005", "", "=sW2e\u001aMO(~", "7rBAT;>A(zwe,", "AgT2g\u001aMO(~[k6\u0005g/t\u007f1\u000b$\n\u0016\u0017Z", "7mS2k", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class SheetUtils {
    public static final SheetUtils INSTANCE = new SheetUtils();

    private SheetUtils() {
    }

    public final int detentIndexFromSheetState(int i2, int i3) {
        if (i3 != 1) {
            if (i3 == 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return -1;
                        }
                        throw new IllegalArgumentException("[RNScreens] Invalid state " + i2 + " for detentCount " + i3);
                    }
                }
                return 1;
            }
            if (i3 != 3) {
                throw new IllegalArgumentException("[RNScreens] Invalid state " + i2 + " for detentCount " + i3);
            }
            if (i2 == 3) {
                return 2;
            }
            if (i2 != 4) {
                if (i2 == 5) {
                    return -1;
                }
                if (i2 != 6) {
                    throw new IllegalArgumentException("[RNScreens] Invalid state " + i2 + " for detentCount " + i3);
                }
                return 1;
            }
        } else if (i2 != 3) {
            if (i2 == 5) {
                return -1;
            }
            throw new IllegalArgumentException("[RNScreens] Invalid state " + i2 + " for detentCount " + i3);
        }
        return 0;
    }

    public final boolean isStateLessEqualThan(int i2, int i3) {
        if (i2 == i3) {
            return true;
        }
        return (i2 == 6 || i3 == 6) ? i2 == 6 ? i3 == 3 : i2 == 4 && i3 != 5 : i2 > i3;
    }

    public final boolean isStateStable(int i2) {
        return i2 == 3 || i2 == 4 || i2 == 5 || i2 == 6;
    }

    public final int sheetStateFromDetentIndex(int i2, int i3) {
        if (i3 != 1) {
            if (i3 == 2) {
                if (i2 == -1) {
                    return 5;
                }
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalArgumentException("[RNScreens] Invalid detentCount/index combination " + i3 + " / " + i2);
                    }
                }
                return 4;
            }
            if (i3 != 3) {
                throw new IllegalArgumentException("[RNScreens] Invalid detentCount/index combination " + i3 + " / " + i2);
            }
            if (i2 == -1) {
                return 5;
            }
            if (i2 != 0) {
                if (i2 == 1) {
                    return 6;
                }
                if (i2 != 2) {
                    throw new IllegalArgumentException("[RNScreens] Invalid detentCount/index combination " + i3 + " / " + i2);
                }
            }
            return 4;
        }
        if (i2 == -1) {
            return 5;
        }
        if (i2 != 0) {
            throw new IllegalArgumentException("[RNScreens] Invalid detentCount/index combination " + i3 + " / " + i2);
        }
        return 3;
    }
}
