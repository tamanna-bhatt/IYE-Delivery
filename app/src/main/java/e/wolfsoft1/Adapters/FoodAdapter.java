package e.wolfsoft1.Adapters;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import e.wolfsoft1.ModelClasses.FoodModel;
import e.wolfsoft1.iyedelivery.R;

/**
 * Created by wolfsoft1 on 27/2/18.
 */

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.MyViewHolder>{

    Context context;


    private List<FoodModel> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {


        ImageView image;
        TextView foodName,totalRest;

        public MyViewHolder(View view) {
            super(view);

            image = (ImageView) view.findViewById(R.id.image);
            foodName=(TextView) view.findViewById(R.id.foodName);
            totalRest=(TextView) view.findViewById(R.id.restNo);



        }

    }


    public FoodAdapter(Context mainActivityContacts, List<FoodModel> offerList) {
        this.OfferList = offerList;
        this.context = mainActivityContacts;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.food_recycler, parent, false);


        return new MyViewHolder(itemView);


    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        FoodModel lists = OfferList.get(position);
        holder.image.setImageResource(lists.getImage());
        holder.foodName.setText(lists.getFoodName());
        holder.totalRest.setText(lists.getTotalRes());



    }

    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}
