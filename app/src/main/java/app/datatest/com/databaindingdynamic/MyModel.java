package app.datatest.com.databaindingdynamic;

import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableField;

public class MyModel extends ViewModel {

    public MyModel(String title) {
        setEditTextVlaue(title);
    }

    private final ObservableField<String> editTextVlaue = new ObservableField<>();


    public ObservableField<String> getEditTextVlaue() {
        return editTextVlaue;
    }

    public void setEditTextVlaue(String value) {
        editTextVlaue.set(value);
    }
}
