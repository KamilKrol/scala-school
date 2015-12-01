

/**
  * Created by kkrol on 01/12/2015.
  */
object Main6 {

  def main(args: Array[String]): Unit = {
    val calc1 = new Calculator("HP", "20B")
    val calc2 = new Calculator("HP", "48G")
    val calc3 = new Calculator("HP", "30B")
    val calc4 = new Calculator("HP", "XXX")
    val calc5 = new Calculator("XXX", "30B")

    val list = List(calc1, calc2, calc3, calc4, calc5)
    val mappedList = list.map(matchFunction)
    println(list)
    println(mappedList)

    val caseClassMatchingList = list.map(caseClassPatternMatching)
    println(caseClassMatchingList)
  }

  def matchFunction(calc: Calculator) = calc match {
    case _ if calc.brand == "HP" && calc.model == "20B" => "financial"
    case _ if calc.brand == "HP" && calc.model == "48G" => "scientific"
    case _ if calc.brand == "HP" && calc.model == "30B" => "business"
    case _ => "unknown = " + calc
  }

  def caseClassPatternMatching(calc: Calculator) = calc match {
    case Calculator("HP", model) => "Model '" + model + "' from HP"
    case c@Calculator(_, model) => "Model '" + c.model + "' from different manufacturer"
  }

}

case class Calculator(brand: String, model: String)