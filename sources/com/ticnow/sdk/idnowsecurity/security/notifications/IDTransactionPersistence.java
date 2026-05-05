package com.ticnow.sdk.idnowsecurity.security.notifications;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class IDTransactionPersistence {
    public void deleteAllTransactions(Context context) {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editorEdit.putString("IDNowTRSList", "");
        editorEdit.apply();
    }

    public void deleteTransaction(String str, Context context) {
        ArrayList<IDTransaction> transactions = getTransactions(context);
        char c2 = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < transactions.size(); i3++) {
            if (transactions.get(i3).equals(str)) {
                c2 = 1;
                i2 = i3;
            }
        }
        if (c2 > 0) {
            transactions.remove(i2);
        }
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editorEdit.putString("IDNowTRSList", new Gson().toJson(transactions));
        editorEdit.apply();
    }

    public ArrayList<IDTransaction> getTransactions(Context context) {
        new ArrayList();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        Gson gson = new Gson();
        String string = defaultSharedPreferences.getString("IDNowTRSList", "");
        return !string.equals("") ? (ArrayList) gson.fromJson(string, new TypeToken<ArrayList<IDTransaction>>() { // from class: com.ticnow.sdk.idnowsecurity.security.notifications.IDTransactionPersistence.1
        }.getType()) : new ArrayList<>();
    }

    public String getTransactionsJson(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("IDNowTRSList", "");
    }

    public void saveTransaction(IDTransaction iDTransaction, Context context) {
        ArrayList<IDTransaction> transactions = getTransactions(context);
        transactions.toString();
        transactions.add(iDTransaction);
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editorEdit.putString("IDNowTRSList", new Gson().toJson(transactions));
        editorEdit.apply();
    }
}
