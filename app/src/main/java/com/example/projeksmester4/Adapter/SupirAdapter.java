package com.example.projeksmester4.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.projeksmester4.Model.SupirModel;
import com.example.projeksmester4.R;


import java.util.ArrayList;

public class SupirAdapter extends ArrayAdapter<SupirModel> {

    private ArrayList<SupirModel> list;
    private LayoutInflater inflater;
    private int res;

    public SupirAdapter(Context context, int resource, ArrayList<SupirModel> list) {
        super(context, resource, list);
        this.list = list;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.res = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        MyHolder holder = null;


        if (convertView == null) {

            convertView = inflater.inflate(res, parent, false);

            holder = new MyHolder();

            holder.ID = (TextView) convertView.findViewById(R.id.id_supir);
            holder.Nama = (TextView) convertView.findViewById(R.id.nama_supir);
            holder.Kelamin = (TextView) convertView.findViewById(R.id.jk);
            holder.Usia = (TextView) convertView.findViewById(R.id.umur);
            holder.Alamat = (TextView) convertView.findViewById(R.id.alamat);
            holder.Nohp = (TextView) convertView.findViewById(R.id.noHp);

            convertView.setTag(holder);

        } else {

            holder = (MyHolder) convertView.getTag();
        }

        holder.ID.setText("# "+list.get(position).getId());
        holder.Nama.setText("# "+list.get(position).getNama());
        holder.Kelamin.setText("# "+list.get(position).getKel());
        holder.Usia.setText("# "+list.get(position).getUsi());
        holder.Alamat.setText("# "+list.get(position).getAlama());
        holder.Nohp.setText("# "+list.get(position).getH());

        return convertView;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public void remove(SupirModel object) {
        super.remove(object);
    }

    @Override
    public void clear() {
        super.clear();
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    static class MyHolder {

        TextView ID;
        TextView Nama;
        TextView Kelamin;
        TextView Usia;
        TextView Alamat;
        TextView Nohp;


    }
}
