package com.example.itproger.Adapter;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.itproger.CoursePage;
import com.example.itproger.R;
import com.example.itproger.model.Language;

import java.util.List;

public class LanguageAdapter extends RecyclerView.Adapter<LanguageAdapter.MyLanguageView> {
    Context context;
    List<Language> languageList;

    public LanguageAdapter(Context context, List<Language> languageList) {
        this.context = context;
        this.languageList = languageList;
    }

    @NonNull
    @Override
    public LanguageAdapter.MyLanguageView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.language_item,parent,false);
        return new MyLanguageView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LanguageAdapter.MyLanguageView holder, int position) {
        String bgColor = languageList.get(position).getBgColor();
int imageId = context.getResources().getIdentifier(languageList.get(position).getImg() , "drawable", context.getPackageName());
holder.imageView.setImageResource(imageId);
holder.cardView.setCardBackgroundColor(Color.parseColor(bgColor));
//holder.linerBg.setBackgroundColor(Color.parseColor(bgColor));
holder.linerBg.getBackground().setColorFilter(Color.parseColor(bgColor), PorterDuff.Mode.SRC_ATOP);
holder.lessonsLevel.setText(languageList.get(position).getLessonLevel());
holder.lessonsBegin.setText(languageList.get(position).getLessonStart());
holder.jobTitleCattegory.setText(languageList.get(position).getJobTitle());

holder.itemView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(context, CoursePage.class);
       ActivityOptions options =  ActivityOptions.makeSceneTransitionAnimation((Activity) context,
               new Pair<View,String>(holder.imageView,"myTransition"));
        intent.putExtra("jobTitle",languageList.get(position).getJobTitle());
        intent.putExtra("bgColor",Color.parseColor(bgColor));
        intent.putExtra("imageId",imageId);
        intent.putExtra("lessonLevel",languageList.get(position).getLessonLevel());
        intent.putExtra("lessonBegin",languageList.get(position).getLessonStart());
        context.startActivity(intent,options.toBundle());
    }
});
    }

    @Override
    public int getItemCount() {
        return languageList.size();
    }

    public class MyLanguageView extends RecyclerView.ViewHolder {
        CardView cardView;
        LinearLayout linerBg;
        ImageView imageView;
        TextView lessonsBegin,lessonsLevel,jobTitleCattegory;
        public MyLanguageView(@NonNull View itemView) {
            super(itemView);
            jobTitleCattegory = itemView.findViewById(R.id.jobTitleCategory);
            cardView = itemView.findViewById(R.id.cardBg);
            lessonsBegin=itemView.findViewById(R.id.lessonsBegin);
            lessonsLevel=itemView.findViewById(R.id.lessonsLevel);
            imageView = itemView.findViewById(R.id.imageLanguage);
            linerBg=itemView.findViewById(R.id.linearBg);
        }
    }
}
