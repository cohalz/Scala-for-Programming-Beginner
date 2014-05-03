#List入門
##似た変数を多く作らない
生徒が何人かいて、それぞれ試験に受かったか判定するプログラムを書くことになったとしましょう。  

今は生徒が5人いて、試験の結果が60点以上でpass、59点以下ではfailと表示することにしましょう。  
そのまま言われた通りに書いたら以下のようになると思います。  
(**以下のコードは真似しないでください**)
```scala
val student1 = 84
val student2 = 45
val student3 = 60
val student4 = 58
val student5 = 69

if(student1 >= 60) {
  println("1 is pass")
} else {
  println("1 is fail")
}

if(student2 >= 60) {
  println("2 is pass")
} else {
  println("2 is fail")
}

if(student3 >= 60) {
  println("3 is pass")
} else {
  println("3 is fail")
}

if(student4 >= 60) {
  println("4 is pass")
} else {
  println("4 is fail")
}

if(student5 >= 60) {
  println("5 is pass")
} else {
  println("5 is fail")
}
```
...
正直これはひどいです。  
**似たような変数、似たような処理**を何度も繰り返しています。  
こんなに長く書いたら**当然ミスも起きますし、探すのも大変**です。  

##複数のデータを扱う
student1やstudent2は名前は似てるだけでコンピュータから見たら完全に別の変数です。  
なのでこのように個別で判定するしかありません。  
しかし、プログラミング言語ではこのような複数のデータを扱いやすくする方法があります。  
その一つが**List**です。  
Listを使うには、**Listとカッコを書いてその中に要素をコンマ(,)区切りで並べて書きます**。  

```scala
val students = List(84,45,60,58,69)
```

これで、複数のデータを保持することが出来ます。  
今はListに整数を書きましたが、文字列や小数、更にはListも入れることが出来ます。(次回以降解説します)  

中に入っているデータを使いたいときには変数名と何番目の数を使うのかの**添字**を書きます。

```scala
students(1)
```

##添字番号
では試しに、**Sublime Text 2**で**6.scala**という名前で以下のコードを保存してください。

```scala
val students = List(84,45,60,58,69)
println(students(1))
```

実行しましょう。

```
scala 6.scala
```

```
45
```

あれ？1番目だから84になるのでは？  
実は**添字の番号は0から**始まっています。  
なのでstudents(0)が最初の84、students(1)が次の45になっています。  
**注意！要素は5つありますが、0番目から始まっているのでstudents(5)はありません。**   
もしstudents(5)と範囲外のものを書いてしまうと**エラー**が起きてすぐプログラムが終了してしまいます。

##要素に対して繰り返す
それでは最初のコードを書き直してみましょう。

```scala
val students = List(84,45,60,58,69)
```

この次は？順番に書き直しますか？

```scala
if(students(0) >= 60)
```

いえ、これではさっきと大して変わりがありません。  
ではどうすればいいのでしょう？

実は前回やったforを使うことでやりたいことが実現できます。  
以下が最初のコードを改善したものです。

```scala
for(i <- 0 to 4) {
  if(students(i) >= 60) {
    println(i+1 + " is pass")
  } else {
    println(i+1 + " is fail")
  }
}
```

```
1 is pass
2 is fail
3 is pass
4 is fail
5 is pass
```

添字は0から、学籍番号は1から始まっているので合わせるためにi番目に1を足しています。  
(iのままだと学籍番号が0から始まってずれてしまいます)

```scala
i+1
```

は**数字の足し算**で、その後の

```scala
+ "is pass"
```

は+の**前の文字列とその後の文字列を結合**です。  
同じ記号ですが**使い分けに注意**してください。  
iが0(forの最初の実行)のとき具体的にどうなっているのか以下に示します。

```scala
println(i+1 + " is pass")
```

```scala
println(0+1 + " is pass")
```

```scala
println(1 + " is pass")
```

```scala
println("1 is pass")
```
##Listでのforはtoではなくuntilを使う
forを使うとき、Listの要素は5つなのに0 to 4と4を書いていました。  
要素5つなら5と合わせて書けた方が、何回やるかもわかりやすいですよね。  
toではなく**until**と書くと実現できます。  
以下のコードは上で書いたコードと同じ動作をします。

```scala
for(i <- 0 until 5) {
  if(students(i) >= 60) {
    println(i+1 + " is pass")
  } else {
    println(i+1 + " is fail")
  }
}
```

toは最後の数字を含みましたが、untilは含みません。  
0 to 4は0,1,2,3,4で、**0 until 5も0,1,2,3,4**(5の前の数の4まで)となります。

##Listで使える便利なもの
Listはよく使うので、便利なものがあらかじめ定義されています。  
使うにはListもしくはstudentsのようなListの入った変数の後にドット(.)を書いて使います。

以下に今回の練習用課題で使うものを紹介します。

- **length**  
  Listの要素数を取得できます。
  ```scala
  val students = List(84,45,60,58,69)
  println(students.length)
  ```

  ```
  5
  ```

  以下のようにいきなり使うことも可能です。

  ```scala
  println(List(2,3,5).length)
  ```

  ```
  3
  ```

  Listの要素数が変われば自動的にlengthの値も変わります。  
  なのでforでListの全要素を見る時によく使います。
  以下の書き方は便利なので覚えておきましょう。
  untilを使っていることにも注意してください。

  ```
  for(i <- 0 until list.length /* 使いたいList */) {
    //ここでlistのすべての要素について繰り返せる
  }
  ```

  lengthを使うと、例えば生徒数が一人分増えてもstudents.lengthが6になるので、しっかり動作します。

  ```scala
  val students = List(84,45,60,58,69,50)  
  for(i <- 0 until students.length) {
    if(students(i) >= 60) {
      println(i+1 + " is pass")
    } else {
      println(i+1 + " is fail")
    }
  }
  ```

  ```
  1 is pass
  2 is fail
  3 is pass
  4 is fail
  5 is pass
  6 is fail
  ```

  変更する箇所が一箇所で済むのは楽ですしミスも減りますね。
  
- **sum**  
  全要素を足した合計値を取得できます。

  ```scala
  println(List(1,2,3).sum)
  ```

  ```
  6
  ```

- **fill**  
  要素数と中身を指定してListを簡単に作る事ができます。

  ```scala
  val list = List.fill(3)(1)
  println(list)
  ```

  結果は以下のようになります。

  ```
  List(1, 1, 1)
  ```

  要素が3個のListで中身は全部1のListを作ることが出来ます。  

  複数の整数値を入力させてListにしたい場合にはreadIntを使います。

  ```scala
  val list = List.fill(3)(readInt)
  println(list)
  ```
  三回入力させて、Listを作れます。  
  入力が1,2,3となればList(1,2,3)となります。
  
  今度は最初に要素がいくつあるのか入力させてListを作ってみましょう。

  ```scala
  val n = readInt
  val list = List.fill(n)(readInt)
  println(list)
  ```

  二回readIntを書きました。  
  最初に何回入力するかを入力し、その次からは回数分だけListの要素を入力します。
  
  例を2つ書きます。
  ####入力1：

  ```
  3
  1
  2
  3
  ```

  ####出力1：

  ```
  List(1,2,3)
  ```

  3を入力して次から3回入力させます(この場合は1,2,3)  
  ####入力2：

  ```
  4
  5
  6
  7
  8
  ```

  ####出力2：

  ```
  List(5,6,7,8)
  ```

  4を最初に入力したので4回入力させます。

このようにListで使える便利なものをListの**メソッド**と呼びます。
List以外にも、整数のメソッド、文字列で使えるメソッドもありますが、後々紹介していきます。
  
##練習用課題
練習として**6.scala**に以下のコードを書いてみてください。  

###(1)
fillを使って、n人の成績を入力し、それぞれが試験に合格したか判定し出力するプログラムを書いてください。(nは最初に入力します)
####入力例1：

```
3
50
70
90
```

####出力例1：

```
1 is fail
2 is pass
3 is pass
```

####入力例2：

```
5
84
45
60
58
69
```

####出力例2：

```
1 is pass
2 is fail
3 is pass
4 is fail
5 is pass
```

###(2)
n人の成績を入力し、平均値(整数)を出力するプログラムを書いてください。(nは最初に入力します)
####入力例1：

```
3
50
70
90

```
####出力例1：

```
70
```

####入力例2：

```
5
84
45
60
58
69
```

####出力例2：

```
63
```

###提出方法
[こちら](https://github.com/cohalz/scala-for-programming-beginner/issues/new)を用意しました。  
はじめにGitHubアカウントを作成してください。  
アカウントを作成できたら、ログインをして、上記のページに飛びます。  
Titleに「06-1」など、いつの何番の問題かわかるように書いてください。  
Leave a commentに書いたコードを貼り付けて、Submit new issueを押してください。   
課題が提出できたら、しばらくして僕が評価を返すのでそれを待ちましょう。  

もしちょっと考えてわからなかったら上部にあるanswerに答えを用意しましたので、ぜひ活用してください。

また質問やご意見あればお待ちしてます。  
上記のページは課題以外でも質問やご意見を送ることができます。  
[こちら](https://github.com/cohalz/scala-for-programming-beginner/issues/new)かTwitter([@cohalz](https://twitter.com/cohalz))まで気軽にどうぞ。是非一緒に学びましょう。

次回 -> 作成中

前回 -> [繰り返し](https://github.com/cohalz/scala-for-programming-beginner/tree/master/05)
