package app.datatest.com.databaindingdynamic;

import android.databinding.BindingAdapter;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import app.datatest.com.databaindingdynamic.databinding.EdittextLayoutBinding;

public class DataBindingAdapter {
    @BindingAdapter("app:items")
    public static void setItems(ViewGroup viewGroup, List<MyModel> myModels) {
        for (MyModel myModel : myModels) {

            LayoutInflater inflate = LayoutInflater.from(viewGroup.getContext());
            EdittextLayoutBinding layoutBinding = EdittextLayoutBinding.inflate(inflate);
            layoutBinding.setItems(myModel);
            viewGroup.addView(layoutBinding.getRoot());
        }

    }
}
