package app;

sealed abstract class Color

case object Red extends Color{
    override def toString(): String = "R" 
}

case object White extends Color{
    override def toString(): String = "W"
}

case object Blue extends Color{
    override def toString():String="B"
}

case object Yellow extends Color{
    override def toString():String="Y"
}

case object Green extends Color{
    override def toString():String="G"
}

case object Violet extends Color{
    override def toString():String="V"
}

object ColorManager{
    def colors():List[Color]={
        List(Violet,Green,Yellow,Blue,White,Red)
    }
}

