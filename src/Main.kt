fun main() {
    val forcaPeso:ForcaPeso= ForcaPeso()
    val forcaCentripeta: ForcaCentripeta= ForcaCentripeta()
    val impulso: Impulso= Impulso()
    val forcaElastica: ForcaElastica= ForcaElastica()
    val velocidadeMedia: VelocidadeMedia= VelocidadeMedia()
    val movimentoRetilineoUniformemente: MovimentoRetilineoUniformemente= MovimentoRetilineoUniformemente()
    val movimentoRetilineoUniformementeVariado: MovimentoRetilineoUniformementeVariado= MovimentoRetilineoUniformementeVariado()

    println("《 Resultados 》")
    println()

    val resultadoForcaPeso: Float = forcaPeso.calcularForcaPeso(massa = 10f, gravidade = 9.8f)
    println("Força Peso = $resultadoForcaPeso")

    val resultadoForcaCentripeta: Float = forcaCentripeta.CalcularForcaCentripeta(massa = 800f, velocidade = 20f, raio = 100f)
    println("Força Centrípeta = $resultadoForcaCentripeta")

    val resultadoImpulso: Float = impulso.calcularImpulso(100f,20f)
    println("Impulso = $resultadoImpulso")

    val resultadoForcaElastica: Float = forcaElastica.calcularForcaElastica(100f,150f)
    println("Força Elástica = $resultadoForcaElastica")

    val resultadoVelocidadeMedia: Float = velocidadeMedia.calcularVelocidadeMedia(posicaoFinal = 300f, posicaoInicial = 0f,tempoFinal = 12f, tempoInicial = 7f)
    println("Velocidade Média = $resultadoVelocidadeMedia")

    val resultadoMovimentoRetilineoUniformemente: Float = movimentoRetilineoUniformemente.calcularMovimentoRetilineoUniformemente(2f,2.5f,340f)
    println("Movimento Retilíneo Uniformemente = $resultadoMovimentoRetilineoUniformemente")

    val resultadoMovimentoRetilineoUniformementeVariado: Float = movimentoRetilineoUniformementeVariado.calcularMovimentoRetilineoUniformementeVariado(0f, velocidadeInicial = 0f, tempo = 5f, aceleracao = 13f)
    println("Movimento Retilíneo Uniformemente Variado = $resultadoMovimentoRetilineoUniformementeVariado ")
}