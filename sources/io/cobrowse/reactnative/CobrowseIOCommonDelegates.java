package io.cobrowse.reactnative;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableArray;
import io.cobrowse.CobrowseIO;

/* JADX INFO: loaded from: classes3.dex */
interface CobrowseIOCommonDelegates extends CobrowseIO.Delegate, CobrowseIO.SessionRequestDelegate, CobrowseIO.SessionLoadDelegate, CobrowseIO.RedactionDelegate, CobrowseIO.UnredactionDelegate, CobrowseIO.RemoteControlRequestDelegate, CobrowseIO.FullDeviceRequestDelegate {
    void setUnredactedTags(ReadableArray readableArray, Promise promise);
}
