package br.com.zup.rhcatalisa

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.zup.rhcatalisa.databinding.FragmentMostrarBinding



class MostrarFragment : Fragment() {


    private lateinit var binding : FragmentMostrarBinding
    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMostrarBinding.inflate(inflater, container, false)
        return binding.root

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val funcionario = arguments?.getParcelable("FUNCIONARIO") as Funcionario?

        funcionario?.let {
            val totalSalario = funcionario.qtdHorasTrabalhadas() * funcionario.valor()
            binding.tvNomeDigitado.text = getString(R.string.nome_funcionario, funcionario.getNomeCompleto())
            binding.tvHorasTrabalhasDigitado.text = getString(R.string.horas_trabalhadas, funcionario.qtdHorasTrabalhadas().toString())
            binding.tvValorHoraDigitado.text = getString(R.string.valor_por_hora, funcionario.valor().toString())
            binding.tvCalculoSalario.text = getString(R.string.sal_rio_a_receber, totalSalario.toString())


        }
    }

}