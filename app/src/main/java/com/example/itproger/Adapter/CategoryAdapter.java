package com.example.itproger.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.itproger.MainActivity;
import com.example.itproger.R;
import com.example.itproger.model.Category;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.MyCategoryHolder> {
    Context context;
    List<Category> categoryList;

    public CategoryAdapter(Context context, List<Category> categoryList) {
        this.context = context;
        this.categoryList = categoryList;
    }

    @NonNull
    @Override
    public MyCategoryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.category_item,parent,false);
        return new MyCategoryHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyCategoryHolder holder, int position) {
holder.textView.setText(categoryList.get(position).getCategoryTest());

holder.itemView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        MainActivity.showItemsByCategory(categoryList.get(position).getId());
    }
});
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    public class MyCategoryHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public MyCategoryHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textViewListItem);
        }
    }
}
