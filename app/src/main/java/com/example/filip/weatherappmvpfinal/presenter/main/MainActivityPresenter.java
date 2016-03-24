package com.example.filip.weatherappmvpfinal.presenter.main;

import com.example.filip.weatherappmvpfinal.pojo.LocationWrapper;

import java.util.ArrayList;

/**
 * Created by Filip on 14/02/2016.
 */
public interface MainActivityPresenter {
    void receiveDataFromLocationService(String locationName);

    ArrayList<LocationWrapper> getLocations();
}
