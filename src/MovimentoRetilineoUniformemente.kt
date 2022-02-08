class MovimentoRetilineoUniformemente {
    fun calcularMovimentoRetilineoUniformemente(posicaoFinal: Float,variacaoDeTempo: Float,velocidadeMedia: Float):Float{
        return (velocidadeMedia * variacaoDeTempo) / posicaoFinal
    }
}