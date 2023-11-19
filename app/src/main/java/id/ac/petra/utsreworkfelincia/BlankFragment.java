package id.ac.petra.utsreworkfelincia;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class ToDo_Fragment extends Fragment {
    private Todo mTodo;
    private EditText mTaskField;
    private EditText mNote;
    private EditText mdueDate;
    private CheckBox mDoneCheckBox;
    private Button mCancel;
    private Button mSave;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mTodo = new Todo();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_todo,container,false);
        mTaskField = v.findViewById(R.id.EditTextTask);
        mTaskField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        mdueDate = (EditText) v.findViewById(R.id.EditTextDueDate);
        mdueDate.setText(mTodo.getMdueDate().toString());
        mdueDate.setEnabled(true);

        mDoneCheckBox = (CheckBox) v.findViewById(R.id.cbdone);
        mDoneCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                mTodo.setmDone(b);
            }
        });

        mNote = (EditText) v.findViewById(R.id.EditTextNote);
        mNote.setText(mTodo.getmNote().toString());
        mNote.setEnabled(true);

        mCancel = (Button) v.findViewById(R.id.Cancel_Button);
        mCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        mSave = (Button) v.findViewById(R.id.Save_Button);
        mSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });


        return v;
    }
}