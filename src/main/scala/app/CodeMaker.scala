package app;
import scala.util.Random

class CodeMaker(){

    def generateCode():List[Color]={
        Random.shuffle(ColorManager.colors()).take(4)
    }
}