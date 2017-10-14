package com.example.naveed.eventbus_recyclerview_fragments_picasso;

import java.util.ArrayList;

/**
 * Created by Naveed on 10/13/2017.
 */
public class Data {

    private String mName;
    private int image;


    public Data (String name, int img) {
        mName = name;
        image = img;

    }

    public String getName() {

        return mName;
    }

    public int getImg() {
        return image;
    }



    private static int lastContact = 0;

    public static ArrayList<Data> createContactsList(int numContacts) {
        ArrayList<Data> contacts = new ArrayList<Data>();
        int[] pic = {R.drawable.dp};

        for (int i = 1; i <= numContacts; i++) {
            contacts.add(new Data("Person " + ++lastContact, pic[i]));

        }

        return contacts;
    }
}
