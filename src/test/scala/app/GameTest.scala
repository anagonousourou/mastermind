package app;

import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter

class GameTest extends FunSuite with BeforeAndAfter{

    var game:Game = _
    before{
        game= new Game
    }

    test("feedback gives the good results"){
        assert(game.feedback("VVVV",List(Violet,Red,Blue,Green))._1==1)
        assert(game.feedback("RBVV",List(White,Violet,Blue,Green))._2 == 0)
    }
}