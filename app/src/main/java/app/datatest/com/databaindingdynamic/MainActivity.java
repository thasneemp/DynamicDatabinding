package app.datatest.com.databaindingdynamic;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import app.datatest.com.databaindingdynamic.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        initBindings();

        binding.getValues.setOnClickListener(this);


    }

    private void initBindings() {
        List<MyModel> myModels = new ArrayList<>();

        myModels.add(new MyModel("1"));
        myModels.add(new MyModel("2"));
        myModels.add(new MyModel("3"));
        myModels.add(new MyModel("4"));
        myModels.add(new MyModel("5"));

        binding.setItemsModel(myModels);

    }

    @Override
    public void onClick(View v) {
        for (MyModel myModel : binding.getItemsModel()) {
            Toast.makeText(this, myModel.getEditTextVlaue().get(), Toast.LENGTH_SHORT).show();
        }
    }
}
