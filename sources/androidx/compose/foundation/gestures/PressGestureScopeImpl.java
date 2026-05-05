package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
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
/* JADX INFO: compiled from: TapGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\\\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\r'4\u0012}\nnjG9LeN.ZS@\u000fsڔ<$i$yCAY\"}0\u000fWN}gvJ`\u000bK\u000f\u001c\u0016\u0001j2P]xs\u0012\u00172XoG3SsE9vt>\u000562*8\u007f\u000b\u0007ɝ@Ϻ@v)B{\f@0\u0001{JV\u001bN\u001d\u001a@\u0006̧$\u0001,^0ZDU\u0005]h=iɜ(ŌR'm?EQ\u001bVl';\u0005*\"9QO5C3\u001c\u000f\u0015ds?1M8ܼCص+'9X<cDk\u0018\u0014C4\u0016լ\u001cę*\\\u0013`)!5?gcye6(&\u0011Bȶ;ɂ\rͺόL031t VH\u0003\u0007k@~\u0017\u0007B.\u0014(ؿ\u0016Ք~đڢ=\u001dlkoVacE\u0018\u001d\rL9)nOt\u001b\u05ed_۶\u001aƘɐU3W]Kf\u0017\"gY\u0006\u0004\u001fx**23\u000eġ.ʾ\u0010-ш$ڛ٦=%'\u000b\u0010h\r\u007f\u0005!xh\u0002\u007fzHn75ރ6Ӡ\b\u000b˧CߟʰoRZw:2\u00161b)\u0016\bAC\u0005wjEkŃMұgȉҷQ_\u0010J=\r\u007fn|\u0013&Wga[5\u007fyVиQБ\u0013̳םf\u0007^\u000fPsTojO:2vm8w*]\u0015ܔ\u0012֮>ڤʬ8.7Bj3\u0011\u000e,lY|7\u000b\u0003h>+\u001bմ#K~2\"!\u0001~\u0001\u0019o\u0016\u001c\u0010ث{̙!ΊۮU7\u001fTcH1I\u000bR\u001f~\"\u0019ogz]\u0013̖\u0015çTݨ°\u001a\u001c?\u0002=n['\rXJ\u0002[^tr\u0014T\u0014ɔ&ю{xԱ:Ü\u05cek\np#:\u00123b]\u0004/\"%w\u001b#6yFװ`ĸyFуSެИBKx5go\u001fJ\u000b\u00067\u001eS\u0004&6Sޞ0ϡ+!.y\u001a3#f.{}4\u0012b=)+yZВf݁sfi_8BFN*\u000bL*<l1K\u001f۶\u0004ڇF\t<ؿ\u0004TOn\tVfVaɃ\n֨\u000b,\u0015ߞ'gH\u001e\b}b:6͋uʸ\u0002\u0014fƹќ\u0011V[jsߐg\u000b\nR\u000f\u0010*ֳ5#"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w8P;yB\u007f\u0015vpI\u0014c\u001aL\u00012G0V7c(", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w8P;yB\u007f\u0015vpI\u0014c\u001aL\u00012G\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "2d]@\\;R", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001bv.C]\r4\r1\u0007", "", "5dc\u0011X5LW(\u0013", "u(5", "4n]AF*:Z\u0019", "5dc\u0013b5MA\u0017z\u0002^", "7r2.a*>Z\u0019}", "", "7rA2_,:a\u0019}", ";tc2k", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0015 \u0015\u0011W\u001eKv8\u000b", "/vP6g\u0019>Z\u0019z\t^", "", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "1`]0X3", "@d[2T:>", "@db2g", "Bqh\u000ej(Bb\u0006~\u0002^(\u000b\t", "@nd;W\u001bH>,", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "@nd;W\u001bH>,FE/~G\u000e)4", "uE\u0018\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/\r", "@nd;W\u001bH>,FBKxo\u0003\u007fo", "uI\u0018\u0016", "Bn3=", "Bn3= \u000e:<d]n:", "uI\u0018\u0013", "Bn3= <\u000bc#ljF", "uE\u0018\u0013", "uH\u0018\u0013", "Bn3=F0SS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGd)JYS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "Bn3=F0SS`\u0005Bk-my\u0017", "uI\u0018\u0017", "Bn?E", "Bn?E v\u000f&c\u0004t-", "Bn?E s+ \fxKh", "BnA2V;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGc%3hS", "BnB6m,", "BnB6m,\u0006F\u001fzlG\u001bh", "BnB=", "BnB= vQ;\tNyh", "uE\u0018\u0017", "BnB= 2)he`\u000f-", "uH\u0018\u0017", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PressGestureScopeImpl implements PressGestureScope, Density {
    public static final int $stable = 0;
    private final /* synthetic */ Density $$delegate_0;
    private boolean isCanceled;
    private boolean isReleased;
    private final Mutex mutex = MutexKt.Mutex(false);

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1, reason: invalid class name */
    /* JADX INFO: compiled from: TapGestureDetector.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUx\u001c\u0010\u001f t\u0014#%'%\u0019\b\u0019&(\u001e\u0003(,)", f = "!-;\u0011.;;;7)\u0007'5%\"2,.h%-", i = {}, l = {363}, m = "0G2;G&:B<9L?", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return PressGestureScopeImpl.this.awaitRelease(this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TapGestureDetector.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUx\u001c\u0010\u001f t\u0014#%'%\u0019\b\u0019&(\u001e\u0003(,)", f = "!-;\u0011.;;;7)\u0007'5%\"2,.h%-", i = {0}, l = {357}, m = "A5D7G", n = {"c^kY"}, s = {"xQ^"})
    static final class C04591 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C04591(Continuation<? super C04591> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PressGestureScopeImpl.this.reset(this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TapGestureDetector.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUx\u001c\u0010\u001f t\u0014#%'%\u0019\b\u0019&(\u001e\u0003(,)", f = "!-;\u0011.;;;7)\u0007'5%\"2,.h%-", i = {0}, l = {370}, m = "CBJ\u0013J5>J)=E?<OB", n = {"c^kY"}, s = {"xQ^"})
    static final class C04601 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C04601(Continuation<? super C04601> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return PressGestureScopeImpl.this.tryAwaitRelease(this);
        }
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    public int mo703roundToPxR2X_6o(long j2) {
        return this.$$delegate_0.mo703roundToPxR2X_6o(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    public int mo704roundToPx0680j_4(float f2) {
        return this.$$delegate_0.mo704roundToPx0680j_4(f2);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public float mo705toDpGaN1DYA(long j2) {
        return this.$$delegate_0.mo705toDpGaN1DYA(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public float mo706toDpu2uoSUM(float f2) {
        return this.$$delegate_0.mo706toDpu2uoSUM(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public float mo707toDpu2uoSUM(int i2) {
        return this.$$delegate_0.mo707toDpu2uoSUM(i2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    public long mo708toDpSizekrfVVM(long j2) {
        return this.$$delegate_0.mo708toDpSizekrfVVM(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx--R2X_6o */
    public float mo709toPxR2X_6o(long j2) {
        return this.$$delegate_0.mo709toPxR2X_6o(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx-0680j_4 */
    public float mo710toPx0680j_4(float f2) {
        return this.$$delegate_0.mo710toPx0680j_4(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    public Rect toRect(DpRect dpRect) {
        return this.$$delegate_0.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    public long mo711toSizeXkaWNTQ(long j2) {
        return this.$$delegate_0.mo711toSizeXkaWNTQ(j2);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public long mo712toSp0xMU5do(float f2) {
        return this.$$delegate_0.mo712toSp0xMU5do(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public long mo713toSpkPz2Gy4(float f2) {
        return this.$$delegate_0.mo713toSpkPz2Gy4(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public long mo714toSpkPz2Gy4(int i2) {
        return this.$$delegate_0.mo714toSpkPz2Gy4(i2);
    }

    public PressGestureScopeImpl(Density density) {
        this.$$delegate_0 = density;
    }

    public final void cancel() {
        this.isCanceled = true;
        Mutex.DefaultImpls.unlock$default(this.mutex, null, 1, null);
    }

    public final void release() {
        this.isReleased = true;
        Mutex.DefaultImpls.unlock$default(this.mutex, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object reset(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl.C04591
            if (r0 == 0) goto L42
            r5 = r7
            androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1 r5 = (androidx.compose.foundation.gestures.PressGestureScopeImpl.C04591) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L42
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L13:
            java.lang.Object r4 = r5.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r2 = 1
            if (r0 == 0) goto L2f
            if (r0 != r2) goto L48
            java.lang.Object r1 = r5.L$0
            androidx.compose.foundation.gestures.PressGestureScopeImpl r1 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r1
            kotlin.ResultKt.throwOnFailure(r4)
        L27:
            r0 = 0
            r1.isReleased = r0
            r1.isCanceled = r0
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L2f:
            kotlin.ResultKt.throwOnFailure(r4)
            kotlinx.coroutines.sync.Mutex r1 = r6.mutex
            r5.L$0 = r6
            r5.label = r2
            r0 = 0
            java.lang.Object r0 = kotlinx.coroutines.sync.Mutex.DefaultImpls.lock$default(r1, r0, r5, r2, r0)
            if (r0 != r3) goto L40
            return r3
        L40:
            r1 = r6
            goto L27
        L42:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1 r5 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1
            r5.<init>(r7)
            goto L13
        L48:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.reset(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object awaitRelease(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl.AnonymousClass1
            if (r0 == 0) goto L3d
            r4 = r6
            androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1 r4 = (androidx.compose.foundation.gestures.PressGestureScopeImpl.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L3d
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L16:
            java.lang.Object r3 = r4.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L31
            if (r1 != r0) goto L4b
            kotlin.ResultKt.throwOnFailure(r3)
        L26:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r0 = r3.booleanValue()
            if (r0 == 0) goto L43
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L31:
            kotlin.ResultKt.throwOnFailure(r3)
            r4.label = r0
            java.lang.Object r3 = r5.tryAwaitRelease(r4)
            if (r3 != r2) goto L26
            return r2
        L3d:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1 r4 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1
            r4.<init>(r6)
            goto L16
        L43:
            androidx.compose.foundation.gestures.GestureCancellationException r1 = new androidx.compose.foundation.gestures.GestureCancellationException
            java.lang.String r0 = "The press gesture was canceled."
            r1.<init>(r0)
            throw r1
        L4b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.awaitRelease(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object tryAwaitRelease(kotlin.coroutines.Continuation<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl.C04601
            if (r0 == 0) goto L56
            r5 = r7
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r5 = (androidx.compose.foundation.gestures.PressGestureScopeImpl.C04601) r5
            int r0 = r5.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L56
            int r0 = r5.label
            int r0 = r0 - r2
            r5.label = r0
        L19:
            java.lang.Object r4 = r5.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L3a
            if (r0 != r2) goto L5c
            java.lang.Object r1 = r5.L$0
            androidx.compose.foundation.gestures.PressGestureScopeImpl r1 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r1
            kotlin.ResultKt.throwOnFailure(r4)
        L2e:
            kotlinx.coroutines.sync.Mutex r0 = r1.mutex
            kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(r0, r3, r2, r3)
        L33:
            boolean r0 = r1.isReleased
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            return r0
        L3a:
            kotlin.ResultKt.throwOnFailure(r4)
            boolean r0 = r6.isReleased
            if (r0 != 0) goto L54
            boolean r0 = r6.isCanceled
            if (r0 != 0) goto L54
            kotlinx.coroutines.sync.Mutex r0 = r6.mutex
            r5.L$0 = r6
            r5.label = r2
            java.lang.Object r0 = kotlinx.coroutines.sync.Mutex.DefaultImpls.lock$default(r0, r3, r5, r2, r3)
            if (r0 != r1) goto L52
            return r1
        L52:
            r1 = r6
            goto L2e
        L54:
            r1 = r6
            goto L33
        L56:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r5 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1
            r5.<init>(r7)
            goto L19
        L5c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.tryAwaitRelease(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
