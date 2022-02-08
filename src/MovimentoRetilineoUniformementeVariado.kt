import kotlin.math.pow

class MovimentoRetilineoUniformementeVariado {

    fun potenciaTempo(base: Float,expoente: Float): Float{
        return base.pow(expoente).toFloat()
    }

    fun calcularMovimentoRetilineoUniformementeVariado( posicaoInicial: Float, velocidadeInicial: Float, tempo: Float, aceleracao: Float): Float{
        return posicaoInicial + (velocidadeInicial * tempo) + (aceleracao * (potenciaTempo(tempo,2f)) / 2)
    }
}