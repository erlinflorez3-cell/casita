package com.valid.communication.models;

import com.google.gson.Gson;
import com.valid.security.helpers.KeyHelper;
import com.valid.utils.VsshLogger;
import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import yg.C1499aX;
import yg.C1561oA;
import yg.FB;

/* JADX INFO: loaded from: classes5.dex */
public class KeyEntity {
    private static final String TAG = C1561oA.Qd("\u0001\f\tH\u0010y\u0004\u007fyBv\u0002~}\u0005|vol~rwu4rsggms-Ibu@hmako", (short) (C1499aX.Xd() ^ (FB.Xd() ^ (-1609516813))));
    private PublicKey mBankPubKey;
    private PrivateKey mClientPrivateKey;
    private PublicKey mClientPubKey;
    private PublicKey mServerPubKey;
    private Key mSymKey;

    public class NullPointerException extends RuntimeException {
    }

    public PublicKey getmBankPubKey() {
        return this.mBankPubKey;
    }

    public PrivateKey getmClientPrivateKey() {
        return this.mClientPrivateKey;
    }

    public PublicKey getmClientPubKey() {
        return this.mClientPubKey;
    }

    public PublicKey getmServerPubKey() {
        return this.mServerPubKey;
    }

    public Key getmSymKey() {
        return this.mSymKey;
    }

    public void setmBankPubKey(String str) {
        try {
            this.mBankPubKey = KeyHelper.getPublicKeyFromString(KeyHelper.buildPublicKeyAsString(str));
        } catch (IOException e2) {
            VsshLogger.logError(TAG, e2.getMessage(), e2);
        }
    }

    public void setmClientPrivateKey(PrivateKey privateKey) {
        try {
            this.mClientPrivateKey = privateKey;
        } catch (NullPointerException unused) {
        }
    }

    public void setmClientPubKey(PublicKey publicKey) {
        try {
            this.mClientPubKey = publicKey;
        } catch (NullPointerException unused) {
        }
    }

    public void setmServerPubKey(String str) {
        if (str.isEmpty()) {
            this.mServerPubKey = null;
            return;
        }
        try {
            this.mServerPubKey = KeyHelper.getPublicKeyFromString(KeyHelper.buildPublicKeyAsString(str));
        } catch (IOException e2) {
            VsshLogger.logError(TAG, e2.getMessage(), e2);
            this.mServerPubKey = null;
        }
    }

    public void setmServerPubKey(PublicKey publicKey) {
        try {
            this.mServerPubKey = publicKey;
        } catch (NullPointerException unused) {
        }
    }

    public void setmSymKey(Key key) {
        try {
            this.mSymKey = key;
        } catch (NullPointerException unused) {
        }
    }

    public String toString() {
        try {
            return new Gson().toJson(this);
        } catch (NullPointerException unused) {
            return null;
        }
    }
}
