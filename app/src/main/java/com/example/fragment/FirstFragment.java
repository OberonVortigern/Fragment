package com.example.fragment;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.google.android.material.textfield.TextInputEditText;

public class FirstFragment extends Fragment {
    private PageViewModel pageViewModel;
    public FirstFragment() {
// Required empty public constructor
    }
    /**
     * Create a new instance of this fragment
     * @return A new instance of fragment FirstFragment.
     */
    public static FirstFragment newInstance() {
        return new FirstFragment();
    }
    @Override public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
// init ViewModel
        pageViewModel =
                ViewModelProviders.of(requireActivity()).get(PageViewModel.class);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }
    @Override public void onViewCreated(@NonNull View view, @Nullable
            Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextInputEditText nameEditText =
                view.findViewById(R.id.textInputTextName);
        nameEditText.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence charSequence, int
                    i, int i1, int i2) {
            }
            @Override public void onTextChanged(CharSequence charSequence, int i,
                                                int i1, int i2) {
                pageViewModel.setName(charSequence.toString());
            }
            @Override public void afterTextChanged(Editable editable) {
            }

        });

// Add Text Watcher on name input text

        TextInputEditText alamatEditText =
                view.findViewById(R.id.textInputTextAlamat);

// Add Text Watcher on name input text
        alamatEditText.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence charSequence, int
                    i, int i1, int i2) {
            }
            @Override public void onTextChanged(CharSequence charSequence, int i,
                                                int i1, int i2) {
                pageViewModel.setAlamat(charSequence.toString());
            }
            @Override public void afterTextChanged(Editable editable) {
            }

        });

        TextInputEditText numberEditText =
                view.findViewById(R.id.textInputNomor);

// Add Text Watcher on name input text
        numberEditText.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence charSequence, int
                    i, int i1, int i2) {
            }
            @Override public void onTextChanged(CharSequence charSequence, int i,
                                                int i1, int i2) {
                pageViewModel.setNumber(charSequence.toString());
            }
            @Override public void afterTextChanged(Editable editable) {
            }

        });
    }
}