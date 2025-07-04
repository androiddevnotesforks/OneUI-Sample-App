package de.lemke.oneuisample.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import de.lemke.oneuisample.databinding.FragmentTabDesignSubtabQrBinding.inflate

@AndroidEntryPoint
class SubtabQR : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
        inflate(inflater, container, false).root
}