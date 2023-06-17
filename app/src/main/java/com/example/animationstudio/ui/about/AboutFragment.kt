package com.example.animationstudio.ui.about

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.animationstudio.R

class AboutFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_about, container, false)

        // Initialize views
        val imageView = view.findViewById<ImageView>(R.id.imageView)
        val appNameTextView = view.findViewById<TextView>(R.id.appNameTextView)
        val versionTextView = view.findViewById<TextView>(R.id.versionTextView)
        val contactTextView = view.findViewById<TextView>(R.id.contactTextView)

        // Set values
        imageView.setImageResource(R.drawable.logo)
        appNameTextView.text = "Animation Studio"
        versionTextView.text = "Versi: 1.0"
        contactTextView.text = "Kontak: strahmasti@gmail.com"

        return view
    }
}
