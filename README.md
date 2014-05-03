#Scalaで始めるプログラミング入門
次世代言語と呼ばれることもあるScalaを使ってプログラミングを学んでいきましょう。  
プログラミングを始めようと思っている、または始めたけど挫折しちゃっている人のレベルからを対象としています。  
#####[何故Scalaなの？](https://github.com/cohalz/scala-for-programming-beginner#%E4%BD%95%E6%95%85scala%E3%81%AA%E3%81%AE-1)
##目次

- 00 [Scalaの導入](https://github.com/cohalz/scala-for-programming-beginner)
- 01 [簡単な計算とテキストエディタの導入](https://github.com/cohalz/scala-for-programming-beginner/tree/master/01)
- 02 [変数とコードの変更](https://github.com/cohalz/scala-for-programming-beginner/tree/master/02)
- 03 [文字列と入出力、コメント](https://github.com/cohalz/scala-for-programming-beginner/tree/master/03)
- 04 [条件分岐](https://github.com/cohalz/scala-for-programming-beginner/tree/master/04)
- 05 [繰り返し](https://github.com/cohalz/scala-for-programming-beginner/tree/master/05)
- 06 [リスト入門](https://github.com/cohalz/scala-for-programming-beginner/tree/master/06)

##インストール方法  
まずはScalaをインストールしましょう。  
###Javaの確認とインストール方法
Scalaを使えるようにするにはJavaが必要です。

Javaが入っているかどうかの確認をします。  
Windowsならコマンドプロンプト、Macならターミナルを開いて以下のコマンドを入力してください。
```
java -version
```
その結果以下の様な表示が出たらJavaは入っています。
```
java version "1.7.0_45"
Java(TM) SE Runtime Environment (build 1.7.0_45-b18)
Java HotSpot(TM) 64-Bit Server VM (build 24.45-b08, mixed mode)
```

表示が出なかった場合、以下の手順を行ってください。  
[http://www.oracle.com/technetwork/java/javase/downloads/index.html](http://www.oracle.com/technetwork/java/javase/downloads/index.html)  
ここから、Java Platform (JDK)をクリックします。  
Java SE Development Kitと書いてあるところを探し、Accept License Agreementをクリックします。  
その後、使用しているOSに合わせてダウンロードをし、インストールを行ってください。  

###Scalaのインストール方法
- **Windows**  
  以下のリンクからインストールが可能です。  
  指示に従って進めていってください。  
  [http://www.scala-lang.org/files/archive/scala-2.11.0.msi](http://www.scala-lang.org/files/archive/scala-2.11.0.msi)

- **Mac**  
  Macはパッケージ管理ツールのHomebrewを使うのが一般的です。  
  Homebrewが何かわからない・多分入っていないと思う人は、以下の記事に従って導入してください。  
  Terminal.app(ターミナル)はアプリケーション->ユーティリティのフォルダに入っています。  
  [Mac OS X Mavericks にHomebrewをインストールする方法](http://maezono.info/2013/12/14/1350)

  Homebrewのインストールが完了したら、ターミナルで以下のコマンドを入力してください。  
  ```brew install scala``` 
  
Windows/Macのどちらかでインストールが終わったら、一旦コマンドプロンプトやターミナルを閉じます。
もう一度起動してから、以下のコマンドを入力してScalaが入っているか確認します。  
```
scala -version
```  
  
その結果以下の様な表示が出れば成功です。おめでとうございます。  
```
Scala code runner version 2.11.0 -- Copyright 2002-2013, LAMP/EPFL
```

##Scalaコードを試してみましょう！  
Windowsならコマンドプロンプト、Macならターミナルを使い以下のコマンドを入力してください。  
```
scala
```  

その結果以下の表示が出ると思います。  
```  
Welcome to Scala version 2.11.0 (Java HotSpot(TM) 64-Bit Server VM, Java 1.7.0_45).
Type in expressions to have them evaluated.
Type :help for more information.

scala> 
```

scala> という表示の後にカーソルがあると思いますが、ちょっと文字を入れてみましょう。  
```
scala> 1 + 1
```  

1 + 1を入力しました。  
その結果は以下に似たものになったと思います。
```
res0: Int = 2

scala> 
```

なにやら色々と文字がありますが、2と書いてあるところが1+1の結果を表しているのだろうということはわかりますね。  
実際に3 + 1や 6 - 1、-5-6(スペースを空けずに入力)など色々と自分で試して確認してみましょう。  
次回からはもう少しだけ詳しく数字や今回説明しなかった文字について説明します。 


##何故Scalaなの？  
最後に上記の疑問に答えます。  
「何故Scalaなの」や「C言語とかJavaなら聞いたことあるけど...」とかの疑問もあると思います。  
Scalaを最初に選ぶ理由として、一つにCやJavaは初めて書くには少し敷居が高いと思っているからです。  
例として1 + 1の結果を表示するにはCやJavaではどう書くのか書いてみます。  

**C**  
```
#include <stdio.h>

int main(void) {
  printf("%d\n", 1 + 1);
  return 0;
}
```

**Java** 
```
public class Main {
  public static void main (String[] args) {
    System.out.println(1 + 1);
  }
} 
```

結構長いですよね。もちろん長いのにも理由はありますが、初学者はその理由を知る前に挫折しちゃうこともあります。  
また別の理由として、ScalaはJavaやRubyで聞くような、「オブジェクト指向」と呼ばれるものを簡単に書けるようになっていたり、  
最近人気が上がっているHaskellやOCaml、F#などの関数型言語と呼ばれる言語で聞くような特徴も取り入れています。  
プログラミングにおいて大事な知識は多いですが、その多くをScala一つでカバーすることができるのがScalaを勧める大きな理由です。

何かあれば[こちら](https://github.com/cohalz/scala-for-programming-beginner/issues/new)かTwitter([@cohalz](https://twitter.com/cohalz))まで気軽にどうぞ。是非一緒に学びましょう。

次回 -> [簡単な計算とテキストエディタの導入](https://github.com/cohalz/scala-for-programming-beginner/tree/master/01)
