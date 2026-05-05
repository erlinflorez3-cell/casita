package kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
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
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eQLш|\u0004O\f8\u000b4L\u0007\":\u001b\u007f\u0007tʑA0JfP.`_2\u000fq|:)qҕ\u0010Xk[*\u007f2\t}Ȟ\u0016f'IoKX\u0015\u001a&|x,aU'^\"\u0013@D\b?aNڱA9nwv 0608\u0012\u0005/\u001b:L\u001ex\u0013Cy\r\"4NtRR;Nŋ\u001e\u0012\u0014Ch\u0010,g\u007fNdI\u001daH;;\u0003\u0018ĩ\u0015Ϣ_x\u000e[\u001a^TU\u001b'g,7X9K\u0014SbIޮR$E\u0011O\n=3im;s]\u0002hNX.\"E/]\rurT]5Un\u000e?+}d\u0014l\u001c9\u0010z*\u001bl\b\u001c\u0006?H\\.Jj\u0016\u0010Kt!TpT\u0010bZ\u007f)b~\u001d3\u0012K+g.-e*Y'bO{3\u000eN'\u000fn9[\u0003\u000f\u0011\u0019)V\u0010Q_RpAVR\"YknJp3\u00118\u0004HG.0ɨ\u00154\u001f¦O]?)/rRWRi\u000f\u0005\u000fiרmXPؗ:p\u001c?8\u0010\\iRh\u001dk~Uг0\u0017Uȼl\t\u0004\u0011!'-\u0004J+=\u0010|P?Ȍlܷa\n-Äϲ;o"}, d2 = {"\u001aj^A_0G\u001d~\t\ne0\u0006y/r\u000e,\u0006IV", "", ";`Y<e", "", ";h]<e", "uH8uI", ">`c0[", "uH8\u0016\u001c\u001d", "5dc\u001aT1H`", "u(8", "5dc\u001a\\5H`", "5dc\u001dT;<V", "Dda@\\6G", "1n\\=T9>B#", "=sW2e", "3pd._:", "", "", "6`b566=S", "7r0A?,:a(", "BnBAe0GU", "", "Dda@\\6G=\u001a", "\u0011n\\=T5B]\"", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class KotlinVersion implements Comparable<KotlinVersion> {
    public static final int MAX_COMPONENT_VALUE = 255;
    private final int major;
    private final int minor;
    private final int patch;
    private final int version;
    public static final Companion Companion = new Companion(null);
    public static final KotlinVersion CURRENT = KotlinVersionCurrentValue.get();

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u0018\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$BQIV2}P\u000b\u0006R>˯pН^\u000bKƤV\"\u0007mDI\u0004|4\u070fa̓FoG\u074cޢsB"}, d2 = {"\u001aj^A_0G\u001d~\t\ne0\u0006y/r\u000e,\u0006I?t!Oz\nEz/>/", "", "u(E", "\u0011TA\u001f8\u0015-", "\u001aj^A_0G\u001d~\t\ne0\u0006y/r\u000e,\u0006IV", "\u001b@G,6\u0016&>\u0003gZG\u001bvy\u000bLo\b", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public KotlinVersion(int i2, int i3) {
        this(i2, i3, 0);
    }

    public KotlinVersion(int i2, int i3, int i4) {
        this.major = i2;
        this.minor = i3;
        this.patch = i4;
        this.version = versionOf(i2, i3, i4);
    }

    private final int versionOf(int i2, int i3, int i4) {
        if (new IntRange(0, 255).contains(i2) && new IntRange(0, 255).contains(i3) && new IntRange(0, 255).contains(i4)) {
            return (i2 << 16) + (i3 << 8) + i4;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i2 + '.' + i3 + '.' + i4).toString());
    }

    @Override // java.lang.Comparable
    public int compareTo(KotlinVersion other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.version - other.version;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        KotlinVersion kotlinVersion = obj instanceof KotlinVersion ? (KotlinVersion) obj : null;
        return kotlinVersion != null && this.version == kotlinVersion.version;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getPatch() {
        return this.patch;
    }

    public int hashCode() {
        return this.version;
    }

    public final boolean isAtLeast(int i2, int i3) {
        int i4 = this.major;
        return i4 > i2 || (i4 == i2 && this.minor >= i3);
    }

    public final boolean isAtLeast(int i2, int i3, int i4) {
        int i5;
        int i6 = this.major;
        return i6 > i2 || (i6 == i2 && ((i5 = this.minor) > i3 || (i5 == i3 && this.patch >= i4)));
    }

    public String toString() {
        return new StringBuilder().append(this.major).append('.').append(this.minor).append('.').append(this.patch).toString();
    }
}
