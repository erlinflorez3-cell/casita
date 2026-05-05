package com.biocatch.client.android.sdk.core.dialogs;

import android.app.Dialog;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.android.commonsdk.technicalServices.events.EventBusService;
import com.biocatch.client.android.sdk.collection.collectors.elements.DFSViewEnumerator;
import com.biocatch.client.android.sdk.core.exceptions.InvalidOperationException;
import com.biocatch.client.android.sdk.events.DialogFragmentEvent;
import com.biocatch.client.android.sdk.events.IEventHandler;
import com.biocatch.client.android.sdk.events.ViewsDetectedEvent;
import com.biocatch.client.android.sdk.techicalServices.SingleThreadExecutor;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njO0L͜P.hS2şs{J$cҕyCI^\"Ԃ*\t]NogtJb\u000bY\u000f\u000eǝ\u0001j:g]xs\u0012\u00172HsE\u074ccڎm9\u000fsn\u00049r5H}\u0013\u00012*v\u0011\u0007~QM$\u0012^C¤>R\u001bQM  \u0013V /,#g\u0017RV{u:]13mP^?_^\u000e}\u0017Tf?\u0013\u0007c.+nKc(kSK\r`pW\u0003m\u007f\u0004\u00191+5Aas\u0006D!\u0004\",CO;k;,j\u001di`:5qO4Y^\u0013@y\u0011z;BZ\u05fd\u0012όL.5Կ7\u0014\u001c:\rr\u0002H'؟`۰\u0004ziاg1\u000e5C9Ii(Ĩ=ϭR7\u0004˜]*1\u0001\u0007!\nUd֮\u0017ôXwYĸ\"RKQf\u0010i=s\u0005\u0007a04Z΅SĬ3{\u0019фg1EfQ#OwX҉Pϼz\u0005hå\u05eeml"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wLG7r> #2@=\u0003j6PV8GU]:;R\u0002=\u0012!d\u001b$", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "3uT;g\tNa\u0007~\bo0z\t", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\r 5p\u001f2K?BY4+&l_9\u0015-,_v0VZ\u0018\fmR{Lp\"h{N8\u001e\tWAy", "3md:X9:b#\f", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LU,dR{L\"[9n<\u001c\u0011\u0005k!-~L7,\u0004;S\u000f\u0011", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G/7k\u00197QA7r\"\u001e\"ye7\u0007quN\b'P[\\u<crF#nj\u001c<+\u001a\u0016]?$D+5)\u0010uF\u0006Ef|\u001b\u0014\u0011~hwFV\u0019VC\u0011~@6rJX)\bFG\u000f`4k\u0013_\u001bk>D-]o#\"oP,\u0019\u0006`\u001f<R\u0001goG\"\nFm\u001dNI7Iog\u001c}7'K\ts!<eJne", "1ta?X5M4&z|f,\u0006\u0018", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`uKk\u0015Fx\u0006BU\u007f(7v%\u0004", "2hP9b.,S\u0015\fxa\u001a\u0001\u00121l\u007f\u0017~M\u0001\u0013\u0016'\u0003\u000e:\u00074?f", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G/7k\u00192K?BY4+&l_9\u0015-\u001aR\u007f)NL=/iRn<s%Z\f^:\u0017\u0012/", "3uT;g\u000f:\\\u0018\u0006zk", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G Hm\u001f=[\r\u001fKE\u001e\u001ewD5\u0010b3N\u0004|", "7rBAT9MS\u0018", "", "2dc2V;\u001dW\u0015\u0006\u0005`:", "", ">tQ9\\:A2\u001dz\u0002h.m\r/w\u000e", "@n^A", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "@n^A6/BZ\u0018\fzg", "", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "@t]", "AsP?g", "As^=", "BqX4Z,K2\u001dz\u0002h.j\t+r}+", "\u0012hP9b.\u001f`\u0015\u0001\u0003^5\fh@e\t7^<\n\u0016\u001eG|", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class DialogEventsDetector implements Runnable {
    private DialogFragment currentFragment;
    private final SingleThreadExecutor dialogSearchSingleThreadExecutor;
    private final DFSViewEnumerator enumerator;
    private final EventBusService eventBusService;
    private IEventHandler<?> eventHandler;
    private boolean isStarted;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\r\"4\u0012}\u0007lʘ;FǏ\u0016N>Tc*=k*3d^ҸuCIVb\f0\u000bgN\u0016j\u001fNh\u000f[\u000f4\u0016?\u007f\u0082MZ"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wLG7r> #2@=\u0003j6PV8GU]:;R\u0002=\u0012!d\u001b\r\n\u0011\u0001`K&OQ3!\u0010,R\u0011\u001by\u0001\u0015%p1soIV\u001d\u001d", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G Hm\u001f=[\r\u001fKE\u001e\u001ewD5\u0010b3N\u0004|", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G Hm\u001f=[\r\u001ao0%\u001fjBF\u0003e4N\u007f6']N5k(", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w#.\u0017B?g;(\u0017v+\u0018\u000b_3Xx\u0007XLW;j1rL\u0014\u0010i\u0018[\u0001Pu", "6`]1_,", "", "3uT;g", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public final class DialogFragmentEventHandler implements IEventHandler<DialogFragmentEvent> {
        public DialogFragmentEventHandler() {
        }

        @Override // com.biocatch.client.android.sdk.events.IEventHandler
        @Subscribe(threadMode = ThreadMode.POSTING)
        public void handle(DialogFragmentEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            DialogEventsDetector.this.currentFragment = event.getFragment();
            DialogEventsDetector.this.triggerDialogSearch();
        }
    }

    public DialogEventsDetector(EventBusService eventBusService, DFSViewEnumerator enumerator) {
        Intrinsics.checkNotNullParameter(eventBusService, "eventBusService");
        Intrinsics.checkNotNullParameter(enumerator, "enumerator");
        this.eventBusService = eventBusService;
        this.enumerator = enumerator;
        this.dialogSearchSingleThreadExecutor = new SingleThreadExecutor("BC_DialogSearchThread");
    }

    private final void detectDialogs() {
        Dialog dialog;
        Window window;
        DialogFragment dialogFragment = this.currentFragment;
        View decorView = (dialogFragment == null || (dialog = dialogFragment.getDialog()) == null || (window = dialog.getWindow()) == null) ? null : window.getDecorView();
        if (decorView instanceof ViewGroup) {
            publishDialogViews((ViewGroup) decorView, this.enumerator.getAllChildren(decorView));
        }
    }

    private final void publishDialogViews(ViewGroup viewGroup, List<? extends View> list) {
        if (list.isEmpty()) {
            return;
        }
        EventBusService eventBusService = this.eventBusService;
        Resources resources = viewGroup.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "root.resources");
        eventBusService.publish(new ViewsDetectedEvent(null, viewGroup, list, resources));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void triggerDialogSearch() {
        this.dialogSearchSingleThreadExecutor.postDelayed(this, 0L);
    }

    @Override // java.lang.Runnable
    public void run() {
        detectDialogs();
    }

    public final void start() {
        if (this.isStarted) {
            Log.Companion.getLogger().error("Dialog detector is already started. Aborting the start operation.");
            throw new InvalidOperationException("Dialog detector is already started. Aborting the start operation.");
        }
        this.eventHandler = new DialogFragmentEventHandler();
        this.dialogSearchSingleThreadExecutor.start();
        EventBusService eventBusService = this.eventBusService;
        IEventHandler<?> iEventHandler = this.eventHandler;
        Intrinsics.checkNotNull(iEventHandler);
        eventBusService.subscribe(iEventHandler);
        this.isStarted = true;
    }

    public final void stop() {
        if (this.eventHandler != null) {
            this.eventBusService.unsubscribe(this);
        }
        this.dialogSearchSingleThreadExecutor.stop();
        this.eventHandler = null;
        this.isStarted = false;
    }
}
