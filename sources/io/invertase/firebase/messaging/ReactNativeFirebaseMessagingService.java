package io.invertase.firebase.messaging;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import io.invertase.firebase.common.ReactNativeFirebaseEventEmitter;

/* JADX INFO: loaded from: classes3.dex */
public class ReactNativeFirebaseMessagingService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onDeletedMessages() throws Throwable {
        ReactNativeFirebaseEventEmitter.getSharedInstance().sendEvent(ReactNativeFirebaseMessagingSerializer.messagesDeletedToEvent());
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageSent(String str) throws Throwable {
        ReactNativeFirebaseEventEmitter.getSharedInstance().sendEvent(ReactNativeFirebaseMessagingSerializer.messageSentToEvent(str));
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) throws Throwable {
        ReactNativeFirebaseEventEmitter.getSharedInstance().sendEvent(ReactNativeFirebaseMessagingSerializer.newTokenToTokenEvent(str));
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onSendError(String str, Exception exc) throws Throwable {
        ReactNativeFirebaseEventEmitter.getSharedInstance().sendEvent(ReactNativeFirebaseMessagingSerializer.messageSendErrorToEvent(str, exc));
    }
}
