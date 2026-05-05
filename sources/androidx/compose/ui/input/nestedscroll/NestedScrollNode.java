package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: NestedScrollNode.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nj?4Le^.ZS0\u0016s{Břc$wDCU(}*\tUNog\u0005Jb\u000bI\u0012\u000e\u0016\u000fj4կ]xs\u0012\u00172H|E\u074ccڎm9\u000fsf\u0005N2R8(\u0006A/:L\u001ex\u0013Cy\f\"6NsRT#L3\u001eŪ\n>.\u0006fbufNH\u001bv\u0001Ck\tw\\f'\u000eICaUgbB%v\u0010:[DER-%\u0002\u001f7Vi]\u001b? YKةe߉*ɞָ[8^\u001f\"5sw\u001b~\u000b&\u000b'\u0002d\u001aDCO\u0012m\u0001\u00126\u0016\u0013{;^4\u0012\u0014J`.[>-\u001cս2οɤWBV'lhH\u0014o]/%.O[=)\u0005iai5\u0015Ѱ:͕\f̔ţ\u0005p'\u0004b7)5)~\u0010Q_spAVl\"Yk\u00104tp%B\u0004^kFCʾ\u0010фϲ)9ad1M4\bVq\u007fv3y/S2bVn:nDPZ\u000f\u001a\n\\f\u001bj~X\u001f,YS*\u0005\u001f}6,f\\@Y/V(N}\u0002\u001an[_\"%]fg_|n&YO]a9\u0018үߧeR|F\u0010Tp\u0007pfpSbȞh͈&>PК(y\u0002J\\\u001334Ey*=|C'f-H1)x\u0002SȄa˖l\u0014\u0017V90\u0011vt\t\u0017\u000fh^\u0007n\u0016x\u007flSʣ$έEUM\u001b,d0o\u0005\u00111\u0017\u0017u\u0016F\u0016ն}\u000bCֶwʀ\u007f$.\u001c?b=Oc\u001b\r<J\u0002[I#Ǭq˛Q\u0012/ϕM\f\u001dO\u0001.\u0016\u001dA҈n߯nPWܷ/$|t\u0001:Ϋd\u0005\u0002dLۋc\u0012Sߕ_q"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WEv3DY|.5z 5T\r$kB-\u0015gO7\u0014m3U_1FL$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9|Ir65f\f\u001c4t\u0016\u0017WB;A", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WEv3DY|.5z 5T\r$kB-\u0015gO7\u0014m3UT1PUN*kV|Fi", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "1n];X*MW#\b", "2hb=T;<V\u0019\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WEv3DY|.5z 5T\r$kB-\u0015gO7\u0014m3UU+UWJ;ZUrJi", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u007f%Ch}\u001fEk#8TJ\u0005T4,$h`'\u0005p6U}\u0005QUW,ZavG\u001dgA\nW*\u001a\u000f]@78BA'\u00136W\u0002\u0005x\u0005U\u001a\u0017@z\u007f\f_\u0010U\t\u0015tO'uP`fC0ASq*cy]*fAA\u0003\u0018\u007f$\u0017wN1\n\t)Tc", "5dc\u0010b5GS\u0017\u000e~h5", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001bPz\u001eK@.5g\r 6{\u0014;WJB5\u001d\u001e#wa8ta9X}.%VW5\\P\u0002A\u001e\u001b0", "Adc\u0010b5GS\u0017\u000e~h5", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u007f%Ch}\u001fEk#8TJ\u0005T4,$h`'\u0005p6U}\u0005QUW,ZavG\u001dg\u001e~", "<dbAX+\u001c]&\t\u000bm0\u0006\t\u001dc\n3{", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "5dc\u001bX:MS\u0018\\\u0005k6\r\u00183n\u007f\u0016yJ\f\u0017", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJt!Ty\u001eKz.5G{*Bmk", ">`a2a;\u001c]\"\bz\\;\u0001\u00138", "5dc\u001dT9>\\(\\\u0005g5|\u0007>i\n1", ">`a2a;'S'\u000ez]\u001az\u00169l\u0007\u0011\u0006?\u0001", "5dc\u001dT9>\\(gzl;|\b\u001dc\r2\u0003Gi!\u0016G.\u001e@p25`}\u001cEm", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001bPz\u001eK@.5g\r 6{\u0014;WJB5\u001d\u001e#wa8ta9X}.0VM,2", "@db<_=>Rw\u0003\ti(\f\u00072e\r", "BqPCX9LS~~\u000f", "", "5dc!e(OS&\rzD,\u0011", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "=m0Ag(<V", "", "=m32g(<V", "=m?<f;\u001fZ\u001d\b|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9~<}/3]\r4\r", "1n]@h4>R", "/uP6_(;Z\u0019", "=m?<f;\u001fZ\u001d\b|&\u0019qU3Ap\u001c", "uI9\u0019^6MZ\u001d\bD\\6\n\u0013?t\u00041{NJt!P~\u0012E\u0007!D]\b)\r1|3IT75;\u001a\u001ej+#\u0004h,L\u0006|", "=m?<f;,Q&\t\u0002e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "And?V,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WEv3DY|.5z 5T\r$kB-\u0015gO7\u0014m3Ud1WYL,2", "=m?<f;,Q&\t\u0002es[\u001e\u0019Qsrc", "uI9\u0016\u001c\u0011", "=m??X\rEW\"\u0001", "=m??X\rEW\"\u0001BJ\u001e\u0007\u0011zM\n", "uI;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^! Vs\u0017Lr49c\u0007uzT\u001b*^?\u0005r0'\u00172K6\fc*]L", "=m??X\u001a<`#\u0006\u0002", "=m??X\u001a<`#\u0006\u0002&\u0016\u0012gza].", "uI8u=", "@db2g\u000bBa$z\n\\/|\u0016\u0010i\u007f/zN", "CoS.g,\u001dW'\nvm*\u007f\t<", "<df\u0011\\:IO(|}^9", "CoS.g,\u001dW'\nvm*\u007f\t<F\u0004(\u0003?\u000f", "CoS.g,']\u0018~", "CoS.g,']\u0018~9n0v\u0016/l\u007f$\n@", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class NestedScrollNode extends Modifier.Node implements TraversableNode, NestedScrollConnection {
    public static final int $stable = 8;
    private NestedScrollConnection connection;
    private NestedScrollDispatcher resolvedDispatcher;
    private final Object traverseKey;

    public final NestedScrollConnection getConnection() {
        return this.connection;
    }

    public final void setConnection(NestedScrollConnection nestedScrollConnection) {
        this.connection = nestedScrollConnection;
    }

    public NestedScrollNode(NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        this.connection = nestedScrollConnection;
        this.resolvedDispatcher = nestedScrollDispatcher == null ? new NestedScrollDispatcher() : nestedScrollDispatcher;
        this.traverseKey = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    public final NestedScrollNode getParentNestedScrollNode$ui_release() {
        if (isAttached()) {
            return (NestedScrollNode) TraversableNodeKt.findNearestAncestor(this);
        }
        return null;
    }

    private final NestedScrollConnection getParentConnection() {
        if (isAttached()) {
            return getParentNestedScrollNode$ui_release();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    public final CoroutineScope getNestedCoroutineScope() {
        CoroutineScope scope$ui_release;
        NestedScrollNode parentNestedScrollNode$ui_release = getParentNestedScrollNode$ui_release();
        if ((parentNestedScrollNode$ui_release == null || (scope$ui_release = parentNestedScrollNode$ui_release.getNestedCoroutineScope()) == null) && (scope$ui_release = this.resolvedDispatcher.getScope$ui_release()) == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        return scope$ui_release;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public long mo1094onPreScrollOzD1aCk(long j2, int i2) {
        NestedScrollConnection parentConnection = getParentConnection();
        long jMo1094onPreScrollOzD1aCk = parentConnection != null ? parentConnection.mo1094onPreScrollOzD1aCk(j2, i2) : Offset.Companion.m3953getZeroF1C5BW0();
        return Offset.m3942plusMKHz9U(jMo1094onPreScrollOzD1aCk, this.connection.mo1094onPreScrollOzD1aCk(Offset.m3941minusMKHz9U(j2, jMo1094onPreScrollOzD1aCk), i2));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public long mo820onPostScrollDzOQY0M(long j2, long j3, int i2) {
        long jM3953getZeroF1C5BW0;
        long jMo820onPostScrollDzOQY0M = this.connection.mo820onPostScrollDzOQY0M(j2, j3, i2);
        NestedScrollConnection parentConnection = getParentConnection();
        if (parentConnection != null) {
            jM3953getZeroF1C5BW0 = parentConnection.mo820onPostScrollDzOQY0M(Offset.m3942plusMKHz9U(j2, jMo820onPostScrollDzOQY0M), Offset.m3941minusMKHz9U(j3, jMo820onPostScrollDzOQY0M), i2);
        } else {
            jM3953getZeroF1C5BW0 = Offset.Companion.m3953getZeroF1C5BW0();
        }
        return Offset.m3942plusMKHz9U(jMo820onPostScrollDzOQY0M, jM3953getZeroF1C5BW0);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007a  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo1093onPreFlingQWom1Mo(long r10, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1
            if (r0 == 0) goto L7a
            r7 = r12
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1 r7 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1) r7
            int r0 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L7a
            int r0 = r7.label
            int r0 = r0 - r1
            r7.label = r0
        L13:
            java.lang.Object r4 = r7.result
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r7.label
            r6 = 2
            r1 = 1
            if (r0 == 0) goto L37
            if (r0 == r1) goto L57
            if (r0 != r6) goto L80
            long r2 = r7.J$0
            kotlin.ResultKt.throwOnFailure(r4)
        L28:
            androidx.compose.ui.unit.Velocity r4 = (androidx.compose.ui.unit.Velocity) r4
            long r0 = r4.m6884unboximpl()
            long r0 = androidx.compose.ui.unit.Velocity.m6879plusAH228Gc(r2, r0)
            androidx.compose.ui.unit.Velocity r0 = androidx.compose.ui.unit.Velocity.m6866boximpl(r0)
            return r0
        L37:
            kotlin.ResultKt.throwOnFailure(r4)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r0 = r9.getParentConnection()
            if (r0 == 0) goto L4f
            r7.L$0 = r9
            r7.J$0 = r10
            r7.label = r1
            java.lang.Object r4 = r0.mo1093onPreFlingQWom1Mo(r10, r7)
            if (r4 != r8) goto L4d
            return r8
        L4d:
            r0 = r9
            goto L60
        L4f:
            androidx.compose.ui.unit.Velocity$Companion r0 = androidx.compose.ui.unit.Velocity.Companion
            long r2 = r0.m6886getZero9UxMQ8M()
            r0 = r9
            goto L66
        L57:
            long r10 = r7.J$0
            java.lang.Object r0 = r7.L$0
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r0
            kotlin.ResultKt.throwOnFailure(r4)
        L60:
            androidx.compose.ui.unit.Velocity r4 = (androidx.compose.ui.unit.Velocity) r4
            long r2 = r4.m6884unboximpl()
        L66:
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r1 = r0.connection
            long r4 = androidx.compose.ui.unit.Velocity.m6878minusAH228Gc(r10, r2)
            r0 = 0
            r7.L$0 = r0
            r7.J$0 = r2
            r7.label = r6
            java.lang.Object r4 = r1.mo1093onPreFlingQWom1Mo(r4, r7)
            if (r4 != r8) goto L28
            return r8
        L7a:
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1 r7 = new androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1
            r7.<init>(r9, r12)
            goto L13
        L80:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.mo1093onPreFlingQWom1Mo(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x008f  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo819onPostFlingRZ2iAVY(long r17, long r19, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> r21) {
        /*
            r16 = this;
            r2 = r17
            r4 = r19
            r8 = r16
            r9 = r8
            r7 = r21
            boolean r0 = r7 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1
            if (r0 == 0) goto L8f
            r15 = r7
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1 r15 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1) r15
            int r6 = r15.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r6 + r1
            r6 = r6 | r1
            int r0 = r0 - r6
            if (r0 == 0) goto L8f
            int r0 = r15.label
            int r0 = r0 - r1
            r15.label = r0
        L1f:
            java.lang.Object r8 = r15.result
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r15.label
            r6 = 2
            r0 = 1
            if (r1 == 0) goto L43
            if (r1 == r0) goto L5a
            if (r1 != r6) goto L95
            long r0 = r15.J$0
            kotlin.ResultKt.throwOnFailure(r8)
        L34:
            androidx.compose.ui.unit.Velocity r8 = (androidx.compose.ui.unit.Velocity) r8
            long r2 = r8.m6884unboximpl()
        L3a:
            long r0 = androidx.compose.ui.unit.Velocity.m6879plusAH228Gc(r0, r2)
            androidx.compose.ui.unit.Velocity r0 = androidx.compose.ui.unit.Velocity.m6866boximpl(r0)
            return r0
        L43:
            kotlin.ResultKt.throwOnFailure(r8)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r10 = r9.connection
            r15.L$0 = r9
            r15.J$0 = r2
            r15.J$1 = r4
            r15.label = r0
            r11 = r2
            r13 = r4
            java.lang.Object r8 = r10.mo819onPostFlingRZ2iAVY(r11, r13, r15)
            if (r8 != r7) goto L59
            return r7
        L59:
            goto L65
        L5a:
            long r4 = r15.J$1
            long r2 = r15.J$0
            java.lang.Object r9 = r15.L$0
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r9 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r9
            kotlin.ResultKt.throwOnFailure(r8)
        L65:
            androidx.compose.ui.unit.Velocity r8 = (androidx.compose.ui.unit.Velocity) r8
            long r0 = r8.m6884unboximpl()
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r10 = r9.getParentConnection()
            if (r10 == 0) goto L88
            long r11 = androidx.compose.ui.unit.Velocity.m6879plusAH228Gc(r2, r0)
            long r13 = androidx.compose.ui.unit.Velocity.m6878minusAH228Gc(r4, r0)
            r2 = 0
            r15.L$0 = r2
            r15.J$0 = r0
            r15.label = r6
            java.lang.Object r8 = r10.mo819onPostFlingRZ2iAVY(r11, r13, r15)
            if (r8 != r7) goto L87
            return r7
        L87:
            goto L34
        L88:
            androidx.compose.ui.unit.Velocity$Companion r2 = androidx.compose.ui.unit.Velocity.Companion
            long r2 = r2.m6886getZero9UxMQ8M()
            goto L3a
        L8f:
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1 r15 = new androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1
            r15.<init>(r8, r7)
            goto L1f
        L95:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.mo819onPostFlingRZ2iAVY(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void updateDispatcher(NestedScrollDispatcher nestedScrollDispatcher) {
        resetDispatcherFields();
        if (nestedScrollDispatcher == null) {
            this.resolvedDispatcher = new NestedScrollDispatcher();
        } else if (!Intrinsics.areEqual(nestedScrollDispatcher, this.resolvedDispatcher)) {
            this.resolvedDispatcher = nestedScrollDispatcher;
        }
        if (isAttached()) {
            updateDispatcherFields();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateDispatcherFields();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        resetDispatcherFields();
    }

    /* JADX INFO: renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollNode$updateDispatcherFields$1 */
    /* JADX INFO: compiled from: NestedScrollNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!4i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function0<CoroutineScope> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CoroutineScope invoke() {
            return NestedScrollNode.this.getNestedCoroutineScope();
        }
    }

    private final void updateDispatcherFields() {
        this.resolvedDispatcher.setNestedScrollNode$ui_release(this);
        this.resolvedDispatcher.setCalculateNestedScrollScope$ui_release(new Function0<CoroutineScope>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollNode.updateDispatcherFields.1
            AnonymousClass1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CoroutineScope invoke() {
                return NestedScrollNode.this.getNestedCoroutineScope();
            }
        });
        this.resolvedDispatcher.setScope$ui_release(getCoroutineScope());
    }

    private final void resetDispatcherFields() {
        if (this.resolvedDispatcher.getNestedScrollNode$ui_release() == this) {
            this.resolvedDispatcher.setNestedScrollNode$ui_release(null);
        }
    }

    public final void updateNode$ui_release(NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        this.connection = nestedScrollConnection;
        updateDispatcher(nestedScrollDispatcher);
    }
}
