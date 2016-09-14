package com.qf.liuyong.aidl_server;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

import com.qf.liuyong.aidl.MyAidlInterface;

/**
 * Created by Administrator on 2016/9/14.
 */
public class MyService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new MyInterface();
    }
    class MyInterface extends MyAidlInterface.Stub{

        @Override
        public String getName(String name) throws RemoteException {
            return name;
        }
    }
}
