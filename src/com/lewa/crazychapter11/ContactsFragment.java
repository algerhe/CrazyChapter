package com.lewa.crazychapter11;

import android.widget.TextView;
import android.view.LayoutInflater;
import android.app.Fragment;
import android.view.ViewGroup;
import android.view.View;
import android.os.Bundle;

public class ContactsFragment extends Fragment {  
  
    @Override  
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  
            Bundle savedInstanceState) {  
        View contactsLayout = inflater.inflate(R.layout.contacts_layout,  
                container, false);  
        return contactsLayout;  
    }  
  
}  