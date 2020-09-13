interface Virus {
    fun mutate ()
    fun spread()

}
enum class TypeOfVirus {
    Concrete,
    Influenza,
    HIV

}

class ConcreteVirus : Virus {
    override fun mutate() {
        println("ConcreteVirus")

    }

    override fun spread() {
        println("ConcreteVirus is fast")
    }
}
    class InfluenzaVirus : Virus {
        override fun mutate() {

        }

        override fun spread() {

        }

    }

    class HIV : Virus {
        override fun mutate() {

        }

        override fun spread() {

        }

    }

class VirusFactory {
    fun DefVirsu (Virus :TypeOfVirus) : String {
        var VirusType = Virus
        if (VirusType ==TypeOfVirus.Concrete )
            println("This is  Corona Virus")
        else if (VirusType ==TypeOfVirus.Influenza)
            println("This is Influenza Virus ")
        else
            println("This is HIV Virus ")
        return "There is no Virus"

    }

}
fun main (){
    var Virus = VirusFactory().DefVirsu(TypeOfVirus.Concrete)
    var Virus2 = VirusFactory().DefVirsu(TypeOfVirus.Influenza)
    var Virus3 = VirusFactory().DefVirsu(TypeOfVirus.HIV)




}
