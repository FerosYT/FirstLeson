class SugarStorage{
    public var volume:Int = 0

    constructor(volume: Int) {
        this.volume = volume
    }
    fun decreaseSugar(v:Int){
       if(v>0) {
           if (volume - v >= 0) {
               volume -= v
           } else {
               volume = 0
           }
       }
        else{
            print("Отрицательное значение")
       }
    }
    fun increaseSugar(v:Int){
        if(v > 0) {
            volume += v
        }
        else{
            print("Отрицательное значение")
        }
    }
}
