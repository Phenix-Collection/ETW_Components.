package com.kinglloy.wallpaper.galaxy_03;

import android.content.Context;
import android.service.wallpaper.WallpaperService;

import com.maxelus.galaxypacklivewallpaper.config.GalaxyConfig;
import com.yalin.style.engine.IProvider;

/**
 * @author jinyalin
 * @since 2017/7/28.
 */

public class ProviderImpl implements IProvider {
    @Override
    public WallpaperService provideProxy(Context host) {
        GalaxyConfig.galaxyType = 3;
        GalaxyConfig.galaxyBg = 2;
        return new com.maxelus.galaxypacklivewallpaper.WallpaperService(host);
    }
}