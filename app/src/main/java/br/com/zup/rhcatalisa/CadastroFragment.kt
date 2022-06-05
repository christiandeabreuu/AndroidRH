package br.com.zup.rhcatalisa

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import br.com.zup.rhcatalisa.databinding.ActivityMainBinding
import br.com.zup.rhcatalisa.databinding.FragmentCadastroBinding


class CadastroFragment : Fragment() {

    private lateinit var binding: FragmentCadastroBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCadastroBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnCadastrar = binding.btnCalcular

        btnCadastrar.setOnClickListener {
            val nome = binding.etTextoNomeSobrenome.text.toString()
            val horasTrabalhadas = binding.etTextoHorasTrabalhadas.text.toString()
            val valorPorHora = binding.etTextoValorHora.text.toString()
            val funcionario: Funcionario

            if (nome.isNotBlank() && horasTrabalhadas.isNotBlank() && valorPorHora.isNotBlank()) {
                funcionario = Funcionario(nome, horasTrabalhadas.toInt(), valorPorHora.toDouble())
                val bundle = bundleOf("FUNCIONARIO" to funcionario)

                NavHostFragment.findNavController(this).navigate(
                    R.id.action_cadastroFragment_to_mostrarFragment, bundle
                )
            }
        }
    }
}

//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        val view = inflater.inflate(R.layout.fragment_a, container, false)
//
//        view.findViewById<Button>(R.id.buttonFA).setOnClickListener {
//
//            Navigation.findNavController(view).navigate(R.id.action_fragmentA_to_fragmentB)
//        }
//
//        return view
//    }

