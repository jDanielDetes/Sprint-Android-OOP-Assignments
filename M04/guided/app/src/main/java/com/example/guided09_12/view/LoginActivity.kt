package com.example.guided09_12.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.BindingAdapter
import com.example.guided09_12.R
import kotlinx.android.synthetic.main.activity_main.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Button.setOnClickListener {
            val message = viewModel.onLoginClicked()
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show
        }
        inEmail.addTextChangedListener(object:)

        companion object  {
            @BindingAdapter("ToastMEssage")
            @JvmStatic
            fun showToast(view: View, message: String?) {
                message?.let {
                    Toast.maketext(view.context,it,Toast.LENGTH_SHORT).show()
                }
            }
        }


    }
}
