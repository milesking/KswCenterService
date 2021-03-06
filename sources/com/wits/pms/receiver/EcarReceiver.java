package com.wits.pms.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.wits.pms.bean.EcarMessage;

public class EcarReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(EcarMessage.ECAR_NORMAL_ACTION)) {
            handleReceive(intent);
        }
    }

    private void handleReceive(Intent intent) {
        ReceiverHandler.handle(new EcarMessage(intent));
    }
}
