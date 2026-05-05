package androidx.compose.runtime;

import androidx.collection.ObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: DerivedState.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&˛\bDZc|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JeP.hS2\u000fq\u0002<$q$yّCU0}*\tUTog\u0005Jb\u000bI\u000f\u000e\u0016\u0007s4կ]xk\u001e\u0017˰JoM3UoC:ftLӌH4(\u0600\b\u00041\u001aXH@|\u000bE[\fX/nqrQ2\u000e&*\u001c\u0014@8\u0007.^wNlԟ\u001b`J;1\u0007\u0002J^)o03ձ#E\u0003,˼za,1\tCC/=S1\u001a\u0003_M\u001eWqk!1_52ayg8h\u007fJƃY`=g\u0001Ct\u000bab\u001c'aՒ\u0012\\\u0001\u00126\u0013\u0013{;X4\u0012\u0014E`.[9\u0017\u0012\u001c5\rxcB`\u0002\u0015ۍ.}(6_+\u000eSC9I\b\u0018a\u0004'\\Y\u0014\u0005;AS\u0005|9sT<s[/\u001d}_Ui@ki\u0015\u001e*O{\u0006\th\u0012,\u00140}ĉ]~gч\u0019É;[A\u05faq\u0004\u0010O\\m\u0007\u0007ph\n֟\u0001PvvEނ9Ҋ\r\u0010rFj\u000eyZ%o:\u001ce\u001ej\u00064ܱIeϢ{F1'\u0016Z]u\u0002lSk\u00184\u007fxEi\u0007q\u001eYI^i̐\u007ftfУ^λ\u0018?DϵUjtTk\f\to^v\tʢlݻ{\u007f\\P\u0012'@TB6B0I!l\u0017X\u0003TՓW{7d1ӧ\u0012њX9,Ѱ\u0002&z\u001f\u000fg-\u0003}\u007f\u0011Ibʉ\u0017v\u0004ۢSڤ\u001d*m$nM\u000b2Ƚ\u0003\u001a"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9l<\u0004)FY|\u000e@i!<PMJYC\u001a$h7", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u0004=IR;U1#\u0015fp\u001d\u000fn3$", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9l<\u0004)FY|\u000eFi%.#", "1`[0h3:b\u001d\t\u0004", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", ">n[6V@", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Er0C\\\b/\u001f}%*\\GEt\u001f(\u001cl_M\\", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu[\u00070VPV,&@{9\u001f ]\u0018]\u0013\u001d\u0014UP(xM\")\u000f0G\u0016\u0011,q", "1ta?X5M@\u0019|\u0005k+", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9l<\u0004)FY|\u000eFi%.\f0;i>+\u0014>", "5dc\u0010h9KS\"\u000eg^*\u0007\u0016.", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006U%B]\u000f 6[%*\\CyX4\u001c\u001fu`\u000f", "2dQBZ.>`w\u0003\ti3x\u001d a\u00078{", "5dc\u0011X)NU\u001b~\b=0\u000b\u00146a\u0014\u0019wG\u0011\u0017UCx\u0017F\u0006!D]\b)E", "u(E", "5dc\u0011X)NU\u001b~\b=0\u000b\u00146a\u0014\u0019wG\u0011\u0017", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "4ha@g", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9l<\u0004)FY|\u000e@i!<PMJYC\u001a$h &\u0007q<U\u0006\u0014GJX9[(", "4ha@g\u001aMO(~g^*\u0007\u0016.", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u0004=IR;X4\u001c\u001fu`\u000f", "5dc\u0013\\9Lb\u0007\u000evm,i\t-o\r'", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005.1d\f#A|$w;R7z4\u000b\u0015fkF\u00069", "5dc\u001db3BQ-", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006d.1d\f#A|}>\\?Jo>'\u007frh=\u0005w\u0002", "D`[BX", "5dc#T3NS", "1ta?X5M", "AmP=f/Hb", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-j", "@dP1T)ES", "4na0X\u000b>^\u0019\by^5z\u001d\u001ce{'\n", "", "2hb=_(RD\u0015\u0006\u000b^", "", ">qT=X5=A(z\n^\u0019|\u00079r~", "", "BnBAe0GU", " dbB_;+S\u0017\t\b]", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class DerivedSnapshotState<T> extends StateObjectImpl implements DerivedState<T> {
    private final Function0<T> calculation;
    private ResultRecord<T> first = new ResultRecord<>();
    private final SnapshotMutationPolicy<T> policy;

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    @Override // androidx.compose.runtime.DerivedState
    public SnapshotMutationPolicy<T> getPolicy() {
        return this.policy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DerivedSnapshotState(Function0<? extends T> function0, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        this.calculation = function0;
        this.policy = snapshotMutationPolicy;
    }

    /* JADX INFO: compiled from: DerivedState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯL\u001d<K!&˛\bDZc|\u0004W\u00068\u000b4E\u0007\"B\u0012\u007f\u0007|jA0JhP.`ݷ2\u000fq}<$i*yCA^\"}0\tWNmhvJh\u0014KƤ\u000e\u0016\u000fj4կ]xs\u0012\u00172HpE8cڎ[b\tv<\u0004.1R8(\u00051 :J vABy\rJ/i1=ň\u0011M\u0013\u001cZ\u0014L>\u0019\u001e\u000b\u0007~:V\ru:]#I}\u000bT5\u0001H|{\r\rho%\u0005\u00046+nZe\u001d3w\u001b\u000bb[E\u0004m\u0017m\tvM?+w\u001b Nf(,\u0015Yb=e\u0001Jt\ta`\u0012(Yt\u0014O^4@w)#]N\u0012\u0011\u001e'~-cn=ڳ\u0010\u07baxvkBV\u0006lGP\u0019o</+\u00105;9In\u007fh\u0012ϡZѼ\u007f\u0011\u0015̔;\u0003t*i^.b\u001b&b\u0004\"K_MUJd\t\bKDՕ|Ċ\u00066\f\u0382_\u00025\u000b\u001f37'=kG4q\u0004\u0010Z\\g%\u00187ì_ׂVTH̎\u0007\u0018=>\u0017!zFj\u001byg%p:)e\u001c\u0003\u001aTܸ\u001fء`\u0004Dƙ=\u0012Thv~\u000bOc$3F7Og\n\u0004\u000e\u0006L5گAɄg\u001ci\u05ec\u000f\u0016EXp\u001axhHp\u001aqڋ,L"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9l<\u0004)FY|\u000e@i!<PMJYC\u001a$h &\u0007q<U\u0006\u0014GJX9[(", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u0004=IR;X4\u001c\u001fu`\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9l<\u0004)FY|\u000eFi%.\f0;i>+\u0014>", "u(E", "1ta?X5MD\u0015\u0006\u000b^", "5dc\u0010h9KS\"\u000ekZ3\r\t", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "2d_2a+>\\\u0017\u0003zl", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nj\u0014\u001cGm\u001d \u007f4\u001dU\tu", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u0004=IR;U1#\u0015fp\u000f", "5dc\u0011X7>\\\u0018~\u0004\\0|\u0017", "u(;.a+K]\u001d}\u000e(*\u0007\u00106e}7\u007fJ\n`\u0001Dt\u000e:\u0006\t>he\u001cBC", "Adc\u0011X7>\\\u0018~\u0004\\0|\u0017", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ\u0001\u0014Lo\fKZ.DAy+\r1\u0007", "@dbB_;", "", "5dc\u001fX:NZ(", "Adc\u001fX:NZ(", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "@dbB_;!O'\u0002", "", "5dc\u001fX:NZ(avl/", "u(8", "Adc\u001fX:NZ(avl/", "uH\u0018#", "D`[6W\u001aGO$\r}h;`\b", "5dc#T3BR\u0007\bvi:\u007f\u0013>I~", "Adc#T3BR\u0007\bvi:\u007f\u0013>I~", "D`[6W\u001aGO$\r}h;n\u00163t\u007f\u0006\u0006P\n&", "5dc#T3BR\u0007\bvi:\u007f\u0013>W\r,\u000b@^!'P~", "Adc#T3BR\u0007\bvi:\u007f\u0013>W\r,\u000b@^!'P~", "/rb6Z5", "", "D`[BX", "1qT.g,", "7rE._0=", "", "2da6i,=A(z\n^", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9l<\u0004)FY|\u000eFi%.#", "AmP=f/Hb", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-j", "@dP1T)ES{z\ta", "\u0011n\\=T5B]\"", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class ResultRecord<T> extends StateRecord implements DerivedState.Record<T> {
        private ObjectIntMap<StateObject> dependencies = ObjectIntMapKt.emptyObjectIntMap();
        private Object result = Unset;
        private int resultHash;
        private int validSnapshotId;
        private int validSnapshotWriteCount;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final Object Unset = new Object();

        /* JADX INFO: compiled from: DerivedState.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\u0007Gّ1!Ǟr~P+R|\rfʴ=0Re\u0019=`TB\u000f\u001azČ(a,ڎ[=[\u001c\f%߄SR"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9l<\u0004)FY|\u000e@i!<PMJYC\u001a$h &\u0007q<U\u0006\u0014GJX9[\u0011PG\u001c\u001dV\u0017R5\u0016Z", "", "u(E", "#mb2g", "5dc\"a:>b", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Object getUnset() {
                return ResultRecord.Unset;
            }
        }

        public final int getValidSnapshotId() {
            return this.validSnapshotId;
        }

        public final void setValidSnapshotId(int i2) {
            this.validSnapshotId = i2;
        }

        public final int getValidSnapshotWriteCount() {
            return this.validSnapshotWriteCount;
        }

        public final void setValidSnapshotWriteCount(int i2) {
            this.validSnapshotWriteCount = i2;
        }

        @Override // androidx.compose.runtime.DerivedState.Record
        public ObjectIntMap<StateObject> getDependencies() {
            return this.dependencies;
        }

        public void setDependencies(ObjectIntMap<StateObject> objectIntMap) {
            this.dependencies = objectIntMap;
        }

        public final Object getResult() {
            return this.result;
        }

        public final void setResult(Object obj) {
            this.result = obj;
        }

        public final int getResultHash() {
            return this.resultHash;
        }

        public final void setResultHash(int i2) {
            this.resultHash = i2;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord stateRecord) {
            Intrinsics.checkNotNull(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            ResultRecord resultRecord = (ResultRecord) stateRecord;
            setDependencies(resultRecord.getDependencies());
            this.result = resultRecord.result;
            this.resultHash = resultRecord.resultHash;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return new ResultRecord();
        }

        @Override // androidx.compose.runtime.DerivedState.Record
        public T getCurrentValue() {
            return (T) this.result;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean isValid(androidx.compose.runtime.DerivedState<?> r7, androidx.compose.runtime.snapshots.Snapshot r8) {
            /*
                r6 = this;
                java.lang.Object r5 = androidx.compose.runtime.snapshots.SnapshotKt.getLock()
                monitor-enter(r5)
                int r1 = r6.validSnapshotId     // Catch: java.lang.Throwable -> L4a
                int r0 = r8.getId()     // Catch: java.lang.Throwable -> L4a
                r4 = 0
                r3 = 1
                if (r1 != r0) goto L17
                int r1 = r6.validSnapshotWriteCount     // Catch: java.lang.Throwable -> L4a
                int r0 = r8.getWriteCount$runtime_release()     // Catch: java.lang.Throwable -> L4a
                if (r1 == r0) goto L34
            L17:
                r2 = r3
            L18:
                monitor-exit(r5)
                java.lang.Object r1 = r6.result
                java.lang.Object r0 = androidx.compose.runtime.DerivedSnapshotState.ResultRecord.Unset
                if (r1 == r0) goto L2a
                if (r2 == 0) goto L29
                int r1 = r6.resultHash
                int r0 = r6.readableHash(r7, r8)
                if (r1 != r0) goto L2a
            L29:
                r4 = r3
            L2a:
                if (r4 == 0) goto L49
                if (r2 == 0) goto L49
                java.lang.Object r1 = androidx.compose.runtime.snapshots.SnapshotKt.getLock()
                monitor-enter(r1)
                goto L36
            L34:
                r2 = r4
                goto L18
            L36:
                int r0 = r8.getId()     // Catch: java.lang.Throwable -> L45
                r6.validSnapshotId = r0     // Catch: java.lang.Throwable -> L45
                int r0 = r8.getWriteCount$runtime_release()     // Catch: java.lang.Throwable -> L45
                r6.validSnapshotWriteCount = r0     // Catch: java.lang.Throwable -> L45
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L45
                goto L48
            L45:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            L48:
                monitor-exit(r1)
            L49:
                return r4
            L4a:
                r0 = move-exception
                monitor-exit(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.DerivedSnapshotState.ResultRecord.isValid(androidx.compose.runtime.DerivedState, androidx.compose.runtime.snapshots.Snapshot):boolean");
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x00b0 A[PHI: r4
  0x00b0: PHI (r4v7 int) = (r4v6 int), (r4v9 int) binds: [B:17:0x0057, B:33:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int readableHash(androidx.compose.runtime.DerivedState<?> r24, androidx.compose.runtime.snapshots.Snapshot r25) {
            /*
                Method dump skipped, instruction units count: 238
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.DerivedSnapshotState.ResultRecord.readableHash(androidx.compose.runtime.DerivedState, androidx.compose.runtime.snapshots.Snapshot):int");
        }
    }

    public final StateRecord current(Snapshot snapshot) {
        return currentRecord((ResultRecord) SnapshotKt.current(this.first, snapshot), snapshot, false, this.calculation);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T> currentRecord(androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T> r26, androidx.compose.runtime.snapshots.Snapshot r27, boolean r28, kotlin.jvm.functions.Function0<? extends T> r29) {
        /*
            Method dump skipped, instruction units count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.DerivedSnapshotState.currentRecord(androidx.compose.runtime.DerivedSnapshotState$ResultRecord, androidx.compose.runtime.snapshots.Snapshot, boolean, kotlin.jvm.functions.Function0):androidx.compose.runtime.DerivedSnapshotState$ResultRecord");
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.first;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord) {
        Intrinsics.checkNotNull(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.first = (ResultRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.State
    public T getValue() {
        Function1<Object, Unit> readObserver = Snapshot.Companion.getCurrent().getReadObserver();
        if (readObserver != null) {
            readObserver.invoke(this);
        }
        Snapshot current = Snapshot.Companion.getCurrent();
        return (T) currentRecord((ResultRecord) SnapshotKt.current(this.first, current), current, true, this.calculation).getResult();
    }

    @Override // androidx.compose.runtime.DerivedState
    public DerivedState.Record<T> getCurrentRecord() {
        Snapshot current = Snapshot.Companion.getCurrent();
        return currentRecord((ResultRecord) SnapshotKt.current(this.first, current), current, false, this.calculation);
    }

    public String toString() {
        return "DerivedState(value=" + displayValue() + ")@" + hashCode();
    }

    public final T getDebuggerDisplayValue() {
        ResultRecord resultRecord = (ResultRecord) SnapshotKt.current(this.first);
        if (resultRecord.isValid(this, Snapshot.Companion.getCurrent())) {
            return (T) resultRecord.getResult();
        }
        return null;
    }

    private final String displayValue() {
        ResultRecord resultRecord = (ResultRecord) SnapshotKt.current(this.first);
        if (resultRecord.isValid(this, Snapshot.Companion.getCurrent())) {
            return String.valueOf(resultRecord.getResult());
        }
        return "<Not calculated>";
    }
}
