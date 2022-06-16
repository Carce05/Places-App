package com.crypto.ui.crypto

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
<<<<<<< HEAD:app/src/main/java/com/crypto/ui/crypto/CryptoFragment.kt
import androidx.navigation.fragment.findNavController
import com.crypto.R
import com.crypto.databinding.FragmentLugarBinding
import com.crypto.viewmodel.LugarViewModel
=======
import com.lugares.databinding.FragmentLugarBinding
import com.lugares.viewmodel.LugarViewModel
>>>>>>> parent of 4c90b23 (clase03 Finalizada):app/src/main/java/com/lugares/ui/lugar/LugarFragment.kt

class CryptoFragment : Fragment() {

    private var _binding: FragmentLugarBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val lugarViewModel =
            ViewModelProvider(this).get(LugarViewModel::class.java)

        _binding = FragmentLugarBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        lugarViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}