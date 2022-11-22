package com.example.aidldemo.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import com.example.common.ICommunicator;

public class CalculatorService extends Service {
    private static String TAG = "ArchanaCalculatorService";
    public CalculatorService() {
    }
    private  CalculatorStub calculatorStub = new CalculatorStub();

    @Override
    public IBinder onBind(Intent intent) {
        Log.i(TAG, "onBind: intent" + intent);
        return calculatorStub;
    }

    class CalculatorStub extends ICommunicator.Stub {

        @Override
        public int calculate(int num1, int num2) throws RemoteException {
            return num1 + num2;
        }

        @Override
        public String getName() throws RemoteException {
           // return "Archana Kumari From Server";
            return null;
        }

    }

}