class VelocidadeMedia {
    fun calcularVelocidadeMedia(tempoFinal: Float,tempoInicial: Float,posicaoFinal: Float,posicaoInicial: Float):Float{
        return (posicaoFinal - posicaoInicial) / (tempoFinal - tempoInicial)
    }
}