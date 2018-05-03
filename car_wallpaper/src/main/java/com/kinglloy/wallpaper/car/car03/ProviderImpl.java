package com.kinglloy.wallpaper.car.car03;

import android.content.Context;
import android.service.wallpaper.WallpaperService;

import com.kinglloy.wallpaper.car.Wallpaper;
import com.kinglloy.wallpaper.car.config.CarConfig;
import com.yalin.style.engine.IProvider;

/**
 * @author jinyalin
 * @since 2018/5/3.
 */

public class ProviderImpl implements IProvider {
    @Override
    public WallpaperService provideProxy(Context host) {
        CarConfig.car = "gtr";
        CarConfig.carColor = "1";
        CarConfig.landscape = "4";
        CarConfig.rim = "wheel5.png";
        CarConfig.plate = "Kinglloy";
        return new Wallpaper(host);
    }
}
