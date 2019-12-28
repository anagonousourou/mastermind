package app;
class Game{
    val codemaker:CodeMaker= new CodeMaker()
    def launch()={
        val code=this.codemaker.generateCode()
        var guess:String=""
        do{
            print("Guess the code :")
            guess=readLine()
            println(feedback(guess,code))

        }while(feedback(guess,code)._2 != code.size)

    }
    /**
     * On suppose ici que guess est conforme à ce qui est attendu
     * comme format
     * */
    def feedback(guess:String,code:List[Color]):(Int,Int)={
       val nbcorrectcolors=code.filter(c=> guess.contains(c.toString())).size

       var correctpos=0
       for (i<- 0 to code.size-1 ){
            if(guess(i) == code(i).toString()(0)){
                correctpos+=1
            }
       }

       return (nbcorrectcolors,correctpos)
    }
}