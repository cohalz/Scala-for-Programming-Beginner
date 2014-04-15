#文字列と入出力
##文字列を表示する
今までは計算結果を表示しましたが、数字以外も使いたいです。

**Sublime Text 2**にて以下のコードを書いて**3.scala**という名前で保存してください。  
```scala
println("Hello World!")
```
これをコマンドやターミナルで実行します。
```
scala 3.scala
```
結果は以下のようになります。
```
Hello World!
```
printlnはScalaファイルを実行する際に書いて、**表示をする**ものでした。  
そこで、中身を見てみると**ダブルクォート**(**"**)で囲まれたものが文字列になっていそうです。  
実際にそうなのか試してみましょう。

以下のコードに書き換えます。
```scala
val hello = "Hello World!"
println(hello)
```
前回でやった変数を使いました。
これを実行すると、helloではなく、Hello World!と表示されます。
```
Hello World!
```

##区別に注意
ダブルクォートで囲うと文字列になってしまうので変数を使う時に注意しましょう。  
以下のコードが例となります。
```scala
val hello = "Hello World!"
println("hello")
```
helloを囲いましたが、これはHello World!とは表示されず、helloとなります。
```
hello
```
使う際は文字列と変数の区別をつけるようにしましょう。

また、数字とも区別しましょう。
```scala
println("1" + "1")
```
この結果は11です。
文字列はそのままくっつきます。
```
11
```

##文字列を結合
文字列は結合することができます。
```scala
println("Hello" + "World")
```
実行結果は以下のようになります。
```
HelloWorld
```
次のように変数にしてももちろん動きます。
```scala
val lang = "Scala"
println("I study " + lang)
```
結果はこうなります。
```
I study Scala
```

##出力
**println**は改行付きで表示をします。lnはlineの略です。  
**print**もあります。改行をせずに表示します。  

以下のコードを実行して違いを確かめましょう。
```scala
println("abc")
println("def")
```
printlnは改行されます。
```
abc
def
```
printはというと、
```scala
print("abc")
print("def")
```
改行されません。
```
abcdef
```
##入力
今までは、コードに書いてそのまま動かしていましたが、実行するときに入力をすることもできます。  
**3.scala**の内容を以下にします。
```scala
val input = readLine
println(input)
```
実行します。
```
scala 3.scala
```
何も表示されないと思います。
実は入力待ちになっていて、文字列を入力して**Enter**を押すことで実行が続きます。  
**Scala**と入力してみます。
```
Scala
```
結果も同じです。
inputという変数に入力された結果が入っているのがわかります。

入力した文字列の最後に「**!**」をつけて表示してみましょう。
```scala
val input = readLine
println(input + "!")
```
上で書いた**print**と組み合わせたり、複数入力させることもできます。
```scala
print("Your name = ")
val name = readLine
print("Your age = ")
val age = readLine
println("Your name is " + name + " and age is " + age)
```
二回入力を求められます。
入力と出力結果の例は以下のようになります。
```
Your name = cohalz
Your age = 19
Your name is cohalz and age is 19
```

##練習用課題
練習として**3.scala**に以下のコードを書いてみてください。  

###(1)
二回文字列を入力をさせて、一個目の入力の最後に「.」を、  
二個目の入力の最後に「?」を追加して出力するプログラムを書いてください。
####入力例：
```
I do my homework
Programming is too difficult
```
####出力例：
```
I do my homework.
Programming is too difficult?
```
  
###(2)
"a" * 3と書くと"aaa"という"a"が3つ並んだ文字列を作ることができます。  
countという変数を使って、入力された文字列をcountの回数だけ並べるプログラムを書いてください。
####入力例1：(countが3の場合)
```
"ABC"
```
####出力例1：
```
"ABCABCABC"
```

####入力例2：(countが5の場合)
```
"x"
```
####出力例2：
```
"xxxxx"
```

###提出方法
[こちら](https://github.com/cohalz/scala-for-programming-beginner/issues/new)を用意しました。  
はじめにGitHubアカウントを作成してください。  
アカウントを作成できたら、ログインをして、上記のページに飛びます。  
Titleに「03-1」など、いつの何番の問題かわかるように書いてください。  
Leave a commentに書いたコードを貼り付けて、Submit new issueを押してください。   
課題が提出できたら、しばらくして僕が評価を返すのでそれを待ちましょう。  

また質問やご意見あればお待ちしてます。  
上記のページは課題以外でも質問やご意見を送ることができます。  
[こちら](https://github.com/cohalz/scala-for-programming-beginner/issues/new)かTwitter([@cohalz](https://twitter.com/cohalz))まで気軽にどうぞ。是非一緒に学びましょう。

次回 -> 作成中

前回 -> [変数とコードの変更](https://github.com/cohalz/scala-for-programming-beginner/tree/master/02)
