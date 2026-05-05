package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012\u0006\rnjG9LeN.ZS8#sڔ<$i+yّCU(}*\tUTmf\u0005Ϻx\u001es\u000f4\u00151i?\nz\ta \u000fJB\u001e@Cc}?Qr\u00058\u0015 `#H{\u0015\u0001H.X\u0012\u0007zqP:\u0015ضDpHXUY\u0013%*\u0006l,1\"jtf6vp&H=1\u001bipZWc>\ne\rtXm\r?g,:X7c\u0019kSK\u000b`kW\u0003mu\u0006\u0013v8?+w{\b:f\u0012,\u0015YSS]C2j\u0005i`:(\u0002ՕeׂT\u000e0»K\b\u001bC\u001c\u000e4/\u001f͖/բj\b\u0016ޗE~aIh\u0002\rLVаmي\u001b%\bđ{W)hisK\u001b^7*\u0006\u001d 3\u0001\u001d%kV\u001e`C \u0003z(ĻS͘AHVˣ\u0558A\u0002"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#]'7u\u00167\\+7x:\u001e\">", "", "2db0e0Ib#\f", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0016G}\fIz0Dc\u000b.\u0001[\u0016;Q?BJ4,\u0013ueD\u0016m9$", "@dP1<-\u001aP'~\u0004m", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Fo\u001c:\u0004)@h\b-E7\u0004.ZG7r\u0013\u001e#fn=\u0012r6[L\u000eMV]3`[<B%\u001a$\u000f^4\u000b\u0014]K-|\u000e\u0018/\u0011*X\u0006EqMaY~", "6hV5@(KY'Z\bk(\u0011", "", ":nf2e\u0014:`\u001f\r", "", ";`a8", "", "7mS2k", ";`a8;0@V", "<dgAH5FO&\u0005z]\u000f\u0001\u000b2I\t'{S", "<dgAH5FO&\u0005z]\u0010\u0006\b/x", ">qT=T9>6\u001d\u0001}F(\n\u000f=A\r5wT", "3kT:X5Mav\t\u000bg;", "\u0011n\\=T5B]\"", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ElementMarker {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final long[] EMPTY_HIGH_MARKS = new long[0];
    private final SerialDescriptor descriptor;
    private final long[] highMarksArray;
    private long lowerMarks;
    private final Function2<SerialDescriptor, Integer, Boolean> readIfAbsent;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u001f6Ȑ\u0005ӯ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٨\u001cԥ&\tWȞ˝kq"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#]'7u\u00167\\+7x:\u001e\"'?C\u000fn(Wz1P\"", "", "u(E", "\u0013L?!L&!7zatF\bin\u001d", "", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ElementMarker(SerialDescriptor descriptor, Function2<? super SerialDescriptor, ? super Integer, Boolean> readIfAbsent) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(readIfAbsent, "readIfAbsent");
        this.descriptor = descriptor;
        this.readIfAbsent = readIfAbsent;
        int elementsCount = descriptor.getElementsCount();
        if (elementsCount <= 64) {
            this.lowerMarks = elementsCount != 64 ? (-1) << elementsCount : 0L;
            this.highMarksArray = EMPTY_HIGH_MARKS;
        } else {
            this.lowerMarks = 0L;
            this.highMarksArray = prepareHighMarksArray(elementsCount);
        }
    }

    private final void markHigh(int i2) {
        int i3 = (i2 >>> 6) - 1;
        long[] jArr = this.highMarksArray;
        jArr[i3] = jArr[i3] | (1 << ((i2 + 63) - (i2 | 63)));
    }

    private final int nextUnmarkedHighIndex() {
        int length = this.highMarksArray.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            int i4 = i3 * 64;
            long j2 = this.highMarksArray[i2];
            while (j2 != -1) {
                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j2);
                j2 |= 1 << iNumberOfTrailingZeros;
                int i5 = iNumberOfTrailingZeros + i4;
                if (this.readIfAbsent.invoke(this.descriptor, Integer.valueOf(i5)).booleanValue()) {
                    this.highMarksArray[i2] = j2;
                    return i5;
                }
            }
            this.highMarksArray[i2] = j2;
            i2 = i3;
        }
        return -1;
    }

    private final long[] prepareHighMarksArray(int i2) {
        long[] jArr = new long[(i2 - 1) >>> 6];
        if ((i2 + 63) - (63 | i2) != 0) {
            jArr[ArraysKt.getLastIndex(jArr)] = (-1) << i2;
        }
        return jArr;
    }

    public final void mark(int i2) {
        if (i2 < 64) {
            this.lowerMarks |= 1 << i2;
        } else {
            markHigh(i2);
        }
    }

    public final int nextUnmarkedIndex() {
        int iNumberOfTrailingZeros;
        int elementsCount = this.descriptor.getElementsCount();
        do {
            long j2 = this.lowerMarks;
            if (j2 == -1) {
                if (elementsCount > 64) {
                    return nextUnmarkedHighIndex();
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j2);
            this.lowerMarks |= 1 << iNumberOfTrailingZeros;
        } while (!this.readIfAbsent.invoke(this.descriptor, Integer.valueOf(iNumberOfTrailingZeros)).booleanValue());
        return iNumberOfTrailingZeros;
    }
}
