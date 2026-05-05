package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146B\u0005#4\u0012\u0006\u0007nj?0Le^.ZS@\u000fsڔ:Yqҕ\"CiTR})\u0011\u0010SmiĔNZ\u0019CW\f$}\u0003,w[?\u0002b\u001f@C\b?aOFް;žx:\u001d\"8%F}ڑ\u007f\u001a3RǞz\u0006"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-psl@\u001bP,\\\u0007.V\"", "", "u(E", "AtR0X,=S\u0018", "", "5dc h*<S\u0019}z]", "u(I", "1gT0^", "", "\u0014`X9h9>", "!tR0X:L", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-psl@\u001bP,\\\u0007.V\u000b/(`Y\u0003J\u0014g", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-psl@\u001bP,\\\u0007.V\u000b<<ZPrK\"g", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class SnapshotApplyResult {
    public static final int $stable = 0;

    public /* synthetic */ SnapshotApplyResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void check();

    public abstract boolean getSucceeded();

    private SnapshotApplyResult() {
    }

    /* JADX INFO: compiled from: Snapshot.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00146B\u0005#4\u0012\u0006\u0007nʑ?ԌD{߉^R\u0002)Op\u00024ż_$\u007fC\u0004[(\u0003:\t}T.{?\\h\f[\u000f4\u0018/?\u0003ֆWޯa\u0016'4HrM7ޢsD"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-psl@\u001bP,\\\u0007.V\u000b<<ZPrK\"g", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-psl@\u001bP,\\\u0007.V\"", "u(E", "AtR0X,=S\u0018", "", "5dc h*<S\u0019}z]", "u(I", "1gT0^", "", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Success extends SnapshotApplyResult {
        public static final int $stable = 0;
        public static final Success INSTANCE = new Success();

        @Override // androidx.compose.runtime.snapshots.SnapshotApplyResult
        public void check() {
        }

        @Override // androidx.compose.runtime.snapshots.SnapshotApplyResult
        public boolean getSucceeded() {
            return true;
        }

        private Success() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: Snapshot.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4D\u0007\":\u001b\u007f\u0007lkA0ReP\u008cXX@ş\u001c{b#\u001c/\u0002GIU2}P\nҊRgup\u0013`\u0019L'\u0006D\u00031@\u001ad\u0007]*\u000f`CņC9UڎU;fwD\tpD0=\u0012\u0005/ `\u001dfͣ|ŲO\u0010*2FwHZұQ\u0010"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-psl@\u001bP,\\\u0007.V\u000b/(`Y\u0003J\u0014g", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-psl@\u001bP,\\\u0007.V\"", "AmP=f/Hb", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-j", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoWJ\u007f!@g\u0001*F{_\u001cV?Fy7($>%*", "5dc a(Ia\u001c\t\n", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005.1d\f#A|$w;L7vB!\u001fw7", "AtR0X,=S\u0018", "", "5dc h*<S\u0019}z]", "u(I", "1gT0^", "", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Failure extends SnapshotApplyResult {
        public static final int $stable = 8;
        private final Snapshot snapshot;

        @Override // androidx.compose.runtime.snapshots.SnapshotApplyResult
        public boolean getSucceeded() {
            return false;
        }

        public Failure(Snapshot snapshot) {
            super(null);
            this.snapshot = snapshot;
        }

        public final Snapshot getSnapshot() {
            return this.snapshot;
        }

        @Override // androidx.compose.runtime.snapshots.SnapshotApplyResult
        public void check() throws SnapshotApplyConflictException {
            this.snapshot.dispose();
            throw new SnapshotApplyConflictException(this.snapshot);
        }
    }
}
