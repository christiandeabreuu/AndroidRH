package br.com.zup.rhcatalisa

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize

class Funcionario(
    private var nomeCompleto: String,
    private var horasTrabalhadas: Int,
    private var valorHora : Double
) : Parcelable {
    fun getNomeCompleto() = this.nomeCompleto
    fun valor() = this.horasTrabalhadas
    fun qtdHorasTrabalhadas() = this.valorHora
}

