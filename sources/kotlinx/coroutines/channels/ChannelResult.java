package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&˛\bDRш|\u0004G\n8\u000b<K\u0007\"2\u001b\u007f\u0007tkA0JfP.`_2\u000fq~<$i*yCAW Ԋ`\u001fѧl\b\u0010rPҙ\u0019B-\u0005Fx\u0019,\u0002V\u0017|2OCHnO9[pU;vsd\u0005ڶ6$>{\u0013\u0004b7V\u001e\u000f|YJB۵ضDr@a\u001bPM% \u0016V 7Ȧ֔kP<Yz`\u0003<1\u0015\u0002Dd&\u000eCƊQ\u000fLh5\"?n,AX7c,kgΫ\u000bTaW\u0011X:N\u0013\u0003?'YP$]Ds\u0018\u0016+*}\r$ō'%\f_|$'Yl*\u05f6O^>\u0006{\u0014\u000fR\u0003<\u0006]Ξ\u0005ƨ\u001cǴ\f\u0014;ο\u0003UFT\u0010c\u0013\u000f\tgN\u0017S\u0007ioݰ\u001fjicA!\\@L\u0014\u001b(;\u0001\u001d(\u0012\u0019\u05f8d\u00193V}\\?Z\u0011LVZ\"Ykt:5Ċ\u0006.\u001c2M\r=\u0005\u0086-\u0018¹6]O\"OkɞLe"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7t\u0003.[SBz\n", "\"", "", "6n[1X9", "1n]@g9NQ(\t\b&0\u0005\u00146", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "5dc\u0015b3=S&=vg5\u0007\u0018+t\u00042\u0005N", "u(E", "7rBBV*>a'", "", "7rBBV*>a'F~f7\u0004", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "7r5.\\3N`\u0019", "7r5.\\3N`\u0019F~f7\u0004", "7r29b:>R", "7r29b:>R`\u0003\u0003i3", "5dc\u001ce\u0015NZ ", "5dc\u001ce\u0015NZ F~f7\u0004", "5dc\u001ce\u001bA`#\u0011", "5dc\u001ce\u001bA`#\u0011Bb4\b\u0010", "3wR2c;B]\"h\bG<\u0004\u0010", "", "3wR2c;B]\"h\bG<\u0004\u0010vi\b3\u0003", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~H\u0001-A\u007f\u0012+TC\u0011", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004", "3pd._:", "=sW2e", "6`b566=S", "", "\u0014`X9X+", "\u0011k^@X+", "\u0011n\\=T5B]\"", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class ChannelResult<T> {
    public static final Companion Companion = new Companion(null);
    private static final Failed failed = new Failed();
    private final Object holder;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004O\u00078\u000b4C\u0007\":\u001b\u007fјnjGӄL͜P.`Y2şs{B0cҕwّQ٥J}P\b\u0010]wm|Jr\rY\u000e4\u0017ѱn.OW\u0007`Z @F\b?aR CGf\r8\u001b\u001f`)~ѝ\u0005I 8P(v)L\u0012 Z6NzRR;XK.b\u0016L \u0019 rf|7~p4ƅ1ݭ\u0007iJ÷ϴc<"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7t\u0003.[SBzr{\u001cro9\u00069", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7t\u0003.[SBzr~\u0011lh9\u00069", "1`d@X", "", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001b\u007f\u00169w{%\u0003@VZ\b", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Closed extends Failed {
        public final Throwable cause;

        public Closed(Throwable th) {
            this.cause = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof Closed) && Intrinsics.areEqual(this.cause, ((Closed) obj).cause);
        }

        public int hashCode() {
            Throwable th = this.cause;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // kotlinx.coroutines.channels.ChannelResult.Failed
        public String toString() {
            return "Closed(" + this.cause + ')';
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007lqA0RfP.XT0ŧl\u0012éT[Rp\u0004B[\u001aԥ&\u000bUNuh7kh\u000f[\u0015\u0016\u0018\tjrO\u0004}}\u0014\u00151Puo7[vU9'z|\nڶ6$>\u0002\u0013\nbCV\u001a\u000f\u0001SM\u001c\u0012vF\u001f?r\u000fS\u0004(\u0018LCŋ\u0005 br\\B\u0011\u0010kGG)\u0013kRNme^\u0002m\u000fLS5\u0013'g,9X9K\u0014SbI\fқ_A\tO\u007fNUt5)CI\"Z\rݜ\u0002Џ\u0019+WՕǇv8"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7t\u0003.[SBzr{\u001fpl5\u0010g6WL", "", "\nh]6g\u0005", "u(E", "4`X9X+", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7t\u0003.[SBzr~\u0011lh9\u00069", "AtR0X:L", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7t\u0003.[SBz\n", "\u0013", "D`[BX", "AtR0X:L\u001b}iG]\u0012`x", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "4`X9h9>", "4`X9h9>\u001b\u0004\u000eyC!\f\u000f", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "1k^@X+", "1`d@X", "", "1k^@X+\u00068\u0004KyD\u0010l", "uKY.i(\bZ\u0015\b|(\u001b\u007f\u00169w{%\u0003@VZ}Lk\u001f8@,1b\u007fi!j\u001b.KR\u0011", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: closed-JP2dKIU, reason: not valid java name */
        public final <E> Object m10512closedJP2dKIU(Throwable th) {
            return ChannelResult.m10500constructorimpl(new Closed(th));
        }

        /* JADX INFO: renamed from: failure-PtdJZtk, reason: not valid java name */
        public final <E> Object m10513failurePtdJZtk() {
            return ChannelResult.m10500constructorimpl(ChannelResult.failed);
        }

        /* JADX INFO: renamed from: success-JP2dKIU, reason: not valid java name */
        public final <E> Object m10514successJP2dKIU(E e2) {
            return ChannelResult.m10500constructorimpl(e2);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176Ȑ\u00050Bߚ(\u0007\u0015iy5ǲiJ4Ra+Wq\n6<[Rt\nOڎ\u001e\u0002"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7t\u0003.[SBzr~\u0011lh9\u00069", "", "\nh]6g\u0005", "u(E", "BnBAe0GU", "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static class Failed {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ ChannelResult(Object obj) {
        this.holder = obj;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ChannelResult m10499boximpl(Object obj) {
        return new ChannelResult(obj);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <T> Object m10500constructorimpl(Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m10501equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof ChannelResult) && Intrinsics.areEqual(obj, ((ChannelResult) obj2).m10511unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10502equalsimpl0(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    /* JADX INFO: renamed from: exceptionOrNull-impl, reason: not valid java name */
    public static final Throwable m10503exceptionOrNullimpl(Object obj) {
        Closed closed = obj instanceof Closed ? (Closed) obj : null;
        if (closed != null) {
            return closed.cause;
        }
        return null;
    }

    public static /* synthetic */ void getHolder$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getOrNull-impl, reason: not valid java name */
    public static final T m10504getOrNullimpl(Object obj) {
        if (obj instanceof Failed) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getOrThrow-impl, reason: not valid java name */
    public static final T m10505getOrThrowimpl(Object obj) throws Throwable {
        if (!(obj instanceof Failed)) {
            return obj;
        }
        if (obj instanceof Closed) {
            Closed closed = (Closed) obj;
            if (closed.cause != null) {
                throw closed.cause;
            }
        }
        throw new IllegalStateException(("Trying to call 'getOrThrow' on a failed channel result: " + obj).toString());
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m10506hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: isClosed-impl, reason: not valid java name */
    public static final boolean m10507isClosedimpl(Object obj) {
        return obj instanceof Closed;
    }

    /* JADX INFO: renamed from: isFailure-impl, reason: not valid java name */
    public static final boolean m10508isFailureimpl(Object obj) {
        return obj instanceof Failed;
    }

    /* JADX INFO: renamed from: isSuccess-impl, reason: not valid java name */
    public static final boolean m10509isSuccessimpl(Object obj) {
        return !(obj instanceof Failed);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m10510toStringimpl(Object obj) {
        return obj instanceof Closed ? ((Closed) obj).toString() : "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m10501equalsimpl(this.holder, obj);
    }

    public int hashCode() {
        return m10506hashCodeimpl(this.holder);
    }

    public String toString() {
        return m10510toStringimpl(this.holder);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m10511unboximpl() {
        return this.holder;
    }
}
