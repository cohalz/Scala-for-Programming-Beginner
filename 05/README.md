#繰り返し
##同じ処理は何回も書かない
Helloと10回表示するプログラムを書く事になったとしましょう。  
今まで使った知識を使うと、以下の様に書くと思います。
```scala
println("Hello")
println("Hello")
println("Hello")
println("Hello")
println("Hello")
println("Hello")
println("Hello")
println("Hello")
println("Hello")
println("Hello")
```
ですが、こんなの(コピペで作れるとはいえ)**書くのは面倒**です。  
**本当に10回分書いてあるのか**も数えないといけません。  

このような時に繰り返しのための**for**を使います。  
以下のコードを**Sublime Text 2**で**5.scala**に書いてください。
```scala
for(i <- 1 to 10) {
  println("Hello")
}
```

```
scala 5.scala
```
実行するとちゃんとHelloが10回表示されます。
```
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
```

##forの書き方
forの解説をしましょう。今回のコードはこれでした。
```scala
for(i <- 1 to 10) {
  println("Hello")
}
```
これを見ると、前回のifと同じような構造をしている事がわかります。
```scala
if(/* 条件 */) {
  //コード
}
```
```scala
for(/* 何か */) {
  //コード
}
```
この**何か**の部分を見ていきましょう。
```scala
i <- 1 to 10
```
1 to 10は英語で**1から10**までと読めます。  
**1から10までの数は十個あるので十回繰り返される**、と思って大丈夫です。

じゃあiは何かというと、1から10までの数が繰り返される度に、**そのときの数字が順番に入っていく**変数です。  
変数なので数字の代わりに使うことが出来ます。

例を見てみましょう。  
10回繰り返しますが、iの中身を表示させています。
```scala
for(i <- 1 to 10) {
  println(i)
}
```
結果はこうなります。
```
1
2
3
4
5
6
7
8
9
10
```
数字を変えてみます。
この場合も11から20まで数字は十個あるので十回繰り返されます。
```scala
for(i <- 11 to 20) {
  println(i)
}
```
結果はこうなります。
```
11
12
13
14
15
16
17
18
19
20
```
最初の数字から最後の数字まで、変数に数字が順番に入っていることがわかります。

最初の10回Helloを使うコードでは**i**を使いませんでした。  
変数を使わないことはもちろん問題ありません。

またforの外ではiの数字を使う事はできません。  
**波括弧の中でのみ**使うことが出来ます。  
以下のコードは**エラー**になります。
```scala
for (i <- 1 to 10) {
  println(i)
}
println(i)
```
ちなみに、ifの中で定義した変数もifの中でしか使えません。
以下のコードも**エラー**になります。
```scala
val x = 2
if(x == 2) {
  val y = 1
}
println(y)
```

##自由に組み合わせる
ifやforなどは自由に中に入れても問題ありません。  
forの中にforを入れることだって可能です。

以下は九九を五の段まで表示するプログラムです。  
実際に書いて実行してみてください。
```scala
for(i <- 1 to 5) {
  for(j <- 1 to 5) {
    println(i + " * " + j + " = " + i * j)
  }
}
```

ifとforを使うことができれば、大きなプログラムも書くことが可能になります。  
前回の課題の(2)、FizzBuzzを例に取ってみます。  
FizzBuzzとは以下の様なものでした。

  「最初に数字を入力する。  
  その数字が3で割り切れたらFizz、5で割り切れたらBuzz、15で割り切れたらFizzBuzz、  
  どれでも割り切れなかったらその数字を表示する。」

解答例は以下になります。
```scala
val x = readInt
if(x % 3 == 0 && x % 5 == 0) {
  println("FizzBuzz")
} else if(x % 3 == 0) {
  println("Fizz")
} else if(x % 5 == 0) {
  println("Buzz")
} else {
  println(x)
}
```
これを入力した数字じゃなく、1から100まで判定してそれぞれ表示するにはforを使います。
```scala
for(i <- 1 to 100) {
  if(i % 3 == 0 && i % 5 == 0) {
    println("FizzBuzz")
  } else if(i % 3 == 0) {
    println("Fizz")
  } else if(i % 5 == 0) {
    println("Buzz")
  } else {
    println(i)
  }
}
```
あまり変わっていないように見えますが、これだけでちゃんと1から100まで試すことが出来ます。

次に、数字を入力させて、1から入力した数まで判定するにはこう書きます。
```scala
val n = readInt
for(i <- 1 to n) {
  if(i % 3 == 0 && i % 5 == 0) {
    println("FizzBuzz")
  } else if(i % 3 == 0) {
    println("Fizz")
  } else if(i % 5 == 0) {
    println("Buzz")
  } else {
    println(i)
  }
}
```
5を入力すれば、5までの数まで、100を入力すれば一つ前と同じ結果が出ることを確認してください。

##練習用課題
練習として**5.scala**に以下のコードを書いてみてください。  

###(1)
50から100までの数字の中で、  3の倍数の数だけ表示させるプログラムを書いてください。
###(2)
二回数字を入力させて、最初に入力した数から次に入力した数まですべてFizzBuzz判定するプログラムを書いてください。
####入力例1：
```
1
10
```
####出力例1：
```
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
```
####入力例2：
```
1000
1010
```
####出力例2：
```
Buzz
1001
Fizz
1003
1004
FizzBuzz
1006
1007
Fizz
1009
Buzz
```
###提出方法
[こちら](https://github.com/cohalz/scala-for-programming-beginner/issues/new)を用意しました。  
はじめにGitHubアカウントを作成してください。  
アカウントを作成できたら、ログインをして、上記のページに飛びます。  
Titleに「05-1」など、いつの何番の問題かわかるように書いてください。  
Leave a commentに書いたコードを貼り付けて、Submit new issueを押してください。   
課題が提出できたら、しばらくして僕が評価を返すのでそれを待ちましょう。  

もしちょっと考えてわからなかったら上部にあるanswerに答えを用意しましたので、ぜひ活用してください。

また質問やご意見あればお待ちしてます。  
上記のページは課題以外でも質問やご意見を送ることができます。  
[こちら](https://github.com/cohalz/scala-for-programming-beginner/issues/new)かTwitter([@cohalz](https://twitter.com/cohalz))まで気軽にどうぞ。是非一緒に学びましょう。

次回 -> [リスト入門](https://github.com/cohalz/scala-for-programming-beginner/tree/master/06)

前回 -> [条件分岐](https://github.com/cohalz/scala-for-programming-beginner/tree/master/04)
