package asha.binar.challangenchapter3navcom.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import asha.binar.challangenchapter3navcom.MainActivity
import asha.binar.challangenchapter3navcom.R
import asha.binar.challangenchapter3navcom.adapter.AlphabetAdapter
import asha.binar.challangenchapter3navcom.databinding.FragmentAlphabetBinding


class AlphabetFragment : Fragment() {
    private var _binding : FragmentAlphabetBinding? = null
    private val binding get() = _binding!!
    private val dataSet = MainActivity().MyData

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAlphabetBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = AlphabetAdapter()
        adapter.submitData(dataSet)

        binding.rvAlphabet.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvAlphabet.adapter = adapter
    }


}