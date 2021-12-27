


package com.example.itproger;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.itproger.Adapter.CategoryAdapter;
import com.example.itproger.Adapter.LanguageAdapter;
import com.example.itproger.model.Category;
import com.example.itproger.model.Language;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
   static CategoryAdapter categoryAdapter;
RecyclerView.LayoutManager layoutManager;
RecyclerView.LayoutManager layoutManagerLang;
    static  LanguageAdapter languageAdapter;

 static    List<Category> categoryList = new ArrayList<>();
  static   List<Language> languageList = new ArrayList<>();
  static  List<Language> fullCourseList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerView recyclerViewLanguages = findViewById(R.id.recyclerViewLanguages);
         categoryAdapter = new CategoryAdapter(this,categoryList);
         languageAdapter  = new LanguageAdapter(this,languageList);
        layoutManager=new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        layoutManagerLang=new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewLanguages.setLayoutManager(layoutManagerLang);
        recyclerView.setAdapter(categoryAdapter);
        recyclerViewLanguages.setAdapter(languageAdapter);

        categoryList.add(new Category(1,"Games"));
        categoryList.add(new Category(2,"Sites"));
        categoryList.add(new Category(3,"Languages"));
        categoryList.add(new Category(4,"Others"));

        languageList.add(new Language(1,"Become professional Javascript Developer","#000000","javascript","1st August","Beginner",3));
        languageList.add(new Language(2,"Become professional Java Developer","#80b82c","java","1st July","Beginner",2));
        languageList.add(new Language(3,"Category Languages","#456782","java2","1st September","intermediate",4));
        languageList.add(new Language(4,"Cattegory Others","#456782","java2","1st September","intermediate",1));
        languageList.add(new Language(4,"Cattegory Others","#456782","java2","1st September","intermediate",0));
        languageList.add(new Language(5,"Cattegory 2","#456782","java2","1st September","intermediate",2));
        languageList.add(new Language(6,"Cattegory 2","#456782","java2","1st September","intermediate",1));

        fullCourseList.addAll(languageList);

    }
    public   static void showItemsByCategory(int category){
         List<Language> filterCategory = new ArrayList<>();
         languageList.clear();
         languageList.addAll(fullCourseList);
        for (int i=0; i<languageList.size();i++){
            Language language = languageList.get(i);
           if (language.getCategory()==category){
               filterCategory.add(language);
           }
        }
        languageList.clear();
        languageList.addAll(filterCategory);
languageAdapter.notifyDataSetChanged();
    }
}