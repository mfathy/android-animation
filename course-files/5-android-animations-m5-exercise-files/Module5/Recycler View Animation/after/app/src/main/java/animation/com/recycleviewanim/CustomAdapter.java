package animation.com.recycleviewanim;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

	private LayoutInflater mInflater;

	List<Data.Information> data = Collections.emptyList();
	private int previousPosition = 0;

    private Context mContext;


	public CustomAdapter(Context context, ArrayList<Data.Information> data) {

		mInflater = LayoutInflater.from(context);
		this.data = data;
        this.mContext = context;
	}

    @Override
	public CustomAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

		View view = mInflater.inflate(R.layout.custom_row, parent, false);

		MyViewHolder holder = new MyViewHolder(view);

		return holder;
	}

	@Override
	public void onBindViewHolder(final CustomAdapter.MyViewHolder holder, final int position) {

		holder.title.setText(data.get(position).title);
		holder.imageView.setImageResource(data.get(position).ItemId);

		if (position > previousPosition){
			AnimationUtils.animate(holder,true);
		}
		else {
            AnimationUtils.animate(holder, false);
		}
		previousPosition = position;


        holder.imageView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                ActivityOptionsCompat anim = ActivityOptionsCompat
                        .makeSceneTransitionAnimation((android.app.Activity) mContext, holder.imageView, "targetImage");
                Intent intent = new Intent(mContext, DetailActivity.class);
                intent.putExtra("position", position);
                mContext.startActivity(intent, anim.toBundle());

            }
        });


	}

	@Override
	public int getItemCount(){
		return data.size();
	}


	static class MyViewHolder extends RecyclerView.ViewHolder {

		TextView title;
		ImageView imageView;

		public MyViewHolder(View itemView) {
			super(itemView);

			title = (TextView) itemView.findViewById(R.id.txv_row);
			imageView = (ImageView) itemView.findViewById(R.id.cardImage);

		}
	}

}
