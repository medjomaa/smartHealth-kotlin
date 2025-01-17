package com.example.smartheath.controller

import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_view_disease.*

class ViewDiseaseFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_view_disease, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view)

        view_disease_button.setOnClickListener {
            val disease = disease_view_input.text.toString()
            // Handle view disease logic here
        }
    }
}
