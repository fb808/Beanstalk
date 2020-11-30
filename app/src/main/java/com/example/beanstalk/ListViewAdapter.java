package com.example.beanstalk;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
//    private TextView event;
//    private TextView name;
//    private TextView part;
//    private TextView agency;
//    private TextView written_fees;
//    private TextView practical_fees;
//
//    private ArrayList<CertificateData> ArrayList = new ArrayList<CertificateData>();
//
//    public ListViewAdapter(){
//
//    }
//
//    @Override
//    public int getCount() {
//        return ArrayList.size();
//    }
//
//    @Override
//    public Object getItem(int i) {
//        return ArrayList.get(i);
//    }
//
//    @Override
//    public long getItemId(int i) {
//        return i;
//    }
//
//    @Override
//    public View getView(int i, View view, ViewGroup viewGroup) {
//        final int pos = i;
//        final Context context = viewGroup.getContext();
//
//        if(view == null){
//            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            view = inflater.inflate(R.layout.listview_item, viewGroup, false);
//        }
//
//        event = (TextView) view.findViewById(R.id.tv_event);
//        name = (TextView) view.findViewById(R.id.tv_name);
//        part = (TextView) view.findViewById(R.id.tv_part);
//        agency = (TextView) view.findViewById(R.id.tv_agency);
//        written_fees = (TextView) view.findViewById(R.id.tv_write_price);
//        practical_fees = (TextView) view.findViewById(R.id.tv_practical_price);
//
//        CertificateData certificateData = ArrayList.get(i);
//
//        event.setText(certificateData.getEvent());
//        name.setText(certificateData.getName());
//        part.setText(certificateData.getPart());
//        agency.setText(certificateData.getAgency());
//        written_fees.setText(certificateData.getWrite_price());
//        practical_fees.setText(certificateData.getPractical_price());
//
//        return view;
//    }
//    public void addItem(String event, String name, String part, String agency, int write_price, int practical_price){
//        CertificateData item = new CertificateData();
//
//        item.setEvent(event);
//        item.setName(name);
//        item.setPart(part);
//        item.setAgency(agency);
//        item.setWrite_price(write_price);
//        item.setPractical_price(practical_price);
//
//        ArrayList.add(item);
//    }

    Context Context = null;
    LayoutInflater LayoutInflater = null;
    ArrayList<CertificateData> certificate = new ArrayList<>();

    public ListViewAdapter(Context context, ArrayList<CertificateData> data){
        Context = context;
        certificate = data;
        LayoutInflater = android.view.LayoutInflater.from(Context);
    }

    @Override
    public int getCount() {
        return certificate.size();
    }

    @Override
    public CertificateData getItem(int i) {
        return certificate.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1 = LayoutInflater.inflate(R.layout.listview_item, null);

//        TextView event = (TextView) view1.findViewById(R.id.tv_event);
        TextView name = (TextView) view1.findViewById(R.id.tv_name);
        TextView part = (TextView) view1.findViewById(R.id.tv_part);
        TextView agency = (TextView) view1.findViewById(R.id.tv_agency);
        TextView write_price = (TextView) view1.findViewById(R.id.tv_write_price);
        TextView practical_price = (TextView) view1.findViewById(R.id.tv_practical_price);

//        event.setText(certificate.get(i).getEvent());
        name.setText(certificate.get(i).getName());
        part.setText(certificate.get(i).getPart());
        agency.setText(certificate.get(i).getAgency());
        write_price.setText(""+certificate.get(i).getWrite_price());
        practical_price.setText(""+certificate.get(i).getPractical_price());

        return view1;
    }
}