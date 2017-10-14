package com.example.naveed.eventbus_recyclerview_fragments_picasso;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Naveed on 10/13/2017.
 */
public class customAdapter  extends RecyclerView.Adapter<customAdapter.ViewHolder> {



    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView txtView;
        public ImageButton imgBtn;
        public ImageView imgView;



        public ViewHolder(View itemView) {

            super(itemView);

            txtView = (TextView) itemView.findViewById(R.id.tv);
            imgBtn= (ImageButton) itemView.findViewById(R.id.img_btn);
            imgView = (ImageView) itemView.findViewById(R.id.img_view);

        }
    }

      private List<Data> mContacts;
      private Context mContext;
      private LayoutInflater inflater;

        public customAdapter(Context context, List<Data> contacts) {
            mContacts = contacts;
            mContext = context;
            inflater = LayoutInflater.from(context);
        }
        private Context getContext() {
            return mContext;
        }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {


        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.contact_layout, viewGroup, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

        Data contact = mContacts.get(i);
        viewHolder.txtView.setText(contact.getName());
        viewHolder.imgView.setImageResource(contact.getImg());

    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }
}
