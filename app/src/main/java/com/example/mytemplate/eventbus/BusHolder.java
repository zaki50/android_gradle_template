package com.example.mytemplate.eventbus;

import com.google.common.eventbus.EventBus;

/**
 * EventBus の共有インスタンスを提供するためのクラスです。
 * アプリ内で単一の EventBus を使用する際のユーティリティクラス。
 */
public final class BusHolder {
    private static final EventBus sInstance = new EventBus();

    public static EventBus get() {
        return sInstance;
    }
}