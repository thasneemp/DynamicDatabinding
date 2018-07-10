package app.datatest.com.databaindingdynamic;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

public class DataBindingAdapter {
    @BindingAdapter("app:items")
    public static void setItems(ViewGroup viewGroup, List<MyModel> myModels) {
        for (MyModel myModel : myModels) {
            LayoutInflater inflate = LayoutInflater.from(viewGroup.getContext());
            ViewDataBinding binding = DataBindingUtil.inflate(inflate, R.layout.edittext_layout, viewGroup, false);
            binding.setVariable(BR.items, myModel);
            viewGroup.addView(binding.getRoot());
        }

    }
}
