package com.devnemo.nemos.paintings.platform.services;

public interface IModLoaderHelper {

    String getModLoaderName();

    boolean isModLoaded(String modId);

    boolean isDevelopmentEnvironment();
}