package com.example.cognit1;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public class WorkshopFragment extends Fragment 
{ 
	@Override 
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) 
	{    
		View myFragmentView = inflater.inflate(R.layout.workshopfragmentlayout, container, false);   
		return myFragmentView; 
	}
	public static Fragment newInstance() 
	{
        WorkshopFragment mFrgment = new WorkshopFragment();
        return mFrgment;
    }
}