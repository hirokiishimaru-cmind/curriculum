{
    //問1 isEven関数を実行して、以下の配列から偶数だけが出力されるように実装してください。
    let numbers = [2, 5, 12, 13, 15, 18, 22];
    //ここに答えを実装してください。↓↓↓
    for (let i = 0; i < numbers.length; i++) {
        const num = numbers[i];
        if(num % 2 === 0){
            isEven(num);
        }
    }
    function isEven(num) {
        console.log(num + 'は偶数です');
    }

    
    //問2 以下の要件を満たすように実装してください。
    // インスタンス化した時にガソリンとナンバーがセットされるようなCarクラスを作成する
    class Car{
        constructor(gasoline, number){
            this.gasoline = gasoline;
            this.number = number;
        }

        //ガソリンは〇〇です。ナンバーは△△です」と出力される「getNumGas」という関数を作成する
        getNumGas(){
            console.log(`ガソリンは${this.gasoline}です。ナンバーは${this.number}です。`);
        }
    }
    let CarSample = new Car("レギュラー", 1234);
    CarSample.getNumGas();
}