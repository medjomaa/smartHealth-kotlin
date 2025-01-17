package com.example.smartheath.controller

import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_view_patient.*

class ViewPatientFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_view_patient, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view)

        view_patient_button.setOnClickListener {
            val patientName = patient_view_input.text.toString()
            // Handle view patient logic here
        }
    }
}
