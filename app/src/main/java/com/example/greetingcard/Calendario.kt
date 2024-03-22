package com.example.greetingcard

import java.util.*

class Calendario {

    fun diaDaSemana(dia: Int, mes: Int, ano: Int): String {
        val dias = arrayListOf("DOMINGO", "SEGUNDA", "TERÇA", "QUARTA", "QUINTA", "SEXTA", "SÁBADO")
        val calendar = Calendar.getInstance()
        calendar.set(ano, mes - 1, dia)
        val diaDaSemana = calendar.get(Calendar.DAY_OF_WEEK)
        return dias[diaDaSemana - 1]
    }

    fun diaDaSemana(): String {
        val dias = arrayListOf("DOMINGO", "SEGUNDA", "TERÇA", "QUARTA", "QUINTA", "SEXTA", "SÁBADO")
        val calendar = Calendar.getInstance()
        val diaDaSemana = calendar.get(Calendar.DAY_OF_WEEK)
        return dias[diaDaSemana - 1]
    }
}