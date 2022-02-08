import kotlin.math.pow

class ForcaCentripeta {

    fun velocidadeForcaCentripeta(base: Float,expoente: Float): Float{
        return base.pow(expoente).toFloat()
    }

    fun CalcularForcaCentripeta(massa: Float, velocidade: Float, raio: Float): Float{
        return massa * (velocidadeForcaCentripeta(base = velocidade, expoente = 2f) / raio)
    }


}