package app;


class Guesser{

    def gnAllPossibilities():List[String]={
       ColorManager.colors().map(c=>c.toString())
       .map(s=>al(s,ColorManager.colors())).flatten
    }

    
    def al(init:String,remaining:List[Color]):List[String]={
        if(init.size==4){
            List(init)
        }
        else{
           remaining.filterNot(r=>init.contains(r.toString())).map(c=>init+c.toString())
            .map(s=>al(s,remaining)).flatten
        }
    }
}